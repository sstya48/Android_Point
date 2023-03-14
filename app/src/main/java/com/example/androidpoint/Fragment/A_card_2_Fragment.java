package com.example.androidpoint.Fragment;

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


public class A_card_2_Fragment extends Fragment {

    ImageView toggle_btn_output;
    TextView toggle_java,toggle_xml;
    public A_card_2_Fragment() {

    }

    public static A_card_2_Fragment newInstance(String param1, String param2) {
        A_card_2_Fragment fragment = new A_card_2_Fragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a_card_2_, container, false);


        toggle_btn_output = view.findViewById(R.id.toggle_btn_output);

        toggle_btn_output.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                A_A2_Fragment scroll_demo= new A_A2_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, scroll_demo, "SCROLL DEMO")
                        .addToBackStack(null)
                        .commit();

            }
        });

        toggle_java= view.findViewById(R.id.toggle_java);
        toggle_xml= view.findViewById(R.id.toggle_xml);

        toggle_java.setText("package example.androidalians.togglebutton;  \n" +
                "  \n" +
                "import android.support.v7.app.AppCompatActivity;  \n" +
                "import android.os.Bundle;  \n" +
                "import android.view.View;  \n" +
                "import android.widget.Button;  \n" +
                "import android.widget.Toast;  \n" +
                "import android.widget.ToggleButton;  \n" +
                "  \n" +
                "public class MainActivity extends AppCompatActivity {  \n" +
                "    private ToggleButton toggleButton1, toggleButton2;  \n" +
                "    private Button buttonSubmit;  \n" +
                "    @Override  \n" +
                "    protected void onCreate(Bundle savedInstanceState) {  \n" +
                "        super.onCreate(savedInstanceState);  \n" +
                "        setContentView(R.layout.activity_main);  \n" +
                "  \n" +
                "        addListenerOnButtonClick();  \n" +
                "    }  \n" +
                "  \n" +
                "    public void addListenerOnButtonClick(){  \n" +
                "  \n" +
                "        toggleButton1=(ToggleButton)findViewById(R.id.toggleButton);  \n" +
                "        toggleButton2=(ToggleButton)findViewById(R.id.toggleButton2);  \n" +
                "  \n" +
                "        buttonSubmit=(Button)findViewById(R.id.button);  \n" +
                "  \n" +
                "        buttonSubmit.setOnClickListener(new View.  OnClickListener(){  \n" +
                "            @Override  \n" +
                "            public void onClick(View view) {  \n" +
                "                StringBuilder result = new StringBuilder();  \n" +
                "                result.append(\"ToggleButton1 : \") .append(toggleButton1.getText());  \n" +
                "                result.append(\"\\nToggleButton2 : \") .append(toggleButton2.getText());  \n" +
                "  \n" +
                "                Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();  \n" +
                "            }  \n" +
                "  \n" +
                "        });  \n" +
                "  \n" +
                "    }  \n" +
                "}  ");

        toggle_xml.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\">\n" +
                "\n" +
                "    <ToggleButton\n" +
                "        android:id=\"@+id/toggleButton\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_alignParentBottom=\"true\"\n" +
                "        android:layout_marginEnd=\"52dp\"\n" +
                "        android:layout_marginBottom=\"441dp\"\n" +
                "        android:layout_toStartOf=\"@+id/toggleButton2\"\n" +
                "        android:text=\"ToggleButton\"\n" +
                "        android:textOff=\"Off\"\n" +
                "        android:textOn=\"On\" />\n" +
                "\n" +
                "    <ToggleButton\n" +
                "        android:id=\"@+id/toggleButton2\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_alignParentEnd=\"true\"\n" +
                "        android:layout_alignParentBottom=\"true\"\n" +
                "        android:layout_marginEnd=\"85dp\"\n" +
                "        android:layout_marginBottom=\"439dp\"\n" +
                "        android:text=\"ToggleButton\"\n" +
                "        android:textOff=\"Off\"\n" +
                "        android:textOn=\"On\" />\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/button\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_alignParentEnd=\"true\"\n" +
                "        android:layout_alignParentBottom=\"true\"\n" +
                "        android:layout_marginEnd=\"144dp\"\n" +
                "        android:layout_marginBottom=\"187dp\"\n" +
                "        android:text=\"Submit\" />\n" +
                "\n" +
                "</RelativeLayout>");

        return view;
    }
}