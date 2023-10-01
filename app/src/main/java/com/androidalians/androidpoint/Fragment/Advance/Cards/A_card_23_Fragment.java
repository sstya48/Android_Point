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

import com.androidalians.androidpoint.Fragment.Advance.A_A23_Fragment;
import com.androidalians.androidpoint.Fragment.Advance.Advance;
import com.androidalians.androidpoint.R;
public class A_card_23_Fragment extends Fragment {

    ImageView calculator_output;

    TextView calculator_java,calculator_xml;

    AppCompatImageView Btn_arrow;
    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a_card_23_, container, false);

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

        calculator_output = view.findViewById(R.id.calculator_output);
        calculator_output.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                A_A23_Fragment scroll_demo= new A_A23_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, scroll_demo, "SCROLL DEMO")
                        .addToBackStack(null)
                        .commit();
            }
        });

        calculator_java= view.findViewById(R.id.calculator_java);
        calculator_xml= view.findViewById(R.id.calculator_xml);


        calculator_java.setTextIsSelectable(true);
        calculator_java.setText("package example.androidalians.calender;\n" +
                "import androidx.appcompat.app.AppCompatActivity;\n" +
                "import android.os.Bundle;\n" +
                "import android.util.TypedValue;\n" +
                "import android.view.View;\n" +
                "import android.widget.Button;\n" +
                "import android.widget.TextView;\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "    private Button b1;\n" +
                "    private Button b2;\n" +
                "    private Button b3;\n" +
                "    private Button b4;\n" +
                "    private Button b5;\n" +
                "    private Button b6;\n" +
                "    private Button b7;\n" +
                "    private Button b8;\n" +
                "    private Button b9;\n" +
                "    private Button b0;\n" +
                "    private Button b_equal;\n" +
                "    private Button b_multi;\n" +
                "    private Button b_divide;\n" +
                "    private Button b_add;\n" +
                "    private Button b_sub;\n" +
                "    private Button b_clear;\n" +
                "    private Button b_dot;\n" +
                "    private Button b_para1;\n" +
                "    private Button b_para2;\n" +
                "    private TextView t1;\n" +
                "    private TextView t2;\n" +
                "    private final char ADDITION = '+';\n" +
                "    private final char SUBTRACTION = '-';\n" +
                "    private final char MULTIPLICATION = '*';\n" +
                "    private final char DIVISION = '/';\n" +
                "    private final char EQU = '=';\n" +
                "    private final char EXTRA = '@';\n" +
                "    private final char MODULUS = '%';\n" +
                "    private char ACTION;\n" +
                "    private double val1 = Double.NaN;\n" +
                "    private double val2;\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_main);\n" +
                "\n" +
                "        b1 = findViewById(R.id.button1);\n" +
                "        b2 = findViewById(R.id.button2);\n" +
                "        b3 = findViewById(R.id.button3);\n" +
                "        b4 = findViewById(R.id.button4);\n" +
                "        b5 = findViewById(R.id.button5);\n" +
                "        b6 = findViewById(R.id.button6);\n" +
                "        b7 = findViewById(R.id.button7);\n" +
                "        b8 = findViewById(R.id.button8);\n" +
                "        b9 = findViewById(R.id.button9);\n" +
                "        b0 = findViewById(R.id.button0);\n" +
                "        b_equal = findViewById(R.id.button_equal);\n" +
                "        b_multi = findViewById(R.id.button_multi);\n" +
                "        b_divide = findViewById(R.id.button_divide);\n" +
                "        b_add = findViewById(R.id.button_add);\n" +
                "        b_sub = findViewById(R.id.button_sub);\n" +
                "        b_clear = findViewById(R.id.button_clear);\n" +
                "        b_dot = findViewById(R.id.button_dot);\n" +
                "        b_para1 = findViewById(R.id.button_para1);\n" +
                "        b_para2 = findViewById(R.id.button_para2);\n" +
                "        t1 = findViewById(R.id.input);\n" +
                "        t2 = findViewById(R.id.output);\n" +
                "\n" +
                "        b1.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View view) {\n" +
                "                ifErrorOnOutput();\n" +
                "                exceedLength();\n" +
                "                t1.setText(t1.getText().toString() + \"1\");\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "        b2.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View view) {\n" +
                "                ifErrorOnOutput();\n" +
                "                exceedLength();\n" +
                "                t1.setText(t1.getText().toString() + \"2\");\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "        b3.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View view) {\n" +
                "                ifErrorOnOutput();\n" +
                "                exceedLength();\n" +
                "                t1.setText(t1.getText().toString() + \"3\");\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "        b4.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View view) {\n" +
                "                ifErrorOnOutput();\n" +
                "                exceedLength();\n" +
                "                t1.setText(t1.getText().toString() + \"4\");\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "        b5.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View view) {\n" +
                "                ifErrorOnOutput();\n" +
                "                exceedLength();\n" +
                "                t1.setText(t1.getText().toString() + \"5\");\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "        b6.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View view) {\n" +
                "                ifErrorOnOutput();\n" +
                "                exceedLength();\n" +
                "                t1.setText(t1.getText().toString() + \"6\");\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "        b7.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View view) {\n" +
                "                ifErrorOnOutput();\n" +
                "                exceedLength();\n" +
                "                t1.setText(t1.getText().toString() + \"7\");\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "        b8.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View view) {\n" +
                "                ifErrorOnOutput();\n" +
                "                exceedLength();\n" +
                "                t1.setText(t1.getText().toString() + \"8\");\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "        b9.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View view) {\n" +
                "                ifErrorOnOutput();\n" +
                "                exceedLength();\n" +
                "                t1.setText(t1.getText().toString() + \"9\");\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "        b0.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View view) {\n" +
                "                ifErrorOnOutput();\n" +
                "                exceedLength();\n" +
                "                t1.setText(t1.getText().toString() + \"0\");\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "        b_dot.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View view) {\n" +
                "                exceedLength();\n" +
                "                t1.setText(t1.getText().toString() + \".\");\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "        b_para1.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View view) {\n" +
                "                if (t1.getText().length() > 0) {\n" +
                "                    ACTION = MODULUS;\n" +
                "                    operation();\n" +
                "                    if (!ifReallyDecimal()) {\n" +
                "                        t2.setText(val1 + \"%\");\n" +
                "                    } else {\n" +
                "                        t2.setText((int) val1 + \"%\");\n" +
                "                    }\n" +
                "                    t1.setText(null);\n" +
                "                } else {\n" +
                "                    t2.setText(\"Error\");\n" +
                "                }\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "        b_add.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View view) {\n" +
                "                if (t1.getText().length() > 0) {\n" +
                "                    ACTION = ADDITION;\n" +
                "                    operation();\n" +
                "                    if (!ifReallyDecimal()) {\n" +
                "                        t2.setText(val1 + \"+\");\n" +
                "                    } else {\n" +
                "                        t2.setText((int) val1 + \"+\");\n" +
                "                    }\n" +
                "                    t1.setText(null);\n" +
                "                } else {\n" +
                "                    t2.setText(\"Error\");\n" +
                "                }\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "        b_sub.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View view) {\n" +
                "                if (t1.getText().length() > 0) {\n" +
                "                    ACTION = SUBTRACTION;\n" +
                "                    operation();\n" +
                "                    if (t1.getText().length() > 0)\n" +
                "                        if (!ifReallyDecimal()) {\n" +
                "                            t2.setText(val1 + \"-\");\n" +
                "                        } else {\n" +
                "                            t2.setText((int) val1 + \"-\");\n" +
                "                        }\n" +
                "                    t1.setText(null);\n" +
                "                } else {\n" +
                "                    t2.setText(\"Error\");\n" +
                "                }\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "        b_multi.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View view) {\n" +
                "                if (t1.getText().length() > 0) {\n" +
                "                    ACTION = MULTIPLICATION;\n" +
                "                    operation();\n" +
                "                    if (!ifReallyDecimal()) {\n" +
                "                        t2.setText(val1 + \"×\");\n" +
                "                    } else {\n" +
                "                        t2.setText((int) val1 + \"×\");\n" +
                "                    }\n" +
                "                    t1.setText(null);\n" +
                "                } else {\n" +
                "                    t2.setText(\"Error\");\n" +
                "                }\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "        b_divide.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View view) {\n" +
                "                if (t1.getText().length() > 0) {\n" +
                "                    ACTION = DIVISION;\n" +
                "                    operation();\n" +
                "                    if (ifReallyDecimal()) {\n" +
                "                        t2.setText((int) val1 + \"/\");\n" +
                "                    } else {\n" +
                "                        t2.setText(val1 + \"/\");\n" +
                "                    }\n" +
                "                    t1.setText(null);\n" +
                "                } else {\n" +
                "                    t2.setText(\"Error\");\n" +
                "                }\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "        b_para2.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View view) {\n" +
                "                if (!t2.getText().toString().isEmpty() || !t1.getText().toString().isEmpty()) {\n" +
                "                    val1 = Double.parseDouble(t1.getText().toString());\n" +
                "                    ACTION = EXTRA;\n" +
                "                    t2.setText(\"-\" + t1.getText().toString());\n" +
                "                    t1.setText(\"\");\n" +
                "                } else {\n" +
                "                    t2.setText(\"Error\");\n" +
                "                }\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "        b_equal.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View view) {\n" +
                "                if (t1.getText().length() > 0) {\n" +
                "                    operation();\n" +
                "                    ACTION = EQU;\n" +
                "                    if (!ifReallyDecimal()) {\n" +
                "                        t2.setText(/*t2.getText().toString() + String.valueOf(val2) + \"=\" + */String.valueOf(val1));\n" +
                "                    } else {\n" +
                "                        t2.setText(/*t2.getText().toString() + String.valueOf(val2) + \"=\" + */String.valueOf((int) val1));\n" +
                "                    }\n" +
                "                    t1.setText(null);\n" +
                "                } else {\n" +
                "                    t2.setText(\"Error\");\n" +
                "                }\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "        b_clear.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View view) {\n" +
                "                if (t1.getText().length() > 0) {\n" +
                "                    CharSequence name = t1.getText().toString();\n" +
                "                    t1.setText(name.subSequence(0, name.length() - 1));\n" +
                "                } else {\n" +
                "                    val1 = Double.NaN;\n" +
                "                    val2 = Double.NaN;\n" +
                "                    t1.setText(\"\");\n" +
                "                    t2.setText(\"\");\n" +
                "                }\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "        // Empty text views on long click.\n" +
                "        b_clear.setOnLongClickListener(new View.OnLongClickListener() {\n" +
                "            @Override\n" +
                "            public boolean onLongClick(View view) {\n" +
                "                val1 = Double.NaN;\n" +
                "                val2 = Double.NaN;\n" +
                "                t1.setText(\"\");\n" +
                "                t2.setText(\"\");\n" +
                "                return true;\n" +
                "            }\n" +
                "        });\n" +
                "    }\n" +
                "\n" +
                "    private void operation() {\n" +
                "        if (!Double.isNaN(val1)) {\n" +
                "            if (t2.getText().toString().charAt(0) == '-') {\n" +
                "                val1 = (-1) * val1;\n" +
                "            }\n" +
                "            val2 = Double.parseDouble(t1.getText().toString());\n" +
                "\n" +
                "            switch (ACTION) {\n" +
                "                case ADDITION:\n" +
                "                    val1 = val1 + val2;\n" +
                "                    break;\n" +
                "                case SUBTRACTION:\n" +
                "                    val1 = val1 - val2;\n" +
                "                    break;\n" +
                "                case MULTIPLICATION:\n" +
                "                    val1 = val1 * val2;\n" +
                "                    break;\n" +
                "                case DIVISION:\n" +
                "                    val1 = val1 / val2;\n" +
                "                    break;\n" +
                "                case EXTRA:\n" +
                "                    val1 = (-1) * val1;\n" +
                "                    break;\n" +
                "                case MODULUS:\n" +
                "                    val1 = val1 % val2;\n" +
                "                    break;\n" +
                "                case EQU:\n" +
                "                    break;\n" +
                "            }\n" +
                "        } else {\n" +
                "            val1 = Double.parseDouble(t1.getText().toString());\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    // Remove error message that is already written there.\n" +
                "    private void ifErrorOnOutput() {\n" +
                "        if (t2.getText().toString().equals(\"Error\")) {\n" +
                "            t2.setText(\"\");\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    // Whether value if a double or not\n" +
                "    private boolean ifReallyDecimal() {\n" +
                "        return val1 == (int) val1;\n" +
                "    }\n" +
                "\n" +
                "    private void noOperation() {\n" +
                "        String inputExpression = t2.getText().toString();\n" +
                "        if (!inputExpression.isEmpty() && !inputExpression.equals(\"Error\")) {\n" +
                "            if (inputExpression.contains(\"-\")) {\n" +
                "                inputExpression = inputExpression.replace(\"-\", \"\");\n" +
                "                t2.setText(\"\");\n" +
                "                val1 = Double.parseDouble(inputExpression);\n" +
                "            }\n" +
                "            if (inputExpression.contains(\"+\")) {\n" +
                "                inputExpression = inputExpression.replace(\"+\", \"\");\n" +
                "                t2.setText(\"\");\n" +
                "                val1 = Double.parseDouble(inputExpression);\n" +
                "            }\n" +
                "            if (inputExpression.contains(\"/\")) {\n" +
                "                inputExpression = inputExpression.replace(\"/\", \"\");\n" +
                "                t2.setText(\"\");\n" +
                "                val1 = Double.parseDouble(inputExpression);\n" +
                "            }\n" +
                "            if (inputExpression.contains(\"%\")) {\n" +
                "                inputExpression = inputExpression.replace(\"%\", \"\");\n" +
                "                t2.setText(\"\");\n" +
                "                val1 = Double.parseDouble(inputExpression);\n" +
                "            }\n" +
                "            if (inputExpression.contains(\"×\")) {\n" +
                "                inputExpression = inputExpression.replace(\"×\", \"\");\n" +
                "                t2.setText(\"\");\n" +
                "                val1 = Double.parseDouble(inputExpression);\n" +
                "            }\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    // Make text small if too many digits.\n" +
                "    private void exceedLength() {\n" +
                "        if (t1.getText().toString().length() > 10) {\n" +
                "            t1.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);\n" +
                "        }\n" +
                "    }\n" +
                "} ");


        calculator_xml.setTextIsSelectable(true);
        calculator_xml.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    tools:context=\".Fragment.Advance.A_A23_Fragment\">\n" +
                "    \n" +
                "    <Button\n" +
                "        android:id=\"@+id/button1\"\n" +
                "        android:layout_width=\"70dp\"\n" +
                "        android:layout_height=\"70dp\"\n" +
                "        android:background=\"@color/blue\"\n" +
                "        android:text=\"1\"\n" +
                "        android:textColor=\"#ffff\"\n" +
                "        android:textSize=\"28sp\"\n" +
                "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintHorizontal_bias=\"0.043\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toTopOf=\"parent\"\n" +
                "        app:layout_constraintVertical_bias=\"0.817\" />\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/button2\"\n" +
                "        android:layout_width=\"70dp\"\n" +
                "        android:layout_height=\"70dp\"\n" +
                "        android:background=\"@color/blue\"\n" +
                "        android:text=\"2\"\n" +
                "        android:textColor=\"#ffff\"\n" +
                "        android:textSize=\"28sp\"\n" +
                "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintHorizontal_bias=\"0.352\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toTopOf=\"parent\"\n" +
                "        app:layout_constraintVertical_bias=\"0.817\" />\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/button3\"\n" +
                "        android:layout_width=\"70dp\"\n" +
                "        android:layout_height=\"70dp\"\n" +
                "        android:background=\"@color/blue\"\n" +
                "        android:text=\"3\"\n" +
                "        android:textColor=\"#ffff\"\n" +
                "        android:textSize=\"28sp\"\n" +
                "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintHorizontal_bias=\"0.672\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toTopOf=\"parent\"\n" +
                "        app:layout_constraintVertical_bias=\"0.817\" />\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/button4\"\n" +
                "        android:layout_width=\"70dp\"\n" +
                "        android:layout_height=\"70dp\"\n" +
                "        android:background=\"@color/blue\"\n" +
                "        android:text=\"4\"\n" +
                "        android:textColor=\"#ffff\"\n" +
                "        android:textSize=\"28sp\"\n" +
                "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintHorizontal_bias=\"0.043\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toTopOf=\"parent\"\n" +
                "        app:layout_constraintVertical_bias=\"0.677\" />\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/button5\"\n" +
                "        android:layout_width=\"70dp\"\n" +
                "        android:layout_height=\"70dp\"\n" +
                "        android:background=\"@color/blue\"\n" +
                "        android:text=\"5\"\n" +
                "        android:textColor=\"#ffff\"\n" +
                "        android:textSize=\"28sp\"\n" +
                "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintHorizontal_bias=\"0.352\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toTopOf=\"parent\"\n" +
                "        app:layout_constraintVertical_bias=\"0.677\" />\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/button6\"\n" +
                "        android:layout_width=\"70dp\"\n" +
                "        android:layout_height=\"70dp\"\n" +
                "        android:background=\"@color/blue\"\n" +
                "        android:text=\"6\"\n" +
                "        android:textColor=\"#ffff\"\n" +
                "        android:textSize=\"28sp\"\n" +
                "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintHorizontal_bias=\"0.672\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toTopOf=\"parent\"\n" +
                "        app:layout_constraintVertical_bias=\"0.677\" />\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/button7\"\n" +
                "        android:layout_width=\"70dp\"\n" +
                "        android:layout_height=\"70dp\"\n" +
                "        android:background=\"@color/blue\"\n" +
                "        android:text=\"7\"\n" +
                "        android:textColor=\"#ffff\"\n" +
                "        android:textSize=\"28sp\"\n" +
                "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintHorizontal_bias=\"0.043\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toTopOf=\"parent\"\n" +
                "        app:layout_constraintVertical_bias=\"0.541\" />\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/button8\"\n" +
                "        android:layout_width=\"70dp\"\n" +
                "        android:layout_height=\"70dp\"\n" +
                "        android:background=\"@color/blue\"\n" +
                "        android:text=\"8\"\n" +
                "        android:textColor=\"#ffff\"\n" +
                "        android:textSize=\"28sp\"\n" +
                "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintHorizontal_bias=\"0.352\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toTopOf=\"parent\"\n" +
                "        app:layout_constraintVertical_bias=\"0.541\" />\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/button9\"\n" +
                "        android:layout_width=\"70dp\"\n" +
                "        android:layout_height=\"70dp\"\n" +
                "        android:background=\"@color/blue\"\n" +
                "        android:text=\"9\"\n" +
                "        android:textColor=\"#ffff\"\n" +
                "        android:textSize=\"28sp\"\n" +
                "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintHorizontal_bias=\"0.672\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toTopOf=\"parent\"\n" +
                "        app:layout_constraintVertical_bias=\"0.541\" />\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/button0\"\n" +
                "        android:layout_width=\"170dp\"\n" +
                "        android:layout_height=\"70dp\"\n" +
                "        android:background=\"@color/blue\"\n" +
                "        android:paddingRight=\"95sp\"\n" +
                "        android:text=\"0\"\n" +
                "        android:textColor=\"#ffff\"\n" +
                "        android:textSize=\"28sp\"\n" +
                "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintHorizontal_bias=\"0.061\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toTopOf=\"parent\"\n" +
                "        app:layout_constraintVertical_bias=\"0.957\" />\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/button_equal\"\n" +
                "        android:layout_width=\"70dp\"\n" +
                "        android:layout_height=\"70dp\"\n" +
                "        android:background=\"@color/blue\"\n" +
                "        android:text=\"=\"\n" +
                "        android:textColor=\"#ffff\"\n" +
                "        android:textSize=\"28sp\"\n" +
                "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintHorizontal_bias=\"0.99\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toTopOf=\"parent\"\n" +
                "        app:layout_constraintVertical_bias=\"0.958\" />\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/button_multi\"\n" +
                "        android:layout_width=\"70dp\"\n" +
                "        android:layout_height=\"70dp\"\n" +
                "        android:background=\"@color/blue\"\n" +
                "        android:text=\"×\"\n" +
                "        android:textColor=\"#ffff\"\n" +
                "        android:textSize=\"28sp\"\n" +
                "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintHorizontal_bias=\"0.99\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toTopOf=\"parent\"\n" +
                "        app:layout_constraintVertical_bias=\"0.541\" />\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/button_divide\"\n" +
                "        android:layout_width=\"70dp\"\n" +
                "        android:layout_height=\"70dp\"\n" +
                "        android:background=\"@color/blue\"\n" +
                "        android:text=\"/\"\n" +
                "        android:textColor=\"#ffff\"\n" +
                "        android:textSize=\"28sp\"\n" +
                "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintHorizontal_bias=\"0.987\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toTopOf=\"parent\"\n" +
                "        app:layout_constraintVertical_bias=\"0.406\" />\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/button_add\"\n" +
                "        android:layout_width=\"70dp\"\n" +
                "        android:layout_height=\"70dp\"\n" +
                "        android:background=\"@color/blue\"\n" +
                "        android:text=\"+\"\n" +
                "        android:textColor=\"#ffff\"\n" +
                "        android:textSize=\"28sp\"\n" +
                "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintHorizontal_bias=\"0.99\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toTopOf=\"parent\"\n" +
                "        app:layout_constraintVertical_bias=\"0.817\" />\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/button_sub\"\n" +
                "        android:layout_width=\"70dp\"\n" +
                "        android:layout_height=\"70dp\"\n" +
                "        android:background=\"@color/blue\"\n" +
                "        android:text=\"-\"\n" +
                "        android:textColor=\"#ffff\"\n" +
                "        android:textSize=\"28sp\"\n" +
                "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintHorizontal_bias=\"0.99\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toTopOf=\"parent\"\n" +
                "        app:layout_constraintVertical_bias=\"0.677\" />\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/button_clear\"\n" +
                "        android:layout_width=\"70dp\"\n" +
                "        android:layout_height=\"70dp\"\n" +
                "        android:background=\"@color/blue\"\n" +
                "        android:text=\"AC\"\n" +
                "        android:textColor=\"@color/white\"\n" +
                "        android:textSize=\"28sp\"\n" +
                "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintHorizontal_bias=\"0.043\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toTopOf=\"parent\"\n" +
                "        app:layout_constraintVertical_bias=\"0.406\" />\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/button_para1\"\n" +
                "        android:layout_width=\"70dp\"\n" +
                "        android:layout_height=\"70dp\"\n" +
                "        android:background=\"@color/blue\"\n" +
                "        android:text=\"%\"\n" +
                "        android:textColor=\"@color/white\"\n" +
                "        android:textSize=\"28sp\"\n" +
                "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintHorizontal_bias=\"0.672\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toTopOf=\"parent\"\n" +
                "        app:layout_constraintVertical_bias=\"0.406\" />\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/button_para2\"\n" +
                "        android:layout_width=\"70dp\"\n" +
                "        android:layout_height=\"70dp\"\n" +
                "        android:background=\"@color/blue\"\n" +
                "        android:text=\"+/-\"\n" +
                "        android:textColor=\"@color/white\"\n" +
                "        android:textSize=\"28sp\"\n" +
                "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintHorizontal_bias=\"0.349\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toTopOf=\"parent\"\n" +
                "        app:layout_constraintVertical_bias=\"0.406\" />\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/button_dot\"\n" +
                "        android:layout_width=\"70dp\"\n" +
                "        android:layout_height=\"70dp\"\n" +
                "        android:background=\"@color/blue\"\n" +
                "        android:text=\".\"\n" +
                "        android:textColor=\"#ffff\"\n" +
                "        android:textSize=\"28sp\"\n" +
                "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintHorizontal_bias=\"0.671\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toTopOf=\"parent\"\n" +
                "        app:layout_constraintVertical_bias=\"0.958\" />\n" +
                "\n" +
                "    <TextView\n" +
                "        android:id=\"@+id/input\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:textSize=\"68sp\"\n" +
                "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintHorizontal_bias=\"0.909\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toTopOf=\"parent\"\n" +
                "        app:layout_constraintVertical_bias=\"0.252\" />\n" +
                "\n" +
                "    <TextView\n" +
                "        android:id=\"@+id/output\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:textSize=\"36sp\"\n" +
                "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintHorizontal_bias=\"0.909\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toTopOf=\"parent\"\n" +
                "        app:layout_constraintVertical_bias=\"0.051\" />\n" +
                "\n" +
                "</androidx.constraintlayout.widget.ConstraintLayout>");

        return view;
    }
}