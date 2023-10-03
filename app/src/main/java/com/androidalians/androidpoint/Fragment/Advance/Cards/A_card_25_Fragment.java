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
import com.androidalians.androidpoint.Fragment.Advance.Advance;
import com.androidalians.androidpoint.R;

public class A_card_25_Fragment extends Fragment {

    AppCompatImageView chronometer_output, Btn_arrow;

    TextView chronometer_java, chronometer_xml;


    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a_card_25_, container, false);

        Btn_arrow = view.findViewById(R.id.Btn_arrow);
        chronometer_java = view.findViewById(R.id.chronometer_java);
        chronometer_xml = view.findViewById(R.id.chronometer_xml);
        chronometer_output = view.findViewById(R.id.chronometer_output);


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
        chronometer_output.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                A_A25_Fragment scroll_demo = new A_A25_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, scroll_demo, "SCROLL DEMO")
                        .addToBackStack(null)
                        .commit();
            }
        });

        chronometer_java.setTextIsSelectable(true);
        chronometer_java.setText("package example.androidalians.chronometerexample;\n" +
                "\n" +
                "import android.os.Bundle;\n" +
                "import android.os.SystemClock;\n" +
                "import android.support.v7.app.AppCompatActivity;\n" +
                "import android.view.Menu;\n" +
                "import android.view.MenuItem;\n" +
                "import android.view.View;\n" +
                "import android.widget.Button;\n" +
                "import android.widget.Chronometer;\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "\n" +
                "    Chronometer simpleChronometer;\n" +
                "    Button start, stop, restart, setFormat, clearFormat;\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_main);\n" +
                "        simpleChronometer = findViewById(R.id.simpleChronometer);\n" +
                "        start = findViewById(R.id.startButton);\n" +
                "        stop = findViewById(R.id.stopButton);\n" +
                "        restart = findViewById(R.id.restartButton);\n" +
                "        setFormat = findViewById(R.id.setFormat);\n" +
                "        clearFormat = findViewById(R.id.clearFormat);\n" +
                "\n" +
                "        start.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View v) {\n" +
                "                simpleChronometer.start();\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "        stop.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View v) {\n" +
                "                simpleChronometer.stop();\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "       restart.setOnClickListener(new View.OnClickListener() {\n" +
                "           @Override\n" +
                "           public void onClick(View v) {\n" +
                "               simpleChronometer.setBase(SystemClock.elapsedRealtime());\n" +
                "           }\n" +
                "        });\n" +
                "\n" +
                "        setFormat.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View v) {\n" +
                "                simpleChronometer.setFormat(\"Time (%s)\");\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "        clearFormat.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View v) {\n" +
                "                simpleChronometer.setFormat(null);\n" +
                "            }\n" +
                "        });\n" +
                "    }\n" +
                "\n" +
                "    \n" +
                "}");


        chronometer_xml.setTextIsSelectable(true);
        chronometer_xml.setText("<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    tools:context=\".MainActivity\">\n" +
                "\n" +
                "    <TextView\n" +
                "        android:id=\"@+id/textView1\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_alignParentTop=\"true\"\n" +
                "        android:layout_centerHorizontal=\"true\"\n" +
                "        android:layout_marginTop=\"10dp\"\n" +
                "        android:text=\"@string/chronometerInAndroid\"\n" +
                "        android:textColor=\"#FF0000\"\n" +
                "        android:textSize=\"20dp\"\n" +
                "        android:textStyle=\"bold\" />\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/startButton\"\n" +
                "        android:layout_width=\"200dp\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_below=\"@+id/textView1\"\n" +
                "        android:layout_centerHorizontal=\"true\"\n" +
                "        android:layout_marginTop=\"10dp\"\n" +
                "        android:text=\"@string/start\" />\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/stopButton\"\n" +
                "        android:layout_width=\"200dp\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_below=\"@+id/startButton\"\n" +
                "        android:layout_centerHorizontal=\"true\"\n" +
                "        android:layout_marginTop=\"10dp\"\n" +
                "        android:text=\"@string/stop\" />\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/restartButton\"\n" +
                "        android:layout_width=\"200dp\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_below=\"@+id/stopButton\"\n" +
                "        android:layout_centerHorizontal=\"true\"\n" +
                "        android:layout_marginTop=\"10dp\"\n" +
                "        android:text=\"@string/restart\" />\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/setFormat\"\n" +
                "        android:layout_width=\"200dp\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_below=\"@+id/restartButton\"\n" +
                "        android:layout_centerHorizontal=\"true\"\n" +
                "        android:layout_marginTop=\"10dp\"\n" +
                "        android:text=\"@string/setFormat\" />\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/clearFormat\"\n" +
                "        android:layout_width=\"200dp\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_below=\"@+id/setFormat\"\n" +
                "        android:layout_centerHorizontal=\"true\"\n" +
                "        android:layout_marginTop=\"10dp\"\n" +
                "        android:text=\"@string/clearFormat\" />\n" +
                "\n" +
                "    <Chronometer\n" +
                "        android:id=\"@+id/simpleChronometer\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_below=\"@+id/clearFormat\"\n" +
                "        android:layout_centerHorizontal=\"true\"\n" +
                "        android:layout_marginTop=\"20dp\"\n" +
                "        android:background=\"#000\"\n" +
                "        android:gravity=\"center\"\n" +
                "        android:padding=\"10dp\"\n" +
                "        android:textColor=\"#f00\"\n" +
                "        android:textStyle=\"bold\" />\n" +
                "\n" +
                "</RelativeLayout>");


        return view;
    }
}