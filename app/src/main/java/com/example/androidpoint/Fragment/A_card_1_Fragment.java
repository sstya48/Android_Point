package com.example.androidpoint.Fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.androidpoint.R;

public class A_card_1_Fragment extends Fragment {

    TextView splash_xml,splash_java,splash_main_java,splash_main_xml;
    ImageView spalshscreen_output;

    public A_card_1_Fragment() {
        // Required empty public constructor
    }

    public static A_card_1_Fragment newInstance() {
        A_card_1_Fragment fragment = new A_card_1_Fragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_a_card_1_, container, false);

        splash_xml= view.findViewById(R.id.splash_xml);
        splash_java= view.findViewById(R.id.splash_java);
        splash_main_java= view.findViewById(R.id.splash_main_java);
        splash_main_xml= view.findViewById(R.id.splash_main_xml);
        spalshscreen_output= view.findViewById(R.id.spalshscreen_output);

        spalshscreen_output.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                A_A1_Fragment scroll_demo= new A_A1_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, scroll_demo, "SCROLL DEMO")
                        .addToBackStack(null)
                        .commit();

            }
        });


        splash_java.setText("package abhiandroid.com.splashscreen;\n" +
                "\n" +
                "import android.support.v7.app.AppCompatActivity;\n" +
                "import android.os.Bundle;\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_main);\n" +
                "\n" +
                "\n" +
                "    }\n" +
                "}");



        splash_xml.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:id=\"@+id/activity_main\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\">\n" +
                "\n" +
                "    <TextView\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:text=\"Hello World by AbhiAndroid!\"\n" +
                "        android:textSize=\"20sp\"\n" +
                "        android:layout_centerInParent=\"true\"/>\n" +
                "</RelativeLayout>");



        splash_main_java.setText("package abhiandroid.com.splashscreen;\n" +
                "\n" +
                "import android.app.Activity;\n" +
                "import android.content.Intent;\n" +
                "import android.os.Bundle;\n" +
                "import android.os.Handler;\n" +
                "\n" +
                "public class SplashActivity extends Activity {\n" +
                "\n" +
                "    Handler handler;\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.splashfile);\n" +
                "\n" +
                "        handler=new Handler();\n" +
                "        handler.postDelayed(new Runnable() {\n" +
                "            @Override\n" +
                "            public void run() {\n" +
                "                Intent intent=new Intent(SplashActivity.this,MainActivity.class);\n" +
                "                startActivity(intent);\n" +
                "                finish();\n" +
                "            }\n" +
                "        },3000);\n" +
                "\n" +
                "    }\n" +
                "}");



        splash_main_xml.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "android:layout_width=\"match_parent\"\n" +
                "android:layout_height=\"match_parent\"\n" +
                "android:gravity=\"center\"\n" +
                "android:background=\"@color/splashBackground\">\n" +
                "\n" +
                "<ImageView\n" +
                "    android:id=\"@+id/logo_id\"\n" +
                "    android:layout_width=\"250dp\"\n" +
                "    android:layout_height=\"250dp\"\n" +
                "    android:layout_centerInParent=\"true\"\n" +
                "    android:src=\"@drawable/abhiandroid\"/>\n" +
                "\n" +
                "    <TextView\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_below=\"@+id/logo_id\"\n" +
                "        android:layout_centerHorizontal=\"true\"\n" +
                "        android:text=\"Splash Screen\"\n" +
                "        android:textSize=\"30dp\"\n" +
                "        android:textColor=\"@color/blue\"/>\n" +
                "\n" +
                "</RelativeLayout>");




        return view;
    }
}