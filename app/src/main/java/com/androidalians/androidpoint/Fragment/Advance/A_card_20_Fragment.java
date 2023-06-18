package com.androidalians.androidpoint.Fragment.Advance;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.androidalians.androidpoint.R;
public class A_card_20_Fragment extends Fragment {
    TextView flash_java, flash_xml, Gridal_Permission;
    ImageView flash_output;
    AppCompatImageView Btn_arrow;
    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a_card_20_, container, false);

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

        flash_java = view.findViewById(R.id.flash_java);
        flash_xml = view.findViewById(R.id.flash_xml);
        Gridal_Permission = view.findViewById(R.id.Gridal_Permission);
        flash_output = view.findViewById(R.id.flash_output);

        flash_output.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                A_A20_Fragment scroll_demo= new A_A20_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, scroll_demo, "SCROLL DEMO")
                        .addToBackStack(null)
                        .commit();
            }
        });
        flash_java.setTextIsSelectable(true);
        flash_java.setText("import android.content.Context;\n" +
                "import android.content.DialogInterface;\n" +
                "import android.content.pm.PackageManager;\n" +
                "import android.hardware.camera2.CameraAccessException;\n" +
                "import android.hardware.camera2.CameraManager;\n" +
                "import android.os.Bundle;\n" +
                "import android.support.v7.app.AlertDialog;\n" +
                "import android.support.v7.app.AppCompatActivity;\n" +
                "import android.widget.CompoundButton;\n" +
                "import android.widget.ToggleButton;\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "\n" +
                "   private CameraManager mCameraManager;\n" +
                "   private String mCameraId;\n" +
                "   private ToggleButton toggleButton;\n" +
                "\n" +
                "   @Override\n" +
                "   protected void onCreate(Bundle savedInstanceState) {\n" +
                "      super.onCreate(savedInstanceState);\n" +
                "      setContentView(R.layout.activity_main);\n" +
                "\n" +
                "      boolean isFlashAvailable = getApplicationContext().getPackageManager()\n" +
                "         .hasSystemFeature(PackageManager.FEATURE_CAMERA_FRONT);\n" +
                "\n" +
                "      if (!isFlashAvailable) {\n" +
                "         showNoFlashError();\n" +
                "      }\n" +
                "\n" +
                "      mCameraManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);\n" +
                "      try {\n" +
                "         mCameraId = mCameraManager.getCameraIdList()[0];\n" +
                "      } catch (CameraAccessException e) {\n" +
                "         e.printStackTrace();\n" +
                "      }\n" +
                "\n" +
                "      toggleButton = findViewById(R.id.onOffFlashlight);\n" +
                "      toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {\n" +
                "         @Override\n" +
                "         public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {\n" +
                "            switchFlashLight(isChecked);\n" +
                "         }\n" +
                "      });\n" +
                "   }\n" +
                "\n" +
                "   public void showNoFlashError() {\n" +
                "      AlertDialog alert = new AlertDialog.Builder(this)\n" +
                "      .create();\n" +
                "      alert.setTitle(\"Oops!\");\n" +
                "      alert.setMessage(\"Flash not available in this device...\");\n" +
                "      alert.setButton(DialogInterface.BUTTON_POSITIVE, \"OK\", new DialogInterface.OnClickListener() {\n" +
                "         public void onClick(DialogInterface dialog, int which) {\n" +
                "            finish();\n" +
                "         }\n" +
                "      });\n" +
                "      alert.show();\n" +
                "   }\n" +
                "\n" +
                "   public void switchFlashLight(boolean status) {\n" +
                "      try {\n" +
                "         mCameraManager.setTorchMode(mCameraId, status);\n" +
                "      } catch (CameraAccessException e) {\n" +
                "         e.printStackTrace();\n" +
                "      }\n" +
                "   }\n" +
                "}");

        flash_xml.setTextIsSelectable(true);
        flash_xml.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "   android:layout_width=\"match_parent\"\n" +
                "   android:layout_height=\"match_parent\"\n" +
                "   android:gravity=\"center\"\n" +
                "   android:orientation=\"vertical\">\n" +
                "\n" +
                "   <ToggleButton\n" +
                "      android:id=\"@+id/onOffFlashlight\"\n" +
                "      android:layout_width=\"wrap_content\"\n" +
                "      android:layout_height=\"wrap_content\"\n" +
                "      android:textOn=\"Turn Off\"\n" +
                "      android:textOff=\"Turn On\"\n" +
                "      android:checked=\"false\"\n" +
                "      android:text=\"Turn On/Off Camera LED/ Flashlight Android\" />\n" +
                "</LinearLayout>");

        Gridal_Permission.setTextIsSelectable(true);
        Gridal_Permission.setText("<uses-permission android:name=\"android.permission.CAMERA\" />\n" +
                "   <uses-feature android:name=\"android.hardware.camera.flash\" />");

        return view;
    }
}