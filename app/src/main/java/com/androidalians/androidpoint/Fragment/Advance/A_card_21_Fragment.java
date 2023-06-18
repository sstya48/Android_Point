package com.androidalians.androidpoint.Fragment.Advance;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.androidalians.androidpoint.R;
public class A_card_21_Fragment extends Fragment {
    ImageView fing_btn_output;
    CardView fingur_print_yt;
    TextView fing_java,fing_xml, SecondActivity_xml, gridal_xml;
    AppCompatImageView Btn_arrow;
    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a_card_21_, container, false);

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

        fing_btn_output = view.findViewById(R.id.fing_btn_output);

        fing_btn_output.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                A_A21_Fragment scroll_demo= new A_A21_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, scroll_demo, "SCROLL DEMO")
                        .addToBackStack(null)
                        .commit();

            }
        });

        fingur_print_yt=view.findViewById(R.id.fingur_print_yt);
        fingur_print_yt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/watch?v=61eCsySkjH0&t=664s");
            }
        });

        fing_java= view.findViewById(R.id.fing_java);
        fing_xml= view.findViewById(R.id.fing_xml);
        SecondActivity_xml= view.findViewById(R.id.SecondActivity_xml);
        gridal_xml= view.findViewById(R.id.gridal_xml);



        fing_java.setText("package example.androidalians.fingurprint;\n" +
                "\n" +
                "import static androidx.biometric.BiometricManager\n" +
                "                       .Authenticators.BIOMETRIC_STRONG;\n" +
                "import static androidx.biometric.BiometricManager\n" +
                "                   .Authenticators.DEVICE_CREDENTIAL;\n" +
                "import androidx.annotation.NonNull;\n" +
                "import androidx.appcompat.app.AppCompatActivity;\n" +
                "import androidx.biometric.BiometricManager;\n" +
                "import androidx.biometric.BiometricPrompt;\n" +
                "import androidx.core.content.ContextCompat;\n" +
                "import android.annotation.SuppressLint;\n" +
                "import android.content.Intent;\n" +
                "import android.os.Bundle;\n" +
                "import android.provider.Settings;\n" +
                "import android.util.Log;\n" +
                "import android.widget.Button;\n" +
                "import android.widget.ImageView;\n" +
                "import android.widget.Toast;\n" +
                "\n" +
                "import java.util.concurrent.Executor;\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "    private static final int REQUEST_CODE = 111111;\n" +
                "    ImageView imageview;\n" +
                "    private Executor executor;\n" +
                "    private BiometricPrompt biometricPrompt;\n" +
                "    private BiometricPrompt.PromptInfo promptInfo;\n" +
                "\n" +
                "    @SuppressLint(\"MissingInflatedId\")\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_main);\n" +
                "\n" +
                "        imageview = findViewById(R.id.imageview);\n" +
                "\n" +
                "        BiometricManager biometricManager = BiometricManager.from(this);\n" +
                "        switch (biometricManager.canAuthenticate(BIOMETRIC_STRONG | DEVICE_CREDENTIAL)) {\n" +
                "         case BiometricManager.BIOMETRIC_SUCCESS:\n" +
                "           break;\n" +
                "\n" +
                "         case BiometricManager.BIOMETRIC_ERROR_NO_HARDWARE:\n" +
                "          Toast.makeText(this,\"No features available on your device\",Toast.LENGTH_LONG).show();\n" +
                "            break;\n" +
                "\n" +
                "         case BiometricManager.BIOMETRIC_ERROR_HW_UNAVAILABLE:\n" +
                "           Toast.makeText(this, \"Biometric features are currentlyunavailable\",Toast.LENGTH_LONG).show();\n" +
                "            break;\n" +
                "\n" +
                "         case BiometricManager.BIOMETRIC_ERROR_NONE_ENROLLED:\n" +
                "            final Intent enrollIntent = new Intent(Settings.ACTION_BIOMETRIC_ENROLL);\n" +
                "            enrollIntent.putExtra(Settings.EXTRA_BIOMETRIC_AUTHENTICATORS_ALLOWED, BIOMETRIC_STRONG | DEVICE_CREDENTIAL);\n" +
                "            startActivityForResult(enrollIntent, REQUEST_CODE);\n" +
                "            break;\n" +
                "        }\n" +
                "\n" +
                "        executor = ContextCompat.getMainExecutor(this);\n" +
                "        biometricPrompt = new BiometricPrompt(MainActivity.this,executor, new BiometricPrompt.AuthenticationCallback() {\n" +
                "            @Override\n" +
                "            public void onAuthenticationError(int errorCode,@NonNull CharSequence errString) {\n" +
                "              super.onAuthenticationError(errorCode, errString);\n" +
                "              Toast.makeText(getApplicationContext(), \"Authentication error: \" + errString,Toast.LENGTH_SHORT).show();\n" +
                "            }\n" +
                "            @Override\n" +
                "            public void onAuthenticationSucceeded(@NonNull BiometricPrompt.AuthenticationResult result) {\n" +
                "                super.onAuthenticationSucceeded(result);\n" +
                "                Toast.makeText(getApplicationContext(),\"Authentication succeeded!\",Toast.LENGTH_SHORT).show();\n" +
                "            }\n" +
                "          @Override\n" +
                "          public void onAuthenticationFailed() {\n" +
                "            super.onAuthenticationFailed();\n" +
                "            startActivity(new Intent(MainActivity.this, secpage.class));\n" +
                "            Toast.makeText(getApplicationContext(), \"Authentication failed\",Toast.LENGTH_SHORT).show();\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "        promptInfo = new BiometricPrompt.PromptInfo.Builder()\n" +
                "                .setTitle(\"Biometric login for my app\")\n" +
                "                .setSubtitle(\"Log in using your biometric credential\")\n" +
                "                .setNegativeButtonText(\"Use account password\")\n" +
                "                .build();\n" +
                "\n" +
                "        imageview.setOnClickListener(view -> {\n" +
                "            biometricPrompt.authenticate(promptInfo);\n" +
                "        });\n" +
                "    }\n" +
                "}");
        fing_java.setTextIsSelectable(true);

        fing_xml.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<LinearLayout xmlns:android=\"http://schemas.android.com\n" +
                "                                         /apk/res/android\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    android:orientation=\"vertical\">\n" +
                "\n" +
                "    <TextView\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:text=\"Login Activity\"\n" +
                "        android:textSize=\"25sp\"\n" +
                "        android:layout_gravity=\"center\"\n" +
                "        android:layout_marginTop=\"200dp\"\n" +
                "        android:textColor=\"@color/black\"/>\n" +
                "\n" +
                "    <ImageView\n" +
                "        android:id=\"@+id/imageview\"\n" +
                "        android:layout_width=\"100dp\"\n" +
                "        android:layout_height=\"100dp\"\n" +
                "        android:src=\"@drawable/baseline_fingerprint_24\"\n" +
                "        android:layout_gravity=\"center\"\n" +
                "        android:layout_marginTop=\"50dp\"/>\n" +
                "    \n" +
                "</LinearLayout>");
        fing_xml.setTextIsSelectable(true);

        SecondActivity_xml.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<LinearLayout xmlns:android=\"http://schemas.android.com\n" +
                "                               /apk/res/android\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    android:orientation=\"vertical\"\n" +
                "    tools:context=\".secpage\">\n" +
                "\n" +
                "    <TextView\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:text=\"Login Activity Susses\"\n" +
                "        android:textSize=\"25sp\"\n" +
                "        android:layout_gravity=\"center\"\n" +
                "        android:layout_marginTop=\"200dp\"\n" +
                "        android:textColor=\"@color/black\"/>\n" +
                "\n" +
                "</LinearLayout>");
        SecondActivity_xml.setTextIsSelectable(true);

        gridal_xml.setText("dependencies {\n" +
                " implementation \"androidx.biometric:biometric:1.1.0\"\n" +
                "}");
        gridal_xml.setTextIsSelectable(true);

        return view;
    }
    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}