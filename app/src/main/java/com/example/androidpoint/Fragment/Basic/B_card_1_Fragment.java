package com.example.androidpoint.Fragment.Basic;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import com.example.androidpoint.DemoFragments.Hello_World_Fragment;
import com.example.androidpoint.R;

public class B_card_1_Fragment extends Fragment {
    TextView hello_toast_java,hello_toast_xml;
    AppCompatImageView hello_toast_demo;
    AppCompatImageView Btn_arrow;
    @SuppressLint({"SetTextI18n", "MissingInflatedId"})
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_b_card_1_, container, false);

        hello_toast_java= view.findViewById(R.id.hello_toast_java);
        hello_toast_java.setTextIsSelectable(true);
        hello_toast_xml= view.findViewById(R.id.hello_toast_xml);
        hello_toast_xml.setTextIsSelectable(true);

        hello_toast_demo= view.findViewById(R.id.hello_toast_demo);

        Btn_arrow=view.findViewById(R.id.Btn_arrow);
        Btn_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Basic basic= new Basic();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, basic, "Back Button Basic")
                        .addToBackStack(null)
                        .commit();
            }
        });
        hello_toast_demo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Hello_World_Fragment hello_world_demo= new Hello_World_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, hello_world_demo, "Hello world Toast DEMO")
                        .addToBackStack(null)
                        .commit();
            }
        });


        hello_toast_java.setText("package example.androidalians.helloworld;\n" +
                "\n" +
                "import android.support.v7.app.AppCompatActivity;\n" +
                "import android.os.Bundle;\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "   @Override\n" +
                "   protected void onCreate(Bundle savedInstanceState) {\n" +
                "      super.onCreate(savedInstanceState);\n" +
                "      setContentView(R.layout.activity_main);\n" +
                "\n" +
                "        Toast.makeText(getApplicationContext(), \"Hello world!!, \n" +
                "                                   Toast.LENGTH_LONG).show();\n"+
                "   }\n" +
                "}");

        hello_toast_xml.setText("<?xml version=\\\"1.0\\\" encoding=\\\"utf-8\\\"?>\"\n" +
                "<RelativeLayout xmlns:android=\"http://schemas.android.com \n" +
                "                                                      /apk/res/android\"\n" +
                "   xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "   android:layout_width=\"match_parent\"\n" +
                "   android:layout_height=\"match_parent\" >\n" +
                "   \n" +
                "   <TextView\n" +
                "      android:layout_width=\"wrap_content\"\n" +
                "      android:layout_height=\"wrap_content\"\n" +
                "      android:layout_centerHorizontal=\"true\"\n" +
                "      android:layout_centerVertical=\"true\"\n" +
                "      android:text=\"@string/hello_world\"\n" +
                "      tools:context=\".MainActivity\" />\n" +
                "      \n" +
                "</RelativeLayout>");

        return view;
    }
}