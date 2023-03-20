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


public class A_card_18_Fragment extends Fragment {

    TextView db_java, db_xml, db_gridal_permission,Item_Java, Update_Java,
            DatabaseHelper_java, Student_java, ArrayAdapter_java, activity_main,
            activityitem_main, activityitem_update, rowlist_xml;

    AppCompatImageView Btn_arrow;

    ImageView db_output;
    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a_card_18_, container, false);

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

        db_output = view.findViewById(R.id.db_output);
        rowlist_xml = view.findViewById(R.id.rowlist_xml);
        activity_main = view.findViewById(R.id.activity_main);
        activityitem_main = view.findViewById(R.id.activityitem_main);
        db_java = view.findViewById(R.id.db_java);
        db_xml = view.findViewById(R.id.db_xml);
        Item_Java = view.findViewById(R.id.Item_Java);
        Update_Java = view.findViewById(R.id.Update_Java);
        DatabaseHelper_java = view.findViewById(R.id.DatabaseHelper_java);
        ArrayAdapter_java = view.findViewById(R.id.ArrayAdapter_java);
        activityitem_update = view.findViewById(R.id.activityitem_update);
        Student_java = view.findViewById(R.id.Student_java);


        db_output.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                A_A18_Fragment scroll_demo= new A_A18_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, scroll_demo, "SCROLL DEMO")
                        .addToBackStack(null)
                        .commit();
            }
        });
        db_java.setTextIsSelectable(true);
        db_java.setText("package com.example.database;\n" +
                "\n" +
                "import androidx.appcompat.app.AppCompatActivity;\n" +
                "import android.os.Bundle;\n" +
                "\n" +
                "import android.content.Intent;\n" +
                "import android.view.View;\n" +
                "import android.widget.ListView;\n" +
                "import android.widget.TextView;\n" +
                "\n" +
                "import com.google.android.material.floatingactionbutton.FloatingActionButton;\n" +
                "\n" +
                "import java.util.ArrayList;\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "    FloatingActionButton fb;\n" +
                "    DatabaseHelper db;\n" +
                "    ListView lv;\n" +
                "    ArrayList<Studen> dataModels;\n" +
                "\n" +
                "    TextView name,city,phone;\n" +
                "    private A_Adapter adapter;\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_main);\n" +
                "\n" +
                "            lv=findViewById(R.id.user_list);\n" +
                "            db = new DatabaseHelper(this);\n" +
                "\n" +
                "            dataModels = new ArrayList<Studen>();\n" +
                "\n" +
                "            dataModels=db.getData();\n" +
                "\n" +
                "            adapter= new A_Adapter(this, dataModels) {\n" +
                "\n" +
                "            };\n" +
                "\n" +
                "            lv.setAdapter(adapter);\n" +
                "\n" +
                "            fb=findViewById(R.id.fb);\n" +
                "\n" +
                "            fb.setOnClickListener(new View.OnClickListener() {\n" +
                "                @Override\n" +
                "                public void onClick(View view) {\n" +
                "                    Intent i=new Intent(MainActivity.this,item.class);\n" +
                "                    startActivity(i);\n" +
                "                }\n" +
                "            });\n" +
                "        }\n" +
                "    }");

        Item_Java.setTextIsSelectable(true);
        Item_Java.setText("package com.example.database;\n" +
                "\n" +
                "import androidx.appcompat.app.AppCompatActivity;\n" +
                "import android.content.Intent;\n" +
                "import android.os.Bundle;\n" +
                "import android.view.View;\n" +
                "import android.widget.Button;\n" +
                "import android.widget.EditText;\n" +
                "import android.widget.Toast;\n" +
                "public class item extends AppCompatActivity {\n" +
                "    EditText name, city, phone;\n" +
                "    Button insert;\n" +
                "    DatabaseHelper openHelper;\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_item);\n" +
                "\n" +
                "                openHelper = new DatabaseHelper(this);\n" +
                "\n" +
                "                name = findViewById(R.id.name);\n" +
                "                city = findViewById(R.id.city);\n" +
                "                phone = findViewById(R.id.mobile);\n" +
                "                insert = findViewById(R.id.btn1);\n" +
                "\n" +
                "                insert.setOnClickListener(new View.OnClickListener() {\n" +
                "                    @Override\n" +
                "                    public void onClick(View view) {\n" +
                "\n" +
                "                        String uname = name.getText().toString();\n" +
                "                        String ucity = city.getText().toString();\n" +
                "                        String uphone = phone.getText().toString();\n" +
                "\n" +
                "                        openHelper.insertData(uname, ucity, uphone);\n" +
                "                        Intent i = new Intent(item.this, MainActivity.class);\n" +
                "                        startActivity(i);\n" +
                "                        Toast.makeText(item.this, \"Data Added\",\n" +
                "                                Toast.LENGTH_SHORT).show();\n" +
                "                    }\n" +
                "                });\n" +
                "    }\n" +
                "\n" +
                "}");
        Update_Java.setTextIsSelectable(true);
        Update_Java.setText("package com.example.database;\n" +
                "\n" +
                "import androidx.appcompat.app.AppCompatActivity;\n" +
                "import android.annotation.SuppressLint;\n" +
                "import android.content.Intent;\n" +
                "import android.database.sqlite.SQLiteDatabase;\n" +
                "import android.os.Bundle;\n" +
                "import android.view.View;\n" +
                "import android.widget.ArrayAdapter;\n" +
                "import android.widget.Button;\n" +
                "import android.widget.EditText;\n" +
                "import android.widget.ListView;\n" +
                "import android.widget.Toast;\n" +
                "import java.util.ArrayList;\n" +
                "\n" +
                "public class update extends AppCompatActivity {\n" +
                "        Button update;\n" +
                "        ListView listView;\n" +
                "        EditText name, city, phone;\n" +
                "        DatabaseHelper openHelper;\n" +
                "        SQLiteDatabase db;\n" +
                "        ArrayList<String> userlist = new ArrayList<String>();\n" +
                "        ArrayAdapter<String> adapter;\n" +
                "\n" +
                "        @SuppressLint(\"MissingInflatedId\")\n" +
                "            @Override\n" +
                "            protected void onCreate(Bundle savedInstanceState) {\n" +
                "            super.onCreate(savedInstanceState);\n" +
                "            setContentView(R.layout.activity_update);\n" +
                "\n" +
                "                openHelper = new DatabaseHelper(this);\n" +
                "                name = findViewById(R.id.name);\n" +
                "                city = findViewById(R.id.city);\n" +
                "                phone = findViewById(R.id.mobile);\n" +
                "                update = findViewById(R.id.update);\n" +
                "\n" +
                "                Intent i = getIntent();\n" +
                "                String nameIntent = i.getStringExtra(\"name\");\n" +
                "                name.setText(nameIntent);\n" +
                "\n" +
                "                String cityIntent = i.getStringExtra(\"city\");\n" +
                "                city.setText(cityIntent);\n" +
                "\n" +
                "                String phoneIntent = i.getStringExtra(\"phone\");\n" +
                "                phone.setText(phoneIntent);\n" +
                "\n" +
                "                update.setOnClickListener(new View.OnClickListener() {\n" +
                "                    @Override\n" +
                "                    public void onClick(View view) {\n" +
                "\n" +
                "                        Intent i = getIntent();\n" +
                "                        int id = i.getIntExtra(\"id\", 0);\n" +
                "                        String names = name.getText().toString();\n" +
                "                        String citys = city.getText().toString();\n" +
                "                        String phones = phone.getText().toString();\n" +
                "\n" +
                "                        openHelper.update(String.valueOf(id), names, citys, phones);\n" +
                "\n" +
                "                        Intent intent = new Intent(update.this, MainActivity.class);\n" +
                "                        startActivity(intent);\n" +
                "\n" +
                "                        Toast.makeText(update.this, \"Data Update\", Toast.LENGTH_SHORT).show();\n" +
                "                    }\n" +
                "                });\n" +
                "        }\n" +
                "}");
        DatabaseHelper_java.setTextIsSelectable(true);
        DatabaseHelper_java.setText("package com.example.database;\n" +
                "\n" +
                "import static android.content.ContentValues.TAG;\n" +
                "import android.content.ContentValues;\n" +
                "import android.content.Context;\n" +
                "import android.database.Cursor;\n" +
                "import android.database.sqlite.SQLiteDatabase;\n" +
                "import android.database.sqlite.SQLiteOpenHelper;\n" +
                "import android.util.Log;\n" +
                "import androidx.annotation.Nullable;\n" +
                "import java.util.ArrayList;\n" +
                "public class DatabaseHelper extends SQLiteOpenHelper {\n" +
                "        public static final String DATABASE_NAME = \"user.db\";\n" +
                "        public static final String TABLE_NAME = \"usertbl\";\n" +
                "        public static final String COL_1 = \"Id\";\n" +
                "        public static final String COL_2 = \"Name\";\n" +
                "        public static final String COL_3 = \"City\";\n" +
                "        public static final String COL_4 = \"Phone\";\n" +
                "        public DatabaseHelper(@Nullable Context context) {\n" +
                "            super(context, DATABASE_NAME, null, 1);\n" +
                "        }\n" +
                "\n" +
                "        @Override\n" +
                "        public void onCreate(SQLiteDatabase db) {\n" +
                "            db.execSQL(\" CREATE TABLE IF NOT EXISTS  \" + TABLE_NAME + \" \" +\n" +
                "                    \"(\" + COL_1 + \" INTEGER PRIMARY KEY AUTOINCREMENT,\"\n" +
                "                    + COL_2 + \" TEXT,\"\n" +
                "                    + COL_3 + \" TEXT,\"\n" +
                "                    + COL_4 + \" TEXT\" + \")\");\n" +
                "        }\n" +
                "        @Override\n" +
                "        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {\n" +
                "\n" +
                "            db.execSQL(\"DROP TABLE IF EXISTS \" + TABLE_NAME);\n" +
                "            onCreate(db);\n" +
                "        }\n" +
                "        public ArrayList<Studen> getData() {\n" +
                "\n" +
                "            SQLiteDatabase db = this.getReadableDatabase();\n" +
                "            String query = \" select * from \" + TABLE_NAME;\n" +
                "            Cursor data = db.rawQuery(query, null);\n" +
                "\n" +
                "            ArrayList<Studen> dataModels = new\n" +
                "                    ArrayList<>();\n" +
                "\n" +
                "            if (data.moveToFirst()) {\n" +
                "                do {\n" +
                "                    Log.w(\"TAG\", \"getData: \" + data.getInt(0));\n" +
                "                    Log.w(\"TAG\", \"getData: \" + data.getString(1));\n" +
                "                    dataModels.add(new Studen(data.getInt(0),\n" +
                "                            data.getString(1), data.getString(2),\n" +
                "                            data.getString(3)));\n" +
                "                }\n" +
                "                while (data.moveToNext());\n" +
                "            }\n" +
                "            data.close();\n" +
                "\n" +
                "            return dataModels;\n" +
                "        }\n" +
                "        public void insertData(String uname,String\n" +
                "                ucity,String uphone){\n" +
                "            SQLiteDatabase db = this.getWritableDatabase();\n" +
                "            ContentValues contentValues=new\n" +
                "                    ContentValues();\n" +
                "            contentValues.put(DatabaseHelper.COL_2,uname);\n" +
                "            contentValues.put(DatabaseHelper.COL_3,ucity);\n" +
                "            contentValues.put(DatabaseHelper.COL_4,uphone);\n" +
                "\n" +
                "            long id= db.insert(DatabaseHelper.TABLE_NAME,\n" +
                "                    null,contentValues);\n" +
                "            db.close();\n" +
                "        }\n" +
                "        public void deleteData(int id) {\n" +
                "\n" +
                "            SQLiteDatabase db = this.getWritableDatabase();\n" +
                "\n" +
                "            db.delete(TABLE_NAME, \"id=?\", new\n" +
                "                    String[]{String.valueOf(id)});\n" +
                "            db.close();\n" +
                "        }\n" +
                "        public void update(String id, String txtname,\n" +
                "                           String txtcity, String txtphone) {\n" +
                "            SQLiteDatabase db = this.getWritableDatabase();\n" +
                "\n" +
                "            ContentValues contentValues = new ContentValues();\n" +
                "\n" +
                "            contentValues.put(DatabaseHelper.COL_2, txtname);\n" +
                "            contentValues.put(DatabaseHelper.COL_3, txtcity);\n" +
                "            contentValues.put(DatabaseHelper.COL_4, txtphone);\n" +
                "            Log.d(TAG, \"Update ContentValues : \" + contentValues);\n" +
                "            Log.d(TAG, \"Update ContentValues : \" + id);\n" +
                "\n" +
                "            db.update(DatabaseHelper.TABLE_NAME, contentValues,\n" +
                "                    DatabaseHelper.COL_1 + \" = ? \",\n" +
                "                    new String[]{String.valueOf((id))});\n" +
                "            db.close();\n" +
                "        }\n" +
                "    }");
        Student_java.setTextIsSelectable(true);
        Student_java.setText("package com.example.database;\n" +
                "\n" +
                "public class Studen {\n" +
                "        private  int id;\n" +
                "        private  String name;\n" +
                "        private  String city;\n" +
                "        private  String phone;\n" +
                "        public Studen(int id, String name, String city, String phone) {\n" +
                "            this.setId(id);\n" +
                "            this.setName(name);\n" +
                "            this.setCity(city);\n" +
                "            this.setPhone(phone);\n" +
                "        }\n" +
                "        public  void setId(int id) {\n" +
                "            this.id = id;\n" +
                "        }\n" +
                "        public  void setName(String name) {\n" +
                "            this.name = name;\n" +
                "        }\n" +
                "\n" +
                "        public  void setCity(String city) {\n" +
                "            this.city = city;\n" +
                "        }\n" +
                "\n" +
                "        public  void setPhone(String phone) {\n" +
                "            this.phone = phone;\n" +
                "        }\n" +
                "\n" +
                "        public int getId() {\n" +
                "            return id;\n" +
                "        }\n" +
                "        public String getName() {\n" +
                "            return name;\n" +
                "        }\n" +
                "        public String getCity() {\n" +
                "            return city;\n" +
                "        }\n" +
                "        public String getPhone() {\n" +
                "            return phone;\n" +
                "        }\n" +
                "    }\n");
        ArrayAdapter_java.setTextIsSelectable(true);
        ArrayAdapter_java.setText("package com.example.database;\n" +
                "\n" +
                "import android.content.Context;\n" +
                "import android.content.Intent;\n" +
                "import android.view.LayoutInflater;\n" +
                "import android.view.View;\n" +
                "import android.view.ViewGroup;\n" +
                "import android.widget.ArrayAdapter;\n" +
                "import android.widget.ImageView;\n" +
                "import android.widget.TextView;\n" +
                "\n" +
                "import java.util.ArrayList;\n" +
                "\n" +
                "public class A_Adapter extends ArrayAdapter<Studen> {\n" +
                "\n" +
                "    Context mcontext;\n" +
                "    TextView id,txtname, txtcity, txtphone;\n" +
                "    ImageView listedit, listdelete;\n" +
                "    ArrayList<Studen> dataModel;\n" +
                "\n" +
                "        public A_Adapter(Context context, ArrayList<Studen> data) {\n" +
                "            super(context, 0, data);\n" +
                "            this.dataModel = data;\n" +
                "            this.mcontext = context;\n" +
                "        }\n" +
                "        @Override\n" +
                "        public View getView(int position, View convertView, ViewGroup parent) {\n" +
                "\n" +
                "            convertView = LayoutInflater.from(mcontext).inflate(R.layout.rowlist, parent, false);\n" +
                "\n" +
                "            Studen studen= dataModel.get(position);\n" +
                "\n" +
                "            id = convertView.findViewById(R.id.tvid);\n" +
                "            txtname = convertView.findViewById(R.id.name);\n" +
                "            txtcity = convertView.findViewById(R.id.city);\n" +
                "            txtphone = convertView.findViewById(R.id.phone);\n" +
                "\n" +
                "            listedit = convertView.findViewById(R.id.listedit);\n" +
                "            listdelete = convertView.findViewById(R.id.listdelete);\n" +
                "\n" +
                "            id.setText(String.valueOf(studen.getId()));\n" +
                "            txtname.setText(studen.getName());\n" +
                "            txtcity.setText(studen.getCity());\n" +
                "            txtphone.setText(studen.getPhone());\n" +
                "\n" +
                "            listedit.setOnClickListener(new\n" +
                "            View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View view) {\n" +
                "            Intent i=new Intent(mcontext,update.class);\n" +
                "            i.putExtra(\"id\" , studen.getId());\n" +
                "            i.putExtra(\"name\" , studen.getName());\n" +
                "            i.putExtra(\"city\" , studen.getCity());\n" +
                "            i.putExtra(\"phone\" , studen.getPhone());\n" +
                "            mcontext.startActivity(i);\n" +
                "            }\n" +
                "            });\n" +
                "\n" +
                "            listdelete.setOnClickListener(new\n" +
                "            View.OnClickListener() {\n" +
                "             @Override\n" +
                "             public void onClick(View view) {\n" +
                "              DatabaseHelper databaseHelper = new DatabaseHelper(mcontext);\n" +
                "              databaseHelper.deleteData(studen.getId());\n" +
                "              dataModel.remove(position);\n" +
                "              notifyDataSetChanged();\n" +
                "               }\n" +
                "               });\n" +
                "            return convertView;\n" +
                "        }\n" +
                "    }");
        activity_main.setTextIsSelectable(true);
        activity_main.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    tools:context=\".MainActivity\">\n" +
                "\n" +
                "    <ListView\n" +
                "        android:id=\"@+id/user_list\"\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"642dp\"\n" +
                "        android:layout_alignParentTop=\"true\"\n" +
                "        android:layout_alignParentBottom=\"true\"\n" +
                "        android:layout_marginTop=\"35dp\"\n" +
                "        android:layout_marginBottom=\"54dp\">\n" +
                "\n" +
                "    </ListView>\n" +
                "\n" +
                "    <com.google.android.material.floatingactionbutton.FloatingActionButton\n" +
                "        android:id=\"@+id/fb\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_alignParentEnd=\"true\"\n" +
                "        android:layout_alignParentBottom=\"true\"\n" +
                "        android:layout_gravity=\"bottom|right\"\n" +
                "        android:layout_marginStart=\"16sp\"\n" +
                "        android:layout_marginTop=\"16sp\"\n" +
                "        android:layout_marginEnd=\"22dp\"\n" +
                "        android:layout_marginBottom=\"16dp\"\n" +
                "        android:backgroundTint=\"@color/teal_700\"\n" +
                "        android:src=\"@drawable/ic_baseline_add_24\"\n" +
                "        app:fabSize=\"normal\"\n" +
                "        app:layout_anchor=\"@id/user_list\"\n" +
                "        app:layout_anchorGravity=\"bottom|right|end\" />\n" +
                "\n" +
                "    <TextView\n" +
                "        android:id=\"@+id/textView\"\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"29dp\"\n" +
                "        android:text=\"Student Data \"\n" +
                "        android:textSize=\"20sp\"\n" +
                "        android:textStyle=\"bold\"\n" +
                "        android:layout_marginStart=\"20sp\"\n" +
                "        android:layout_marginTop=\"5dp\"/>\n" +
                "\n" +
                "</RelativeLayout>\n");
        activityitem_main.setTextIsSelectable(true);
        activityitem_main.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    tools:context=\".item\"\n" +
                "    android:orientation=\"vertical\"\n" +
                "    android:gravity=\"center\">\n" +
                "\n" +
                "    <TextView\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_alignParentEnd=\"true\"\n" +
                "        android:layout_alignParentBottom=\"true\"\n" +
                "        android:layout_marginEnd=\"99dp\"\n" +
                "        android:layout_marginBottom=\"567dp\"\n" +
                "        android:text=\"Student Information\"\n" +
                "        android:textColor=\"@color/black\"\n" +
                "        android:textSize=\"25sp\" />\n" +
                "\n" +
                "    <EditText\n" +
                "        android:id=\"@+id/name\"\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_alignParentBottom=\"true\"\n" +
                "        android:layout_marginStart=\"50dp\"\n" +
                "        android:layout_marginEnd=\"50dp\"\n" +
                "        android:layout_marginBottom=\"462dp\"\n" +
                "        android:hint=\"Enter Name\"\n" +
                "        android:inputType=\"text\"\n" +
                "        android:textAlignment=\"center\" />\n" +
                "\n" +
                "    <EditText\n" +
                "        android:id=\"@+id/city\"\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_alignParentBottom=\"true\"\n" +
                "        android:layout_marginStart=\"50dp\"\n" +
                "        android:layout_marginEnd=\"50dp\"\n" +
                "        android:layout_marginBottom=\"404dp\"\n" +
                "        android:hint=\"Enter City\"\n" +
                "        android:inputType=\"text\"\n" +
                "        android:textAlignment=\"center\" />\n" +
                "\n" +
                "    <EditText\n" +
                "        android:id=\"@+id/mobile\"\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_alignParentBottom=\"true\"\n" +
                "        android:layout_marginStart=\"50dp\"\n" +
                "        android:layout_marginEnd=\"50dp\"\n" +
                "        android:layout_marginBottom=\"347dp\"\n" +
                "        android:hint=\"Enter Mobile\"\n" +
                "        android:inputType=\"phone\"\n" +
                "        android:textAlignment=\"center\" />\n" +
                "\n" +
                "    <RelativeLayout\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:gravity=\"center\"\n" +
                "        android:layout_marginTop=\"410dp\">\n" +
                "\n" +
                "        <Button\n" +
                "            android:id=\"@+id/btn1\"\n" +
                "            android:layout_width=\"wrap_content\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:text=\"ADD DATA\" />\n" +
                "\n" +
                "    </RelativeLayout>\n" +
                "\n" +
                "</RelativeLayout>\n");
        activityitem_update.setTextIsSelectable(true);
        activityitem_update.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    tools:context=\".update\"\n" +
                "    android:orientation=\"vertical\"\n" +
                "    android:gravity=\"center\" >\n" +
                "\n" +
                "    <TextView\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_alignParentEnd=\"true\"\n" +
                "        android:layout_alignParentBottom=\"true\"\n" +
                "        android:layout_marginEnd=\"101dp\"\n" +
                "        android:layout_marginBottom=\"653dp\"\n" +
                "        android:text=\"Student Information\"\n" +
                "        android:textColor=\"@color/black\"\n" +
                "        android:textSize=\"25sp\" />\n" +
                "\n" +
                "    <EditText\n" +
                "        android:id=\"@+id/name\"\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_alignParentBottom=\"true\"\n" +
                "        android:layout_marginStart=\"50dp\"\n" +
                "        android:layout_marginEnd=\"50dp\"\n" +
                "        android:layout_marginBottom=\"462dp\"\n" +
                "        android:hint=\"Enter Name\"\n" +
                "        android:inputType=\"text\"\n" +
                "        android:textAlignment=\"center\" />\n" +
                "\n" +
                "    <EditText\n" +
                "        android:id=\"@+id/city\"\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_alignParentBottom=\"true\"\n" +
                "        android:layout_marginStart=\"50dp\"\n" +
                "        android:layout_marginEnd=\"50dp\"\n" +
                "        android:layout_marginBottom=\"404dp\"\n" +
                "        android:hint=\"Enter City\"\n" +
                "        android:inputType=\"text\"\n" +
                "        android:textAlignment=\"center\" />\n" +
                "\n" +
                "    <EditText\n" +
                "        android:id=\"@+id/mobile\"\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_alignParentBottom=\"true\"\n" +
                "        android:layout_marginStart=\"50dp\"\n" +
                "        android:layout_marginEnd=\"50dp\"\n" +
                "        android:layout_marginBottom=\"347dp\"\n" +
                "        android:hint=\"Enter Mobile\"\n" +
                "        android:inputType=\"phone\"\n" +
                "        android:textAlignment=\"center\" />\n" +
                "\n" +
                "    <RelativeLayout\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:gravity=\"center\"\n" +
                "        android:layout_marginTop=\"410dp\">\n" +
                "\n" +
                "        <Button\n" +
                "            android:id=\"@+id/update\"\n" +
                "            android:layout_width=\"wrap_content\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:layout_weight=\"1\"\n" +
                "            android:text=\"Update\" />\n" +
                "\n" +
                "    </RelativeLayout>\n" +
                "\n" +
                "</RelativeLayout>\n");
        rowlist_xml.setTextIsSelectable(true);
        rowlist_xml.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\">\n" +
                "\n" +
                "    <TextView\n" +
                "        android:id=\"@+id/tvid\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:textStyle=\"bold\" />\n" +
                "\n" +
                "    <TextView\n" +
                "        android:id=\"@+id/name\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:textSize=\"20sp\"\n" +
                "        android:layout_margin=\"5dp\"\n" +
                "        android:layout_marginTop=\"10sp\"\n" +
                "        android:textStyle=\"bold\" />\n" +
                "\n" +
                "    <TextView\n" +
                "        android:id=\"@+id/city\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_below=\"@id/name\"\n" +
                "        android:layout_marginStart=\"5dp\"\n" +
                "        android:layout_marginTop=\"5dp\"\n" +
                "        android:layout_marginEnd=\"5dp\"\n" +
                "        android:layout_marginBottom=\"5dp\"\n" +
                "        android:textColor=\"#343434\"\n" +
                "        android:textSize=\"20sp\" />\n" +
                "\n" +
                "    <TextView\n" +
                "        android:id=\"@+id/phone\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_below=\"@+id/city\"\n" +
                "        android:layout_marginTop=\"10sp\"\n" +
                "        android:textColor=\"#343434\"\n" +
                "        android:layout_margin=\"5dp\"\n" +
                "        android:textSize=\"20sp\" />\n" +
                "    <ImageView\n" +
                "        android:id=\"@+id/listedit\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_alignParentTop=\"true\"\n" +
                "        android:layout_alignParentEnd=\"true\"\n" +
                "        android:layout_marginStart=\"311dp\"\n" +
                "        android:layout_marginLeft=\"200sp\"\n" +
                "        android:layout_marginTop=\"15dp\"\n" +
                "        android:layout_marginEnd=\"11dp\"\n" +
                "        android:src=\"@drawable/ic_baseline_edit_24\" />\n" +
                "\n" +
                "    <ImageView\n" +
                "        android:id=\"@+id/listdelete\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_alignParentTop=\"true\"\n" +
                "        android:layout_alignParentEnd=\"true\"\n" +
                "        android:layout_marginStart=\"306dp\"\n" +
                "        android:layout_marginLeft=\"300sp\"\n" +
                "        android:layout_marginTop=\"55dp\"\n" +
                "        android:layout_marginEnd=\"5dp\"\n" +
                "        android:src=\"@drawable/ic_baseline_delete_24\"/>\n" +
                "\n" +
                "</RelativeLayout>\n" +
                "\n");


        return view;
    }
}