package com.example.androidpoint.Fragment.Basic;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.androidpoint.DemoFragments.Hello_World_Fragment;
import com.example.androidpoint.DemoFragments.Text_to_speech_demo;
import com.example.androidpoint.R;

public class B_card_17_Fragment extends Fragment {

    TextView text_to_java,text_to_xml;
    AppCompatImageView hello_toast_demo;

    AppCompatImageView Text_code_arrow;
    CardView text_to_yt;
    AppCompatImageView text_to_speech_demo;

    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b_card_17_, container, false);



        text_to_java= view.findViewById(R.id.text_to_java);
        text_to_yt= view.findViewById(R.id.text_to_yt);
        text_to_java.setTextIsSelectable(true);
        text_to_xml= view.findViewById(R.id.text_to_xml);
        Text_code_arrow= view.findViewById(R.id.Text_code_arrow);
        text_to_xml.setTextIsSelectable(true);

        hello_toast_demo= view.findViewById(R.id.hello_toast_demo);

        text_to_speech_demo=view.findViewById(R.id.text_to_speech_demo);
        Text_code_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Basic basic= new Basic();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, basic, "Back Button Basic")
                        .commit();
            }
        });

        text_to_yt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/watch?v=c0s72KW6uTk");

            }
        });
        text_to_speech_demo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Text_to_speech_demo Text_to_speech_demo= new Text_to_speech_demo();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, Text_to_speech_demo, "Text To Speech DEMO")
                        .addToBackStack(null)
                        .commit();

            }
        });

        text_to_java.setText("import androidx.appcompat.app.AppCompatActivity;\n" +
                "import android.os.Bundle;\n" +
                "import android.speech.tts.TextToSpeech;\n" +
                "import android.view.View;\n" +
                "import android.widget.Button;\n" +
                "import android.widget.EditText;\n" +
                "import java.util.Locale;\n" +
                "  \n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "  \n" +
                "    EditText Text;\n" +
                "    Button btnText;\n" +
                "    TextToSpeech textToSpeech;\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_main);\n" +
                "  \n" +
                "        Text = findViewById(R.id.Text);\n" +
                "        btnText = findViewById(R.id.btnText);\n" +
                "  \n" +
                "        textToSpeech = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {\n" +
                "            @Override\n" +
                "            public void onInit(int i) {\n" +
                "                if(i!=TextToSpeech.ERROR){ \n" +
                "                    textToSpeech.setLanguage(Locale.UK); \n" +
                "                }\n" +
                "            }\n" +
                "        });\n" +
                "  \n" +
                "        btnText.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View view) {\n" +
                "                textToSpeech.speak(Text.getText().toString(),TextToSpeech.QUEUE_FLUSH,null);\n" +
                "            }\n" +
                "        });\n" +
                "  \n" +
                "    }\n" +
                "}\n" +
                    //  mnifest permission
                "  \n" +
                "<uses-permission android:name=\"android.permission.TTS_SERVICE\" /> ");

        text_to_xml.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    android:orientation=\"vertical\"\n" +
                "    tools:context=\".DemoFragments.Text_to_speech_demo\">\n" +
                "    \n" +
                "    <EditText\n" +
                "        android:id=\"@+id/Text\"\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_marginBottom=\"20dp\"\n" +
                "        android:hint=\"Enter Any Sentence\"\n" +
                "        android:layout_marginTop=\"200dp\"\n" +
                "        android:layout_marginStart=\"30dp\"\n" +
                "        android:layout_marginEnd=\"30dp\"\n" +
                "        android:gravity=\"center\"\n" +
                "        android:textSize=\"16dp\"/>\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/btnText\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:text=\"Speech Here\"\n" +
                "        android:layout_gravity=\"center\"/>\n" +
                "\n" +
                "</LinearLayout>");

        return view;
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}
