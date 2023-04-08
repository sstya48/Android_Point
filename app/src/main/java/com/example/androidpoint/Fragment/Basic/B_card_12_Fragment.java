package com.example.androidpoint.Fragment.Basic;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import com.example.androidpoint.DemoFragments.Implicit_Intent_Fragment;
import com.example.androidpoint.R;

public class B_card_12_Fragment extends Fragment {
    TextView implicit_java, implicit_xml;
    AppCompatImageView implicit_demo, Btn_arrow;
    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b_card_12_, container, false);

        implicit_java = view.findViewById(R.id.implicit_java);
        implicit_java.setTextIsSelectable(true);

        implicit_xml = view.findViewById(R.id.implicit_xml);
        implicit_xml.setTextIsSelectable(true);

        implicit_demo = view.findViewById(R.id.implicit_demo);
        Btn_arrow = view.findViewById(R.id.Btn_arrow);
        Btn_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Basic basic = new Basic();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, basic, "Back Button Basic")
                        .addToBackStack(null)
                        .commit();
            }
        });
        implicit_demo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Implicit_Intent_Fragment implicit_intent_fragment = new Implicit_Intent_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, implicit_intent_fragment, "Implicit DEMO")
                        .addToBackStack(null)
                        .commit();
            }
        });

        implicit_xml.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<LinearLayout xmlns:android=\"http://schemas.android.com\"\n" +
                "                                       /apk/res/android\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    android:orientation=\"vertical\"\n" +
                "    android:gravity=\"center\">\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/bt_implicit\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_marginTop=\"10dp\"\n" +
                "        android:layout_gravity=\"center_horizontal\"\n" +
                "        android:text=\"IMPLICIT INTENT\" />\n" +
                "\n" +
                "</LinearLayout>");


        implicit_java.setText("package example.androidalians.implicitintent;\n" +
                "\n" +
                "      import android.content.Intent;\n" +
                "      import android.net.Uri;\n" +
                "      import android.support.v7.app.AppCompatActivity;\n" +
                "      import android.os.Bundle;\n" +
                "      import android.view.View;\n" +
                "      import android.widget.Button;\n" +
                "      import android.widget.EditText;\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "\n" +
                "    Button button;\n" +
                "    EditText editText;\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_main);\n" +
                "\n" +
                "        button = findViewById(R.id.button);\n" +
                "        editText =  findViewById(R.id.editText);\n" +
                "\n" +
                "        button.setOnClickListener(new View.OnClickListener() {\n" +
                "        @Override\n" +
                "        public void onClick(View view) {\n" +
                "          Intent intent = new Intent(Intent.ACTION_VIEW);\n" +
                "          intent.setData(Uri.parse(\"https://www.youtube.com\n" +
                "                                               /@Androidalians\"));\n" +
                "          startActivity(intent);\n" +
                "          Toast.makeText(getContext(), \"Implicit Intent\",\n" +
                "                                       Toast.LENGTH_SHORT).show();\n" +
                "            }\n" +
                "        });\n" +
                "    }\n" +
                "} ");

        return view;

    }
}
