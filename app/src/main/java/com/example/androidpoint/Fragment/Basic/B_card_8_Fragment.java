package com.example.androidpoint.Fragment.Basic;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.androidpoint.DemoFragments.DatePickerFragment;
import com.example.androidpoint.R;

public class B_card_8_Fragment extends Fragment {

    TextView datepicker_java,datepicker_xml;
    CardView datepicker_yt;
    AppCompatImageView datepicker_demo,Btn_arrow;

    @SuppressLint({"SetTextI18n", "MissingInflatedId"})
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=  inflater.inflate(R.layout.fragment_b_card_8_, container, false);

        datepicker_java=view.findViewById(R.id.datepicker_java);
        datepicker_java.setTextIsSelectable(true);

        datepicker_xml=view.findViewById(R.id.datepicker_xml);
        datepicker_xml.setTextIsSelectable(true);


        datepicker_demo=view.findViewById(R.id.datepicker_demo);

        Btn_arrow=view.findViewById(R.id.Btn_arrow);
        datepicker_yt = view.findViewById(R.id.datepicker_yt);

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

        datepicker_yt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/watch?v=NZLs_GeO00I");
            }
        });
        datepicker_demo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatePickerFragment datePickerFragment= new DatePickerFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, datePickerFragment, "Date Picker DEMO")
                        .addToBackStack(null)
                        .commit();
            }
        });

        datepicker_java.setText("package com.example.datepicker;\n" +
                "\n" +
                "import androidx.annotation.RequiresApi;\n" +
                "import androidx.appcompat.app.AppCompatActivity;\n" +
                "import android.app.DatePickerDialog;\n" +
                "import android.os.Build;\n" +
                "import android.os.Bundle;\n" +
                "import android.view.View;\n" +
                "import android.widget.Button;\n" +
                "import android.widget.DatePicker;\n" +
                "import android.widget.TextView;\n" +
                "import java.util.Calendar;\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "\n" +
                "    private Button btnpickdate;\n" +
                "    private TextView selectdate;\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_main);\n" +
                "\n" +
                "     btnpickdate = findViewById(R.id.btnpickdate);\n" +
                "     selectdate = findViewById(R.id.selectdate);\n" +
                "\n" +
                "      btnpickdate.setOnClickListener(new View.OnClickListener() {\n" +
                "          @RequiresApi(api = Build.VERSION_CODES.N)\n" +
                "          @Override\n" +
                "          public void onClick(View view) {\n" +
                "\n" +
                "             final Calendar c = Calendar.getInstance();\n" +
                "\n" +
                "              int year = c.get(Calendar.YEAR);\n" +
                "              int month = c.get(Calendar.MONTH);\n" +
                "              int day = c.get(Calendar.DAY_OF_MONTH);\n" +
                "\n" +
                "              DatePickerDialog datePickerDialog = new " +
                "                 DatePickerDialog(MainActivity.this,\n" +
               "                   new DatePickerDialog.OnDateSetListener() {\n" +
                "\n" +
                "                  @Override\n" +
                "                  public void onDateSet(DatePicker view, int year, \n" +
                "                           int monthOfYear, int dayOfMonth) {\n" +
                "\n" +
                "                  selectdate.setText(dayOfMonth + \"-\" + (monthOfYear + 1)\n" +
                "                                    + \"-\" + year);\n" +
                "                            }\n" +
                "                        },\n" +
                "\n" +
                "                        year, month, day);\n" +
                "\n" +
                "                datePickerDialog.show();\n" +
                "\n" +
                "            }\n" +
                "        });\n" +
                "    }\n" +
                "}");

        datepicker_xml.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<RelativeLayout xmlns:android=\"http://schemas.android.com\"\n" +
                "                                         /apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    tools:context=\".MainActivity\">\n" +
                "\n" +
                "    <TextView\n" +
                "        android:id=\"@+id/Heading\"\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:gravity=\"center\"\n" +
                "        android:text=\"Date Picker Dialog in Android\"/>\n" +
                "\n" +
                "    <TextView\n" +
                "        android:id=\"@+id/selectdate\"\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_below=\"@+id/Heading\"\n" +
                "        android:layout_marginTop=\"10sp\"\n" +
                "        android:gravity=\"center\"\n" +
                "        android:text=\"Date\"/>\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/btnpickdate\"\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_below=\"@+id/selectdate\"\n" +
                "        android:layout_margin=\"20sp\"\n" +
                "        android:text=\"Select Date\" />\n" +
                "</RelativeLayout>");


        return  view;
    }
    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}

