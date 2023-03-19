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


public class A_card_14_Fragment extends Fragment {

    TextView insta_java, insta_xml, Drawable_Color, Drawable_Border, Drawable_arrow;

    AppCompatImageView Btn_arrow;
    ImageView insta_output;

    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a_card_14_, container, false);

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

        insta_output = view.findViewById(R.id.insta_output);
        insta_java = view.findViewById(R.id.insta_java);
        insta_xml = view.findViewById(R.id.insta_xml);
        Drawable_Color = view.findViewById(R.id.Drawable_Color);
        Drawable_Border = view.findViewById(R.id.Drawable_Border);
        Drawable_arrow = view.findViewById(R.id.Drawable_arrow);


        insta_output.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                A_A14_Fragment scroll_demo= new A_A14_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, scroll_demo, "SCROLL DEMO")
                        .addToBackStack(null)
                        .commit();
            }
        });
        insta_java.setTextIsSelectable(true);
        insta_java.setText("package example.androidalians.instagram;\n" +
                "\n" +
                "import androidx.appcompat.app.AppCompatActivity;\n" +
                "\n" +
                "import android.os.Bundle;\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_main);\n" +
                "    }\n" +
                "}");
        insta_xml.setTextIsSelectable(true);
        insta_xml.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    android:background=\"@drawable/background_edit_text\"\n" +
                "    tools:context=\".Fragment.A_A14_Fragment\">\n" +
                "\n" +
                "    <TextView\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_centerHorizontal=\"true\"\n" +
                "        android:layout_marginTop=\"6dp\"\n" +
                "        android:drawableRight=\"@drawable/ic_baseline_keyboard_arrow_down_24\"\n" +
                "        android:text=\"English (India)\"\n" +
                "        android:textColor=\"@color/white\"\n" +
                "        android:textSize=\"14sp\" />\n" +
                "\n" +
                "    <LinearLayout\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_centerInParent=\"true\"\n" +
                "        android:gravity=\"center\"\n" +
                "        android:orientation=\"vertical\"\n" +
                "        android:paddingStart=\"28dp\"\n" +
                "        android:paddingEnd=\"28dp\">\n" +
                "\n" +
                "        <TextView\n" +
                "            android:layout_width=\"match_parent\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:gravity=\"center\"\n" +
                "            android:text=\"\uD835\uDCD8\uD835\uDCF7\uD835\uDCFC\uD835\uDCFD\uD835\uDCEA\uD835\uDCF0\uD835\uDCFB\uD835\uDCEA\uD835\uDCF6\"\n" +
                "            android:textColor=\"@color/white\"\n" +
                "            android:textSize=\"48sp\" />\n" +
                "\n" +
                "\n" +
                "        <EditText\n" +
                "            android:id=\"@+id/ed_username\"\n" +
                "            android:layout_width=\"match_parent\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:layout_marginTop=\"30dp\"\n" +
                "            android:background=\"@drawable/edittext_background\"\n" +
                "            android:hint=\"username\"\n" +
                "            android:inputType=\"text\"\n" +
                "            android:padding=\"15dp\"\n" +
                "            android:singleLine=\"true\"\n" +
                "            android:textColorHint=\"@color/white\"\n" +
                "            android:textSize=\"14sp\" />\n" +
                "\n" +
                "        <EditText\n" +
                "            android:id=\"@+id/ed_password\"\n" +
                "            android:layout_width=\"match_parent\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:layout_marginTop=\"16dp\"\n" +
                "            android:background=\"@drawable/edittext_background\"\n" +
                "            android:hint=\"Password\"\n" +
                "            android:inputType=\"textPassword\"\n" +
                "            android:padding=\"15dp\"\n" +
                "            android:singleLine=\"true\"\n" +
                "            android:textColorHint=\"@color/white\"\n" +
                "            android:textSize=\"14sp\" />\n" +
                "\n" +
                "        <Button\n" +
                "            android:layout_width=\"match_parent\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:layout_marginTop=\"25dp\"\n" +
                "            android:background=\"@drawable/button_border\"\n" +
                "            android:text=\"Log In\"\n" +
                "            android:textAllCaps=\"false\"\n" +
                "            android:textColor=\"@color/white\"\n" +
                "            android:textSize=\"18sp\"\n" +
                "            app:cornerRadius=\"4dp\" />\n" +
                "\n" +
                "        <TextView\n" +
                "            android:layout_width=\"wrap_content\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:layout_marginTop=\"20dp\"\n" +
                "            android:text=\"Forgot your login detail? Get help signing in.\"\n" +
                "            android:textColor=\"@color/white\"\n" +
                "            android:textSize=\"14sp\" />\n" +
                "\n" +
                "        <LinearLayout\n" +
                "            android:layout_width=\"match_parent\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:layout_gravity=\"center_vertical\"\n" +
                "            android:layout_marginTop=\"12sp\"\n" +
                "            android:orientation=\"horizontal\">\n" +
                "\n" +
                "            <View\n" +
                "                android:layout_width=\"0dp\"\n" +
                "                android:layout_height=\"1.5dp\"\n" +
                "                android:layout_marginTop=\"15sp\"\n" +
                "                android:layout_weight=\"1\"\n" +
                "                android:background=\"#e2e2e2\" />\n" +
                "\n" +
                "            <TextView\n" +
                "                android:layout_width=\"wrap_content\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:layout_marginStart=\"8dp\"\n" +
                "                android:layout_marginTop=\"5sp\"\n" +
                "                android:layout_marginEnd=\"8dp\"\n" +
                "                android:text=\"OR\"\n" +
                "                android:textColor=\"#9a9a9a\"\n" +
                "                android:textSize=\"14sp\"\n" +
                "                android:textStyle=\"bold\" />\n" +
                "\n" +
                "            <View\n" +
                "                android:layout_width=\"0dp\"\n" +
                "                android:layout_height=\"1.5dp\"\n" +
                "                android:layout_marginTop=\"15sp\"\n" +
                "                android:layout_weight=\"1\"\n" +
                "                android:background=\"#e2e2e2\" />\n" +
                "\n" +
                "        </LinearLayout>\n" +
                "\n" +
                "        <TextView\n" +
                "            android:layout_width=\"150dp\"\n" +
                "            android:layout_height=\"38dp\"\n" +
                "            android:layout_marginTop=\"16dp\"\n" +
                "            android:gravity=\"center\"\n" +
                "            android:padding=\"4dp\"\n" +
                "            android:text=\"Log in with Facebook\"\n" +
                "            android:textColor=\"@color/white\"\n" +
                "            android:textSize=\"15sp\"\n" +
                "            android:textStyle=\"bold\" />\n" +
                "\n" +
                "    </LinearLayout>\n" +
                "\n" +
                "    <View\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"1.5dp\"\n" +
                "        android:background=\"#e2e2e2\"\n" +
                "        android:layout_marginBottom=\"8dp\"/>\n" +
                "\n" +
                "    <TextView\n" +
                "        android:id=\"@+id/sign_up\"\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_alignParentBottom=\"true\"\n" +
                "        android:layout_marginBottom=\"0dp\"\n" +
                "        android:background=\"@drawable/edittext_background\"\n" +
                "        android:gravity=\"center_horizontal\"\n" +
                "        android:padding=\"15sp\"\n" +
                "        android:text=\"Don't have an account? sing up.\"\n" +
                "        android:textAlignment=\"center\"\n" +
                "        android:textColor=\"@color/white\"\n" +
                "        android:textSize=\"12sp\" />\n" +
                "\n" +
                "</RelativeLayout>");
        Drawable_Color.setTextIsSelectable(true);
        Drawable_Color.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<shape\n" +
                "    android:shape = \"rectangle\"\n" +
                "    xmlns:android = \"http://schemas.android.com/apk/res/android\" >\n" +
                "    <gradient\n" +
                "        android:startColor = \"#2B7EAA\"\n" +
                "        android:endColor = \"#A850A2\"\n" +
                "        android:angle = \"70\"\n" +
                "        android:type = \"linear\" />\n" +
                "</shape>");

        Drawable_Border.setTextIsSelectable(true);
        Drawable_Border.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<selector xmlns:android=\"http://schemas.android.com/apk/res/android\">\n" +
                "    <item>\n" +
                "        <shape android:shape=\"rectangle\">\n" +
                "            <solid android:color=\"@android:color/transparent\"/>\n" +
                "            <stroke android:width=\"1sp\"\n" +
                "            android:color=\"@color/white\"/>\n" +
                "            <corners android:radius=\"1sp\"/>\n" +
                "        </shape>\n" +
                "    </item>\n" +
                "</selector>");

        Drawable_arrow.setTextIsSelectable(true);
        Drawable_arrow.setText("<vector android:height=\"24dp\" \n" +
                "        android:tint=\"#000000\"\n" +
                "        android:viewportHeight=\"24\" \n" +
                "        android:viewportWidth=\"24\"\n" +
                "        android:width=\"24dp\" \n" +
                "        xmlns:android=\"http://schemas.android.com/apk/res/android\">\n" +
                "    <path android:fillColor=\"@android:color/white\" \n" +
                "          android:pathData=\"M7.41,8.59L12,13.17l4.59,-4.58L18,10l-6,6 -6,-6 1.41,-1.41z\"/>\n" +
                "</vector>\n");


        return view;
    }
}