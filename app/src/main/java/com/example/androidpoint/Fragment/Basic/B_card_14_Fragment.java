package com.example.androidpoint.Fragment.Basic;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.example.androidpoint.DemoFragments.OptionMenuFragment;
import com.example.androidpoint.R;

public class B_card_14_Fragment extends Fragment {
    AppCompatImageView optionMenu_demo, optionmenu_code_arrow;
    TextView optionMenu_java, option_xml_menu;

    CardView option_menu_yt;
    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_b_card_14_, container, false);

        optionMenu_java = view.findViewById(R.id.optionMenu_java);
        optionMenu_java.setTextIsSelectable(true);

        option_xml_menu = view.findViewById(R.id.option_xml_menu);
        option_xml_menu.setTextIsSelectable(true);

        optionMenu_demo = view.findViewById(R.id.optionMenu_demo);
        option_menu_yt = view.findViewById(R.id.option_menu_yt);

        optionmenu_code_arrow = view.findViewById(R.id.optionmenu_code_arrow);
        optionmenu_code_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Basic basic = new Basic();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, basic, "Option Menu Code Back")
                        .commit();
            }
        });

        option_menu_yt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/watch?v=-aLpcYdeSbw");
            }
        });
        optionMenu_demo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OptionMenuFragment optionMenuFragment = new OptionMenuFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, optionMenuFragment, "Option Menu Demo")
                        .commit();
            }
        });

        optionMenu_java.setText("package com.example.popup;\n" +
                "\n" +
                "import android.os.Bundle;\n" +
                "import android.view.Menu;\n" +
                "import android.view.MenuItem;\n" +
                "import android.widget.Toast;\n" +
                "import androidx.appcompat.app.AppCompatActivity;\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_main);\n" +
                "    }\n" +
                "    @Override\n" +
                "    public boolean onCreateOptionsMenu(Menu menu) {\n" +
                "        getMenuInflater().inflate(R.menu.menu, menu);\n" +
                "        return true;\n" +
                "    }\n" +
                "    @Override\n" +
                "    public boolean onOptionsItemSelected(MenuItem item) {\n" +
                "        Toast.makeText(this, \"Selected Item: \" + item.getTitle(), \n" +
                "                                           Toast.LENGTH_SHORT).show();\n" +
                "        return true;\n" +
                "    }\n" +
                "}");


        option_xml_menu.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<menu xmlns:android=\"http://schemas.android.com\">\n" +
                "                               /apk/res/android\">\n" +
                "    <item\n" +
                "        android:id=\"@+id/upload\"\n" +
                "        android:title=\"Upload\"/>\n" +
                "    <item\n" +
                "        android:id=\"@+id/search\"\n" +
                "        android:title=\"Search\"/>\n" +
                "    <item\n" +
                "        android:id=\"@+id/contact\"\n" +
                "        android:title=\"Contact us\"/>\n" +
                "</menu>");

        return view;
    }
    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}