package com.androidalians.androidpoint.Fragment.Basic;

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

import com.androidalians.androidpoint.DemoFragments.Countdown_Timer;
import com.androidalians.androidpoint.R;

public class B_card_19_Fragment extends Fragment {

    TextView countdown_timer_java,countdown_timer_xml;
   // CardView speech_to_yt;
    AppCompatImageView Countdown_Timer_code_arrow, countdown_timer_demo;
    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_b_card_19_, container, false);

        countdown_timer_java= view.findViewById(R.id.countdown_timer_java);
       // speech_to_yt= view.findViewById(R.id.speech_to_yt);
        countdown_timer_java.setTextIsSelectable(true);
        countdown_timer_xml= view.findViewById(R.id.countdown_timer_xml);
        countdown_timer_xml.setTextIsSelectable(true);

        Countdown_Timer_code_arrow= view.findViewById(R.id.Countdown_Timer_code_arrow);

        countdown_timer_demo=view.findViewById(R.id.countdown_timer_demo);
        Countdown_Timer_code_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Basic basic= new Basic();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, basic, "Back Button Basic")
                        .commit();
            }
        });

    /*    speech_to_yt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/watch?v=_SE7Sx4Cgqo");
            }
        });*/
        countdown_timer_demo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Countdown_Timer Countdown_Timer= new Countdown_Timer();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, Countdown_Timer, "Speech To Text DEMO")
                        .addToBackStack(null)
                        .commit();

            }
        });

        countdown_timer_java.setText("package example.androidalians.myapplication;\n" +
                "import android.annotation.TargetApi;\n" +
                "import android.os.Build;\n" +
                "import android.os.Bundle;\n" +
                "import android.os.CountDownTimer;\n" +
                "import android.support.v7.app.AppCompatActivity;\n" +
                "import android.view.View;\n" +
                "import android.widget.Button;\n" +
                "import android.widget.RatingBar;\n" +
                "import android.widget.TextView;\n" +
                "import android.widget.Toast;\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "   public int counter;\n" +
                "   Button start_timer;\n" +
                "   TextView textView;\n"+
                "         \n" +
                "   @Override\n" +
                "   protected void onCreate(Bundle savedInstanceState) {\n" +
                "      super.onCreate(savedInstanceState);\n" +
                "      setContentView(R.layout.activity_main);\n" +
                "\n" +
                "      final TextView counttime=findViewById(R.id.counttime);\n" +
                "      new CountDownTimer(30000,1000) {\n" +
                "         @Override\n" +
                "         public void onTick(long millisUntilFinished) {\n" +
                "            counttime.setText(String.valueOf(counter));\n" +
                "            counter++;\n" +
                "         }\n" +
                "         @Override\n" +
                "         public void onFinish() {\n" +
                "            counttime.setText(\"Finished\");\n" +
                "         }\n" +
                "      }.start();\n" +
                "   }\n" +
                "}");

        countdown_timer_xml.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    android:orientation=\"vertical\">\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/start_timer\"\n" +
                "        android:layout_width=\"80dp\"\n" +
                "        android:layout_height=\"80dp\"\n" +
                "        android:background=\"@drawable/circle_radius_start\"\n" +
                "        android:text=\"Start\"\n" +
                "        android:layout_marginTop=\"100dp\"\n" +
                "        android:layout_gravity=\"center\" >\n" +
                "\n" +
                "    </Button>\n" +
                "    \n" +
                "    <TextView\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:id=\"@+id/textView\"\n" +
                "        android:layout_marginTop=\"30dp\"\n" +
                "        android:layout_gravity=\"center\"\n" +
                "        android:textAppearance=\"?android:attr/textAppearanceLarge\"\n" +
                "        android:textSize=\"40sp\" />\n" +
                "\n" +
                "</LinearLayout>");

        return view;
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}
