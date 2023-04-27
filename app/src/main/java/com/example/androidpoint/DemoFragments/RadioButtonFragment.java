package com.example.androidpoint.DemoFragments;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.androidpoint.Fragment.Basic.B_card_6_Fragment;
import com.example.androidpoint.R;

public class RadioButtonFragment extends Fragment {


    AppCompatImageView radio_demo_arrow;
    private Button submit;
    private RadioGroup radioGroup;

    public RadioButtonFragment() {
        // Required empty public constructor
    }
 public static RadioButtonFragment newInstance() {
        RadioButtonFragment fragment = new RadioButtonFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_radio_button, container, false);

        radio_demo_arrow = view.findViewById(R.id.radio_demo_arrow);

        radioGroup = view.findViewById(R.id.activity_main_answers);

        submit = view.findViewById(R.id.activity_main_submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int answerRadioButtonId = radioGroup.getCheckedRadioButtonId();
                if (answerRadioButtonId != -1) {
                    RadioButton answer = view.findViewById(answerRadioButtonId);
                    if (answer.getText().equals(getResources().getString(R.string.answer3))) {
                        Toast.makeText(getContext(), getResources().getString(R.string.correct_answer), Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(getContext(), getResources().getString(R.string.incorrect_answer), Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(getContext(), getResources().getString(R.string.missing_answer), Toast.LENGTH_SHORT).show();
                }
            }
        });


        radio_demo_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_card_6_Fragment RadioBtnBackFrag= new B_card_6_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, RadioBtnBackFrag, "RadioBtn Demo Back")
                        .commit();
            }
        });

        return view;
    }
}