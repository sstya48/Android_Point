package com.example.androidpoint.Fragment.Basic;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.androidpoint.DemoFragments.SongButtonDemo;
import com.example.androidpoint.DemoFragments.VibratePhoneDemo;
import com.example.androidpoint.R;
public class B_card_22_Fragment extends Fragment {

    AppCompatImageView song_arrow, song_demo;

    //   CardView vibrate_yt;

    TextView song_xml, song_java;

    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b_card_22_, container, false);


        song_java= view.findViewById(R.id.song_java);
        song_java.setTextIsSelectable(true);
        song_xml= view.findViewById(R.id.song_xml);
        song_xml.setTextIsSelectable(true);
      /*  manifest_xml= view.findViewById(R.id.manifest_xml);
        manifest_xml.setTextIsSelectable(true);
        model_java= view.findViewById(R.id.model_java);
        model_java.setTextIsSelectable(true);*/

        // vibrate_yt= view.findViewById(R.id.vibrate_yt);

        song_arrow = view.findViewById(R.id.song_arrow);
        song_demo = view.findViewById(R.id.song_demo);


        song_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Basic basic= new Basic();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, basic, "Back Button Basic")
                        .commit();
            }
        });

        song_demo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SongButtonDemo SongButtonDemo= new SongButtonDemo();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, SongButtonDemo, "Custem Toast DEMO")
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
        song_java.setText("package com.androidalians.sound_button;\n" +
                " \n" +
                "import android.media.MediaPlayer;\n" +
                "import android.os.Bundle;\n" +
                "import android.app.Activity;\n" +
                "import android.view.Menu;\n" +
                "import android.view.View;\n" +
                "import android.widget.Button;\n" +
                " \n" +
                "public class MainActivity extends Activity {\n" +
                " \n" +
                "    MediaPlayer button_sound;\n" +
                "     Button Button1,Button2,Button3,Button4;\n" +
                " \n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_main);\n" +
                "        Button b1 = (Button) findViewById(R.id.button1);\n" +
                "        Button b2 = (Button) findViewById(R.id.button2);\n" +
                "        Button b3 = (Button) findViewById(R.id.button3);\n" +
                "        Button b4 = (Button) findViewById(R.id.button4);\n" +
                " \n" +
                "        b1.setOnClickListener(new View.OnClickListener() {\n" +
                " \n" +
                "            @Override\n" +
                "            public void onClick(View v) {\n" +
                "                // TODO Auto-generated method stub\n" +
                "                button_sound = MediaPlayer.create(MainActivity.this,\n" +
                "                        R.raw.but_click);\n" +
                "                button_sound.start();\n" +
                "            }\n" +
                "        });\n" +
                "        b2.setOnClickListener(new View.OnClickListener() {\n" +
                " \n" +
                "            @Override\n" +
                "            public void onClick(View v) {\n" +
                "                // TODO Auto-generated method stub\n" +
                "                button_sound = MediaPlayer.create(MainActivity.this,\n" +
                "                        R.raw.sound1);\n" +
                "                button_sound.start();\n" +
                "            }\n" +
                "        });\n" +
                "        b3.setOnClickListener(new View.OnClickListener() {\n" +
                " \n" +
                "            @Override\n" +
                "            public void onClick(View v) {\n" +
                "                // TODO Auto-generated method stub\n" +
                "                button_sound = MediaPlayer.create(MainActivity.this,\n" +
                "                        R.raw.sound2);\n" +
                "                button_sound.start();\n" +
                "            }\n" +
                "        });\n" +
                "        b4.setOnClickListener(new View.OnClickListener() {\n" +
                " \n" +
                "            @Override\n" +
                "            public void onClick(View v) {\n" +
                "                // TODO Auto-generated method stub\n" +
                "                button_sound = MediaPlayer.create(MainActivity.this,\n" +
                "                        R.raw.sound3);\n" +
                "                button_sound.start();\n" +
                "            }\n" +
                "        });\n" +
                " \n" +
                "    }\n" +
                "    }");

        song_xml.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    android:orientation=\"vertical\">\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/button1\"\n" +
                "        android:layout_width=\"250dp\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_gravity=\"center\"\n" +
                "        android:layout_marginTop=\"58dp\"\n" +
                "        android:text=\"Sound1\" />\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/button2\"\n" +
                "        android:layout_width=\"250dp\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_gravity=\"center\"\n" +
                "        android:layout_alignLeft=\"@+id/button1\"\n" +
                "        android:layout_below=\"@+id/button1\"\n" +
                "        android:layout_marginTop=\"55dp\"\n" +
                "        android:text=\"Sound2\" />\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/button4\"\n" +
                "        android:layout_width=\"250dp\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_gravity=\"center\"\n" +
                "        android:layout_alignLeft=\"@+id/button3\"\n" +
                "        android:layout_below=\"@+id/button3\"\n" +
                "        android:layout_marginTop=\"36dp\"\n" +
                "        android:text=\"Sound4\" />\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/button3\"\n" +
                "        android:layout_width=\"250dp\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_gravity=\"center\"\n" +
                "        android:layout_alignLeft=\"@+id/button2\"\n" +
                "        android:layout_below=\"@+id/button2\"\n" +
                "        android:layout_marginTop=\"40dp\"\n" +
                "        android:text=\"Sound3\" />\n" +
                "\n" +
                "</LinearLayout>");

        return view;
    }
}