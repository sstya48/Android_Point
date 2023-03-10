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


public class A_card_7_Fragment extends Fragment {

    TextView progress_java, progress_xml;
    ImageView progress_output;

    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_a_card_7_, container, false);

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

        progress_java.setText("package com.example.sairamkrishna.myapplication;\n" +
                "\n" +
                "import android.app.ProgressDialog;\n" +
                "import android.support.v7.app.ActionBarActivity;\n" +
                "import android.os.Bundle;\n" +
                "import android.view.View;\n" +
                "import android.widget.Button;\n" +
                "\n" +
                "public class MainActivity extends ActionBarActivity {\n" +
                "   Button button;\n" +
                "   private ProgressDialog progress;\n" +
                "   \n" +
                "   protected void onCreate(Bundle savedInstanceState) {\n" +
                "      super.onCreate(savedInstanceState);\n" +
                "      setContentView(R.layout.activity_main);\n" +
                "      button = (Button) findViewById(R.id.button);\n" +
                "   \n" +
                "button.setOnClickListener(new View.OnClickListener() { \n"+
                "    @Override \n"+
                 "   public void onClick(View view) { \n"+
                "      progress=new ProgressDialog(this);\n" +
                "      progress.setMessage(\"Downloading Music\");\n" +
                "      progress.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);\n" +
                "      progress.setIndeterminate(true);\n" +
                "      progress.setProgress(0);\n" +
                "      progress.show();\n" +
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
                "                  // TODO Auto-generated catch block\n" +
                "                  e.printStackTrace();\n" +
                "               }\n" +
                "            }\n" +
                "         }\n" +
                "      };\n" +
                "      t.start();\n" +
                "   }\n" +
                "}");

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
}