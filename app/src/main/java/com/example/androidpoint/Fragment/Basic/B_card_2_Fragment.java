package com.example.androidpoint.Fragment.Basic;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import com.example.androidpoint.R;


public class B_card_2_Fragment extends Fragment {

    TextView activity_lifecycle_xml,activity_lifecycle_java;

    AppCompatImageView Btn_arrow,activity_cycle_demo;


    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_b_card_2_, container, false);

        activity_lifecycle_xml= view.findViewById(R.id.activity_lifecycle_xml);
        activity_lifecycle_xml.setTextIsSelectable(true);

        activity_lifecycle_java= view.findViewById(R.id.activity_lifecycle_java);
        activity_lifecycle_java.setTextIsSelectable(true);


        activity_cycle_demo= view.findViewById(R.id.activity_cycle_demo);

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

        activity_cycle_demo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        activity_lifecycle_java.setText("package example.androidalians.com.activitylifecycle;  \n" +
                "  \n" +
                "import android.app.Activity;  \n" +
                "import android.os.Bundle;  \n" +
                "import android.util.Log;  \n" +
                "  \n" +
                "public class MainActivity extends Activity {  \n" +
                "  \n" +
                "    @Override  \n" +
                "    protected void onCreate(Bundle savedInstanceState) {  \n" +
                "        super.onCreate(savedInstanceState);  \n" +
                "        setContentView(R.layout.activity_main);  \n" +
                "        Log.d(\"lifecycle\",\"onCreate invoked\");  \n" +
                "    }  \n" +
                "    @Override  \n" +
                "    protected void onStart() {  \n" +
                "        super.onStart();  \n" +
                "        Log.d(\"lifecycle\",\"onStart invoked\");  \n" +
                "    }  \n" +
                "    @Override  \n" +
                "    protected void onResume() {  \n" +
                "        super.onResume();  \n" +
                "        Log.d(\"lifecycle\",\"onResume invoked\");  \n" +
                "    }  \n" +
                "    @Override  \n" +
                "    protected void onPause() {  \n" +
                "        super.onPause();  \n" +
                "        Log.d(\"lifecycle\",\"onPause invoked\");  \n" +
                "    }  \n" +
                "    @Override  \n" +
                "    protected void onStop() {  \n" +
                "        super.onStop();  \n" +
                "        Log.d(\"lifecycle\",\"onStop invoked\");  \n" +
                "    }  \n" +
                "    @Override  \n" +
                "    protected void onRestart() {  \n" +
                "        super.onRestart();  \n" +
                "        Log.d(\"lifecycle\",\"onRestart invoked\");  \n" +
                "    }  \n" +
                "    @Override  \n" +
                "    protected void onDestroy() {  \n" +
                "        super.onDestroy();  \n" +
                "        Log.d(\"lifecycle\",\"onDestroy invoked\");  \n" +
                "    }  \n" +
                "} ");


        activity_lifecycle_xml.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>  \n" +
                "<android.support.constraint.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"  \n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"  \n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"  \n" +
                "    android:layout_width=\"match_parent\"  \n" +
                "    android:layout_height=\"match_parent\" > \n" +
                "  \n" +
                "    <TextView  \n" +
                "        android:layout_width=\"wrap_content\"  \n" +
                "        android:layout_height=\"wrap_content\"  \n" +
                "        android:text=\"Hello World!\"  \n" +
                "        app:layout_constraintLeft_toLeftOf=\"parent\"  \n" +
                "        app:layout_constraintRight_toRightOf=\"parent\"  \n" +
                "        app:layout_constraintTop_toTopOf=\"parent\" />  \n" +
                "  \n" +
                "</android.support.constraint.ConstraintLayout>");

        return view;

    }
}