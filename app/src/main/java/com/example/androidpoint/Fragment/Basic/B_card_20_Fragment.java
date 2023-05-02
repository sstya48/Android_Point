package com.example.androidpoint.Fragment.Basic;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.androidpoint.DemoFragments.Countdown_Timer;
import com.example.androidpoint.DemoFragments.Custem_Toast;
import com.example.androidpoint.R;

public class B_card_20_Fragment extends Fragment {

    TextView custem_toast_java,custem_toast_xml, custem_toast_class_xml;

    // CardView speech_to_yt;

    AppCompatImageView custem_toast_code_arrow, custem_toast_demo;

    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b_card_20_, container, false);

        custem_toast_java= view.findViewById(R.id.custem_toast_java);
        custem_toast_java.setTextIsSelectable(true);
        custem_toast_xml= view.findViewById(R.id.custem_toast_xml);
        custem_toast_xml.setTextIsSelectable(true);
        custem_toast_class_xml= view.findViewById(R.id.custem_toast_class_xml);
        custem_toast_class_xml.setTextIsSelectable(true);

        // speech_to_yt= view.findViewById(R.id.speech_to_yt);

        custem_toast_demo=view.findViewById(R.id.custem_toast_demo);
        custem_toast_code_arrow=view.findViewById(R.id.custem_toast_code_arrow);
        custem_toast_code_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Basic basic= new Basic();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, basic, "Back Button Basic")
                        .commit();
            }
        });

        custem_toast_demo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Custem_Toast Custem_Toast= new Custem_Toast();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, Custem_Toast, "Custem Toast DEMO")
                        .addToBackStack(null)
                        .commit();
            }
        });
          /*    speech_to_yt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/watch?v=_SE7Sx4Cgqo");
            }
        });*/

        custem_toast_java.setText("package com.androidalians.customtoast;\n" +
                "import android.support.v7.app.AppCompatActivity;\n" +
                "import android.os.Bundle;\n" +
                "import android.view.Gravity;\n" +
                "import android.view.LayoutInflater;\n" +
                "import android.view.View;\n" +
                "import android.view.ViewGroup;\n" +
                "import android.widget.Button;\n" +
                "import android.widget.TextView;\n" +
                "import android.widget.Toast;\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_main);\n" +
                "        Button btn = (Button)findViewById(R.id.btnShow);\n" +
                "        btn.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View v) {\n" +
                "                LayoutInflater inflater = getLayoutInflater();\n" +
                "                View layout = inflater.inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.custom_toast_layout));\n" +
                "                TextView tv = (TextView) layout.findViewById(R.id.txtvw);\n" +
                "                tv.setText(\"Custom Toast Notification\");\n" +
                "                Toast toast = new Toast(getApplicationContext());\n" +
                "                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 100);\n" +
                "                toast.setDuration(Toast.LENGTH_LONG);\n" +
                "                toast.setView(layout);\n" +
                "                toast.show();\n" +
                "            }\n" +
                "        });\n" +
                "    }\n" +
                "}");

        custem_toast_xml.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    android:orientation=\"vertical\"\n" +
                "    tools:context=\".DemoFragments.Custem_Toast\">\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/btnShow\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:text=\"Show Custom Toast\"\n" +
                "        android:layout_marginTop=\"190dp\"\n" +
                "        android:layout_marginLeft=\"110dp\"/>\n" +
                "\n" +
                "</LinearLayout>");

        custem_toast_class_xml.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    android:id=\"@+id/custom_toast_layout\"\n" +
                "    android:orientation=\"horizontal\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    android:paddingLeft=\"10dp\"\n" +
                "    android:paddingRight=\"10dp\"\n" +
                "    android:background=\"@color/gray\">\n" +
                "\n" +
                "    <ImageView android:src=\"@drawable/home\"\n" +
                "        android:layout_width=\"35dp\"\n" +
                "        android:layout_height=\"35dp\"\n" +
                "        android:layout_marginRight=\"10dp\" />\n" +
                "\n" +
                "    <TextView android:id=\"@+id/txtvw\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_marginTop=\"7dp\"\n" +
                "        android:textColor=\"#FFF\"\n" +
                "        android:textStyle=\"bold\"\n" +
                "        android:textSize=\"15dp\" />\n" +
                "\n" +
                "</LinearLayout>");

        return view;
    }

   /* private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }*/
}
