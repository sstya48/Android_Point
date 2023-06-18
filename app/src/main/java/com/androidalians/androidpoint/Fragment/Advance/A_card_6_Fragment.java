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

public class A_card_6_Fragment extends Fragment {
    TextView webview_java, webview_xml, manifest_xml;
    AppCompatImageView Btn_arrow;
    ImageView webview_output;

    CardView web_view_yt;
    @SuppressLint({"SetTextI18n", "MissingInflatedId"})
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a_card_6_, container, false);

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

        webview_output = view.findViewById(R.id.webview_output);
        webview_java = view.findViewById(R.id.webview_java);
        webview_xml = view.findViewById(R.id.webview_xml);
        manifest_xml = view.findViewById(R.id.manifest_xml);
        web_view_yt = view.findViewById(R.id.web_view_yt);

        webview_output.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                A_A6_Fragment scroll_demo= new A_A6_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, scroll_demo, "SCROLL DEMO")
                        .addToBackStack(null)
                        .commit();
            }
        });
        web_view_yt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/watch?v=545zjNc9tnY");
            }
        });

        manifest_xml.setTextIsSelectable(true);
        manifest_xml.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<manifest xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    package=\"com.example.geeksforgeeks\"\n" +
                "    android:versionCode=\"1\"\n" +
                "    android:versionName=\"1.0\"\n" +
                "    android:installLocation=\"preferExternal\">\n" +
                "   \n" +
                "       <uses-permission android:name=\"android.permission.INTERNET\" /> \n" +
                " \n" +
                "    <application\n" +
                "        android:allowBackup=\"true\"\n" +
                "        android:dataExtractionRules=\"@xml/data_extraction_rules\"\n" +
                "        android:fullBackupContent=\"@xml/backup_rules\"\n" +
                "        android:icon=\"@mipmap/ic_launcher\"\n" +
                "        android:label=\"@string/app_name\"\n" +
                "        android:roundIcon=\"@mipmap/ic_launcher_round\"\n" +
                "        android:supportsRtl=\"true\"\n" +
                "        android:theme=\"@style/Theme.MyApplication\"\n" +
                "        tools:targetApi=\"31\">\n" +
                "        <activity\n" +
                "            android:name=\".MainActivity\"\n" +
                "            android:exported=\"true\">\n" +
                "            <intent-filter>\n" +
                "             <action android:name=\"android.intent.action.MAIN\"/>\n" +
                " \n" +
                "             <category android:name=\"android.intent.category.LAUNCHER\"/>\n" +
                "            </intent-filter>\n" +
                "        </activity>\n" +
                "    </application>\n" +
                " \n" +
                "</manifest>");
        webview_java.setTextIsSelectable(true);
        webview_java.setText("package com.example.androidalians.webviewdemo;\n" +
                "\n" +
                "import android.app.Activity;\n" +
                "import android.os.Bundle;\n" +
                "import android.view.View;\n" +
                "import android.webkit.WebView;\n" +
                "import android.webkit.WebViewClient;\n" +
                "import android.widget.Button;\n" +
                "import android.widget.EditText;\n" +
                "\n" +
                "public class MainActivity extends Activity  {\n" +
                "\n" +
                "   Button button;\n" +
                "   EditText editText;\n" +
                "   WebView webview;\n" +
                "\n" +
                "   @Override\n" +
                "   protected void onCreate(Bundle savedInstanceState) {\n" +
                "    super.onCreate(savedInstanceState);\n" +
                "    setContentView(R.layout.activity_main);\n" +
                "\n" +
                "    button = findViewById(R.id.button);\n" +
                "    editText = findViewById(R.id.editText);\n" +
                "    webview = findViewById(R.id.webView);\n" +
                "    webview.setWebViewClient(new MyBrowser());\n" +
                "\n" +
                "    button.setOnClickListener(new View.OnClickListener() {\n" +
                "     @Override\n" +
                "     public void onClick(View v) {\n" +
                "       String url = edittext.getText().toString();\n" +
                "\n" +
                "       webview.getSettings().setLoadsImagesAutomatically(true);\n" +
                "       webview.getSettings().setJavaScriptEnabled(true);\n" +
                "       webview.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);\n" +
                "       webview.loadUrl(url);\n" +
                "         }\n" +
                "      });\n" +
                "   }\n" +
                "\n" +
                "  private class MyBrowser extends WebViewClient {\n" +
                "    @Override\n" +
                "    public boolean shouldOverrideUrlLoading(WebView view,String url) {\n" +
                "       view.loadUrl(url);\n" +
                "       return true;\n" +
                "      }\n" +
                "   }\n" +
                "}");
        webview_xml.setTextIsSelectable(true);
        webview_xml.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    android:orientation=\"vertical\">\n" +
                "\n" +
                "    <EditText\n" +
                "        android:id=\"@+id/editText\"\n" +
                "        android:layout_width=\"190dp\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_marginTop=\"40dp\"\n" +
                "        android:layout_gravity=\"center\"\n" +
                "        android:hint=\"Enter Text\"\n" +
                "        android:focusable=\"true\"/>\n" +
                "    \n" +
                "    <Button\n" +
                "        android:id=\"@+id/button\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_gravity=\"center\"\n" +
                "        android:text=\"Enter\"\n" +
                "        android:layout_marginTop=\"20dp\"/>\n" +
                "\n" +
                "    <WebView\n" +
                "        android:id=\"@+id/webView\"\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"match_parent\"\n" +
                "        android:layout_below=\"@+id/button\"\n" +
                "        android:layout_marginTop=\"10dp\"/>\n" +
                "\n" +
                "</LinearLayout>");

        return view;
    }
    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}