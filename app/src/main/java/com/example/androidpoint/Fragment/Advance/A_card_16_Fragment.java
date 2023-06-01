package com.example.androidpoint.Fragment.Advance;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.androidpoint.R;
public class A_card_16_Fragment extends Fragment {
    TextView sms_java, sms_xml;
    AppCompatImageView Btn_arrow;
    ImageView sms_output;
    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a_card_16_, container, false);

        Btn_arrow=view.findViewById(R.id.Btn_arrow);
        Btn_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Advance advance= new Advance();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, advance, "Back Button Basic")
                        .addToBackStack(null)
                        .commit();
            }
        });

        sms_output = view.findViewById(R.id.sms_output);
        sms_java = view.findViewById(R.id.sms_java);
        sms_xml = view.findViewById(R.id.sms_xml);
        sms_output.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                A_A16_Fragment scroll_demo= new A_A16_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, scroll_demo, "SCROLL DEMO")
                        .addToBackStack(null)
                        .commit();
            }
        });

        sms_java.setText("package com.DataFlair.smssample;\n" +
                "import android.Manifest;\n" +
                "import android.app.Activity;\n" +
                "import android.content.pm.PackageManager;\n" +
                "import android.os.Bundle;\n" +
                "import android.telephony.SmsManager;\n" +
                "import android.view.View;\n" +
                "import android.widget.Button;\n" +
                "import android.widget.EditText;\n" +
                "import android.widget.Toast;\n" +
                "import androidx.core.app.ActivityCompat;\n" +
                "import androidx.core.content.ContextCompat;\n" +
                "\n" +
                "public class MainActivity extends Activity {\n" +
                "   private static final int PERMISSION_RQST_SEND = 0;\n" +
                "   Button send;\n" +
                "   EditText call;\n" +
                "   EditText sms;\n" +
                "   String phoneNo;\n" +
                "   String message;\n" +
                "\n" +
                "   @Override\n" +
                "   protected void onCreate(Bundle savedInstanceState) {\n" +
                "       super.onCreate(savedInstanceState);\n" +
                "       setContentView(R.layout.activity_main);\n" +
                "   \n" +
                "       send = (Button) findViewById(R.id.send);\n" +
                "       call = (EditText) findViewById(R.id.call);\n" +
                "       sms = (EditText) findViewById(R.id.sms);\n" +
                "       button1.setOnClickListener(new View.OnClickListener() {\n" +
                "           public void onClick(View view) {\n" +
                "               sendSMSMessage();\n" +
                "           }\n" +
                "       });\n" +
                "   }\n" +
                "   protected void sendSMSMessage() {\n" +
                "       phoneNo = phoneNo.getText().toString(); \n" +
                "       message = myMessage.getText().toString();\n" +
                "       if (ContextCompat.checkSelfPermission(this,Manifest.permission.SEND_SMS) != PackageManager.PERMISSION_GRANTED) {\n" +
                "           if (ActivityCompat.shouldShowRequestPermissionRationale(this,Manifest.permission.SEND_SMS)) {\n" +
                "           }\n" +
                "        else { ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.SEND_SMS}, PERMISSION_RQST_SEND);\n" +
                "           }\n" +
                "       }\n" +
                "   }\n" +
                "   @Override\n" +
                "   public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {\n" +
                "       switch (requestCode) {\n" +
                "           case PERMISSION_RQST_SEND: {\n" +
                "               if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {\n" +
                "                   SmsManager smsManager = SmsManager.getDefault();\n" +
                "                   smsManager.sendTextMessage(phoneNo, null, message, null, null);\n" +
                "                   Toast.makeText(getApplicationContext(), \"SMS sent.\",Toast.LENGTH_LONG).show();\n" +
                "               } else {Toast.makeText(getApplicationContext(), \"SMS failed, you may try again later.\", Toast.LENGTH_LONG).show();\n" +
                "                   return;\n" +
                "               }\n" +
                "           }\n" +
                "       }\n" +
                "   }\n" +
                "}");
        sms_java.setTextIsSelectable(true);

        sms_xml.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    android:orientation=\"vertical\">\n" +
                "    \n" +
                "    <LinearLayout\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"match_parent\"\n" +
                "        android:gravity=\"center\"\n" +
                "        android:orientation=\"vertical\">\n" +
                "\n" +
                "        <EditText\n" +
                "            android:id=\"@+id/call\"\n" +
                "            android:layout_width=\"wrap_content\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:hint=\"Enter Phone Number\"\n" +
                "            android:inputType=\"number\" />\n" +
                "\n" +
                "        <EditText\n" +
                "            android:id=\"@+id/sms\"\n" +
                "            android:layout_width=\"wrap_content\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:hint=\"Enter SMS\" />\n" +
                "\n" +
                "        <Button\n" +
                "            android:id=\"@+id/send\"\n" +
                "            android:layout_width=\"wrap_content\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:layout_marginTop=\"48dp\"\n" +
                "            android:text=\"Send Sms\" />\n" +
                "\n" +
                "    </LinearLayout>\n" +
                "\n" +
                "</LinearLayout>");
        sms_xml.setTextIsSelectable(true);


        return view;
    }
}