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


public class A_card_15_Fragment extends Fragment {

    TextView phone_java, phone_xml, phone_manifest;

    AppCompatImageView Btn_arrow;
    ImageView phone_output;

    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a_card_15_, container, false);

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

        phone_output = view.findViewById(R.id.phone_output);
        phone_java = view.findViewById(R.id.phone_java);
        phone_xml = view.findViewById(R.id.phone_xml);
        phone_manifest = view.findViewById(R.id.phone_manifest);


        phone_output.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                A_A15_Fragment scroll_demo= new A_A15_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, scroll_demo, "SCROLL DEMO")
                        .addToBackStack(null)
                        .commit();
            }
        });
        phone_java.setTextIsSelectable(true);
        phone_java.setText("package example.androidalians.phonecall;  \n" +
                "  \n" +
                "import android.net.Uri;  \n" +
                "import android.os.Bundle;  \n" +
                "import android.app.Activity;  \n" +
                "import android.content.Intent;  \n" +
                "import android.view.Menu;  \n" +
                "import android.view.View;  \n" +
                "import android.view.View.OnClickListener;  \n" +
                "import android.widget.Button;  \n" +
                "import android.widget.EditText;  \n" +
                "  \n" +
                "public class MainActivity extends Activity {  \n" +
                "  \n" +
                "    EditText edittext;  \n" +
                "    Button button;  \n" +
                "  \n" +
                "    @Override  \n" +
                "    protected void onCreate(Bundle savedInstanceState) {  \n" +
                "    super.onCreate(savedInstanceState);  \n" +
                "    setContentView(R.layout.activity_main);  \n" +
                "  \n" +
                "        //Getting the edittext and button instance  \n" +
                "        edittext=(EditText)findViewById(R.id.editText);  \n" +
                "        button=(Button)findViewById(R.id.button);  \n" +
                "  \n" +
                "        button.setOnClickListener(new OnClickListener(){  \n" +
                "            @Override  \n" +
                "            public void onClick(View arg0) {  \n" +
                "                String number=edittext1.getText().toString();  \n" +
                "                Intent callIntent = new Intent(Intent.ACTION_CALL);  \n" +
                "                callIntent.setData(Uri.parse(\"tel:\"+number));  \n" +
                "                startActivity(callIntent);  \n" +
                "            }  \n" +
                "        });  \n" +
                "    }  \n" +
                "  \n" +
                "    @Override  \n" +
                "    public boolean onCreateOptionsMenu(Menu menu) {  \n" +
                "        getMenuInflater().inflate(R.menu.activity_main, menu);  \n" +
                "        return true;  \n" +
                "    }  \n" +
                "}  ");
        phone_xml.setTextIsSelectable(true);
        phone_xml.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    android:orientation=\"vertical\">\n" +
                "\n" +
                "    <EditText\n" +
                "        android:id=\"@+id/editText\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_marginTop=\"155dp\"\n" +
                "        android:hint=\"Enter phone number\"\n" +
                "        android:layout_gravity=\"center\"\n" +
                "        android:ems=\"10\" />\n" +
                "\n" +
                "    <ImageButton\n" +
                "        android:id=\"@+id/button\"\n" +
                "        android:layout_width=\"70dp\"\n" +
                "        android:layout_height=\"70dp\"\n" +
                "        android:layout_marginTop=\"100dp\"\n" +
                "        android:src=\"@drawable/callll\"\n" +
                "        android:padding=\"30dp\"\n" +
                "        android:layout_gravity=\"center\" />\n" +
                "\n" +
                "</LinearLayout>");
        phone_manifest.setTextIsSelectable(true);
        phone_manifest.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>  \n" +
                "  \n" +
                "<manifest xmlns:androclass=\"http://schemas.android.com/apk/res/android\"  \n" +
                "    package=\"com.example.phonecall\"  \n" +
                "    android:versionCode=\"1\"  \n" +
                "    android:versionName=\"1.0\" >  \n" +
                "  \n" +
                "    <uses-sdk  \n" +
                "        android:minSdkVersion=\"8\"  \n" +
                "        android:targetSdkVersion=\"16\" />  \n" +
                "  \n" +
                "    <uses-permission android:name=\"android.permission.CALL_PHONE\" />  \n" +
                "    <application  \n" +
                "        android:allowBackup=\"true\"  \n" +
                "        android:icon=\"@drawable/ic_launcher\"  \n" +
                "        android:label=\"@string/app_name\"  \n" +
                "        android:theme=\"@style/AppTheme\" >  \n" +
                "        <activity  \n" +
                "            android:name=\"example.androidalians.phonecall.MainActivity\"  \n" +
                "            android:label=\"@string/app_name\" >  \n" +
                "            <intent-filter>  \n" +
                "                <action android:name=\"android.intent.action.MAIN\" />  \n" +
                "  \n" +
                "                <category android:name=\"android.intent.category.LAUNCHER\" />  \n" +
                "            </intent-filter>  \n" +
                "        </activity>  \n" +
                "    </application>  \n" +
                "  \n" +
                "</manifest>  ");


        return view;
    }
}