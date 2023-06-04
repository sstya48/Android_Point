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
public class A_card_3_Fragment extends Fragment {
    TextView radio_java, radio_xml;
    AppCompatImageView Btn_arrow;
    ImageView radio_btn_output;
    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_a_card_3_, container, false);

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

        radio_btn_output = view.findViewById(R.id.radio_btn_output);
        radio_java = view.findViewById(R.id.radio_java);
        radio_xml = view.findViewById(R.id.radio_xml);

        radio_btn_output.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                A_A3_Fragment scroll_demo= new A_A3_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, scroll_demo, "SCROLL DEMO")
                        .addToBackStack(null)
                        .commit();


            }
        });
        radio_java.setText("package example.androidalians.radiogroup;  \n" +
                "  \n" +
                "import android.os.Bundle;\n" +
                "import android.widget.RadioButton;\n" +
                "import android.widget.RadioGroup;\n" +
                "import android.widget.Toast;\n" +
                "import androidx.appcompat.app.AppCompatActivity;\n" +
                "  \n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "  \n" +
                "  private RadioGroup radioGroup;\n" +
                "  \n" +
                "  @Override\n" +
                "  protected void onCreate(Bundle savedInstanceState) {\n" +
                "     super.onCreate(savedInstanceState);\n" +
                "     setContentView(R.layout.activity_main);\n" +
                "      \n" +
                "     radioGroup = findViewById(R.id.idRVLanguages);\n" +
                "          \n" +
                "     radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {\n" +
                "       @Override\n" +
                "       public void onCheckedChanged(RadioGroup group, int checkedId) {\n" +
                "        RadioButton radioButton = findViewById(checkedId);\n" +
                "            \n" +
                "        Toast.makeText(MainActivity.this, \"Selected Radio \n" +
                "                                   Button is : \" + radioButton.getText(),\n" +
                "        Toast.LENGTH_SHORT).show();\n" +
                "            }\n" +
                "        });\n" +
                "    }\n" +
                "}");
        radio_java.setTextIsSelectable(true);



        radio_xml.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    android:orientation=\"vertical\">\n" +
                "\n" +
                "    <TextView\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_above=\"@id/radioGroup\"\n" +
                "        android:layout_margin=\"15dp\"\n" +
                "        android:text=\"Radio Group in Android\"\n" +
                "        android:textAlignment=\"center\"\n" +
                "        android:textColor=\"@color/black\"\n" +
                "        android:textSize=\"20sp\"\n" +
                "        android:textStyle=\"bold\" />\n" +
                "\n" +
                "    <RadioGroup\n" +
                "        android:id=\"@+id/radioGroup\"\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_centerInParent=\"true\"\n" +
                "        android:layout_gravity=\"center\"\n" +
                "        android:layout_marginTop=\"40dp\"\n" +
                "        android:gravity=\"center\">\n" +
                "\n" +
                "        <RadioButton\n" +
                "            android:id=\"@+id/javaRB\"\n" +
                "            android:layout_width=\"200dp\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:layout_gravity=\"center\"\n" +
                "            android:checked=\"false\"\n" +
                "            android:padding=\"4dp\"\n" +
                "            android:text=\"Kotlin\"\n" +
                "            android:textAlignment=\"center\"\n" +
                "            android:textSize=\"20sp\" />\n" +
                "\n" +
                "        <RadioButton\n" +
                "            android:id=\"@+id/cRB\"\n" +
                "            android:layout_width=\"200dp\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:layout_gravity=\"center\"\n" +
                "            android:checked=\"false\"\n" +
                "            android:padding=\"4dp\"\n" +
                "            android:text=\"Android\"\n" +
                "            android:textAlignment=\"center\"\n" +
                "            android:textSize=\"20sp\" />\n" +
                "\n" +
                "        <RadioButton\n" +
                "            android:id=\"@+id/pythonRB\"\n" +
                "            android:layout_width=\"200dp\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:layout_gravity=\"center\"\n" +
                "            android:checked=\"false\"\n" +
                "            android:padding=\"4dp\"\n" +
                "            android:text=\"Flutter\"\n" +
                "            android:textAlignment=\"center\"\n" +
                "            android:textSize=\"20sp\" />\n" +
                "\n" +
                "    </RadioGroup>\n" +
                "\n" +
                "</RelativeLayout>");
        radio_xml.setTextIsSelectable(true);

        return view;
    }
}