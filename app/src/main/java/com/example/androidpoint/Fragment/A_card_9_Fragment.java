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


public class A_card_9_Fragment extends Fragment {

    TextView location_java, location_xml, manifest_xml, gridal_permission;

    AppCompatImageView Btn_arrow;
    ImageView location_output;
    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_a_card_9_, container, false);

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

        location_output = view.findViewById(R.id.location_output);
        location_java = view.findViewById(R.id.location_java);
        location_xml = view.findViewById(R.id.location_xml);
        manifest_xml = view.findViewById(R.id.manifest_xml);
        gridal_permission = view.findViewById(R.id.gridal_permission);


        location_output.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                A_A9_Fragment scroll_demo= new A_A9_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, scroll_demo, "SCROLL DEMO")
                        .addToBackStack(null)
                        .commit();
            }
        });
        location_java.setTextIsSelectable(true);
        location_java.setText("import example.androidalians.Manifest;\n" +
                "import android.content.pm.PackageManager;\n" +
                "import android.location.Location;\n" +
                "import android.os.Bundle;\n" +
                "import android.widget.Toast;\n" +
                "import com.google.android.gms.maps.CameraUpdateFactory;\n" +
                "import com.google.android.gms.maps.SupportMapFragment;\n" +
                "import com.google.android.gms.location.FusedLocationProviderClient;\n" +
                "import com.google.android.gms.location.LocationServices;\n" +
                "import com.google.android.gms.maps.GoogleMap;\n" +
                "import com.google.android.gms.maps.OnMapReadyCallback;\n" +
                "import com.google.android.gms.maps.model.LatLng;\n" +
                "import com.google.android.gms.maps.model.MarkerOptions;\n" +
                "import com.google.android.gms.tasks.OnSuccessListener;\n" +
                "import com.google.android.gms.tasks.Task;\n" +
                "import androidx.annotation.NonNull;\n" +
                "import androidx.core.app.ActivityCompat;\n" +
                "import androidx.fragment.app.FragmentActivity;\n" +
                "   \n" +
                "public class MainActivity extends FragmentActivity implements OnMapReadyCallback {\n" +
                "   Location currentLocation;\n" +
                "   FusedLocationProviderClient fusedLocationProviderClient;\n" +
                "   private static final int REQUEST_CODE = 101\n" +
                "   @Override\n" +
                "   protected void onCreate(Bundle savedInstanceState) {\n" +
                "      super.onCreate(savedInstanceState);\n" +
                "      setContentView(R.layout.activity_main);\n" +
                "   \n" +
                "      fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this);\n" +
                "      fetchLocation();\n" +
                "   }\n" +
                "   private void fetchLocation() {\n" +
                "      if (ActivityCompat.checkSelfPermission(\n" +
                "         this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(\n" +
                "         this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {\n" +
                "         ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, REQUEST_CODE);\n" +
                "         return;\n" +
                "      }\n" +
                "      Task<Location> task = fusedLocationProviderClient.getLastLocation();\n" +
                "      task.addOnSuccessListener(new OnSuccessListener<Location>() {\n" +
                "         @Override\n" +
                "         public void onSuccess(Location location) {\n" +
                "            if (location != null) {\n" +
                "               currentLocation = location;\n" +
                "               Toast.makeText(getApplicationContext(), currentLocation.getLatitude() + \"\" + currentLocation.getLongitude(), Toast.LENGTH_SHORT).show();\n" +
                "               SupportMapFragment supportMapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.myMap);\n" +
                "               assert supportMapFragment != null;\n" +
                "               supportMapFragment.getMapAsync(MainActivity.this);\n" +
                "            }\n" +
                "         }\n" +
                "      });\n" +
                "   }\n" +
                "   @Override\n" +
                "   public void onMapReady(GoogleMap googleMap) {\n" +
                "      LatLng latLng = new LatLng(currentLocation.getLatitude(), currentLocation.getLongitude());\n" +
                "      MarkerOptions markerOptions = new MarkerOptions().position(latLng).title(\"I am here!\");\n" +
                "      googleMap.animateCamera(CameraUpdateFactory.newLatLng(latLng));\n" +
                "      googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng, 5));\n" +
                "      googleMap.addMarker(markerOptions);\n" +
                "   }\n" +
                "   @Override\n" +
                "   public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {\n" +
                "      switch (requestCode) {\n" +
                "         case REQUEST_CODE:\n" +
                "            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {\n" +
                "               fetchLocation();\n" +
                "         }\n" +
                "         break;\n" +
                "      }\n" +
                "   }\n" +
                "}");
        location_xml.setTextIsSelectable(true);
        location_xml.setText(" <?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<fragment xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "   xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "   android:id=\"@+id/myMap\"\n" +
                "   android:name=\"com.google.android.gms.maps.SupportMapFragment\"\n" +
                "   android:layout_width=\"match_parent\"\n" +
                "   android:layout_height=\"match_parent\"\n" +
                "   tools:context=\".MainActivity\" />");
        manifest_xml.setTextIsSelectable(true);
        manifest_xml.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<manifest xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    package=\"com.example.geeksforgeeks\"\n" +
                "    android:versionCode=\"1\"\n" +
                "    android:versionName=\"1.0\"\n" +
                "    android:installLocation=\"preferExternal\">\n" +
                "   \n" +
                " <uses-permission android:name=\"android.permission.ACCESS_COARSE_LOCATION\"/>\n"+
                " <uses-permission android:name=\"android.permission.ACCESS_FINE_LOCATION\"/>\n"+
                " \n" +
                "    <application\n" +
                "        android:allowBackup=\"true\"\n" +
                "        android:dataExtractionRules=\"@xml/data_extraction_rules\"\n" +
                "        android:fullBackupContent=\"@xml/backup_rules\"\n" +
                "        android:icon=\"@mipmap/ic_launcher\"\n" +
                "        android:label=\"@string/app_name\"\n" +
                "        android:roundIcon=\"@mipmap/ic_launcher_round\"\n" +
                "        android:supportsRtl=\"true\"\n" +
                "        android:theme=\"@style/Theme.MyApplication\"\n" +
                "        tools:targetApi=\"31\">\n" +
                "        <activity\n" +
                "            android:name=\".MainActivity\"\n" +
                "            android:exported=\"true\">\n" +
                "            <intent-filter>\n" +
                "                <action android:name=\"android.intent.action.MAIN\" />\n" +
                " \n" +
                "                <category android:name=\"android.intent.category.LAUNCHER\" />\n" +
                "            </intent-filter>\n" +
                "        </activity>\n" +
                "    </application>\n" +
                " \n" +
                "</manifest>");
        gridal_permission.setTextIsSelectable(true);
        gridal_permission.setText("// Google map" +
                "implementation 'com.google.android.gms:play-services-maps:17.0.0'\n"+
                "implementation 'com.google.android.gms:play-services-location:17.0.0'\n");

        return view;
    }
}