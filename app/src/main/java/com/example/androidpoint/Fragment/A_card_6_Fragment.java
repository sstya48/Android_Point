package com.example.androidpoint.Fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.androidpoint.R;


public class A_card_6_Fragment extends Fragment {

    TextView webview_java, webview_xml;

    ImageView webview_output;


    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a_card_6_, container, false);

        webview_output = view.findViewById(R.id.webview_output);
        webview_java = view.findViewById(R.id.webview_java);
        webview_xml = view.findViewById(R.id.webview_xml);

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

        webview_java.setText("package com.example.krishna.webviewdemo;\n" +
                "import android.app.Activity;\n" +
                "import android.os.Bundle;\n" +
                "import android.view.View;\n" +
                "import android.webkit.WebView;\n" +
                "import android.webkit.WebViewClient;\n" +
                "import android.widget.Button;\n" +
                "import android.widget.EditText;\n" +
                "\n" +
                "\n" +
                "public class MainActivity extends Activity  {\n" +
                "   Button button;\n" +
                "   EditText editText;\n" +
                "   WebView webview;\n" +
                "\n" +
                "   @Override\n" +
                "   protected void onCreate(Bundle savedInstanceState) {\n" +
                "      super.onCreate(savedInstanceState);\n" +
                "      setContentView(R.layout.activity_main);\n" +
                "\n" +
                "      button = (Button)findViewById(R.id.button);\n" +
                "      editText = (EditText)findViewById(R.id.editText);\n" +
                "\n" +
                "      webview = (WebView)findViewById(R.id.webView);\n" +
                "      webview.setWebViewClient(new MyBrowser());\n" +
                "\n" +
                "      button.setOnClickListener(new View.OnClickListener() {\n" +
                "         @Override\n" +
                "         public void onClick(View v) {\n" +
                "            String url = edittext.getText().toString();\n" +
                "\n" +
                "            webview.getSettings().setLoadsImagesAutomatically(true);\n" +
                "            webview.getSettings().setJavaScriptEnabled(true);\n" +
                "            webview.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);\n" +
                "            webview.loadUrl(url);\n" +
                "         }\n" +
                "      });\n" +
                "   }\n" +
                "\n" +
                "   private class MyBrowser extends WebViewClient {\n" +
                "      @Override\n" +
                "      public boolean shouldOverrideUrlLoading(WebView view, String url) {\n" +
                "         view.loadUrl(url);\n" +
                "         return true;\n" +
                "      }\n" +
                "   }\n" +
                "}");

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
}