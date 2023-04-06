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


public class A_card_10_Fragment extends Fragment {

    TextView reg_java, reg_xml, reg_gridal_permission;

    AppCompatImageView Btn_arrow;
    ImageView reg_output;
    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a_card_10_, container, false);

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

        reg_output = view.findViewById(R.id.reg_output);
        reg_java = view.findViewById(R.id.reg_java);
        reg_xml = view.findViewById(R.id.reg_xml);
        reg_gridal_permission = view.findViewById(R.id.reg_gridal_permission);


        reg_output.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                A_A10_Fragment scroll_demo= new A_A10_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, scroll_demo, "SCROLL DEMO")
                        .addToBackStack(null)
                        .commit();
            }
        });
        reg_java.setTextIsSelectable(true);
        reg_java.setText("package example.androidalians.registation;\n" +
                "\n" +
                "import android.content.Intent;\n" +
                "import android.os.Bundle;\n" +
                "import android.util.Patterns;\n" +
                "import android.view.View;\n" +
                "import android.widget.Button;\n" +
                "import android.widget.TextView;\n" +
                "import android.widget.Toast;\n" +
                "import com.basgeekball.awesomevalidation.AwesomeValidation;\n" +
                "import com.basgeekball.awesomevalidation.ValidationStyle;\n" +
                "import androidx.appcompat.app.AppCompatActivity;\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "    Button requestButton;\n" +
                "    TextView alreadySignin;\n" +
                "    private AwesomeValidation awesomeValidation;\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_main);\n" +
                "\n" +
                "        awesomeValidation = new AwesomeValidation(ValidationStyle.BASIC);\n" +
                "\n" +
                "        requestButton = (Button) findViewById(R.id.buttonSubmit);\n" +
                "        alreadySignin = (TextView) findViewById(R.id.already_signin);\n" +
                "        requestButton.setOnClickListener(mMyListener);\n" +
                "        alreadySignin.setOnClickListener(mMyListener);\n" +
                "\n" +
                "        String regexPassword = \"(?=.*[a-z])(?=.*[A-Z])(?=.*[\\\\d])(?=.*[~`!@#\\\\$%\\\\^&\\\\*\\\\(\\\\)\\\\-_\\\\+=\\\\{\\\\}\\\\[\\\\]\\\\|\\\\;:\\\"<>,./\\\\?]).{8,}\";\n" +
                "        //adding validation to edittexts\n" +
                "        awesomeValidation.addValidation(this, R.id.editTextName, \"^[A-Za-z\\\\s]{1,}[\\\\.]{0,1}[A-Za-z\\\\s]{0,}$\", R.string.nameerror);\n" +
                "        awesomeValidation.addValidation(this, R.id.editTextEmail, Patterns.EMAIL_ADDRESS, R.string.emailerror);\n" +
                "        awesomeValidation.addValidation(this, R.id.editTextMobile, \"^[2-9]{2}[0-9]{8}$\", R.string.mobileerror);\n" +
                "        awesomeValidation.addValidation(this, R.id.editPassword, regexPassword, R.string.passworderror);\n" +
                "    }\n" +
                "    private View.OnClickListener mMyListener = new View.OnClickListener() {\n" +
                "        public void onClick(View v) {\n" +
                "            switch (v.getId()) {\n" +
                "                case R.id.buttonSubmit:\n" +
                "                    if (awesomeValidation.validate()) {\n" +
                "                        Toast.makeText(getApplicationContext(), \"Its Working!\", Toast.LENGTH_LONG).show();\n" +
                "                    }\n" +
                "                    break;\n" +
                "                case R.id.already_signin:\n" +
                "                    Intent i = new Intent(getApplicationContext(), LoginActivity.class);\n" +
                "                    startActivity(i);\n" +
                "                    break;\n" +
                "                default:\n" +
                "                    break;\n" +
                "            }\n" +
                "        }\n" +
                "    };\n" +
                "\n" +
                "}\n");
        reg_xml.setTextIsSelectable(true);
        reg_xml.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    android:orientation=\"vertical\"\n" +
                "    android:id=\"@+id/register_activity\"\n" +
                "    tools:context=\".Fragment.A_A10_Fragment\">\n" +
                "\n" +
                "    <ScrollView\n" +
                "        android:id=\"@+id/login_form\"\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"match_parent\" >\n" +
                "\n" +
                "        <LinearLayout\n" +
                "            android:layout_width=\"fill_parent\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:layout_marginLeft=\"10dp\"\n" +
                "            android:layout_marginRight=\"10dp\"\n" +
                "            android:orientation=\"vertical\">\n" +
                "\n" +
                "            <ImageView\n" +
                "                android:layout_width=\"150dp\"\n" +
                "                android:layout_height=\"150dp\"\n" +
                "                android:src=\"@drawable/appicn\"\n" +
                "                android:layout_gravity=\"center_horizontal\" />\n" +
                "\n" +
                "            <TextView\n" +
                "                android:layout_width=\"match_parent\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:layout_marginTop=\"8dp\"\n" +
                "                android:textColor=\"@color/black\"\n" +
                "                android:textSize=\"25sp\"\n" +
                "                android:textAlignment=\"center\"\n" +
                "                android:text=\"Registration Form\"/>\n" +
                "\n" +
                "            <TextView\n" +
                "                android:layout_width=\"match_parent\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:layout_marginTop=\"5dp\"\n" +
                "                android:textColor=\"@color/white\"\n" +
                "                android:textAlignment=\"center\"\n" +
                "                android:text=\"SIGN UP TO LEARN QUICKLY\"/>\n" +
                "\n" +
                "            <com.google.android.material.textfield.TextInputLayout\n" +
                "                android:layout_width=\"match_parent\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:hint=\"Username\">\n" +
                "\n" +
                "                <EditText\n" +
                "                    android:id=\"@+id/editTextName\"\n" +
                "                    android:layout_width=\"match_parent\"\n" +
                "                    android:layout_height=\"wrap_content\"\n" +
                "                    android:inputType=\"text\"\n" +
                "                    android:layout_margin=\"10dp\"\n" +
                "                    android:ems=\"10\" />\n" +
                "\n" +
                "            </com.google.android.material.textfield.TextInputLayout>\n" +
                "\n" +
                "            <com.google.android.material.textfield.TextInputLayout\n" +
                "                android:layout_width=\"match_parent\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:hint=\"Email\">\n" +
                "\n" +
                "                <EditText\n" +
                "                    android:id=\"@+id/editTextEmail\"\n" +
                "                    android:layout_width=\"match_parent\"\n" +
                "                    android:layout_height=\"wrap_content\"\n" +
                "                    android:inputType=\"textEmailAddress\"\n" +
                "                    android:layout_margin=\"10dp\"\n" +
                "                    android:ems=\"10\" />\n" +
                "\n" +
                "            </com.google.android.material.textfield.TextInputLayout>\n" +
                "\n" +
                "            <com.google.android.material.textfield.TextInputLayout\n" +
                "                android:layout_width=\"match_parent\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:hint=\"Phone\">\n" +
                "\n" +
                "                <EditText\n" +
                "                    android:id=\"@+id/editTextMobile\"\n" +
                "                    android:layout_width=\"match_parent\"\n" +
                "                    android:layout_height=\"wrap_content\"\n" +
                "                    android:inputType=\"phone\"\n" +
                "                    android:layout_margin=\"10dp\"\n" +
                "                    android:ems=\"10\" />\n" +
                "\n" +
                "            </com.google.android.material.textfield.TextInputLayout>\n" +
                "\n" +
                "            <com.google.android.material.textfield.TextInputLayout\n" +
                "                android:layout_width=\"match_parent\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                app:endIconMode=\"password_toggle\"\n" +
                "                android:hint=\"Password\">\n" +
                "\n" +
                "                <EditText\n" +
                "                    android:id=\"@+id/editPassword\"\n" +
                "                    android:layout_width=\"match_parent\"\n" +
                "                    android:layout_height=\"wrap_content\"\n" +
                "                    android:inputType=\"textPassword\"\n" +
                "                    android:layout_margin=\"10dp\"\n" +
                "                    android:ems=\"10\" />\n" +
                "\n" +
                "            </com.google.android.material.textfield.TextInputLayout>\n" +
                "\n" +
                "            <Button\n" +
                "                android:id=\"@+id/buttonSubmit\"\n" +
                "                android:layout_margin=\"20dp\"\n" +
                "                android:layout_width=\"match_parent\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:textColor=\"@color/black\"\n" +
                "                android:text=\"Sign Up\" />\n" +
                "\n" +
                "            <TextView\n" +
                "                android:id=\"@+id/already_signin\"\n" +
                "                android:layout_width=\"match_parent\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:layout_marginTop=\"7dp\"\n" +
                "                android:textColor=\"@color/blue\"\n" +
                "                android:textAlignment=\"center\"\n" +
                "                android:text=\"Singin\"/>\n" +
                "\n" +
                "        </LinearLayout>\n" +
                "        \n" +
                "    </ScrollView>\n" +
                "    \n" +
                "</LinearLayout>");

        reg_gridal_permission.setTextIsSelectable(true);
        reg_gridal_permission.setText("dependencies {\n" +
                "    implementation 'de.hdodenhof:circleimageview:3.0.0'\n" +
                "}");

        return view;
    }
}