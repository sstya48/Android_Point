package com.androidalians.androidpoint.Fragment.Basic;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.androidalians.androidpoint.DemoFragments.TimePickerFragment;
import com.androidalians.androidpoint.R;

public class B_card_9_Fragment extends Fragment {
    AppCompatImageView timepicker_demo, timePicker_code_arrow;
    TextView timepicker_xml, timepicker_java;
    CardView timepicker_yt;
    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b_card_9_, container, false);


        timepicker_xml = view.findViewById(R.id.timepicker_xml);
        timepicker_xml.setTextIsSelectable(true);

        timepicker_java = view.findViewById(R.id.timepicker_java);
        timepicker_java.setTextIsSelectable(true);

        timepicker_demo = view.findViewById(R.id.timepicker_demo);

        timepicker_yt = view.findViewById(R.id.timepicker_yt);
        timePicker_code_arrow = view.findViewById(R.id.timePicker_code_arrow);

        timePicker_code_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Basic basic = new Basic();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, basic, "TimePicker Code Back")
                        .commit();

            }
        });
        timepicker_yt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/watch?v=RMElbIO5cDc");

            }
        });
        timepicker_demo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TimePickerFragment timePickerFragment = new TimePickerFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, timePickerFragment, "Time Picker DEMO")
                        .commit();
            }
        });

        timepicker_java.setText("package example.androidalians.timepicker;\n" +
                "\n" +
                "import androidx.appcompat.app.AppCompatActivity;\n" +
                "import android.app.TimePickerDialog;\n" +
                "import android.os.Bundle;\n" +
                "import android.view.View;\n" +
                "import android.widget.Button;\n" +
                "import android.widget.TextView;\n" +
                "import android.widget.TimePicker;\n" +
                "import java.util.Calendar;\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "\n" +
                "    private Button pickTimeBtn;\n" +
                "    private TextView selectedTimeTV;\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_main);\n" +
                "\n" +
                "        pickTimeBtn = findViewById(R.id.idBtnPickTime);\n" +
                "        selectedTimeTV = findViewById(R.id.idTVSelectedTime);\n" +
                "        pickTimeBtn.setOnClickListener(new View.OnClickListener() {\n" +
                "         @Override\n" +
                "         public void onClick(View v) {\n" +
                "            final Calendar c = Calendar.getInstance();\n" +
                "\n" +
                "            int hour = c.get(Calendar.HOUR_OF_DAY);\n" +
                "            int minute = c.get(Calendar.MINUTE);\n" +
                "\n" +
                "            TimePickerDialog timePickerDialog = new TimePickerDialog(MainActivity.this, new TimePickerDialog.OnTimeSetListener() {\n" +
                "              @Override\n" +
                "              public void onTimeSet(TimePicker view, int hourOfDay,int minute) {\n" +
                "                selectedTimeTV.setText(hourOfDay + \":\" + minute);\n" +
                "                }\n" +
                "             }, hour, minute, false);\n" +
                "            timePickerDialog.show();\n" +
                "           }\n" +
                "        });\n" +
                "    }\n" +
                "}");

        timepicker_xml.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    android:gravity=\"center\"\n" +
                "    android:orientation=\"vertical\">\n" +
                "\n" +
                "        <TextView\n" +
                "            android:id=\"@+id/idTVHeading\"\n" +
                "            android:layout_width=\"match_parent\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:padding=\"10dp\"\n" +
                "            android:text=\"Time Picker Dialog in Android\" />\n" +
                "\n" +
                "        <TextView\n" +
                "            android:id=\"@+id/idTVSelectedTime\"\n" +
                "            android:layout_width=\"match_parent\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:padding=\"10dp\"\n" +
                "            android:text=\"Time\"/>\n" +
                "\n" +
                "        <Button\n" +
                "            android:id=\"@+id/idBtnPickTime\"\n" +
                "            android:layout_width=\"match_parent\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:layout_margin=\"20dp\"\n" +
                "            android:text=\"Pick Date\"\n" +
                "            android:textSize=\"20sp\" />\n" +
                "\n" +
                "</LinearLayout>");

        return view;
    }
    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}
