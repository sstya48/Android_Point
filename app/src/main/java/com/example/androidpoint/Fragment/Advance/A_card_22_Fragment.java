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
public class A_card_22_Fragment extends Fragment {
    ImageView rate_output;
    TextView rate_java,rate_xml, transparent_xml, rectangle_xml;
    AppCompatImageView Btn_arrow;
    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a_card_22_, container, false);

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

        rate_output = view.findViewById(R.id.rate_output);
        rate_output.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                A_A22_Fragment scroll_demo= new A_A22_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, scroll_demo, "SCROLL DEMO")
                        .addToBackStack(null)
                        .commit();
            }
        });

        rate_java= view.findViewById(R.id.rate_java);
        rate_xml= view.findViewById(R.id.rate_xml);
        transparent_xml= view.findViewById(R.id.transparent_xml);
        rectangle_xml= view.findViewById(R.id.rectangle_xml);

        rate_java.setTextIsSelectable(true);
        rate_java.setText("package example.androidalians.rating;\n" +
                "\n" +
                "import androidx.appcompat.app.AppCompatActivity;\n" +
                "import android.os.Bundle;\n" +
                "\n" +
                "public class secpage extends AppCompatActivity {\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_secpage);\n" +
                "    }\n" +
                "}");

        rate_xml.setTextIsSelectable(true);
        rate_xml.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\">\n" +
                "\n" +
                "    <androidx.cardview.widget.CardView\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        app:cardUseCompatPadding=\"true\"\n" +
                "        app:cardCornerRadius=\"10dp\">\n" +
                "\n" +
                "        <LinearLayout\n" +
                "            android:layout_width=\"match_parent\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:orientation=\"vertical\">\n" +
                "\n" +
                "            <View\n" +
                "                android:layout_width=\"match_parent\"\n" +
                "                android:layout_height=\"120dp\"\n" +
                "                android:background=\"@color/yello\"/>\n" +
                "\n" +
                "            <RelativeLayout\n" +
                "                android:layout_width=\"150dp\"\n" +
                "                android:layout_height=\"150dp\"\n" +
                "                android:layout_gravity=\"center\"\n" +
                "                android:layout_marginTop=\"-75dp\"\n" +
                "                android:background=\"@drawable/roundback_rateus\"\n" +
                "                android:padding=\"20dp\">\n" +
                "\n" +
                "                <View\n" +
                "                    android:layout_width=\"match_parent\"\n" +
                "                    android:layout_height=\"match_parent\"\n" +
                "                    android:background=\"@drawable/roundbackwhite\" />\n" +
                "\n" +
                "                <ImageView\n" +
                "                    android:layout_width=\"match_parent\"\n" +
                "                    android:layout_height=\"match_parent\"\n" +
                "                    android:adjustViewBounds=\"true\"\n" +
                "                    android:padding=\"25dp\"\n" +
                "                    android:src=\"@drawable/three_star\"\n" +
                "                    android:layout_centerInParent=\"true\"/>\n" +
                "\n" +
                "            </RelativeLayout>\n" +
                "\n" +
                "            <TextView\n" +
                "                android:layout_width=\"wrap_content\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:text=\"Rate Our App\"\n" +
                "                android:textColor=\"#CC000000\"\n" +
                "                android:textSize=\"25sp\"\n" +
                "                android:textStyle=\"bold\"\n" +
                "                android:layout_gravity=\"center\"/>\n" +
                "\n" +
                "            <TextView\n" +
                "                android:layout_width=\"wrap_content\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:text=\"If you are enjoy using our app. \n" +
                "                   Would you mind rating us on the App Stare.\"\n" +
                "                android:textColor=\"#CC000000\"\n" +
                "                android:textSize=\"16sp\"\n" +
                "                android:gravity=\"center\"\n" +
                "                android:layout_marginTop=\"10dp\"\n" +
                "                android:layout_marginStart=\"20dp\"\n" +
                "                android:layout_marginEnd=\"20dp\"\n" +
                "                android:layout_gravity=\"center\"/>\n" +
                "\n" +
                "            <androidx.appcompat.widget.AppCompatRatingBar\n" +
                "                android:layout_width=\"wrap_content\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:layout_gravity=\"center\"\n" +
                "                android:layout_marginTop=\"20dp\"\n" +
                "                android:layout_marginBottom=\"20dp\"\n" +
                "                android:rating=\"3\"\n" +
                "                android:theme=\"@style/MyRatingBar\"/>\n" +
                "\n" +
                "            <LinearLayout\n" +
                "                android:layout_width=\"match_parent\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:orientation=\"horizontal\"\n" +
                "                android:layout_marginStart=\"20dp\"\n" +
                "                android:layout_marginEnd=\"20dp\"\n" +
                "                android:gravity=\"end\"\n" +
                "                android:layout_marginTop=\"10dp\"\n" +
                "                android:layout_marginBottom=\"10dp\"\n" +
                "                android:paddingTop=\"10dp\"\n" +
                "                android:paddingBottom=\"10dp\">\n" +
                "\n" +
                "                <androidx.appcompat.widget.AppCompatButton\n" +
                "                    android:layout_width=\"wrap_content\"\n" +
                "                    android:layout_height=\"40dp\"\n" +
                "                    android:textStyle=\"bold\"\n" +
                "                    android:text=\"May Be, later\"\n" +
                "                    android:textAllCaps=\"false\"\n" +
                "                    android:textColor=\"#CC000000\"\n" +
                "                    android:paddingStart=\"20dp\"\n" +
                "                    android:paddingEnd=\"20dp\"\n" +
                "                    android:background=\"@drawable/round_button_rate\"/>\n" +
                "\n" +
                "                <androidx.appcompat.widget.AppCompatButton\n" +
                "                    android:layout_width=\"wrap_content\"\n" +
                "                    android:layout_height=\"40dp\"\n" +
                "                    android:textStyle=\"bold\"\n" +
                "                    android:text=\"Rate Now\"\n" +
                "                    android:textAllCaps=\"false\"\n" +
                "                    android:textColor=\"#CC000000\"\n" +
                "                    android:paddingStart=\"20dp\"\n" +
                "                    android:paddingEnd=\"20dp\"\n" +
                "                    android:background=\"@drawable/round_button_rate\"/>\n" +
                "\n" +
                "            </LinearLayout>\n" +
                "\n" +
                "        </LinearLayout>\n" +
                "\n" +
                "    </androidx.cardview.widget.CardView>\n" +
                "\n" +
                "</RelativeLayout>");

        transparent_xml.setTextIsSelectable(true);
        transparent_xml.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<shape xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    android:shape=\"rectangle\">\n" +
                "    <solid android:color=\"@android:color/transparent\"/>\n" +
                "        <stroke android:width=\"2dp\"\n" +
                "        android:color=\"@color/white\"/>\n" +
                "    <corners android:radius=\"1000dp\"/>\n" +
                "</shape>");

        rectangle_xml.setTextIsSelectable(true);
        rectangle_xml.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<shape xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    android:shape=\"rectangle\">\n" +
                "    <solid\n" +
                "        android:color=\"@color/white\"/>\n" +
                "    <corners android:radius=\"1000dp\"/>\n" +
                "\n" +
                "</shape>");

        return view;
    }
}