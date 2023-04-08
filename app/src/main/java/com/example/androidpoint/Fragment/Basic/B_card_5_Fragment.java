package com.example.androidpoint.Fragment.Basic;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.androidpoint.DemoFragments.CheckBox_Fragment;
import com.example.androidpoint.R;
public class B_card_5_Fragment extends Fragment {

    TextView checkbox_java,checkbox_xml;
    AppCompatImageView Btn_arrow,checkbox_demo;
    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_b_card_5_, container, false);


        checkbox_java=view.findViewById(R.id.checkbox_java);
        checkbox_java.setTextIsSelectable(true);

        checkbox_xml=view.findViewById(R.id.checkbox_xml);
        checkbox_xml.setTextIsSelectable(true);

        checkbox_demo=view.findViewById(R.id.checkbox_demo);

        Btn_arrow=view.findViewById(R.id.Btn_arrow);

        Btn_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Basic basic= new Basic();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, basic, "Back Button Basic")
                        .addToBackStack(null)
                        .commit();
            }
        });

        checkbox_demo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CheckBox_Fragment checkBox_fragment= new CheckBox_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, checkBox_fragment, "checkBox DEMO")
                        .addToBackStack(null)
                        .commit();
            }
        });


        checkbox_xml.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    android:orientation=\"vertical\"\n" +
                "    android:gravity=\"center\">\n" +
                "\n" +
                "    <CheckBox\n" +
                "        android:id=\"@+id/checkBox\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_marginTop=\"68dp\"\n" +
                "        android:text=\"Pizza\"\n" +
                "        android:paddingLeft=\"10dp\"/>\n" +
                "\n" +
                "    <CheckBox\n" +
                "        android:id=\"@+id/checkBox2\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_marginTop=\"28dp\"\n" +
                "        android:text=\"Coffee\" />\n" +
                "\n" +
                "    <CheckBox\n" +
                "        android:id=\"@+id/checkBox3\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_marginTop=\"28dp\"\n" +
                "        android:text=\"Burger\" /> \n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/button\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_marginTop=\"184dp\"\n" +
                "        android:text=\"Order\" />\n" +
                "\n" +
                "    </LinearLayout>\n" +
                "\n");


       checkbox_java.setText("package example.androidalians.checkbox;  \n" +
               "  \n" +
               "import android.support.v7.app.AppCompatActivity;  \n" +
               "import android.os.Bundle;  \n" +
               "import android.view.View;  \n" +
               "import android.widget.Button;  \n" +
               "import android.widget.CheckBox;  \n" +
               "import android.widget.Toast;  \n" +
               "  \n" +
               "public class MainActivity extends AppCompatActivity {  \n" +
               "    CheckBox pizza,coffe,burger;  \n" +
               "    Button buttonOrder;  \n" +
               "    @Override  \n" +
               "    protected void onCreate(Bundle savedInstanceState) {  \n" +
               "        super.onCreate(savedInstanceState);  \n" +
               "        setContentView(R.layout.activity_main);  \n" +
               "        addListenerOnButtonClick();  \n" +
               "    }  \n" +
               "    public void addListenerOnButtonClick(){  \n" +
               "        pizza=(CheckBox)findViewById(R.id.checkBox);  \n" +
               "        coffe=(CheckBox)findViewById(R.id.checkBox2);  \n" +
               "        burger=(CheckBox)findViewById(R.id.checkBox3);  \n" +
               "        buttonOrder=(Button)findViewById(R.id.button);  \n" +
               "  \n" +
               "        buttonOrder.setOnClickListener(new View.OnClickListener(){  \n" +
               "  \n" +
               "            @Override  \n" +
               "            public void onClick(View view) {  \n" +
               "                int totalamount=0;  \n" +
               "                StringBuilder result=new StringBuilder();  \n" +
               "                result.append(\"Selected Items:\");  \n" +
               "                if(pizza.isChecked()){  \n" +
               "                    result.append(\"\\nPizza 100Rs\");  \n" +
               "                    totalamount+=100;  \n" +
               "                }  \n" +
               "                if(coffe.isChecked()){  \n" +
               "                    result.append(\"\\nCoffe 50Rs\");  \n" +
               "                    totalamount+=50;  \n" +
               "                }  \n" +
               "                if(burger.isChecked()){  \n" +
               "                    result.append(\"\\nBurger 120Rs\");  \n" +
               "                    totalamount+=120;  \n" +
               "                }  \n" +
               "                result.append(\"\\nTotal: \"+totalamount+\"Rs\");  \n" +
               "                Toast.makeText(getApplicationContext(),result.toString(),\n" +
               "                                                Toast.LENGTH_LONG).show();\n" +
               "            }  \n" +
               "        });  \n" +
               "    }  \n" +
               "}  \n" );
        return view;
    }
}