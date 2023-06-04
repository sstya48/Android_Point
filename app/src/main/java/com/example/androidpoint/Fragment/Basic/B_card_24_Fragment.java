package com.example.androidpoint.Fragment.Basic;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.androidpoint.DemoFragments.AllLayout;
import com.example.androidpoint.DemoFragments.ImageSwitcher_Demo;
import com.example.androidpoint.R;

public class B_card_24_Fragment extends Fragment {
    AppCompatImageView image_switcher_arrow,image_switcher_demo;
    TextView content_main_xml,image_switcher_xml,image_switcher_java;
    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b_card_24_, container, false);

        image_switcher_arrow= view.findViewById(R.id.image_switcher_arrow);
        image_switcher_demo= view.findViewById(R.id.image_switcher_demo);
        image_switcher_xml= view.findViewById(R.id.image_switcher_xml);
        image_switcher_xml.setTextIsSelectable(true);
        image_switcher_java= view.findViewById(R.id.image_switcher_java);
        image_switcher_java.setTextIsSelectable(true);

        image_switcher_xml.setText("<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "        android:layout_width=\"fill_parent\"\n" +
                "        android:layout_height=\"fill_parent\"\n" +
                "        android:orientation=\"vertical\" >\n" +
                "\n" +
                "        <Button\n" +
                "            android:id=\"@+id/startBlinkTextButton\"\n" +
                "            android:layout_width=\"wrap_content\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:layout_centerHorizontal=\"true\"\n" +
                "            android:text=\"Start Blinking Text\" />\n" +
                "\n" +
                "        <Button\n" +
                "            android:id=\"@+id/stopBlinkTextButton\"\n" +
                "            android:layout_width=\"wrap_content\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:layout_below=\"@id/startBlinkTextButton\"\n" +
                "            android:layout_centerHorizontal=\"true\"\n" +
                "            android:text=\"Stop Blinking Text\" />\n" +
                "\n" +
                "        <TextView\n" +
                "            android:id=\"@+id/blinkTextView\"\n" +
                "            android:layout_width=\"wrap_content\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:layout_below=\"@id/stopBlinkTextButton\"\n" +
                "            android:layout_centerHorizontal=\"true\"\n" +
                "            android:paddingTop=\"10dp\"\n" +
                "            android:textColor=\"@color/red\"\n" +
                "            android:text=\"Hello Android Alians\"\n" +
                "            android:textSize=\"40sp\" />\n" +
                "\n" +
                "    </RelativeLayout>");
        image_switcher_java.setText("package example.androidalians.animationdemo;\n" +
                "     import android.animation.ArgbEvaluator;\n" +
                "     import android.animation.ObjectAnimator;\n" +
                "     import android.animation.ValueAnimator;\n" +
                "     import android.app.Activity;\n" +
                "     import android.graphics.Color;\n" +
                "     import android.os.Bundle;\n" +
                "     import android.view.View;\n" +
                "     import android.view.View.OnClickListener;\n" +
                "     import android.widget.Button;\n" +
                "     import android.widget.TextView;\n" +
                "\n" +
                "public class AnimationStarter extends Activity {\n" +
                "\n" +
                "  private static final String TAG = \"AnimationStarter\";\n" +
                "  ObjectAnimator textColorAnim;\n" +
                "\n" +
                "  @Override\n" +
                "  protected void onCreate(Bundle savedInstanceState) {\n" +
                "     super.onCreate(savedInstanceState);\n" +
                "     setContentView(R.layout.blinking_text_layout);\n" +
                "\n" +
                "     Button startBlinkTextButton = findViewById(R.id.startBlinkTextButton);\n" +
                "     Button stopBlinkTextButton = findViewById(R.id.stopBlinkTextButton);\n" +
                "     final TextView blinkText = findViewById(R.id.blinkTextView);\n" +
                "\n" +
                "        startBlinkTextButton.setOnClickListener(new OnClickListener() {\n" +
                "\n" +
                "            @Override\n" +
                "            public void onClick(View v) {\n" +
                "                textColorAnim = ObjectAnimator.ofInt(blinkText,\"textColor\",Color.BLACK, Color.TRANSPARENT);\n" +
                "                textColorAnim.setDuration(1000);\n" +
                "                textColorAnim.setEvaluator(new ArgbEvaluator());\n" +
                "                textColorAnim.setRepeatCount(ValueAnimator.INFINITE);\n" +
                "                textColorAnim.setRepeatMode(ValueAnimator.REVERSE);\n" +
                "                textColorAnim.start();\n" +
                "            }\n" +
                "        });\n" +
                "        stopBlinkTextButton.setOnClickListener(new OnClickListener() {\n" +
                "\n" +
                "            @Override\n" +
                "            public void onClick(View v) {\n" +
                "                if(textColorAnim != null) {\n" +
                "                    textColorAnim.cancel();\n" +
                "                    blinkText.setTextColor(Color.RED);\n" +
                "                }\n" +
                "            }\n" +
                "        });\n" +
                "    }\n" +
                "}");


        image_switcher_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Basic basic= new Basic();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, basic, "Back Button Basic")
                        .commit();
            }
        });

        image_switcher_demo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ImageSwitcher_Demo AllLayout= new ImageSwitcher_Demo();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, AllLayout, "Image Switcher DEMO")
                        .addToBackStack(null)
                        .commit();
            }
        });

        return view;
    }
}