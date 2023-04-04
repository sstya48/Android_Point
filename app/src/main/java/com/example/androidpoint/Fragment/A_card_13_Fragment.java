package com.example.androidpoint.Fragment;

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


public class A_card_13_Fragment extends Fragment {

    TextView pie_java, pie_xml, pie_gridal_permission;

    AppCompatImageView Btn_arrow;

    ImageView pie_output;
    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a_card_13_, container, false);

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

        pie_output = view.findViewById(R.id.pie_output);
        pie_java = view.findViewById(R.id.pie_java);
        pie_xml = view.findViewById(R.id.pie_xml);
        pie_gridal_permission = view.findViewById(R.id.pie_gridal_permission);


        pie_output.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                A_A13_Fragment scroll_demo= new A_A13_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, scroll_demo, "SCROLL DEMO")
                        .addToBackStack(null)
                        .commit();
            }
        });

        pie_java.setText("\tpackage com.androidalians.piechartandroid;\n" +
                "import androidx.appcompat.app.AppCompatActivity;\n" +
                "import android.graphics.Color;\n" +
                "import android.os.Bundle;\n" +
                "import com.github.mikephil.charting.animation.Easing;\n" +
                "import com.github.mikephil.charting.charts.PieChart;\n" +
                "import com.github.mikephil.charting.components.Legend;\n" +
                "import com.github.mikephil.charting.data.PieData;\n" +
                "import com.github.mikephil.charting.data.PieDataSet;\n" +
                "import com.github.mikephil.charting.data.PieEntry;\n" +
                "import com.github.mikephil.charting.formatter.PercentFormatter;\n" +
                "import com.github.mikephil.charting.utils.ColorTemplate;\n" +
                "import java.util.ArrayList;\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "private PieChart pieChart;\n" +
                "@Override\n" +
                "protected void onCreate(Bundle savedInstanceState) {\n" +
                "super.onCreate(savedInstanceState);\n" +
                "setContentView(R.layout.activity_main);\n" +
                "pieChart = findViewById(R.id.activity_main_piechart);\n" +
                "setupPieChart();\n" +
                "loadPieChartData();\n" +
                "}\n" +
                "private void setupPieChart() {\n" +
                "pieChart.setDrawHoleEnabled(true);\n" +
                "pieChart.setUsePercentValues(true);\n" +
                "pieChart.setEntryLabelTextSize(12);\n" +
                "pieChart.setEntryLabelColor(Color.BLACK);\n" +
                "pieChart.setCenterText(\"Highest paying salary\");\n" +
                "pieChart.setCenterTextSize(24);\n" +
                "pieChart.getDescription().setEnabled(false);\n" +
                "Legend l = pieChart.getLegend();\n" +
                "l.setVerticalAlignment(Legend.LegendVerticalAlignment.TOP);\n" +
                "l.setHorizontalAlignment(Legend.LegendHorizontalAlignment.RIGHT);\n" +
                "l.setOrientation(Legend.LegendOrientation.VERTICAL);\n" +
                "l.setDrawInside(false);\n" +
                "l.setEnabled(true);\n" +
                "}\n" +
                "private void loadPieChartData() {\n" +
                "ArrayList<PieEntry> entries = new ArrayList<>();\n" +
                "entries.add(new PieEntry(0.2f, \"Android\"));\n" +
                "entries.add(new PieEntry(0.15f, \"Java\"));\n" +
                "entries.add(new PieEntry(0.10f, \"Php\"));\n" +
                "entries.add(new PieEntry(0.25f, \"Flutter\"));\n" +
                "entries.add(new PieEntry(0.3f, \"Kotlin\"));\n" +
                "ArrayList<Integer> colors = new ArrayList<>();\n" +
                "for (int color: ColorTemplate.MATERIAL_COLORS) {\n" +
                "colors.add(color);\n" +
                "}\n" +
                "for (int color: ColorTemplate.VORDIPLOM_COLORS) {\n" +
                "colors.add(color);\n" +
                "}\n" +
                "PieDataSet dataSet = new PieDataSet(entries, \"Expense Category\");\n" +
                "dataSet.setColors(colors);\n" +
                "PieData data = new PieData(dataSet);\n" +
                "data.setDrawValues(true);\n" +
                "data.setValueFormatter(new PercentFormatter(pieChart));\n" +
                "data.setValueTextSize(12f);\n" +
                "data.setValueTextColor(Color.BLACK);\n" +
                "pieChart.setData(data);\n" +
                "pieChart.invalidate();\n" +
                "pieChart.animateY(1400, Easing.EaseInOutQuad);\n" +
                "}\n" +
                "}");
        pie_java.setTextIsSelectable(true);

        pie_xml.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "android:layout_width=\"match_parent\"\n" +
                "android:layout_height=\"match_parent\"\n" +
                "tools:context=\".MainActivity\">\n" +
                "\n" +
                "<com.github.mikephil.charting.charts.PieChart\n" +
                "android:id=\"@+id/activity_main_piechart\"\n" +
                "android:layout_width=\"match_parent\"\n" +
                "android:layout_height=\"match_parent\"\n" +
                "app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                "app:layout_constraintLeft_toLeftOf=\"parent\"\n" +
                "app:layout_constraintRight_toRightOf=\"parent\"\n" +
                "app:layout_constraintTop_toTopOf=\"parent\" />\n" +
                "\n" +
                "</androidx.constraintlayout.widget.ConstraintLayout>");
        pie_xml.setTextIsSelectable(true);

        pie_gridal_permission.setText("\tdependencies {\n" +
                "implementation fileTree(dir: \"libs\", include: [\"*.jar\"])\n" +
                "implementation 'androidx.appcompat:appcompat:1.2.0'\n" +
                "implementation 'androidx.constraintlayout:constraintlayout:2.0.4'\n" +
                "testImplementation 'junit:junit:4.12'\n" +
                "androidTestImplementation 'androidx.test.ext:junit:1.1.2'\n" +
                "androidTestImplementation 'androidx.test.espresso:espresso-core:3.3.0'\n" +
                "}");
        pie_gridal_permission.setTextIsSelectable(true);

        return view;
    }
}