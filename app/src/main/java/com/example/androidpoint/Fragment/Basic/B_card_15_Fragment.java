package com.example.androidpoint.Fragment.Basic;

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
import android.widget.TextView;

import com.example.androidpoint.DemoFragments.ContextMenuFragment;
import com.example.androidpoint.R;

public class B_card_15_Fragment extends Fragment {
    TextView contextMenu_java, contextMenu_xml;
    AppCompatImageView contextMenu_demo, contextMenu_Code_arrow;
    @SuppressLint({"SetTextI18n", "MissingInflatedId"})

    CardView context_menu_yt;

    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b_card_15_, container, false);

        contextMenu_java = view.findViewById(R.id.contextMenu_java);
        contextMenu_java.setTextIsSelectable(true);

        contextMenu_xml = view.findViewById(R.id.contextMenu_xml);
        contextMenu_xml.setTextIsSelectable(true);

        contextMenu_demo = view.findViewById(R.id.contextMenu_demo);
        context_menu_yt = view.findViewById(R.id.context_menu_yt);
        contextMenu_Code_arrow = view.findViewById(R.id.contextMenu_Code_arrow);

        contextMenu_Code_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Basic basic = new Basic();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, basic, "Back Button Basic")
                        .commit();
            }
        });

        context_menu_yt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/watch?v=snqGURFJv2g");

            }
        });

        contextMenu_demo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ContextMenuFragment contextMenuFragment = new ContextMenuFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, contextMenuFragment, "Context Menu Demo")
                        .commit();
            }
        });

        contextMenu_java.setText("package example.androidalians.popup;\n" +
                "\n" +
                "import android.graphics.Color;\n" +
                "import android.os.Bundle;\n" +
                "import android.view.ContextMenu;\n" +
                "import android.view.MenuItem;\n" +
                "import android.view.View;\n" +
                "import android.widget.RelativeLayout;\n" +
                "import android.widget.TextView;\n" +
                "import androidx.appcompat.app.AppCompatActivity;\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "    TextView textView;\n" +
                "    RelativeLayout relativeLayout;\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_main);\n" +
                "\n" +
                "        textView = findViewById(R.id.textView);\n" +
                "        relativeLayout = findViewById(R.id.relLayout);\n" +
                "        registerForContextMenu(textView);\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public void onCreateContextMenu(ContextMenu menu, View v,ContextMenu.ContextMenuInfo menuInfo) {\n" +
                "        super.onCreateContextMenu(menu, v, menuInfo);\n" +
                "        menu.setHeaderTitle(\"Choose a color\");\n" +
                "        menu.add(0, v.getId(), 0, \"LightYellow\");\n" +
                "        menu.add(0, v.getId(), 0, \"Purple\");\n" +
                "        menu.add(0, v.getId(), 0, \"Green\");\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public boolean onContextItemSelected(MenuItem item) {\n" +
                "        if (item.getTitle() == \"LightYellow\") {\n" +
                "            relativeLayout.setBackgroundColor(Color.argb(100,255,193,7));\n" +
                "        } else if (item.getTitle() == \"Purple\") {\n" +
                "            relativeLayout.setBackgroundColor(Color.argb(100,89,64,187));\n" +
                "        } else if (item.getTitle() == \"Green\") {\n" +
                "            relativeLayout.setBackgroundColor(Color.argb(100,3,209,111));\n" +
                "        }\n" +
                "        return true;\n" +
                "    }\n" +
                "}");

        contextMenu_xml.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:id=\"@+id/relLayout\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    android:gravity=\"center\"\n" +
                "    android:orientation=\"vertical\">\n" +
                "\n" +
                "    <TextView\n" +
                "        android:id=\"@+id/textView\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_centerHorizontal=\"true\"\n" +
                "        android:text=\"Long press me!\"/>\n" +
                "\n" +
                "</LinearLayout>");

        return view;
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}