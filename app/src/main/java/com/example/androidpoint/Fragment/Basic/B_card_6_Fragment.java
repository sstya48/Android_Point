package com.example.androidpoint.Fragment.Basic;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.androidpoint.DemoFragments.RadioButtonFragment;
import com.example.androidpoint.R;


public class B_card_6_Fragment extends Fragment {
    AppCompatImageView radio_demo,Radio_Code_arrow;
    TextView radio_xml,radio_java,radio_string;
    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_b_card_6_, container, false);

        radio_xml=view.findViewById(R.id.radio_xml);
        radio_xml.setTextIsSelectable(true);
        radio_java=view.findViewById(R.id.radio_java);
        radio_java.setTextIsSelectable(true);
        radio_string=view.findViewById(R.id.radio_string);
        radio_string.setTextIsSelectable(true);
        radio_demo=view.findViewById(R.id.radio_demo);
        Radio_Code_arrow=view.findViewById(R.id.Radio_Code_arrow);

        Radio_Code_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Basic basic= new Basic();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, basic, "Radio Code Back")
                        .commit();
            }
        });
        radio_demo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RadioButtonFragment radioButtonFragment= new RadioButtonFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, radioButtonFragment, "Radio DEMO")
                        .commit();
            }
        });

        radio_xml.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    android:orientation=\"vertical\"\n" +
                "    android:gravity=\"center\">\n" +
                "\n" +
                "        <TextView\n" +
                "            android:layout_width=\"match_parent\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:text=\"What is the world\\'s highest mountain?\"\n" +
                "            android:textSize=\"28sp\"/>\n" +
                "\n" +
                "        <RadioGroup\n" +
                "            android:layout_width=\"match_parent\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:id=\"@+id/activity_main_answers\">\n" +
                "\n" +
                "            <RadioButton\n" +
                "                android:layout_width=\"match_parent\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:text=\"Matterhorn\" />\n" +
                "\n" +
                "            <RadioButton\n" +
                "                android:layout_width=\"match_parent\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:text=\"Mount Olympus\" />\n" +
                "\n" +
                "            <RadioButton\n" +
                "                android:layout_width=\"match_parent\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:text=\"Mount Everest\" />\n" +
                "\n" +
                "            <RadioButton\n" +
                "                android:layout_width=\"match_parent\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:text=\"Mount Fuji\" />\n" +
                "\n" +
                "     </RadioGroup>\n" +
                "\n" +
                "        <Button\n" +
                "            android:layout_width=\"match_parent\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:text=\"Submit Answer\"\n" +
                "            android:id=\"@+id/activity_main_submit\"/>\n" +
                "\n" +
                "    </LinearLayout>\n");


        radio_java.setText("package example.androidalians.radiobutton;\n" +
                "\n" +
                "import androidx.appcompat.app.AppCompatActivity;\n" +
                "import android.os.Bundle;\n" +
                "import android.view.View;\n" +
                "import android.widget.Button;\n" +
                "import android.widget.RadioButton;\n" +
                "import android.widget.RadioGroup;\n" +
                "import android.widget.Toast;\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "    private Button submit;\n" +
                "    private RadioGroup radioGroup;\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_main);\n" +
                "\n" +
                "        radioGroup = findViewById(R.id.activity_main_answers);\n" +
                "\n" +
                "    submit = findViewById(R.id.activity_main_submit);\n" +
                "    submit.setOnClickListener(new View.OnClickListener() {\n" +
                "       @Override\n" +
                "     public void onClick(View v) {\n" +
                "       int answerRadioButtonId = radioGroup.\n" +
                "                               getCheckedRadioButtonId();\n" +
                "       if (answerRadioButtonId != -1) {\n" +
                "          RadioButton answer = findViewById(answerRadioButtonId);\n" +
                "          if (answer.getText().equals(getResources().getString(R.string.answer3))) {\n" +
                "            Toast.makeText(getApplicationContext(), getResources().getString(R.string.correct_answer),Toast.LENGTH_SHORT).show();\n" +
                "        } else {\n" +
                "             Toast.makeText(getApplicationContext(), getResources().getString(R.string.incorrect_answer),Toast.LENGTH_SHORT).show();\n" +
                "                    }\n" +
                "        } else {\n" +
                "              Toast.makeText(getApplicationContext(), getResources().getString(R.string.missing_answer),Toast.LENGTH_SHORT).show();\n" +
                "                }\n" +
                "            }\n" +
                "        });\n" +
                "    }\n" +
                "}");

        radio_string.setText("<resources>\n" +
                "<string name=\"app_name\">Radio Button Tutorial</string>\n" +
                "<string name=\"answer3\">Mount Everest</string>\n" +
                "<string name=\"correct_answer\">Correct Answer</string>\n" +
                "<string name=\"incorrect_answer\">Incorrect Answer</string>\n" +
                "<string name=\"missing_answer\">Missing Answer</string>\n" +
                "\n" +
                "</resources>");

        return view;
    }
}