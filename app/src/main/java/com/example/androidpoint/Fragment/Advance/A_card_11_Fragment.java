package com.example.androidpoint.Fragment.Advance;

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
import android.widget.ImageView;
import android.widget.TextView;

import com.example.androidpoint.R;
public class A_card_11_Fragment extends Fragment {
    TextView bar_java, bar_xml, bar_gridal_permission;
    AppCompatImageView Btn_arrow;
    ImageView bar_output;

    CardView bar_chart_yt;
    @SuppressLint({"SetTextI18n", "MissingInflatedId"})
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a_card_11_, container, false);

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

        bar_output = view.findViewById(R.id.bar_output);
        bar_java = view.findViewById(R.id.bar_java);
        bar_xml = view.findViewById(R.id.bar_xml);
        bar_chart_yt = view.findViewById(R.id.bar_chart_yt);
        bar_gridal_permission = view.findViewById(R.id.bar_gridal_permission);


        bar_output.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                A_A11_Fragment scroll_demo= new A_A11_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, scroll_demo, "SCROLL DEMO")
                        .addToBackStack(null)
                        .commit();

            }
        });

        bar_chart_yt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/watch?v=DPP5Mq4oxAQ");
            }
        });

        bar_java.setText("import android.androidalians.barchart;\n" +
                "import android.os.Bundle;\n" +
                "import androidx.appcompat.app.AppCompatActivity;\n" +
                "import com.github.mikephil.charting.charts.BarChart;\n" +
                "import com.github.mikephil.charting.components.Alin;\n" +
                "import com.github.mikephil.charting.data.BarData;\n" +
                "import com.github.mikephil.charting.data.BarDataSet;\n" +
                "import com.github.mikephil.charting.data.BarEntry;\n" +
                "import com.github.mikephil.charting.formatter.IndeAlinValueFormatter;\n" +
                "import java.util.ArrayList;\n" +
                "  \n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "      \n" +
                "    BarChart barChart;\n" +
                "      \n" +
                "    BarDataSet barDataSet1, barDataSet2;\n" +
                "      \n" +
                "    ArrayList barEntries;\n" +
                "      \n" +
                "    String[] days = new String[]{\"Sunday\", \"Monday\", \"Tuesday\", \"Thursday\", \"Friday\", \"Saturday\"};\n" +
                "  \n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_main);\n" +
                "          \n" +
                "    barChart = findViewById(R.id.idBarChart);\n" +
                "          \n" +
                "    barDataSet1 = new BarDataSet(getBarEntriesOne(), \"First Set\");\n" +
                "    barDataSet1.setColor(getApplicationContext().getResources().getColor(R.color.purple_200));\n" +
                "    barDataSet2 = new BarDataSet(getBarEntriesTwo(), \"Second Set\");\n" +
                "    barDataSet2.setColor(Color.BLUE);\n" +
                "          \n" +
                "    BarData data = new BarData(barDataSet1, barDataSet2);\n" +
                "          \n" +
                "    barChart.setData(data);\n" +
                "          \n" +
                "    barChart.getDescription().setEnabled(false);\n" +
                "          \n" +
                "    Alin Alin = barChart.getAlin();\n" +
                "          \n" +
                "    Alin.setValueFormatter(new IndeAlinValueFormatter(days));\n" +
                "          \n" +
                "    Alin.setCenterAxisLabels(true);\n" +
                "         \n" +
                "    Alin.setPosition(Alin.Alin.BOTTOM);\n" +
                "          \n" +
                "    Alin.setGranularity(1);\n" +
                "          \n" +
                "    Alin.setGranularityEnabled(true);\n" +
                "          \n" +
                "        barChart.setDragEnabled(true);\n" +
                "          \n" +
                "        barChart.setVisibleXRangeMaximum(3);\n" +
                "          \n" +
                "        float barSpace = 0.1f;\n" +
                "          \n" +
                "        float groupSpace = 0.5f;\n" +
                "          \n" +
                "        data.setBarWidth(0.15f);\n" +
                "          \n" +
                "        barChart.getAlin().setAxisMinimum(0);\n" +
                "          \n" +
                "        barChart.animate();\n" +
                "          \n" +
                "        barChart.groupBars(0, groupSpace, barSpace);\n" +
                "          \n" +
                "        barChart.invalidate();\n" +
                "    }\n" +
                "  \n" +
                "    private ArrayList<BarEntry> getBarEntriesOne() {\n" +
                "          \n" +
                "        barEntries = new ArrayList<>();\n" +
                "          \n" +
                "        barEntries.add(new BarEntry(1f, 4));\n" +
                "        barEntries.add(new BarEntry(2f, 6));\n" +
                "        barEntries.add(new BarEntry(3f, 8));\n" +
                "        barEntries.add(new BarEntry(4f, 2));\n" +
                "        barEntries.add(new BarEntry(5f, 4));\n" +
                "        barEntries.add(new BarEntry(6f, 1));\n" +
                "        return barEntries;\n" +
                "    }\n" +
                "  \n" +
                "    private ArrayList<BarEntry> getBarEntriesTwo() {\n" +
                "          \n" +
                "        barEntries = new ArrayList<>();\n" +
                "          \n" +
                "        barEntries.add(new BarEntry(1f, 8));\n" +
                "        barEntries.add(new BarEntry(2f, 12));\n" +
                "        barEntries.add(new BarEntry(3f, 4));\n" +
                "        barEntries.add(new BarEntry(4f, 1));\n" +
                "        barEntries.add(new BarEntry(5f, 7));\n" +
                "        barEntries.add(new BarEntry(6f, 3));\n" +
                "        return barEntries;\n" +
                "    }\n" +
                "}");
        bar_java.setTextIsSelectable(true);

        bar_xml.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<RelativeLayout \n" +
                "    xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    tools:context=\".MainActivity\">\n" +
                "  \n" +
                "    <com.github.mikephil.charting.charts.BarChart\n" +
                "        android:id=\"@+id/idBarChart\"\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"match_parent\" />\n" +
                "  \n" +
                "</RelativeLayout>");
        bar_xml.setTextIsSelectable(true);

        bar_gridal_permission.setText("dependencies { +\n" +
                "                \" implementation 'com.github.PhilJay:MPAndroidChart:v3.1.0' \n" +
                "                \"}");
        bar_gridal_permission.setTextIsSelectable(true);

        return view;
    }
    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}