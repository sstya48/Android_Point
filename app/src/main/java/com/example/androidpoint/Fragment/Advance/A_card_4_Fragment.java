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


public class A_card_4_Fragment extends Fragment {

    TextView alert_java, alert_xml, custom_alert_xml;
    ImageView alert_output;

    AppCompatImageView Btn_arrow;

    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a_card_4_, container, false);

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

        alert_output = view.findViewById(R.id.alert_output);
        alert_java = view.findViewById(R.id.alert_java);
        alert_xml = view.findViewById(R.id.alert_xml);
        custom_alert_xml = view.findViewById(R.id.custom_alert_xml);

        alert_output.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                A_A4_Fragment scroll_demo= new A_A4_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, scroll_demo, "SCROLL DEMO")
                        .addToBackStack(null)
                        .commit();
            }
        });

        alert_java.setText("package example.androidalians.alert_dialog_custom;\n" +
                "\n" +
                "import androidx.appcompat.app.AlertDialog;\n" +
                "import androidx.appcompat.app.AppCompatActivity;\n" +
                "import android.annotation.SuppressLint;\n" +
                "import android.os.Bundle;\n" +
                "import android.view.LayoutInflater;\n" +
                "import android.view.View;\n" +
                "import android.view.ViewGroup;\n" +
                "import android.widget.Button;\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "\n" +
                "    Button b1;\n" +
                "\n" +
                "    @SuppressLint(\"MissingInflatedId\")\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_main);\n" +
                "\n" +
                "        b1= findViewById(R.id.b1);\n" +
                "\n" +
                "        b1.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View view) {\n" +
                "\n" +
                "                final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this,R.style.CustomAlertDialog);\n" +
                "                ViewGroup viewGroup= findViewById(android.R.id.content);\n" +
                "                View dialog = LayoutInflater.from(view.getContext()).inflate(R.layout.custom_alert,viewGroup,false);\n" +
                "                Button btn_no = dialog.findViewById(R.id.btn_no);\n" +
                "                Button btn_yes = dialog.findViewById(R.id.btn_yes);\n" +
                "                builder.setView(dialog);\n" +
                "\n" +
                "                final  AlertDialog alertDialog= builder.create();\n" +
                "                btn_no.setOnClickListener(new View.OnClickListener() {\n" +
                "                    @Override\n" +
                "                    public void onClick(View view) {\n" +
                "                        alertDialog.dismiss();\n" +
                "                    }\n" +
                "                });\n" +
                "                btn_yes.setOnClickListener(new View.OnClickListener() {\n" +
                "                    @Override\n" +
                "                    public void onClick(View view) {\n" +
                "                        alertDialog.dismiss();\n" +
                "                    }\n" +
                "                });\n" +
                "                alertDialog.show();\n" +
                "            }\n" +
                "        });\n" +
                "    }\n" +
                "}");
        alert_java.setTextIsSelectable(true);

        alert_xml.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    android:orientation=\"vertical\"\n" +
                "    android:gravity=\"center\">\n" +
                "    \n" +
                "    <Button\n" +
                "        android:id=\"@+id/b1\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:text=\"Click Here\" />\n" +
                "\n" +
                "</LinearLayout>");
        alert_xml.setTextIsSelectable(true);

        custom_alert_xml.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    android:orientation=\"vertical\"\n" +
                "    android:gravity=\"center\"\n" +
                "    android:padding=\"20dp\">\n" +
                "    \n" +
                "        <LinearLayout\n" +
                "            android:layout_width=\"match_parent\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:orientation=\"vertical\"\n" +
                "            android:gravity=\"center\"\n" +
                "            android:paddingTop=\"20dp\"\n" +
                "            android:paddingBottom=\"20dp\"\n" +
                "            android:background=\"@drawable/alert_bg\">\n" +
                "\n" +
                "        <TextView\n" +
                "            android:layout_width=\"wrap_content\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:text=\"Confirm Logout\"\n" +
                "            android:textColor=\"@color/white\"\n" +
                "            android:textStyle=\"bold\"\n" +
                "            android:textSize=\"20sp\" />\n" +
                "\n" +
                "        <TextView\n" +
                "            android:layout_width=\"wrap_content\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:text=\"Are You Sure want to Logout ?\"\n" +
                "            android:textColor=\"@color/white\"\n" +
                "            android:textSize=\"18sp\" />\n" +
                "\n" +
                "        <LinearLayout\n" +
                "            android:layout_width=\"match_parent\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:orientation=\"horizontal\"\n" +
                "            android:gravity=\"center\"\n" +
                "            android:layout_marginTop=\"20dp\">\n" +
                "\n" +
                "            <Button\n" +
                "                android:id=\"@+id/btn_yes\"\n" +
                "                android:layout_width=\"110dp\"\n" +
                "                android:layout_height=\"45dp\"\n" +
                "                android:text=\"YES\"\n" +
                "                android:background=\"@drawable/btn_yes\"\n" +
                "                android:textColor=\"@color/white\" />\n" +
                "\n" +
                "            <Button\n" +
                "                android:id=\"@+id/btn_no\"\n" +
                "                android:layout_width=\"110dp\"\n" +
                "                android:layout_height=\"45dp\"\n" +
                "                android:text=\"NO\"\n" +
                "                android:background=\"@drawable/btn_no\"\n" +
                "                android:textColor=\"@color/white\"\n" +
                "                android:layout_marginLeft=\"30dp\" />\n" +
                "\n" +
                "        </LinearLayout>\n" +
                "\n" +
                "    </LinearLayout>\n" +
                "\n" +
                "</LinearLayout>\n" +
                "\n");
        custom_alert_xml.setTextIsSelectable(true);

        return view;
    }
}