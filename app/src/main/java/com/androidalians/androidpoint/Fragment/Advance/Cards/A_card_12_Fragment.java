package com.androidalians.androidpoint.Fragment.Advance.Cards;

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

import com.androidalians.androidpoint.Fragment.Advance.A_A12_Fragment;
import com.androidalians.androidpoint.Fragment.Advance.Advance;
import com.androidalians.androidpoint.R;
public class A_card_12_Fragment extends Fragment {
    TextView line_java, line_xml, line_gridal_permission;
    AppCompatImageView Btn_arrow;
    ImageView line_output;
    CardView line_chart_yt;
    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a_card_12_, container, false);

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
        line_output = view.findViewById(R.id.line_output);
        line_java = view.findViewById(R.id.line_java);
        line_xml = view.findViewById(R.id.line_xml);
        line_chart_yt = view.findViewById(R.id.line_chart_yt);
        line_gridal_permission = view.findViewById(R.id.line_gridal_permission);
        line_output.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                A_A12_Fragment scroll_demo= new A_A12_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, scroll_demo, "SCROLL DEMO")
                        .addToBackStack(null)
                        .commit();
            }
        });
        line_chart_yt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/watch?v=9gfp_nT8p7g");
            }
        });
        line_java.setText("package example.androidalianslinechart;\n" +
                "import android.annotation.SuppressLint;\n" +
                "import android.os.Bundle;\n" +
                "import androidx.appcompat.widget.AppCompatImageView;\n" +
                "import android.view.LayoutInflater;\n" +
                "import android.view.View;\n" +
                "import android.view.ViewGroup;\n" +
                "import com.example.androidpoint.R;\n" +
                "import com.github.mikephil.charting.charts.LineChart;\n" +
                "import com.github.mikephil.charting.data.Entry;\n" +
                "import com.github.mikephil.charting.data.LineData;\n" +
                "import com.github.mikephil.charting.data.LineDataSet;\n" +
                "import java.lang.reflect.Array;\n" +
                "import java.util.ArrayList;\n" +
                " \n" +
                "   \"public class MainActivity extends AppCompatActivity { +\n" +
                "      \"LineChart lineChart;\n" +
                "      \"AppCompatImageView Btn_arrow;\n" +
                "      \"private PieChart pieChart;\n" +
                "      \"@Override\n" +
                "      \"protected void onCreate(Bundle savedInstanceState) {\n" +
                "      \"super.onCreate(savedInstanceState);\n" +
                "      \"setContentView(R.layout.activity_main);\n" +
                " \n" +
                "  lineChart=view.findViewById(R.id.lineChart);\n" +
                "\n" +
                "     LineDataSet lineDataSet= new LineDataSet(DataValue(),\"Data Set 1\");\n" +
                "       ArrayList<ILineDataSet> datasets= new ArrayList<>();\n" +
                "       datasets.add(lineDataSet);\n" +
                "        LineData data=new LineData(datasets);\n" +
                "        lineChart.setData(data);\n" +
                "        lineChart.invalidate();\n" +
                "\n" +
                "        Btn_arrow=view.findViewById(R.id.Btn_arrow);\n" +
                "\n" +
                "        Btn_arrow.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View view) {\n" +
                "              A_card_12_Fragment A_card_12_Fragment = new A_card_12_Fragment();\n" +
                "              getActivity().getSupportFragmentManager().beginTransaction()\n" +
                "                   .replace(R.id.frame_container, A_card_12_Fragment,\"Back Button Basic\")\n" +
                "                   .addToBackStack(null)\n" +
                "                   .commit();\n" +
                "            }\n" +
                "        });\n" +
                "        return view;\n" +
                "    }\n" +
                "\n" +
                "   private ArrayList<Entry> DataValue()\n" +
                "    {\n" +
                "        ArrayList<Entry> dataval = new ArrayList<Entry>();\n" +
                "        dataval.add(new Entry(0, 20));\n" +
                "        dataval.add(new Entry(1, 25));\n" +
                "        dataval.add(new Entry(2, 10));\n" +
                "        dataval.add(new Entry(3, 24));\n" +
                "        dataval.add(new Entry(4, 30));\n" +
                "        dataval.add(new Entry(5, 28));\n" +
                "    }\n" +
                "}");
        line_java.setTextIsSelectable(true);

        line_xml.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    android:orientation=\"vertical\"\n" +
                "    \n" +
                "    <com.github.mikephil.charting.charts.LineChart\n" +
                "        android:id=\"@+id/lineChart\"\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"match_parent\"\n" +
                "        android:layout_margin=\"40dp\"/>\n" +
                "\n" +
                "</LinearLayout>");
        line_xml.setTextIsSelectable(true);

        line_gridal_permission.setText("dependencies {\n" +
                "   implementation 'com.github.PhilJay:MPAndroidChart:v3.1.0'\n" +
                "}");
        line_gridal_permission.setTextIsSelectable(true);

        return view;
    }
    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}