package com.androidalians.androidpoint.Fragment.Advance.Cards;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.androidalians.androidpoint.Fragment.Advance.A_A25_Fragment;
import com.androidalians.androidpoint.Fragment.Advance.A_A26_Fragment;
import com.androidalians.androidpoint.Fragment.Advance.Advance;
import com.androidalians.androidpoint.R;

public class A_card_26_Fragment extends Fragment {

    AppCompatImageView snackbar_output, Btn_arrow;

    TextView snackbar_java, snackbar_xml, gradle;

    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a_card_26_, container, false);

        Btn_arrow = view.findViewById(R.id.Btn_arrow);
        snackbar_java = view.findViewById(R.id.snackbar_java);
        snackbar_xml = view.findViewById(R.id.snackbar_xml);
        snackbar_output = view.findViewById(R.id.snackbar_output);
        gradle = view.findViewById(R.id.gradle);

        Btn_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Advance advance = new Advance();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, advance, "Back Button Basic")
                        .addToBackStack(null)
                        .commit();
            }
        });
        snackbar_output.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                A_A26_Fragment scroll_demo = new A_A26_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, scroll_demo, "SCROLL DEMO")
                        .addToBackStack(null)
                        .commit();
            }
        });

        snackbar_java.setTextIsSelectable(true);
        snackbar_java.setText("package snackbarexample.androidalias.snackbar;\n" +
                "\n" +
                "import android.support.design.widget.Snackbar;\n" +
                "import android.support.v7.app.AppCompatActivity;\n" +
                "import android.os.Bundle;\n" +
                "import android.view.View;\n" +
                "import android.widget.Button;\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_main);\n" +
                "\n" +
                "        Button button = findViewById(R.id.callbackButton);\n" +
                "\n" +
                "        button.setOnClickListener(new View.OnClickListener() {\n" +
                "            public void onClick(View v) {\n" +
                "                View view = findViewById(R.id.callbackButton);\n" +
                "                String message = \"canikissyou@gmail.com\";\n" +
                "                int duration = Snackbar.LENGTH_SHORT;\n" +
                "                showSnackbar(view, message, duration);\n" +
                "            }\n" +
                "        });\n" +
                "    }\n" +
                "\n" +
                "    public void showSnackbar(View view, String message, int duration)\n" +
                "    {\n" +
                "        Snackbar.make(view, message, duration).show();\n" +
                "    }\n" +
                "\n" +
                "}");

        snackbar_xml.setTextIsSelectable(true);
        snackbar_xml.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<android.support.constraint.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    tools:context=\".MainActivity\">\n" +
                "\n" +
                "    <LinearLayout\n" +
                "        android:layout_width=\"fill_parent\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:orientation=\"vertical\"\n" +
                "        android:paddingTop=\"100dp\"\n" +
                "        android:paddingLeft=\"20dp\"\n" +
                "        android:paddingRight=\"20dp\">\n" +
                "\n" +
                "        <TextView\n" +
                "            android:layout_width=\"wrap_content\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:layout_gravity=\"center\"\n" +
                "            android:gravity=\"center_horizontal\"\n" +
                "            android:text=\"Click button below to bring up snackbar\" />\n" +
                "\n" +
                "        <Button\n" +
                "            android:id=\"@+id/callbackButton\"\n" +
                "            android:layout_width=\"300dp\"\n" +
                "            android:layout_height=\"50dp\"\n" +
                "            android:layout_gravity=\"center_horizontal\"\n" +
                "            android:layout_margin=\"50dp\"\n" +
                "            android:backgroundTint=\"@android:color/holo_blue_light\"\n" +
                "            android:textColor=\"@android:color/white\"\n" +
                "            android:text=\"Tap To Display Snackbar Message\"/>\n" +
                "\n" +
                "    </LinearLayout>\n" +
                "\n" +
                "</android.support.constraint.ConstraintLayout>");

        gradle.setTextIsSelectable(true);
        gradle.setText("dependencies {\n" +
                "    implementation 'com.android.support:design:27.1.1'\n" +
                "}");


        return view;
    }
}