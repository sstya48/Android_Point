package com.example.androidpoint.Fragment;

import static com.example.androidpoint.R.*;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.androidpoint.R;


public class A_card_8_Fragment extends Fragment {

    TextView imageslider_java, imageslider_xml, manifest_xml;
    ImageView imageslider_output;
    @SuppressLint({"SetTextI18n", "MissingInflatedId"})
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(layout.fragment_a_card_8_, container, false);

        imageslider_output = view.findViewById(id.imageslider_output);
        imageslider_java = view.findViewById(id.imageslider_java);
        imageslider_xml = view.findViewById(id.imageslider_xml);
        manifest_xml = view.findViewById(id.manifest_xml);

        imageslider_output.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                A_A8_Fragment scroll_demo= new A_A8_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(id.frame_container, scroll_demo, "SCROLL DEMO")
                        .addToBackStack(null)
                        .commit();
            }
        });
        imageslider_java.setTextIsSelectable(true);
        imageslider_java.setText("package example.androidalians.imageslider;  \n" +
                "  \n" +
                "import android.support.v4.view.ViewPager;  \n" +
                "import android.support.v7.app.AppCompatActivity;  \n" +
                "import android.os.Bundle;\n" +
                "\n" +
                "        public class MainActivity extends AppCompatActivity {\n" +
                "\n" +
                "            @Override\n" +
                "            protected void onCreate(Bundle savedInstanceState) {\n" +
                "            super.onCreate(savedInstanceState);\n" +
                "            setContentView(R.layout.activity_main);\n" +
                "\n" +
                "        imageslider = view.findViewById(R.id.imageslider);\n" +
                "\n" +
                "        ArrayList<SlideModel> slideModels = new ArrayList<>();\n" +
                "\n" +
                "        slideModels.add(new SlideModel(\" YOUR GOOGLE IMAGE ADDRESS \", ScaleTypes.FIT));\n" +
                "        slideModels.add(new SlideModel(\" YOUR GOOGLE IMAGE ADDRESS \", ScaleTypes.FIT));\n" +
                "        slideModels.add(new SlideModel(\" YOUR GOOGLE IMAGE ADDRESS \", ScaleTypes.FIT));\n" +
                "        slideModels.add(new SlideModel(\" YOUR GOOGLE IMAGE ADDRESS \", ScaleTypes.FIT));\n" +
                "\n" +
                "        imageslider.setImageList(slideModels, ScaleTypes.FIT);\n" +
                "\n" +
                "        return view;\n" +
                "    }\n" +
                "}");
        manifest_xml.setTextIsSelectable(true);
        manifest_xml.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<manifest xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    package=\"com.example.geeksforgeeks\"\n" +
                "    android:versionCode=\"1\"\n" +
                "    android:versionName=\"1.0\"\n" +
                "    android:installLocation=\"preferExternal\">\n" +
                "   \n" +
                "       <uses-permission android:name=\"android.permission.INTERNET\" /> \n" +
                " \n" +
                "    <application\n" +
                "        android:allowBackup=\"true\"\n" +
                "        android:dataExtractionRules=\"@xml/data_extraction_rules\"\n" +
                "        android:fullBackupContent=\"@xml/backup_rules\"\n" +
                "        android:icon=\"@mipmap/ic_launcher\"\n" +
                "        android:label=\"@string/app_name\"\n" +
                "        android:roundIcon=\"@mipmap/ic_launcher_round\"\n" +
                "        android:supportsRtl=\"true\"\n" +
                "        android:theme=\"@style/Theme.MyApplication\"\n" +
                "        tools:targetApi=\"31\">\n" +
                "        <activity\n" +
                "            android:name=\".MainActivity\"\n" +
                "            android:exported=\"true\">\n" +
                "            <intent-filter>\n" +
                "                <action android:name=\"android.intent.action.MAIN\" />\n" +
                " \n" +
                "                <category android:name=\"android.intent.category.LAUNCHER\" />\n" +
                "            </intent-filter>\n" +
                "        </activity>\n" +
                "    </application>\n" +
                " \n" +
                "</manifest>");
        imageslider_xml.setTextIsSelectable(true);
        imageslider_xml.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    android:orientation=\"vertical\">\n" +
                "\n" +
                "    <androidx.cardview.widget.CardView\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_marginTop=\"200dp\"\n" +
                "        android:layout_marginStart=\"25dp\"\n" +
                "        android:layout_marginEnd=\"25dp\"\n" +
                "        app:cardCornerRadius=\"14dp\" >\n" +
                "\n" +
                "        <RelativeLayout\n" +
                "            android:layout_width=\"match_parent\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:background=\"@drawable/absent_attendance\">\n" +
                "\n" +
                "            <com.denzcoskun.imageslider.ImageSlider\n" +
                "                android:id=\"@+id/imageslider\"\n" +
                "                android:layout_width=\"match_parent\"\n" +
                "                android:layout_height=\"180dp\"\n" +
                "                app:iss_auto_cycle=\"true\"\n" +
                "                app:iss_delay=\"1000\"\n" +
                "                android:background=\"@drawable/boder_sos\"\n" +
                "                app:iss_period=\"1000\" />\n" +
                "\n" +
                "        </RelativeLayout>\n" +
                "\n" +
                "    </androidx.cardview.widget.CardView>\n" +
                "\n" +
                "</LinearLayout>");

        return view;
    }
}