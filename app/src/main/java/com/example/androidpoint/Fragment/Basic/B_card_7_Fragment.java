package com.example.androidpoint.Fragment.Basic;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.androidpoint.DemoFragments.ListViewFragment;
import com.example.androidpoint.R;

public class B_card_7_Fragment extends Fragment {
    AppCompatImageView listview_demo,listView_code_arrow;
    TextView list_string,list_xml,list_java,mylist_xml;

    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_b_card_7_, container, false);


        list_string=view.findViewById(R.id.list_string);
        list_string.setTextIsSelectable(true);

        list_xml=view.findViewById(R.id.list_xml);
        list_xml.setTextIsSelectable(true);

        list_java=view.findViewById(R.id.list_java);
        list_java.setTextIsSelectable(true);

//        mylist_xml= view.findViewById(R.id.mylist_xml);
//        mylist_xml.setTextIsSelectable(true);

        listview_demo=view.findViewById(R.id.listview_demo);

        listView_code_arrow=view.findViewById(R.id.listView_code_arrow);

        listView_code_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Basic basic= new Basic();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, basic, "ListView Code Back")
                        .commit();
            }
        });

        listview_demo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ListViewFragment listViewFragment= new ListViewFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, listViewFragment, "ListView DEMO")
                        .commit();
            }
        });

        list_string.setText("<resources>\n" +
                "   <string name=\"app_name\">ListFragmentDemo</string>\n" +
                "   \n" +
                "   <string-array name=\"Planets\">\n" +
                "      <item>Sun</item>\n" +
                "      <item>Mercury</item>\n" +
                "      <item>Venus</item>\n" +
                "      <item>Earth</item>\n" +
                "      <item>Mars</item>\n" +
                "      <item>Jupiter</item>\n" +
                "      <item>Saturn</item>\n" +
                "      <item>Uranus</item>\n" +
                "      <item>Neptune</item>\n" +
                "   </string-array>\n" +
                "\n" +
                "</resources>");

        list_java.setText("package listview.example.com.listview;\n" +
                "\n" +
                "    import android.support.v7.app.AppCompatActivity;\n" +
                "    import android.os.Bundle;\n" +
                "    import android.view.View;\n" +
                "    import android.widget.AdapterView;\n" +
                "    import android.widget.ArrayAdapter;\n" +
                "    import android.widget.ListView;\n" +
                "    import android.widget.TextView;\n" +
                "    import android.widget.Toast;\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "    ListView listView;\n" +
                "    TextView textView;\n" +
                "    String[] listItem;\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_main);\n" +
                "\n" +
                "        listView=(ListView)findViewById(R.id.listView);\n" +
                "        textView=(TextView)findViewById(R.id.textView);\n" +
                "        listItem = getResources().getStringArray(R.array.Planets);\n" +
                "        final ArrayAdapter<String> adapter = new \n" +
                "                           ArrayAdapter<String>(this,\n" +
                "                             android.R.layout.simple_list_item_1, \n" +
                "                               android.R.id.text1, listItem);\n" +
                "        listView.setAdapter(adapter);\n" +
                "\n" +
                "        listView.setOnItemClickListener(new " +
                "                           AdapterView.OnItemClickListener() {\n" +
                "            @Override\n" +
                "            public void onItemClick(AdapterView<?> adapterView, \n" +
                "                                  View view, int position, long l) {\n" +
                "                String value=adapter.getItem(position);\n" +
                "                Toast.makeText(getApplicationContext(), \"Item: \" \n" +
                "                       + position, Toast.LENGTH_SHORT).show();\n" +
                "\n" +
                "            }\n" +
                "        });\n" +
                "    }\n" +
                "}");



        list_xml.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<LinearLayout xmlns:android=\"http://schemas.android.com\"\n" +
                "                                        /apk/res/android\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    android:orientation=\"vertical\">\n" +
                "\n" +
                "    <ListView\n" +
                "        android:id=\"@android:id/list\"\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"wrap_content\" >\n" +
                "    </ListView>\n" +
                "\n" +
                "</LinearLayout>");


       /* mylist_xml.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>  \n" +
                "  \n" +
                "<TextView xmlns:android=\"http://schemas.android.com/apk/res/android\"  \n" +
                "    android:id=\"@+id/textView\"  \n" +
                "    android:layout_width=\"wrap_content\"  \n" +
                "    android:layout_height=\"wrap_content\"  \n" +
                "    android:text=\"Medium Text\"  \n" +
                "    android:textStyle=\"bold\"  \n" +
                "    android:textAppearance=\"?android:attr/textAppearanceMedium\"  \n" +
                "    android:layout_marginLeft=\"10dp\"  \n" +
                "    android:layout_marginTop=\"5dp\"  \n" +
                "    android:padding=\"2dp\"  \n" +
                "    android:textColor=\"#4d4d4d\"  \n" +
                "     />  ");*/

        return view;
    }
}


