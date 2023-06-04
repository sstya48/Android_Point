package com.example.androidpoint.Fragment.Basic;

import static android.content.Context.VIBRATOR_SERVICE;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.os.Vibrator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.androidpoint.DemoFragments.Custem_Toast;
import com.example.androidpoint.DemoFragments.VibratePhoneDemo;
import com.example.androidpoint.R;

public class B_card_21_Fragment extends Fragment {
    AppCompatImageView vaibrat_arrow, vibrate_demo;

 //   CardView vibrate_yt;
    TextView vibrate_xml, vibrate_java, manifest_xml;
    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b_card_21_, container, false);

        vibrate_java= view.findViewById(R.id.vibrate_java);
        vibrate_java.setTextIsSelectable(true);
        vibrate_xml= view.findViewById(R.id.vibrate_xml);
        vibrate_xml.setTextIsSelectable(true);
        manifest_xml= view.findViewById(R.id.manifest_xml);
        manifest_xml.setTextIsSelectable(true);

        // vibrate_yt= view.findViewById(R.id.vibrate_yt);

        vaibrat_arrow = view.findViewById(R.id.vaibrat_arrow);
        vibrate_demo = view.findViewById(R.id.vibrate_demo);


        vaibrat_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Basic basic= new Basic();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, basic, "Back Button Basic")
                        .commit();
            }
        });

        vibrate_demo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                VibratePhoneDemo VibratePhoneDemo= new VibratePhoneDemo();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, VibratePhoneDemo, "Custem Toast DEMO")
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

        vibrate_java.setText("package com.example.vibreatedemo;\n" +
                "import androidx.appcompat.app.AppCompatActivity;\n" +
                "import android.annotation.SuppressLint;\n" +
                "import android.app.Activity;\n" +
                "import android.content.Context;\n" +
                "import android.os.Bundle;\n" +
                "import android.os.Vibrator;\n" +
                "import android.view.View;\n" +
                "import android.widget.Button;\n" +
                " \n" +
                "public class MainActivity extends Activity {\n" +
                "   Button btn;\n" +
                "   @SuppressLint(&quot;MissingInflatedId&quot;)\n" +
                " \n" +
                "   @Override\n" +
                "   protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_main);\n" +
                "        btn = findViewById(R.id.btn);\n" +
                "        btn.setOnClickListener(new View.OnClickListener() {\n" +
                " \n" +
                "      @Override\n" +
                "      public void onClick(View arg0) {\n" +
                "         Vibrator vibrator= (Vibrator)\n" +
                "         getSystemService(Context.VIBRATOR_SERVICE);\n" +
                "        vibrator.vibrate(2000);\n" +
                "      }\n" +
                "     });\n" +
                "   }\n" +
                "}");


        vibrate_xml.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    android:orientation=\"vertical\">\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/buttonVibrate\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_gravity=\"center\"\n" +
                "        android:text=\"Vibrate\" />\n" +
                "\n" +
                "</LinearLayout>");

        manifest_xml.setText("<uses-permission android:name=\"android.permission.VIBRATE\"/>");

        return view;
    }

   /* private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }*/
}