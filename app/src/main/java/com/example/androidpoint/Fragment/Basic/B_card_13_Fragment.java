package com.example.androidpoint.Fragment.Basic;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import com.example.androidpoint.DemoFragments.Explicit_Intent1_Fragment;
import com.example.androidpoint.R;

public class B_card_13_Fragment extends Fragment {
    TextView explicit_java, explicit_xml;
    TextView explicit2_java, explicit2_xml;
    AppCompatImageView explicit_demo, Btn_arrow;

    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b_card_13_, container, false);

        explicit_java = view.findViewById(R.id.explicit_java);
        explicit_java.setTextIsSelectable(true);

        explicit_xml = view.findViewById(R.id.explicit_xml);
        explicit_xml.setTextIsSelectable(true);

        explicit2_java = view.findViewById(R.id.explicit2_java);
        explicit2_java.setTextIsSelectable(true);

        explicit2_xml = view.findViewById(R.id.explicit2_xml);
        explicit2_xml.setTextIsSelectable(true);

        explicit_demo = view.findViewById(R.id.explicit_demo);

        Btn_arrow = view.findViewById(R.id.Btn_arrow);

        Btn_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Basic basic = new Basic();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, basic, "Back Button Basic")
                        .addToBackStack(null)
                        .commit();
            }
        });
        explicit_demo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Explicit_Intent1_Fragment explicitIntent1Fragment = new Explicit_Intent1_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, explicitIntent1Fragment, "Explicit Demo")
                        .addToBackStack(null)
                        .commit();
            }
        });

        explicit_java.setText("package example.com.explicitintent;\n" +
                "\n" +
                "import androidx.appcompat.app.AppCompatActivity;\n" +
                "import android.content.Intent;\n" +
                "import android.os.Bundle;\n" +
                "import android.view.View;\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "    TextView editText;\n" +
                "    Button btn;\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_main);\n" +
                "\n" +
                "        editText=view.findViewById(R.id.editText);\n" +
                "        btn=view.findViewById(R.id.btn);\n" +
                "        btn.setOnClickListener(new View.OnClickListener() {\n" +
                "         @Override\n" +
                "         public void onClick(View view) {\n" +
                "           Intent i = new Intent(getApplicationContext(), \n" +
                "                               SecondActivity.class);\n" +
                "           startActivity(i);\n" +
                "            }\n" +
                "        });\n" +
                "    }\n" +
                "}");

        explicit_xml.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<LinearLayout xmlns:android=\"http://schemas.android.com\"\n" +
                "                                       /apk/res/android\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    android:gravity=\"center\"\n" +
                "    android:orientation=\"vertical\">\n" +
                "\n" +
                "    <TextView\n" +
                "        android:id=\"@+id/editText\"\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:text=\"Welcome to First Activity\"\n" +
                "        android:textSize=\"20sp\" />\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/btn\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:text=\"Go to Second Activity\" />\n" +
                "\n" +
                "</LinearLayout>");


        explicit2_java.setText("package example.com.explicitintent;\n" +
                "\n" +
                "import androidx.appcompat.app.AppCompatActivity;\n" +
                "import android.content.Intent;\n" +
                "import android.os.Bundle;\n" +
                "import android.view.View;\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "    TextView editText2;\n" +
                "    Button btn2;\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_main);\n" +
                "\n" +
                "        editText2=view.findViewById(R.id.editText2);\n" +
                "        btn2=view.findViewById(R.id.btn2);\n" +
                "        btn2.setOnClickListener(new View.OnClickListener() {\n" +
                "         @Override\n" +
                "         public void onClick(View view) {\n" +
                "           Intent i = new Intent(getApplicationContext(),\n" +
                "                                       MainActivity.class);\n" +
                "            startActivity(i);\n" +
                "            }\n" +
                "        });\n" +
                "    }\n" +
                "}");

        explicit2_xml.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<LinearLayout xmlns:android=\"http://schemas.android.com\"\n" +
                "                                       /apk/res/android\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    android:gravity=\"center\"\n" +
                "    android:orientation=\"vertical\">\n" +
                "\n" +
                "    <TextView\n" +
                "        android:id=\"@+id/editText2\"\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:text=\"Welcome to Second Activity\"\n" +
                "        android:textAlignment=\"center\"\n" +
                "        android:textSize=\"20sp\" />\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/btn2\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:text=\"Go to First Activity\" />\n" +
                "\n" +
                "</LinearLayout>");

        return view;
    }
}