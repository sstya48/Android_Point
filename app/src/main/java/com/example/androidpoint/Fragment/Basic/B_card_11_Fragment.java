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

import com.example.androidpoint.DemoFragments.SearchViewFragment;
import com.example.androidpoint.R;

public class B_card_11_Fragment extends Fragment {
    AppCompatImageView serchview_demo,search_code_arrow;
    TextView serchview_java,serchview_xml;

    CardView serchview_yt;
    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_b_card_11_, container, false);

        serchview_java= view.findViewById(R.id.serchview_java);
        serchview_java.setTextIsSelectable(true);

        serchview_xml= view.findViewById(R.id.serchview_xml);
        serchview_xml.setTextIsSelectable(true);

        serchview_demo= view.findViewById(R.id.serchview_demo);

        Btn_arrow=view.findViewById(R.id.Btn_arrow);
        serchview_yt=view.findViewById(R.id.serchview_yt);
        search_code_arrow=view.findViewById(R.id.search_code_arrow);

        search_code_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Basic basic= new Basic();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, basic, "Search Code Back")
                        .commit();
            }
        });

        serchview_yt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/watch?v=4ZbE8Nnet9k");
            }
        });

        serchview_demo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SearchViewFragment searchViewFragment= new SearchViewFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, searchViewFragment, "searchView DEMO")
                        .commit();
            }
        });

        serchview_xml.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<RelativeLayout xmlns:android=\"http://schemas.android.com\"\n" +
                "                                       /apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    tools:context=\".MainActivity\">\n" +
                "\n" +
                "    <ListView\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"match_parent\"\n" +
                "        android:id=\"@+id/listView\"\n" +
                "        android:divider=\"#ad5\"\n" +
                "        android:dividerHeight=\"2dp\"\n" +
                "        android:layout_marginStart=\"10dp\"\n" +
                "        android:layout_marginEnd=\"10dp\"\n" +
                "        android:layout_below=\"@+id/searchView\" />\n" +
                "\n" +
                "    <SearchView\n" +
                "        android:id=\"@+id/searchView\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:queryHint=\"Search Here\"\n" +
                "        android:iconifiedByDefault=\"false\"\n" +
                "        android:layout_marginStart=\"20dp\"\n" +
                "        android:layout_alignParentTop=\"true\"/>\n" +
                "\n" +
                "</RelativeLayout>");

        serchview_java.setText("package com.example.searchview;\n" +
                "\n" +
                "import androidx.appcompat.app.AppCompatActivity;\n" +
                "import android.annotation.SuppressLint;\n" +
                "import android.os.Bundle;\n" +
                "import android.view.View;\n" +
                "import android.widget.ArrayAdapter;\n" +
                "import android.widget.ListView;\n" +
                "import android.widget.SearchView;\n" +
                "import android.widget.Toast;\n" +
                "import java.util.ArrayList;\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "    SearchView searchView;\n" +
                "    ListView listView;\n" +
                "    ArrayList<String> list;\n" +
                "    ArrayAdapter<String> adapter;\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_main);\n" +
                "\n" +
                "        searchView = (SearchView) findViewById(R.id.searchView);\n" +
                "        listView = (ListView) findViewById(R.id.listView);\n" +
                "\n" +
                "        list = new ArrayList<>();\n" +
                "        list.add(\"Tiger\");\n" +
                "        list.add(\"Giraffe\");\n" +
                "        list.add(\"Bear\");\n" +
                "        list.add(\"Zebra\");\n" +
                "        list.add(\"Panda\");\n" +
                "        list.add(\"Gorilla\");\n" +
                "        list.add(\"Monkey\");\n" +
                "        list.add(\"Wolf\");\n" +
                "        list.add(\"Deer\");\n" +
                "        list.add(\"Fox\");\n" +
                "        list.add(\"Yak\");\n" +
                "        list.add(\"Jaguar\");\n" +
                "        list.add(\"Hyena\");\n" +
                "        list.add(\"Squirrel\");\n" +
                "        list.add(\"Elephant\");\n" +
                "        list.add(\"Crocodile\");\n" +
                "        list.add(\"Kangaroo\");\n" +
                "        list.add(\"Rhinoceros\");\n" +
                "        list.add(\"Hippopotamus\");\n" +
                "\n" +
                "        adapter = new ArrayAdapter<String>(this, android.R.layout\n" +
                "                                       .simple_list_item_1,list);\n" +
                "        listView.setAdapter(adapter);\n" +
                "\n" +
                "        searchView.setOnQueryTextListener(new SearchView \n" +
                "                                           .OnQueryTextListener() {\n" +
                "            @Override\n" +
                "            public boolean onQueryTextSubmit(String query) {\n" +
                "\n" +
                "                if(list.contains(query)){\n" +
                "                    adapter.getFilter().filter(query);\n" +
                "                }else{\n" +
                "                    Toast.makeText(MainActivity.this, \"No Match found\", \n" +
                "                                           Toast.LENGTH_LONG).show();\n" +
                "                }\n" +
                "                return false;\n" +
                "            }\n" +
                "            @Override\n" +
                "            public boolean onQueryTextChange(String newText) {\n" +
                "                //    adapter.getFilter().filter(newText);\n" +
                "                return false;\n" +
                "            }\n" +
                "        });\n" +
                "    }\n" +
                "}");

        return  view;
    }
private void gotoUrl(String s) {
    Uri uri = Uri.parse(s);
    startActivity(new Intent(Intent.ACTION_VIEW,uri));
}
}