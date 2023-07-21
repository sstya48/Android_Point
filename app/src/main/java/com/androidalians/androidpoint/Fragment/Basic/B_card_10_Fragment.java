package com.androidalians.androidpoint.Fragment.Basic;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.androidalians.androidpoint.DemoFragments.Scroll_Demo_Fragment;
import com.androidalians.androidpoint.R;

public class B_card_10_Fragment extends Fragment {
    TextView scroll_java,scroll_xml;
    AppCompatImageView scrollView_code_arrow,scroll_demo;
    @SuppressLint({"SetTextI18n", "MissingInflatedId"})
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_b_card_10_, container, false);

        scroll_java=view.findViewById(R.id.scroll_java);
        scroll_java.setTextIsSelectable(true);

        scroll_xml=view.findViewById(R.id.scroll_xml);
        scroll_xml.setTextIsSelectable(true);

        scroll_demo=view.findViewById(R.id.scroll_demo);

        scrollView_code_arrow=view.findViewById(R.id.scrollView_code_arrow);

        scrollView_code_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Basic basic= new Basic();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, basic, "ScrollView Code Back")
                        .commit();
            }
        });

        scroll_demo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Scroll_Demo_Fragment scroll_demo= new Scroll_Demo_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, scroll_demo, "SCROLL DEMO")
                        .commit();

            }
        });

        scroll_java.setText("package com.example.test.scrollviews;  \n" +
                "  \n" +
                "import android.support.v7.app.AppCompatActivity;  \n" +
                "import android.os.Bundle;  \n" +
                "  \n" +
                "public class MainActivity extends AppCompatActivity {  \n" +
                "  \n" +
                "   @Override  \n" +
                "   protected void onCreate(Bundle savedInstanceState) {  \n" +
                "      super.onCreate(savedInstanceState);  \n" +
                "      setContentView(R.layout.activity_main);  \n" +
                "    }  \n" +
                "}  ");


        scroll_xml.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    android:padding=\"10dp\"\n" +
                "    android:orientation=\"vertical\"> \n" +
                "\n" +
                "    <TextView\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:textAppearance=\"?android:attr/textAppearanceMedium\"\n" +
                "        android:text=\"Vertical ScrollView example\"\n" +
                "        android:id=\"@+id/textView\"\n" +
                "        android:layout_gravity=\"center_horizontal\"\n" +
                "        android:layout_centerHorizontal=\"true\"\n" +
                "        android:layout_alignParentTop=\"true\" />\n" +
                "\n" +
                "    <ScrollView android:layout_marginTop=\"30dp\"\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:id=\"@+id/scrollView\">\n" +
                "\n" +
                "        <LinearLayout\n" +
                "            android:layout_width=\"match_parent\"\n" +
                "            android:layout_height=\"match_parent\"\n" +
                "            android:orientation=\"vertical\" >\n" +
                "\n" +
                "            <Button\n" +
                "                android:layout_width=\"match_parent\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:text=\"Button 1\"\n" +
                "                android:background=\"@color/mango\"\n" +
                "                android:layout_margin=\"8dp\"\n" +
                "                android:textColor=\"@color/white\"/>\n" +
                "\n" +
                "            <Button\n" +
                "                android:layout_width=\"match_parent\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:text=\"Button 2\"\n" +
                "                android:background=\"@color/purple_200\"\n" +
                "                android:layout_margin=\"8dp\"\n" +
                "                android:textColor=\"@color/white\"/>\n" +
                "\n" +
                "            <Button\n" +
                "                android:layout_width=\"match_parent\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:text=\"Button 3\"\n" +
                "                android:background=\"@color/teal_700\"\n" +
                "                android:layout_margin=\"8dp\"\n" +
                "                android:textColor=\"@color/white\"/>\n" +
                "\n" +
                "            <Button\n" +
                "                android:layout_width=\"match_parent\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:text=\"Button 4\"\n" +
                "                android:background=\"@color/lightpeach\"\n" +
                "                android:layout_margin=\"8dp\"\n" +
                "                android:textColor=\"@color/white\"/>\n" +
                "\n" +
                "            <Button\n" +
                "                android:layout_width=\"match_parent\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:text=\"Button 5\"\n" +
                "                android:background=\"@color/active\"\n" +
                "                android:layout_margin=\"8dp\"\n" +
                "                android:textColor=\"@color/white\"/>\n" +
                "\n" +
                "            <Button\n" +
                "                android:layout_width=\"match_parent\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:text=\"Button 6\"\n" +
                "                android:background=\"@color/mango\"\n" +
                "                android:layout_margin=\"8dp\"\n" +
                "                android:textColor=\"@color/white\"\n" +
                "                />\n" +
                "            <Button\n" +
                "                android:layout_width=\"match_parent\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:text=\"Button 7\"\n" +
                "                android:background=\"@color/purple_200\"\n" +
                "                android:layout_margin=\"8dp\"\n" +
                "                android:textColor=\"@color/white\"/>\n" +
                "\n" +
                "            <Button\n" +
                "                android:layout_width=\"match_parent\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:text=\"Button 8\"\n" +
                "                android:background=\"@color/teal_700\"\n" +
                "                android:layout_margin=\"8dp\"\n" +
                "                android:textColor=\"@color/white\"/>\n" +
                "\n" +
                "            <Button\n" +
                "                android:layout_width=\"match_parent\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:text=\"Button 9\"\n" +
                "                android:background=\"@color/lightpeach\"\n" +
                "                android:layout_margin=\"8dp\"\n" +
                "                android:textColor=\"@color/white\"/>\n" +
                "\n" +
                "            <Button\n" +
                "                android:layout_width=\"match_parent\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:text=\"Button 10\"\n" +
                "                android:background=\"@color/active\"\n" +
                "                android:layout_margin=\"8dp\"\n" +
                "                android:textColor=\"@color/white\"/>\n" +
                "\n" +
                "            <Button\n" +
                "                android:layout_width=\"match_parent\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:text=\"Button 11\"\n" +
                "                android:background=\"@color/mango\"\n" +
                "                android:layout_margin=\"8dp\"\n" +
                "                android:textColor=\"@color/white\"/>\n" +
                "\n" +
                "            <Button\n" +
                "                android:layout_width=\"match_parent\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:text=\"Button 12\"\n" +
                "                android:background=\"@color/purple_200\"\n" +
                "                android:layout_margin=\"8dp\"\n" +
                "                android:textColor=\"@color/white\"/>\n" +
                "\n" +
                "            <Button\n" +
                "                android:layout_width=\"match_parent\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:text=\"Button 13\"\n" +
                "                android:background=\"@color/teal_700\"\n" +
                "                android:layout_margin=\"8dp\"\n" +
                "                android:textColor=\"@color/white\"/>\n" +
                "\n" +
                "            <Button\n" +
                "                android:layout_width=\"fill_parent\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:text=\"Button 14\"\n" +
                "                android:background=\"@color/lightpeach\"\n" +
                "                android:layout_margin=\"8dp\"\n" +
                "                android:textColor=\"@color/white\"/>\n" +
                "\n" +
                "            <Button\n" +
                "                android:layout_width=\"fill_parent\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:text=\"Button 15\"\n" +
                "                android:background=\"@color/active\"\n" +
                "                android:layout_margin=\"8dp\"\n" +
                "                android:textColor=\"@color/white\"/>\n" +
                "\n" +
                "            <Button\n" +
                "                android:layout_width=\"fill_parent\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:text=\"Button 16\"\n" +
                "                android:background=\"@color/mango\"\n" +
                "                android:layout_margin=\"8dp\"\n" +
                "                android:textColor=\"@color/white\"/>\n" +
                "\n" +
                "            <Button\n" +
                "                android:layout_width=\"match_parent\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:text=\"Button 17\"\n" +
                "                android:background=\"@color/purple_200\"\n" +
                "                android:layout_margin=\"8dp\"\n" +
                "                android:textColor=\"@color/white\"/>\n" +
                "\n" +
                "            <Button\n" +
                "                android:layout_width=\"match_parent\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:text=\"Button 18\"\n" +
                "                android:background=\"@color/teal_700\"\n" +
                "                android:layout_margin=\"8dp\"\n" +
                "                android:textColor=\"@color/white\"/>\n" +
                "\n" +
                "            <Button\n" +
                "                android:layout_width=\"match_parent\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:text=\"Button 19\"\n" +
                "                android:background=\"@color/lightpeach\"\n" +
                "                android:layout_margin=\"8dp\"\n" +
                "                android:textColor=\"@color/white\"/>\n" +
                "\n" +
                "            <Button\n" +
                "                android:layout_width=\"match_parent\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:text=\"Button 20\"\n" +
                "                android:background=\"@color/active\"\n" +
                "                android:layout_margin=\"8dp\"\n" +
                "                android:textColor=\"@color/white\"/>\n" +
                "\n" +
                "        </LinearLayout>\n" +
                "\n" +
                "    </ScrollView>\n" +
                "\n" +
                "</LinearLayout>");

        return view;
    }
}