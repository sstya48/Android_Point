package com.androidalians.androidpoint.Fragment.Advance.Cards;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.androidalians.androidpoint.Fragment.Advance.A_A19_Fragment;
import com.androidalians.androidpoint.Fragment.Advance.Advance;
import com.androidalians.androidpoint.R;

public class A_card_19_Fragment extends Fragment {

    TextView Gallery_java, Gallery_xml;
    ImageView Gallery_output;

    AppCompatImageView Btn_arrow;
    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a_card_19_, container, false);

        Btn_arrow=view.findViewById(R.id.Btn_arrow);
        Btn_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Advance advance= new Advance();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, advance, "Back Button Basic")
                        .addToBackStack(null)
                        .commit();
            }
        });

        Gallery_java = view.findViewById(R.id.Gallery_java);
        Gallery_xml = view.findViewById(R.id.Gallery_xml);
        Gallery_output = view.findViewById(R.id.Gallery_output);

        Gallery_output.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                A_A19_Fragment scroll_demo= new A_A19_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, scroll_demo, "SCROLL DEMO")
                        .addToBackStack(null)
                        .commit();
            }
        });
        Gallery_java.setTextIsSelectable(true);
        Gallery_java.setText("package example.androidalians.gallery;\n" +
                "\n" +
                "import androidx.annotation.Nullable;\n" +
                "import androidx.appcompat.app.AppCompatActivity;\n" +
                "import android.content.Intent;\n" +
                "import android.net.Uri;\n" +
                "import android.os.Bundle;\n" +
                "import android.provider.MediaStore;\n" +
                "import android.view.View;\n" +
                "import android.widget.Button;\n" +
                "import android.widget.ImageButton;\n" +
                "import android.widget.ImageView;\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "\n" +
                "    Button Button1, Button2;\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_main);\n" +
                "\n" +
                "        Button1 = findViewById(R.id.Button1);\n" +
                "         Button2 = findViewById(R.id.Button2);\n" +
                "        Button1.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View view) {\n" +
                "                try {\n" +
                "                    Intent intent = new Intent();\n" +
                "                    intent.setAction(MediaStore.ACTION_IMAGE_CAPTURE);\n" +
                "                    startActivity(intent);\n" +
                "                }\n" +
                "                catch (Exception e)\n" +
                "                {\n" +
                "                    e.printStackTrace();\n" +
                "                }\n" +
                "            }\n" +
                "        });\n" +
                "    Button2.setOnClickListener(new View.OnClickListener() {\n" +
                "        @Override\n" +
                "        public void onClick(View view) {\n" +
                "          Intent iGallery = new Intent(Intent.ACTION_PICK,MediaStore.Images.Media.EXTERNAL_CONTENT_URI);\n" +
                "\n" +
                "          startActivityForResult(iGallery, 3);\n" +
                "\n" +
                "        }\n" +
                "     });\n" +
                "    }\n" +
                "        @Override\n" +
                "        protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {\n" +
                "           super.onActivityResult(requestCode, resultCode, data);\n" +
                "\n" +
                "        if (resultCode == RESULT_OK && data != null){\n" +
                "            Uri selectrdImage = data.getData();\n" +
                "            ImageView imageView = findViewById(R.id.imgGallery);\n" +
                "            imageView.setImageURI(selectrdImage);\n" +
                "        }\n" +
                "    }\n" +
                "}");

        Gallery_xml.setTextIsSelectable(true);
        Gallery_xml.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    android:background=\"@color/white\">\n" +
                "    <Button\n" +
                "        android:id=\"@+id/Button1\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:textColor=\"@color/black\"\n" +
                "        android:text=\"CAMERA\"\n" +
                "        android:layout_marginTop=\"30sp\"\n" +
                "        android:layout_marginStart=\"60sp\"/>\n" +
                "    \n" +
                "    <Button\n" +
                "        android:id=\"@+id/Button2\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_marginStart=\"250sp\"\n" +
                "        android:layout_marginTop=\"30sp\"\n" +
                "        android:text=\"GALLERY\"\n" +
                "        android:textStyle=\"bold\"\n" +
                "        android:textColor=\"@color/black\" />\n" +
                "\n" +
                "    <ImageView\n" +
                "        android:id=\"@+id/imgGallery\"\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_alignParentStart=\"true\"\n" +
                "        android:layout_marginStart=\"-10dp\"\n" +
                "        android:layout_marginTop=\"100sp\"\n" +
                "        android:layout_marginBottom=\"-1dp\"\n" +
                "        android:textStyle=\"bold\" />\n" +
                "\n" +
                "</RelativeLayout>");


        return view;
    }
}