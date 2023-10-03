package com.androidalians.androidpoint.Fragment.Advance.Cards;

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

import com.androidalians.androidpoint.Fragment.Advance.A_A7_Fragment;
import com.androidalians.androidpoint.Fragment.Advance.Advance;
import com.androidalians.androidpoint.R;
public class A_card_7_Fragment extends Fragment {
    TextView progress_java, progress_xml;
    ImageView progress_output;
    AppCompatImageView Btn_arrow;
    CardView progress_bar_yt;
    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_a_card_7_, container, false);

        Btn_arrow=view.findViewById(R.id.Btn_arrow);
        progress_bar_yt=view.findViewById(R.id.progress_bar_yt);

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

        progress_output = view.findViewById(R.id.progress_output);
        progress_java = view.findViewById(R.id.progress_java);
        progress_xml = view.findViewById(R.id.progress_xml);
        progress_output.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                A_A7_Fragment scroll_demo= new A_A7_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, scroll_demo, "SCROLL DEMO")
                        .addToBackStack(null)
                        .commit();
            }
        });

        progress_bar_yt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/watch?v=KkfGfrABE7o");
            }
        });
        progress_java.setTextIsSelectable(true);
        progress_java.setText("package example.androidalians.progressbar;\n" +
                "\n" +
                "import android.app.ProgressDialog;\n" +
                "import android.support.v7.app.ActionBarActivity;\n" +
                "import android.os.Bundle;\n" +
                "import android.view.View;\n" +
                "import android.widget.Button;\n" +
                "\n" +
                "public class MainActivity extends ActionBarActivity {\n" +
                "\n" +
                " Button button;\n" +
                " private ProgressDialog progress;\n" +
                "   \n" +
                " protected void onCreate(Bundle savedInstanceState) {\n" +
                "    super.onCreate(savedInstanceState);\n" +
                "    setContentView(R.layout.activity_main);\n" +
                "    button = findViewById(R.id.button);\n" +
                "   \n" +
                "   button.setOnClickListener(new View.OnClickListener() { \n"+
                "   @Override \n"+
                "   public void onClick(View view) { \n"+
                "   progress=new ProgressDialog(this);\n" +
                "   progress.setMessage(\"Downloading Music\");\n" +
                "   progress.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);\n" +
                "   progress.setIndeterminate(true);\n" +
                "   progress.setProgress(0);\n" +
                "   progress.show();\n" +
                "      \n" +
                "      final int totalProgressTime = 100;\n" +
                "      final Thread t = new Thread() {\n" +
                "         @Override\n" +
                "         public void run() {\n" +
                "            int jumpTime = 0;\n" +
                "            \n" +
                "            while(jumpTime < totalProgressTime) {\n" +
                "               try {\n" +
                "                  sleep(200);\n" +
                "                  jumpTime += 5;\n" +
                "                  progress.setProgress(jumpTime);\n" +
                "               } catch (InterruptedException e) {\n" +
                "                  e.printStackTrace();\n" +
                "               }\n" +
                "            }\n" +
                "         }\n" +
                "      };\n" +
                "      t.start();\n" +
                "   }\n" +
                "}");
        progress_xml.setTextIsSelectable(true);
        progress_xml.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\">\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/button\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_alignParentTop=\"true\"\n" +
                "        android:layout_centerHorizontal=\"true\"\n" +
                "        android:layout_marginTop=\"216dp\"\n" +
                "        android:text=\"download file\" />\n" +
                "\n" +
                "</RelativeLayout>");

        return view;
    }
    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}