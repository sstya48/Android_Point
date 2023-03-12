package com.example.androidpoint.Fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import com.example.androidpoint.DemoFragments.Hide_Title_Demo_Fragment;
import com.example.androidpoint.DemoFragments.Screen_Orientation_Fragment;
import com.example.androidpoint.R;

public class B_card_4_Fragment extends Fragment {

    TextView screen_orientation_xml,screen_orientation_java,screen_orientation_second_java,screen_orientation_second_xml,manifest_xml_code;

    AppCompatImageView screen_orientation_demo,Btn_arrow;

    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_b_card_4_, container, false);

        screen_orientation_xml= view.findViewById(R.id.screen_orientation_xml);
        screen_orientation_java= view.findViewById(R.id.screen_orientation_java);

        screen_orientation_second_xml= view.findViewById(R.id.screen_orientation_second_xml);
        screen_orientation_second_java= view.findViewById(R.id.screen_orientation_second_java);

        manifest_xml_code= view.findViewById(R.id.manifest_xml_code);

        screen_orientation_demo= view.findViewById(R.id.screen_orientation_demo);

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

        screen_orientation_demo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Screen_Orientation_Fragment screenOrientationFragment= new Screen_Orientation_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, screenOrientationFragment, "screen Orientation DEMO")
                        .addToBackStack(null)
                        .commit();

            }
        });

        screen_orientation_xml.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>  \n" +
                "<android.support.constraint.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"  \n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"  \n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"  \n" +
                "    android:layout_width=\"match_parent\"  \n" +
                "    android:layout_height=\"match_parent\"  \n" +
                "    tools:context=\"example.androidalians.com.screenorientation.MainActivity\">  \n" +
                "  \n" +
                "  \n" +
                "    <Button  \n" +
                "        android:id=\"@+id/button1\"  \n" +
                "        android:layout_width=\"wrap_content\"  \n" +
                "        android:layout_height=\"wrap_content\"  \n" +
                "        android:layout_marginBottom=\"8dp\"  \n" +
                "        android:layout_marginTop=\"112dp\"  \n" +
                "        android:onClick=\"onClick\"  \n" +
                "        android:text=\"Launch next activity\"  \n" +
                "        app:layout_constraintBottom_toBottomOf=\"parent\"  \n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"  \n" +
                "        app:layout_constraintHorizontal_bias=\"0.612\"  \n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"  \n" +
                "        app:layout_constraintTop_toBottomOf=\"@+id/editText1\"  \n" +
                "        app:layout_constraintVertical_bias=\"0.613\" />  \n" +
                "  \n" +
                "    <TextView  \n" +
                "        android:id=\"@+id/editText1\"  \n" +
                "        android:layout_width=\"wrap_content\"  \n" +
                "        android:layout_height=\"wrap_content\"  \n" +
                "        android:layout_centerHorizontal=\"true\"  \n" +
                "        android:layout_marginEnd=\"8dp\"  \n" +
                "        android:layout_marginStart=\"8dp\"  \n" +
                "        android:layout_marginTop=\"124dp\"  \n" +
                "        android:ems=\"10\"  \n" +
                "        android:textSize=\"22dp\"  \n" +
                "        android:text=\"This activity is portrait orientation\"  \n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"  \n" +
                "        app:layout_constraintHorizontal_bias=\"0.502\"  \n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"  \n" +
                "        app:layout_constraintTop_toTopOf=\"parent\" />  \n" +
                "</android.support.constraint.ConstraintLayout>  \n");


        screen_orientation_java.setText("package example.androidalians.com.screenorientation;  \n" +
                "  \n" +
                "import android.content.Intent;  \n" +
                "import android.support.v7.app.AppCompatActivity;  \n" +
                "import android.os.Bundle;  \n" +
                "import android.view.View;  \n" +
                "import android.widget.Button;  \n" +
                "  \n" +
                "public class MainActivity extends AppCompatActivity {  \n" +
                "  \n" +
                "    Button button1;  \n" +
                "    @Override  \n" +
                "    protected void onCreate(Bundle savedInstanceState) {  \n" +
                "        super.onCreate(savedInstanceState);  \n" +
                "        setContentView(R.layout.activity_main);  \n" +
                "  \n" +
                "        button1=(Button)findViewById(R.id.button1);  \n" +
                "    }  \n" +
                "    public void onClick(View v) {  \n" +
                "        Intent intent = new Intent(MainActivity.this,SecondActivity.class);  \n" +
                "        startActivity(intent);  \n" +
                "    }  \n" +
                "}  ");

        screen_orientation_second_java.setText("package example.androidalians.com.screenorientation;  \n" +
                "  \n" +
                "import android.support.v7.app.AppCompatActivity;  \n" +
                "import android.os.Bundle;  \n" +
                "  \n" +
                "public class SecondActivity extends AppCompatActivity {  \n" +
                "  \n" +
                "    @Override  \n" +
                "    protected void onCreate(Bundle savedInstanceState) {  \n" +
                "        super.onCreate(savedInstanceState);  \n" +
                "        setContentView(R.layout.activity_second);  \n" +
                "  \n" +
                "    }  \n" +
                "}  ");

        screen_orientation_second_xml.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>  \n" +
                "<android.support.constraint.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"  \n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"  \n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"  \n" +
                "    android:layout_width=\"match_parent\"  \n" +
                "    android:layout_height=\"match_parent\"  \n" +
                "    tools:context=\"example.androidalians.com.screenorientation.SecondActivity\">  \n" +
                "  \n" +
                "    <TextView  \n" +
                "        android:id=\"@+id/textView\"  \n" +
                "        android:layout_width=\"wrap_content\"  \n" +
                "        android:layout_height=\"wrap_content\"  \n" +
                "        android:layout_marginEnd=\"8dp\"  \n" +
                "        android:layout_marginStart=\"8dp\"  \n" +
                "        android:layout_marginTop=\"180dp\"  \n" +
                "        android:text=\"this is landscape orientation\"  \n" +
                "        android:textSize=\"22dp\"  \n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"  \n" +
                "        app:layout_constraintHorizontal_bias=\"0.502\"  \n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"  \n" +
                "        app:layout_constraintTop_toTopOf=\"parent\" />  \n" +
                "</android.support.constraint.ConstraintLayout>");

        manifest_xml_code.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>  \n" +
                "<manifest xmlns:android=\"http://schemas.android.com/apk/res/android\"  \n" +
                "    package=\"example.androidalians.com.screenorientation\">  \n" +
                "  \n" +
                "    <application  \n" +
                "        android:allowBackup=\"true\"  \n" +
                "        android:icon=\"@mipmap/ic_launcher\"  \n" +
                "        android:label=\"@string/app_name\"  \n" +
                "        android:roundIcon=\"@mipmap/ic_launcher_round\"  \n" +
                "        android:supportsRtl=\"true\"  \n" +
                "        android:theme=\"@style/AppTheme\">  \n" +
                "        <activity  \n" +
                "            android:name=\"example.androidalians.com.screenorientation.MainActivity\"  \n" +
                "            android:screenOrientation=\"portrait\">  \n" +
                "            <intent-filter>  \n" +
                "                <action android:name=\"android.intent.action.MAIN\" />  \n" +
                "  \n" +
                "                <category android:name=\"android.intent.category.LAUNCHER\" />  \n" +
                "            </intent-filter>  \n" +
                "        </activity>  \n" +
                "        <activity android:name=\".SecondActivity\"  \n" +
                "            android:screenOrientation=\"landscape\">  \n" +
                "        </activity>  \n" +
                "    </application>  \n" +
                "  \n" +
                "</manifest>  \n");


        return  view;

    }
}