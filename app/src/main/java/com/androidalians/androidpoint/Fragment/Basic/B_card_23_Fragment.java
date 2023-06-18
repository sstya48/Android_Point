package com.androidalians.androidpoint.Fragment.Basic;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.androidalians.androidpoint.DemoFragments.AllLayout;
import com.androidalians.androidpoint.R;

public class B_card_23_Fragment extends Fragment {
    AppCompatImageView layout_demo, layout_arrow;
    TextView one_xml, two_xml, three_xml, four_xml, five_xml, six_xml;

    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b_card_23_, container, false);

        layout_demo= view.findViewById(R.id.layout_demo);
        layout_arrow= view.findViewById(R.id.layout_arrow);

        one_xml= view.findViewById(R.id.one_xml);
        one_xml.setTextIsSelectable(true);
        two_xml= view.findViewById(R.id.two_xml);
        two_xml.setTextIsSelectable(true);
        three_xml= view.findViewById(R.id.three_xml);
        three_xml.setTextIsSelectable(true);
        four_xml= view.findViewById(R.id.four_xml);
        four_xml.setTextIsSelectable(true);
        five_xml= view.findViewById(R.id.five_xml);
        five_xml.setTextIsSelectable(true);
        six_xml= view.findViewById(R.id.six_xml);
        six_xml.setTextIsSelectable(true);


        one_xml.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<FrameLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"wrap_content\"\n" +
                "    android:layout_gravity=\"center\">\n" +
                "    \n" +
                "    <FrameLayout \n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"match_parent\">\n" +
                "        \n" +
                "    <ImageButton\n" +
                "        android:layout_width=\"100dp\"\n" +
                "        android:layout_height=\"100dp\"\n" +
                "        android:layout_gravity=\"start\"/>\n" +
                "\n" +
                "    <ImageButton\n" +
                "        android:layout_width=\"100dp\"\n" +
                "        android:layout_height=\"100dp\"\n" +
                "        android:layout_gravity=\"center_horizontal\" />\n" +
                "\n" +
                "    <ImageButton\n" +
                "        android:layout_width=\"100dp\"\n" +
                "        android:layout_height=\"100dp\"\n" +
                "        android:layout_gravity=\"end\"/>\n" +
                "\n" +
                "    </FrameLayout>\n" +
                "\n" +
                "    <FrameLayout\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"match_parent\"\n" +
                "        android:layout_marginTop=\"150dp\">\n" +
                "\n" +
                "        <ImageButton\n" +
                "            android:layout_width=\"100dp\"\n" +
                "            android:layout_height=\"100dp\"\n" +
                "            android:layout_gravity=\"start\"/>\n" +
                "\n" +
                "        <ImageButton\n" +
                "            android:layout_width=\"100dp\"\n" +
                "            android:layout_height=\"100dp\"\n" +
                "            android:layout_gravity=\"center_horizontal\" />\n" +
                "\n" +
                "        <ImageButton\n" +
                "            android:layout_width=\"100dp\"\n" +
                "            android:layout_height=\"100dp\"\n" +
                "            android:layout_gravity=\"end\"/>\n" +
                "\n" +
                "    </FrameLayout>\n" +
                "\n" +
                "    <FrameLayout\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"match_parent\"\n" +
                "        android:layout_marginTop=\"300dp\">\n" +
                "\n" +
                "        <ImageButton\n" +
                "            android:layout_width=\"100dp\"\n" +
                "            android:layout_height=\"100dp\"\n" +
                "            android:layout_gravity=\"start\"/>\n" +
                "\n" +
                "        <ImageButton\n" +
                "            android:layout_width=\"100dp\"\n" +
                "            android:layout_height=\"100dp\"\n" +
                "            android:layout_gravity=\"center_horizontal\" />\n" +
                "\n" +
                "        <ImageButton\n" +
                "            android:layout_width=\"100dp\"\n" +
                "            android:layout_height=\"100dp\"\n" +
                "            android:layout_gravity=\"end\"/>\n" +
                "\n" +
                "    </FrameLayout>\n" +
                "\n" +
                "</FrameLayout>");

        two_xml.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"wrap_content\"\n" +
                "    android:orientation=\"vertical\"\n" +
                "    tools:context=\".DemoFragments.LinearLayout_Demo\">\n" +
                "\n" +
                "        <Button\n" +
                "            android:layout_width=\"match_parent\"\n" +
                "            android:layout_margin=\"10dp\"\n" +
                "            android:text=\"Button 1\"\n" +
                "            android:layout_height=\"wrap_content\"/>\n" +
                "\n" +
                "        <Button\n" +
                "            android:layout_width=\"match_parent\"\n" +
                "            android:layout_margin=\"10dp\"\n" +
                "            android:text=\"Button 2\"\n" +
                "            android:layout_height=\"wrap_content\"/>\n" +
                "\n" +
                "        <Button\n" +
                "            android:layout_width=\"match_parent\"\n" +
                "            android:layout_margin=\"10dp\"\n" +
                "            android:text=\"Button 3\"\n" +
                "            android:layout_height=\"wrap_content\"/>\n" +
                "\n" +
                "        <Button\n" +
                "            android:layout_width=\"match_parent\"\n" +
                "            android:layout_margin=\"10dp\"\n" +
                "            android:text=\"Button 4\"\n" +
                "            android:layout_height=\"wrap_content\"/>\n" +
                "\n" +
                "        <Button\n" +
                "            android:layout_width=\"match_parent\"\n" +
                "            android:layout_margin=\"10dp\"\n" +
                "            android:text=\"Button 5\"\n" +
                "            android:layout_height=\"wrap_content\"/>\n" +
                "\n" +
                "        <Button\n" +
                "            android:layout_width=\"match_parent\"\n" +
                "            android:layout_margin=\"10dp\"\n" +
                "            android:text=\"Button 6\"\n" +
                "            android:layout_height=\"wrap_content\"/>\n" +
                "\n" +
                "    </LinearLayout>");
        three_xml.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"fill_parent\"\n" +
                "    android:layout_height=\"fill_parent\">\n" +
                "\n" +
                "        <Button\n" +
                "            android:id=\"@+id/button1\"\n" +
                "            android:layout_width=\"wrap_content\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:text=\"Top Left Button\"\n" +
                "            android:layout_alignParentLeft=\"true\"\n" +
                "            android:layout_alignParentTop=\"true\"/>\n" +
                "        <Button\n" +
                "            android:id=\"@+id/button2\"\n" +
                "            android:layout_width=\"wrap_content\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:text=\"Top Right Button\"\n" +
                "            android:layout_alignParentTop=\"true\"\n" +
                "            android:layout_alignParentRight=\"true\"/>\n" +
                "        <Button\n" +
                "            android:id=\"@+id/button3\"\n" +
                "            android:layout_width=\"wrap_content\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:text=\"Bottom Left Button\"\n" +
                "            android:layout_alignParentLeft=\"true\"\n" +
                "            android:layout_alignParentBottom=\"true\"/>\n" +
                "        <Button\n" +
                "            android:id=\"@+id/button4\"\n" +
                "            android:layout_width=\"wrap_content\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:text=\"Bottom Right Button\"\n" +
                "            android:layout_alignParentRight=\"true\"\n" +
                "            android:layout_alignParentBottom=\"true\"/>\n" +
                "        <Button\n" +
                "            android:id=\"@+id/button5\"\n" +
                "            android:layout_width=\"fill_parent\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:text=\"Middle Button\"\n" +
                "            android:layout_centerVertical=\"true\"\n" +
                "            android:layout_centerHorizontal=\"true\"/>\n" +
                "\n" +
                "    </RelativeLayout>");
        four_xml.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<TableLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    android:layout_marginTop=\"10dp\"\n" +
                "    android:paddingLeft=\"5dp\"\n" +
                "    android:paddingRight=\"5dp\">\n" +
                "\n" +
                "        <TextView\n" +
                "            android:id=\"@+id/txt\"\n" +
                "            android:layout_width=\"wrap_content\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:text=\"Student Data:\"\n" +
                "            android:textSize = \"20dp\"\n" +
                "            android:textStyle=\"bold\">\n" +
                "\n" +
                "        </TextView>\n" +
                "\n" +
                "        <TableRow \n" +
                "            android:background=\"#F0F7F7\"\n " +
                "            android:padding=\"5dp\">\n" +
                "\n" +
                "            <TextView\n" +
                "                android:layout_width=\"wrap_content\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:layout_weight=\"1\"\n" +
                "                android:text=\"No.\" />\n" +
                "            <TextView\n" +
                "                android:layout_width=\"wrap_content\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:layout_weight=\"1\"\n" +
                "                android:text=\"Name\" />\n" +
                "            <TextView\n" +
                "                android:layout_width=\"wrap_content\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:layout_weight=\"1\"\n" +
                "                android:text=\"Class\" />\n" +
                "            <TextView\n" +
                "                android:layout_width=\"wrap_content\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:layout_weight=\"1\"\n" +
                "                android:text=\"Result\" />\n" +
                "        </TableRow>\n" +
                "\n" +
                "        <TableRow \n" +
                "            android:background=\"#F0F7F7\"\n " +
                "            android:padding=\"5dp\">\n" +
                "\n" +
                "            <TextView\n" +
                "                android:layout_width=\"wrap_content\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:layout_weight=\"1\"\n" +
                "                android:text=\"1\" />\n" +
                "            <TextView\n" +
                "                android:layout_width=\"wrap_content\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:layout_weight=\"1\"\n" +
                "                android:text=\"Virat\" />\n" +
                "            <TextView\n" +
                "                android:layout_width=\"wrap_content\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:layout_weight=\"1\"\n" +
                "                android:text=\"5th\" />\n" +
                "            <TextView\n" +
                "                android:layout_width=\"wrap_content\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:layout_weight=\"1\"\n" +
                "                android:text=\"89 %\" />\n" +
                "        </TableRow>\n" +
                "\n" +
                "        <TableRow \n" +
                "            android:background=\"#F0F7F7\"\n " +
                "            android:padding=\"5dp\">\n" +
                "\n" +
                "            <TextView\n" +
                "                android:layout_width=\"wrap_content\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:layout_weight=\"1\"\n" +
                "                android:text=\"2\" />\n" +
                "            <TextView\n" +
                "                android:layout_width=\"wrap_content\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:layout_weight=\"1\"\n" +
                "                android:text=\"Rohit\" />\n" +
                "            <TextView\n" +
                "                android:layout_width=\"wrap_content\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:layout_weight=\"1\"\n" +
                "                android:text=\"8th\" />\n" +
                "            <TextView\n" +
                "                android:layout_width=\"wrap_content\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:layout_weight=\"1\"\n" +
                "                android:text=\"86\" />\n" +
                "\n" +
                "        </TableRow>\n" +
                "\n" +
                "        <TableRow \n" +
                "            android:background=\"#F0F7F7\"\n " +
                "            android:padding=\"5dp\">\n" +
                "\n" +
                "            <TextView\n" +
                "                android:layout_width=\"wrap_content\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:layout_weight=\"1\"\n" +
                "                android:text=\"3\" />\n" +
                "            <TextView\n" +
                "                android:layout_width=\"wrap_content\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:layout_weight=\"1\"\n" +
                "                android:text=\"Radhika\" />\n" +
                "            <TextView\n" +
                "                android:layout_width=\"wrap_content\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:layout_weight=\"1\"\n" +
                "                android:text=\"6th\" />\n" +
                "            <TextView\n" +
                "                android:layout_width=\"wrap_content\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:layout_weight=\"1\"\n" +
                "                android:text=\"83\" />\n" +
                "\n" +
                "        </TableRow>\n" +
                "\n" +
                "        <TableRow \n" +
                "            android:background=\"#F0F7F7\"\n " +
                "            android:padding=\"5dp\">\n" +
                "\n" +
                "            <TextView\n" +
                "                android:layout_width=\"wrap_content\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:layout_weight=\"1\"\n" +
                "                android:text=\"4\" />\n" +
                "            <TextView\n" +
                "                android:layout_width=\"wrap_content\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:layout_weight=\"1\"\n" +
                "                android:text=\"Dharti\" />\n" +
                "            <TextView\n" +
                "                android:layout_width=\"wrap_content\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:layout_weight=\"1\"\n" +
                "                android:text=\"9th\" />\n" +
                "            <TextView\n" +
                "                android:layout_width=\"wrap_content\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:layout_weight=\"1\"\n" +
                "                android:text=\"82 %\" />\n" +
                "\n" +
                "        </TableRow>\n" +
                "\n" +
                "        <TableRow \n" +
                "            android:background=\"#F0F7F7\"\n " +
                "            android:padding=\"5dp\">\n" +
                "\n" +
                "            <TextView\n" +
                "                android:layout_width=\"wrap_content\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:layout_weight=\"1\"\n" +
                "                android:text=\"5\" />\n" +
                "            <TextView\n" +
                "                android:layout_width=\"wrap_content\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:layout_weight=\"1\"\n" +
                "                android:text=\"Niyati\" />\n" +
                "            <TextView\n" +
                "                android:layout_width=\"wrap_content\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:layout_weight=\"1\"\n" +
                "                android:text=\"9th\" />\n" +
                "            <TextView\n" +
                "                android:layout_width=\"wrap_content\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:layout_weight=\"1\"\n" +
                "                android:text=\"81\" />\n" +
                "\n" +
                "        </TableRow>\n" +
                "\n" +
                "    </TableLayout>\n");
        five_xml.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<androidx.constraintlayout.widget.ConstraintLayout\n" +
                "    xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    tools:context=\".MyActivity\">\n" +
                "\n" +
                "<TextView\n" +
                "    android:id=\"@+id/textView\"\n" +
                "    android:layout_width=\"wrap_content\"\n" +
                "    android:layout_height=\"wrap_content\"\n" +
                "    android:gravity=\"center\"\n" +
                "    android:padding=\"10dp\"\n" +
                "    android:text=\"Constraint Layout\"\n" +
                "    android:textColor=\"@color/black\"\n" +
                "    android:textSize=\"20sp\"/>\n" +
                "\n" +
                "</androidx.constraintlayout.widget.ConstraintLayout>\n");

        six_xml.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<GridLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    android:rowCount=\"4\"\n" +
                "    android:columnCount=\"2\"\n" +
                "    android:layout_marginStart=\"25dp\"\n" +
                "    tools:context=\".DemoFragments.GridLayoutFragment\">\n" +
                "\n" +
                "        <ImageView\n" +
                "            android:layout_height=\"90dp\"\n" +
                "            android:layout_width=\"130dp\"\n" +
                "            android:layout_margin=\"10dp\"\n" +
                "            android:src=\"@drawable/image_1\" />\n" +
                "\n" +
                "        <ImageView\n" +
                "            android:layout_height=\"90dp\"\n" +
                "            android:layout_width=\"200dp\"\n" +
                "            android:layout_margin=\"10dp\"\n" +
                "            android:src=\"@drawable/image_2\" />\n" +
                "\n" +
                "        <ImageView\n" +
                "            android:layout_height=\"90dp\"\n" +
                "            android:layout_width=\"130dp\"\n" +
                "            android:layout_margin=\"10dp\"\n" +
                "            android:src=\"@drawable/image_3\" />\n" +
                "\n" +
                "        <ImageView\n" +
                "            android:layout_height=\"90dp\"\n" +
                "            android:layout_width=\"200dp\"\n" +
                "            android:layout_margin=\"10dp\"\n" +
                "            android:src=\"@drawable/image_4\" />\n" +
                "\n" +
                "        <ImageView\n" +
                "            android:layout_height=\"90dp\"\n" +
                "            android:layout_width=\"130dp\"\n" +
                "            android:layout_margin=\"10dp\"\n" +
                "            android:src=\"@drawable/image_5\" />\n" +
                "\n" +
                "        <ImageView\n" +
                "            android:layout_height=\"90dp\"\n" +
                "            android:layout_width=\"220dp\"\n" +
                "            android:layout_margin=\"10dp\"\n" +
                "            android:src=\"@drawable/image_6\" />\n" +
                "\n" +
                "        <ImageView\n" +
                "            android:layout_height=\"90dp\"\n" +
                "            android:layout_width=\"130dp\"\n" +
                "            android:layout_margin=\"10dp\"\n" +
                "            android:src=\"@drawable/image_7\" />\n" +
                "\n" +
                "        <ImageView\n" +
                "            android:layout_height=\"90dp\"\n" +
                "            android:layout_width=\"200dp\"\n" +
                "            android:layout_margin=\"10dp\"\n" +
                "            android:src=\"@drawable/image_8\" />\n" +
                "        <ImageView\n" +
                "            android:layout_height=\"90dp\"\n" +
                "            android:layout_width=\"130dp\"\n" +
                "            android:layout_margin=\"10dp\"\n" +
                "            android:src=\"@drawable/image_9\" />\n" +
                "    \n" +
                "        <ImageView\n" +
                "            android:layout_height=\"90dp\"\n" +
                "            android:layout_width=\"130dp\"\n" +
                "            android:layout_margin=\"10dp\"\n" +
                "            android:layout_marginLeft=\"40dp\"\n" +
                "            android:src=\"@drawable/image_10\" />\n" +
                "\n" +
                "    </GridLayout>");

        layout_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Basic basic= new Basic();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, basic, "Back Button Basic")
                        .commit();
            }
        });

        layout_demo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AllLayout AllLayout= new AllLayout();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, AllLayout, "Custem Toast DEMO")
                        .addToBackStack(null)
                        .commit();
            }
        });
        return view;
    }
}


