package com.androidalians.androidpoint.Fragment.Advance;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.androidalians.androidpoint.R;
public class A_card_17_Fragment extends Fragment {
    TextView email_java, email_xml, email_manifest;
    AppCompatImageView Btn_arrow;
    ImageView email_output;
    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a_card_17_, container, false);

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

        email_output = view.findViewById(R.id.email_output);
        email_java = view.findViewById(R.id.email_java);
        email_xml = view.findViewById(R.id.email_xml);
        email_manifest = view.findViewById(R.id.email_manifest);
        email_output.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                A_A17_Fragment scroll_demo= new A_A17_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, scroll_demo, "SCROLL DEMO")
                        .addToBackStack(null)
                        .commit();
            }
        });
        email_java.setTextIsSelectable(true);
        email_java.setText("package example.androidaians.emaildemo;\n" +
                "\n" +
                "import android.net.Uri;\n" +
                "import android.os.Bundle;\n" +
                "import android.app.Activity;\n" +
                "import android.content.Intent;\n" +
                "import android.util.Log;\n" +
                "import android.view.Menu;\n" +
                "import android.view.View;\n" +
                "import android.widget.Button;\n" +
                "import android.widget.Toast;\n" +
                "\n" +
                "public class MainActivity extends Activity {\n" +
                "   @Override\n" +
                "   protected void onCreate(Bundle savedInstanceState) {\n" +
                "   super.onCreate(savedInstanceState);\n" +
                "   setContentView(R.layout.activity_main);\n" +
                "\n" +
                "      Button startBtn = (Button) findViewById(R.id.sendEmail);\n" +
                "      startBtn.setOnClickListener(new View.OnClickListener() {\n" +
                "\n" +
                "         public void onClick(View view) {\n" +
                "            sendEmail();\n" +
                "         }\n" +
                "      });\n" +
                "   }\n" +
                "\n" +
                "   protected void sendEmail() {\n" +
                "      String[] TO = {\"\"};\n" +
                "      String[] CC = {\"\"};\n" +
                "      Intent emailIntent = new Intent(Intent.ACTION_SEND);\n" +
                "      \n" +
                "      emailIntent.setData(Uri.parse(\"mailto:\"));\n" +
                "      emailIntent.setType(\"text/plain\");\n" +
                "      emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);\n" +
                "      emailIntent.putExtra(Intent.EXTRA_CC, CC);\n" +
                "      emailIntent.putExtra(Intent.EXTRA_SUBJECT,\"Your subject\");\n" +
                "      emailIntent.putExtra(Intent.EXTRA_TEXT, \"Email message goes here\");\n" +
                "      \n" +
                "      try {\n" +
                "         startActivity(Intent.createChooser(emailIntent,\"Send mail...\"));\n" +
                "         finish();\n" +
                "      } catch (android.content.ActivityNotFoundException ex) {\n" +
                "         Toast.makeText(MainActivity.this, \"There is noemail client installed.\", Toast.LENGTH_SHORT).show();\n" +
                "      }\n" +
                "   }\n" +
                "}");
        email_xml.setTextIsSelectable(true);
        email_xml.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    android:orientation=\"vertical\">\n" +
                "    \n" +
                "    <TextView\n" +
                "        android:id=\"@+id/textView\"\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:text=\"Sending Email Example\"\n" +
                "        android:textColor=\"@color/black\"\n+ " +
                "        android:gravity=\"center\"\n" +
                "        android:layout_marginTop=\"50dp\"\n" +
                "        android:textSize=\"30dp\" />\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/sendEmail\"\n" +
                "        android:layout_width=\"200dp\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_gravity=\"center\"\n" +
                "        android:layout_marginTop=\"90dp\"\n" +
                "        android:text=\"compose_email\"/>\n" +
                "\n" +
                "</LinearLayout>");
        email_manifest.setTextIsSelectable(true);
        email_manifest.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<manifest xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "   package=\"exaple.androidalians.emaildemo\" >\n" +
                "   \n" +
                "   <application\n" +
                "      android:allowBackup=\"true\"\n" +
                "      android:icon=\"@drawable/ic_launcher\"\n" +
                "      android:label=\"@string/app_name\"\n" +
                "      android:theme=\"@style/AppTheme\" >\n" +
                "      \n" +
                "      <activity\n" +
                "         android:name=\"exaple.androidalians.emaildemo.MainActivity\"\n" +
                "         android:label=\"@string/app_name\" >\n" +
                "         \n" +
                "         <intent-filter>\n" +
                "            <action android:name=\"android.intent.action.MAIN\" />\n" +
                "            <category android:name=\"android.intent.category.LAUNCHER\" />\n" +
                "         </intent-filter>\n" +
                "         \n" +
                "      </activity>\n" +
                "      \n" +
                "   </application>\n" +
                "</manifest>");

        return view;
    }
}