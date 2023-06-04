package com.example.androidpoint.Fragment.Advance;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.androidpoint.R;


public class A_card_5_Fragment extends Fragment {
    TextView spinner_java, spinner_xml;
    AppCompatImageView Btn_arrow,spinner_output;
    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a_card_5_, container, false);

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

        spinner_output = view.findViewById(R.id.spinner_output);
        spinner_java = view.findViewById(R.id.spinner_java);
        spinner_xml = view.findViewById(R.id.spinner_xml);
        spinner_output.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                A_A5_Fragment scroll_demo= new A_A5_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, scroll_demo, "SCROLL DEMO")
                        .addToBackStack(null)
                        .commit();
            }
        });

        spinner_java.setTextIsSelectable(true);
        spinner_java.setText("package example.androidalians.spinnerdemo;\n" +
                "\n" +
                "import android.support.v7.app.AppCompatActivity;\n" +
                "import android.os.Bundle;\n" +
                "import android.view.View;\n" +
                "import android.widget.AdapterView;\n" +
                "import android.widget.ArrayAdapter;\n" +
                "import android.widget.Spinner;\n" +
                "import android.widget.Toast;\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{\n" +
                "\n" +
                "    String[] bankNames={\"Your Bank \"BOI \",\"SBI \",\"HDFC \",\"PNB \",\"OBC \",\"BOB \",\"ICICI \",\"BOA \"};\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "    super.onCreate(savedInstanceState);\n" +
                "    setContentView(R.layout.activity_main);\n" +
                "\n" +
                "    Spinner spin = (Spinner) findViewById(R.id.simpleSpinner);\n" +
                "    spin.setOnItemSelectedListener(this);\n" +
                "\n" +
                "    ArrayAdapter aa = new ArrayAdapter(this,android.R.layout .simple_spinner_item,bankNames);\n" +
                "    aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);\n" +
                "       spin.setAdapter(aa);\n" +
                "      }\n" +
                "\n" +
                "    @Override\n" +
                "    public void onItemSelected(AdapterView<?> arg0, View  arg1, int position,long id) {\n" +
                "     Toast.makeText(getApplicationContext(), bankNames[position], Toast.LENGTH_LONG).show();\n" +
                "         }\n" +
                "\n" +
                "    @Override\n" +
                "    public void onNothingSelected(AdapterView<?> arg0) {\n" +
                "\n" +
                "     }\n" +
                "}");
        spinner_xml.setTextIsSelectable(true);
        spinner_xml.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    android:orientation=\"vertical\">\n" +
                "\n" +
                "    <Spinner\n" +
                "        android:id=\"@+id/spinner\"\n" +
                "        android:layout_width=\"149dp\"\n" +
                "        android:layout_height=\"40dp\"\n" +
                "        android:layout_gravity=\"center\"\n" +
                "        android:layout_marginTop=\"100dp\" />\n" +
                "\n" +
                "</LinearLayout>");

        return view;
    }
}