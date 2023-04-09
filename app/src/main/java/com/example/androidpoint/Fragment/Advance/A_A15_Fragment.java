package com.example.androidpoint.Fragment.Advance;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.androidpoint.R;


public class A_A15_Fragment extends Fragment {

    EditText edittext1;
    Button button1;

    AppCompatImageView Btn_arrow;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a__a15_, container, false);


        Btn_arrow=view.findViewById(R.id.Btn_arrow);

        Btn_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A_card_15_Fragment A_card_15_Fragment = new A_card_15_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, A_card_15_Fragment, "Back Button Basic")
                        .addToBackStack(null)
                        .commit();
            }
        });

        edittext1 = view.findViewById(R.id.editText1);
        button1 = view.findViewById(R.id.button);

        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                String number = edittext1.getText().toString();
               /* Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:" + number));
                startActivity(callIntent);*/

                Toast.makeText(getContext(),"Sorry this number can not enable",Toast.LENGTH_SHORT).show();
            }

        });



        return view;
    }
}
