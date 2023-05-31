package com.example.androidpoint.Fragment.Advance;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.androidpoint.R;

public class A_card_24_Fragment extends Fragment {
    ImageView Picasso_output;
    TextView Picasso_java, Picasso_xml;
    AppCompatImageView Btn_arrow;

    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a_card_24_, container, false);

        Btn_arrow = view.findViewById(R.id.Btn_arrow);
        Btn_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Advance advance = new Advance();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, advance, "Back Button Basic")
                        .addToBackStack(null)
                        .commit();
            }
        });

        Picasso_output = view.findViewById(R.id.Picasso_output);
        Picasso_output.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                A_A24_Fragment scroll_demo = new A_A24_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, scroll_demo, "SCROLL DEMO")
                        .addToBackStack(null)
                        .commit();

            }
        });

        Picasso_java = view.findViewById(R.id.Picasso_java);
        Picasso_xml = view.findViewById(R.id.Picasso_xml);

        Picasso_java.setTextIsSelectable(true);
        Picasso_java.setText("import android.support.v7.app.AppCompatActivity;\n" +
                "import android.os.Bundle;\n" +
                "import android.view.View;\n" +
                "import android.widget.Button;\n" +
                "import android.widget.ImageView;\n" +
                "import android.widget.Toast;\n" +
                "import com.squareup.picasso.Picasso;\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "    Button resize, centrecrop, centreinside, fit, placeholder, error, fade, callback, rotate,complexrotate;\n" +
                "    ImageView iv;\n" +
                "\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_main);\n" +
                "        resize = findViewById(R.id.resize);\n" +
                "        centrecrop = findViewById(R.id.centrecrop);\n" +
                "        centreinside = findViewById(R.id.centreinside);\n" +
                "        fit = findViewById(R.id.fit);\n" +
                "        placeholder = findViewById(R.id.placeholder);\n" +
                "        error = findViewById(R.id.error);\n" +
                "        fade = findViewById(R.id.fade);\n" +
                "        callback = findViewById(R.id.callback);\n" +
                "        rotate = findViewById(R.id.rotate);\n" +
                "        iv = findViewById(R.id.iv);\n" +
                "        complexrotate = findViewById(R.id.complexrotation);\n" +
                "getData();\n" +
                "    }\n" +
                "\n" +
                "    private void getData() {\n" +
                "\n" +
                "        resize.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View view) {\n" +
                "                Picasso.with(getApplicationContext())\n" +
                "                        .load(\"https://nordvpn.com/wp-content/uploads/android-vs-ios_1200x628-1.png\")\n" +
                "                        .resize(600, 200)// resizes the image to these dimensions (in pixel). does not respect aspect ratio\n" +
                "                        .into(iv);\n" +
                "                Toast.makeText(MainActivity.this, \"Resize called \", Toast.LENGTH_SHORT).show();\n" +
                "\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "        centrecrop.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View view) {\n" +
                "                Picasso.with(getApplicationContext())\n" +
                "                        .load(\"https://nordvpn.com/wp-content/uploads/android-vs-ios_1200x628-1.png\")\n" +
                "                        .resize(100,100)\n" +
                "                        .centerCrop()\n" +
                "                        .into(iv);\n" +
                "                Toast.makeText(MainActivity.this, \"Centrecrop called \", Toast.LENGTH_SHORT).show();\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "        centreinside.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View view) {\n" +
                "                Picasso.with(getApplicationContext())\n" +
                "                        .load(\"http://i.imgur.com/DvpvklR.png\")\n" +
                "                        .resize(100,100)\n" +
                "                        .centerInside()\n" +
                "                        .into(iv);\n" +
                "                Toast.makeText(MainActivity.this, \"Centreinside called \", Toast.LENGTH_SHORT).show();\n" +
                "            }\n" +
                "        });\n" +
                "        fit.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View view) {\n" +
                "                Picasso.with(getApplicationContext())\n" +
                "                        .load(\"https://nordvpn.com/wp-content/uploads/android-vs-ios_1200x628-1.png\")\n" +
                "                        .fit()\n" +
                "                        .into(iv);\n" +
                "                Toast.makeText(MainActivity.this, \"Fit called \", Toast.LENGTH_SHORT).show();\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "        placeholder.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View view) {\n" +
                "                Picasso.with(getApplicationContext())\n" +
                "                        .load(\"https://nordvpn.com/wp-content/uploads/android-vs-ios_1200x628-1.png\")\n" +
                "                        .placeholder(R.drawable.defaultimage) // can also be a drawable\n" +
                "                        .into(iv);\n" +
                "                Toast.makeText(MainActivity.this, \"Placeholder called \", Toast.LENGTH_SHORT).show();\n" +
                "\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "        fade.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View view) {\n" +
                "                Picasso\n" +
                "                        .with(getApplicationContext())\n" +
                "                        .load(\"https://nordvpn.com/wp-content/uploads/android-vs-ios_1200x628-1.png\")\n" +
                "                        .placeholder(R.mipmap.ic_launcher) \n" +
                "                        .noFade()\n" +
                "                        .into(iv);\n" +
                "                Toast.makeText(MainActivity.this, \"Fade called \", Toast.LENGTH_SHORT).show();\n" +
                "            }\n" +
                "        });\n" +
                "        error.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View view) {\n" +
                "                Picasso.with(getApplicationContext())\n" +
                "                        .load(\"https://nordvpn.com/wp-content/uploads/android-vs-ios_1200x628-1.png\")\n" +
                "                        .error(R.mipmap.ic_launcher) \n" +
                "                        .into(iv);\n" +
                "                Toast.makeText(MainActivity.this, \"Error called \", Toast.LENGTH_SHORT).show();\n" +
                "            }\n" +
                "        });\n" +
                "        callback.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View view) {\n" +
                "                 callback();\n" +
                "            }\n" +
                "        });\n" +
                "        rotate.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View view) {\n" +
                "                Picasso.with(getApplicationContext())\n" +
                "                        .load(\"https://nordvpn.com/wp-content/uploads/android-vs-ios_1200x628-1.png\")\n" +
                "                        .rotate(90f)\n" +
                "                        .into(iv);\n" +
                "                Toast.makeText(MainActivity.this, \"Rotate Called\", Toast.LENGTH_SHORT).show();\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "        complexrotate.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View view) {\n" +
                "\n" +
                "                Picasso.with(getApplicationContext())\n" +
                "                        .load(\"https://nordvpn.com/wp-content/uploads/android-vs-ios_1200x628-1.png\")\n" +
                "                        .rotate(45f, 220f,100f)\n" +
                "                        .into(iv);\n" +
                "                Toast.makeText(MainActivity.this, \"Complex Rotate Called\", Toast.LENGTH_SHORT).show();\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "    }\n" +
                "\n" +
                "    public void callback() {\n" +
                "        Picasso.with(MainActivity.this)\n" +
                "                .load(\"https://nordvpn.com/wp-content/uploads/android-vs-ios_1200x628-1.png\")\n" +
                "                .into(iv, new com.squareup.picasso.Callback() {\n" +
                "                    @Override\n" +
                "                    public void onSuccess() {\n" +
                "                        //do smth when picture is loaded successfully\n" +
                "                        Toast.makeText(MainActivity.this, \"Image is loaded succesfully\", Toast.LENGTH_SHORT).show();\n" +
                "\n" +
                "                    }\n" +
                "\n" +
                "                    @Override\n" +
                "                    public void onError() {\n" +
                "                        Toast.makeText(MainActivity.this, \"some Error occured\", Toast.LENGTH_SHORT).show();\n" +
                "\n" +
                "                    }\n" +
                "                });\n" +
                "    }\n" +
                "}");

        Picasso_xml.setTextIsSelectable(true);
        Picasso_xml.setText("<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "   xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "   xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "   android:layout_width=\"match_parent\"\n" +
                "   android:layout_height=\"match_parent\"\n" +
                "   android:orientation=\"vertical\"\n" +
                "   tools:context=\".MainActivity\">\n" +
                "\n" +
                "   <ImageView\n" +
                "       android:id=\"@+id/iv\"\n" +
                "       android:layout_width=\"match_parent\"\n" +
                "       android:layout_height=\"@dimen/_180sdp\"\n" +
                "       android:layout_marginTop=\"@dimen/_5sdp\"\n" +
                "       android:src=\"@mipmap/ic_launcher\"\n" +
                "       />\n" +
                "\n" +
                "   <LinearLayout\n" +
                "       android:layout_width=\"match_parent\"\n" +
                "       android:layout_height=\"wrap_content\"\n" +
                "       android:layout_marginTop=\"@dimen/_10sdp\"\n" +
                "       android:gravity=\"center\"\n" +
                "       android:orientation=\"horizontal\">\n" +
                "\n" +
                "       <Button\n" +
                "           android:id=\"@+id/resize\"\n" +
                "           android:layout_width=\"0dp\"\n" +
                "           android:layout_height=\"wrap_content\"\n" +
                "           android:layout_weight=\"1\"\n" +
                "           android:text=\"resize\"\n" +
                "           android:textSize=\"@dimen/_10sdp\" />\n" +
                "\n" +
                "       <Button\n" +
                "           android:id=\"@+id/centrecrop\"\n" +
                "           android:layout_width=\"0dp\"\n" +
                "           android:layout_height=\"wrap_content\"\n" +
                "           android:layout_weight=\"1\"\n" +
                "           android:text=\"centrecrop\"\n" +
                "           android:textSize=\"@dimen/_10sdp\" />\n" +
                "\n" +
                "       <Button\n" +
                "           android:id=\"@+id/centreinside\"\n" +
                "           android:layout_width=\"0dp\"\n" +
                "           android:layout_height=\"wrap_content\"\n" +
                "           android:layout_weight=\"1\"\n" +
                "           android:text=\"centreinside\"\n" +
                "           android:textSize=\"@dimen/_10sdp\" />\n" +
                "\n" +
                "\n" +
                "   </LinearLayout>\n" +
                "<LinearLayout\n" +
                "       android:layout_width=\"match_parent\"\n" +
                "       android:layout_height=\"wrap_content\"\n" +
                "       android:layout_marginTop=\"@dimen/_10sdp\"\n" +
                "       android:gravity=\"center\"\n" +
                "       android:orientation=\"horizontal\">\n" +
                "\n" +
                "       <Button\n" +
                "           android:id=\"@+id/fit\"\n" +
                "           android:layout_width=\"0dp\"\n" +
                "           android:layout_height=\"wrap_content\"\n" +
                "           android:layout_weight=\"1\"\n" +
                "           android:text=\"fit\"\n" +
                "           android:textSize=\"@dimen/_10sdp\" />\n" +
                "\n" +
                "       <Button\n" +
                "           android:id=\"@+id/placeholder\"\n" +
                "           android:layout_width=\"0dp\"\n" +
                "           android:layout_height=\"wrap_content\"\n" +
                "           android:layout_weight=\"1\"\n" +
                "           android:text=\"placeholder\"\n" +
                "           android:textSize=\"@dimen/_10sdp\" />\n" +
                "\n" +
                "       <Button\n" +
                "           android:id=\"@+id/error\"\n" +
                "           android:layout_width=\"0dp\"\n" +
                "           android:layout_height=\"wrap_content\"\n" +
                "           android:layout_weight=\"1\"\n" +
                "           android:text=\"error\"\n" +
                "           android:textSize=\"@dimen/_10sdp\" />\n" +
                "\n" +
                "\n" +
                "   </LinearLayout>\n" +
                "<LinearLayout\n" +
                "       android:layout_width=\"match_parent\"\n" +
                "       android:layout_height=\"wrap_content\"\n" +
                "       android:layout_marginTop=\"@dimen/_10sdp\"\n" +
                "       android:gravity=\"center\"\n" +
                "       android:orientation=\"horizontal\">\n" +
                "\n" +
                "       <Button\n" +
                "           android:id=\"@+id/fade\"\n" +
                "           android:layout_width=\"0dp\"\n" +
                "           android:layout_height=\"wrap_content\"\n" +
                "           android:layout_weight=\"1\"\n" +
                "           android:text=\"no fade\"\n" +
                "           android:textSize=\"@dimen/_10sdp\" />\n" +
                "\n" +
                "       <Button\n" +
                "           android:id=\"@+id/callback\"\n" +
                "           android:layout_width=\"0dp\"\n" +
                "           android:layout_height=\"wrap_content\"\n" +
                "           android:layout_weight=\"1\"\n" +
                "           android:text=\"callback\"\n" +
                "           android:textSize=\"@dimen/_10sdp\" />\n" +
                "\n" +
                "       <Button\n" +
                "           android:id=\"@+id/rotate\"\n" +
                "           android:layout_width=\"0dp\"\n" +
                "           android:layout_height=\"wrap_content\"\n" +
                "           android:layout_weight=\"1\"\n" +
                "           android:text=\"rotate\"\n" +
                "           android:textSize=\"@dimen/_10sdp\" />\n" +
                "\n" +
                "   </LinearLayout>\n" +
                "\n" +
                "   <LinearLayout\n" +
                "       android:layout_width=\"match_parent\"\n" +
                "       android:layout_height=\"wrap_content\"\n" +
                "       android:layout_marginTop=\"@dimen/_10sdp\"\n" +
                "       android:orientation=\"horizontal\">\n" +
                "\n" +
                "       <Button\n" +
                "           android:id=\"@+id/complexrotation\"\n" +
                "           android:layout_width=\"wrap_content\"\n" +
                "           android:layout_height=\"wrap_content\"\n" +
                "           android:text=\"Complex Rotation\"\n" +
                "           android:textSize=\"@dimen/_10sdp\" />\n" +
                "   </LinearLayout>\n" +
                "</LinearLayout>");

        return view;
    }
}