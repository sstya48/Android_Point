package com.example.androidpoint.Fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import com.example.androidpoint.DemoFragments.Hello_World_Fragment;
import com.example.androidpoint.DemoFragments.Hide_Title_Demo_Fragment;
import com.example.androidpoint.R;

public class B_card_3_Fragment extends Fragment {

    TextView hide_title_xml,hide_title_java;

    AppCompatImageView Btn_arrow,hide_title_demo;

    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_b_card_3_, container, false);

        hide_title_xml= view.findViewById(R.id.hide_title_xml);
        hide_title_java= view.findViewById(R.id.hide_title_java);

        hide_title_demo=view.findViewById(R.id.hide_title_demo);

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

        hide_title_demo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Hide_Title_Demo_Fragment hello_world_demo= new Hide_Title_Demo_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, hello_world_demo, "Hide Title DEMO")
                        .addToBackStack(null)
                        .commit();
            }
        });


        hide_title_java.setText("package first.androidalians.com.hidetitlebar;  \n" +
                "  \n" +
                "import android.support.v7.app.AppCompatActivity;  \n" +
                "import android.os.Bundle;  \n" +
                "import android.view.Window;  \n" +
                "import android.view.WindowManager;  \n" +
                "  \n" +
                "public class MainActivity extends AppCompatActivity {  \n" +
                "  \n" +
                "    @Override  \n" +
                "    protected void onCreate(Bundle savedInstanceState) {  \n" +
                "        super.onCreate(savedInstanceState);  \n" +
                "  \n" +
                "        //will hide the title  \n" +
                "        requestWindowFeature(Window.FEATURE_NO_TITLE);    \n" +
                "  \n" +
                "       // hide the title bar     \n" +
                "        getSupportActionBar().hide();  \n" +
                "  \n" +
                "        //enable full screen  \n" +
                "        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,  \n" +
                "               WindowManager.LayoutParams.FLAG_FULLSCREEN);  \n" +
                "        setContentView(R.layout.activity_main);  \n" +
                "  \n" +
                "  \n" +
                "    }  \n" +
                "}  ");


        hide_title_xml.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>  \n" +
                "<android.support.constraint.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"  \n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"  \n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"  \n" +
                "    android:layout_width=\"match_parent\"  \n" +
                "    android:layout_height=\"match_parent\">  \n" +
                "  \n" +
                "    <TextView  \n" +
                "        android:layout_width=\"wrap_content\"  \n" +
                "        android:layout_height=\"wrap_content\"  \n" +
                "        android:text=\"Hello World!\"  \n" +
                "        app:layout_constraintLeft_toLeftOf=\"parent\"  \n" +
                "        app:layout_constraintRight_toRightOf=\"parent\"  \n" +
                "        app:layout_constraintTop_toTopOf=\"parent\" />  \n" +
                "  \n" +
                "</android.support.constraint.ConstraintLayout>  \n");


        return view;




    }
}