package com.example.androidpoint.Fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.androidpoint.DemoFragments.ContextMenuFragment;
import com.example.androidpoint.DemoFragments.Popup_Menu_Fragment;
import com.example.androidpoint.R;

public class B_card_16_Fragment extends Fragment {

    TextView popup_java,popup_xml,popup_xml_menu;

    AppCompatImageView popup_demo,Btn_arrow;

    @SuppressLint({"SetTextI18n", "MissingInflatedId"})
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_b_card_16_, container, false);

        popup_java = view.findViewById(R.id.popup_java);
        popup_java.setTextIsSelectable(true);

        popup_xml = view.findViewById(R.id.popup_xml);
        popup_xml.setTextIsSelectable(true);

        popup_xml_menu = view.findViewById(R.id.popup_xml_menu);
        popup_xml_menu.setTextIsSelectable(true);

        popup_demo = view.findViewById(R.id.popup_demo);

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

        popup_demo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Popup_Menu_Fragment popupMenuFragment = new Popup_Menu_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, popupMenuFragment, "Popup Menu Demo")
                        .addToBackStack(null)
                        .commit();
            }
        });

        popup_java.setText("package com.example.popup;\n" +
                "\n" +
                "import android.os.Bundle;\n" +
                "import android.view.MenuItem;\n" +
                "import android.view.View;\n" +
                "import android.widget.Button;\n" +
                "import android.widget.Toast;\n" +
                "\n" +
                "import androidx.appcompat.app.AppCompatActivity;\n" +
                "import androidx.appcompat.widget.PopupMenu;\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "    Button button;\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_main);\n" +
                "\n" +
                "        button = findViewById(R.id.button);\n" +
                "\n" +
                "        button.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View view) {\n" +
                "                PopupMenu popup = new PopupMenu(MainActivity.this, button);\n" +
                "                //Inflating the Popup using xml file\n" +
                "                popup.getMenuInflater().inflate(R.menu.menu, popup.getMenu());\n" +
                "\n" +
                "                //registering popup with OnMenuItemClickListener\n" +
                "                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {\n" +
                "                    public boolean onMenuItemClick(MenuItem item) {\n" +
                "                        Toast.makeText(MainActivity.this, \"You Clicked : \" + item.getTitle(), Toast.LENGTH_SHORT).show();\n" +
                "                        return true;\n" +
                "                    }\n" +
                "                });\n" +
                "                popup.show();\n" +
                "            }\n" +
                "        });\n" +
                "    }\n" +
                "}");

        popup_xml.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    android:gravity=\"center\"\n" +
                "    android:orientation=\"vertical\">\n" +
                "\n" +
                "        <Button\n" +
                "            android:id=\"@+id/button\"\n" +
                "            android:layout_width=\"wrap_content\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:text=\"Click\"\n" +
                "            android:textSize=\"20sp\"\n" +
                "            android:textStyle=\"bold\" />\n" +
                "\n" +
                "</LinearLayout>");

        popup_xml_menu.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<menu xmlns:android=\"http://schemas.android.com/apk/res/android\">\n" +
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
}