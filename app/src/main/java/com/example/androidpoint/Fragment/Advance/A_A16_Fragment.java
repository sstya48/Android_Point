package com.example.androidpoint.Fragment.Advance;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import android.telephony.SmsManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.androidpoint.R;
public class A_A16_Fragment extends Fragment {

    AppCompatImageView Btn_arrow;
    private static final int PERMISSION_RQST_SEND = 0;
    Button btnSendSMS;
    String phone;
    EditText myMessage, phoneNo;
    String message;

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a__a16_, container, false);




        Btn_arrow=view.findViewById(R.id.Btn_arrow);

        Btn_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A_card_16_Fragment A_card_16_Fragment = new A_card_16_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, A_card_16_Fragment, "Back Button Basic")
                        .addToBackStack(null)
                        .commit();
            }
        });


        btnSendSMS = view.findViewById(R.id.send);
        phoneNo = view.findViewById(R.id.call);
        myMessage = view.findViewById(R.id.sms);
        btnSendSMS.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                sendSMSMessage();
            }
        });
        return view;
    }
    protected void sendSMSMessage() {
        phone = phoneNo.getText().toString();
        message = myMessage.getText().toString();

        if (ContextCompat.checkSelfPermission(getActivity(),Manifest.permission.SEND_SMS) != PackageManager.PERMISSION_GRANTED) {
            if (ActivityCompat.shouldShowRequestPermissionRationale(getActivity(),Manifest.permission.SEND_SMS)) {
            }
            else { ActivityCompat.requestPermissions(getActivity(), new String[]{Manifest.permission.SEND_SMS}, PERMISSION_RQST_SEND);
            }
        }
    }
    @Override
    public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {
        switch (requestCode) {
            case PERMISSION_RQST_SEND: {
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    SmsManager smsManager = SmsManager.getDefault();
                    smsManager.sendTextMessage(String.valueOf(phoneNo), null, message, null, null);
                    Toast.makeText(getActivity(), "SMS sent.",Toast.LENGTH_LONG).show();
                } else {Toast.makeText(getActivity(), "SMS failed, you may try again later.", Toast.LENGTH_LONG).show();
                    return;
                }
            }
        }
    }
}
