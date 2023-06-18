package com.androidalians.androidpoint.Fragment.Basic;

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

import com.androidalians.androidpoint.DemoFragments.Speech_to_text_demo;
import com.androidalians.androidpoint.R;


public class B_card_18_Fragment extends Fragment {

    TextView speech_to_java,speech_to_xml;
    CardView speech_to_yt;
    AppCompatImageView speech_code_arrow,speech_to_text_demo;

    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b_card_18_, container, false);

        speech_to_java= view.findViewById(R.id.speech_to_java);
        speech_to_yt= view.findViewById(R.id.speech_to_yt);
        speech_to_java.setTextIsSelectable(true);
        speech_to_xml= view.findViewById(R.id.speech_to_xml);
        speech_to_xml.setTextIsSelectable(true);

        speech_code_arrow= view.findViewById(R.id.speech_code_arrow);

        speech_to_text_demo=view.findViewById(R.id.speech_to_text_demo);
        speech_code_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Basic basic= new Basic();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, basic, "Back Button Basic")
                        .commit();
            }
        });

        speech_to_yt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/watch?v=_SE7Sx4Cgqo");
            }
        });
        speech_to_text_demo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Speech_to_text_demo Speech_to_text_demo= new Speech_to_text_demo();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, Speech_to_text_demo, "Speech To Text DEMO")
                        .addToBackStack(null)
                        .commit();
            }
        });

        speech_to_java.setText("\n" +
                "class MainActivity extends AppCompatActivity(){\n" +
                "    private ImageView iv_mic;\n" +
                "    private TextView tv_Speech_to_text;\n" +
                "    private static final int REQUEST_CODE_SPEECH_INPUT = 1;\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState){\n" +
                "          super.onCreate(savedInstanceState);\n" +
                "          setContentView(R.layout.activity_main);\n" +
                "\n" +
                "        iv_mic = findViewById(R.id.iv_mic);\n" +
                "        tv_Speech_to_text = findViewById(R.id.tv_speech_to_text);\n" +
                "\n" +
                "        iv_mic.setOnClickListener(new View.OnClickListener() {\n" +
                "     @Override\n" +
                "    public void onClick(View v)\n" +
                "        {\n" +
                "         Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);\n" +
                "            intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,\n" +
                "            RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);\n" +
                "            intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());\n" +
                "            intent.putExtra(RecognizerIntent.EXTRA_PROMPT, \"Speak to text\");\n" +
                "\n" +
                "        try {\n" +
                "        startActivityForResult(intent, REQUEST_CODE_SPEECH_INPUT);\n" +
                "     }\n" +
                "        catch (Exception e) {\n" +
                "        Toast.makeText(MainActivity.this, \" \" + e.getMessage(),Toast.LENGTH_SHORT).show();\n" +
                "                }\n" +
                "              }\n" +
                "           });\n" +
                "        }\n" +
                "       @Override\n" +
                "           protected void onActivityResult(int requestCode, int resultCode,\n" +
                "       @Nullable Intent data)\n" +
                "        {\n" +
                "               super.onActivityResult(requestCode, resultCode, data);\n" +
                "               if (requestCode == REQUEST_CODE_SPEECH_INPUT) {\n" +
                "               if (resultCode == RESULT_OK && data != null) {\n" +
                "                  ArrayList<String> result = data.getStringArrayListExtra(\n" +
                "                    RecognizerIntent.EXTRA_RESULTS);\n" +
                "                    tv_Speech_to_text.setText(\n" +
                "                   Objects.requireNonNull(result).get(0));\n" +
                "                }\n" +
                "                }\n" +
                "            }\n" +
                "        }\n");

        speech_to_xml.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\">\n" +
                "\n" +
                "        <ImageView\n" +
                "            android:id=\"@+id/iv_mic\"\n" +
                "            android:layout_width=\"70dp\"\n" +
                "            android:layout_height=\"70dp\"\n" +
                "            android:layout_marginTop=\"100dp\"\n" +
                "            android:layout_gravity=\"center\"\n" +
                "            android:src=\"@drawable/speech\" />\n" +
                "\n" +
                "        <TextView\n" +
                "            android:id=\"@+id/tv_speech_to_text\"\n" +
                "            android:layout_width=\"match_parent\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:layout_marginTop=\"44dp\"\n" +
                "            android:layout_marginStart=\"30dp\"\n" +
                "            android:layout_marginEnd=\"30dp\"\n" +
                "            android:hint=\"Your speech text type\"\n" +
                "            android:textSize=\"20sp\" />\n" +
                "\n" +
                "</LinearLayout>\n" +
                "\n");

        return view;
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}
