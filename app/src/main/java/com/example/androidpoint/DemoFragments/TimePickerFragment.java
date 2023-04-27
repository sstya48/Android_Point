package com.example.androidpoint.DemoFragments;

import android.annotation.SuppressLint;
import android.app.TimePickerDialog;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import com.example.androidpoint.Fragment.Basic.B_card_9_Fragment;
import com.example.androidpoint.R;

import java.util.Calendar;


public class TimePickerFragment extends Fragment {

    AppCompatImageView timePicker_demo_arrow;
    private Button pickTimeBtn;
    private TextView selectedTimeTV;


    public TimePickerFragment() {
        // Required empty public constructor
    }

  public static TimePickerFragment newInstance() {
        TimePickerFragment fragment = new TimePickerFragment();
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
        View view= inflater.inflate(R.layout.fragment_time_picker, container, false);

        timePicker_demo_arrow = view.findViewById(R.id.timePicker_demo_arrow);

        pickTimeBtn = view.findViewById(R.id.idBtnPickTime);
        selectedTimeTV = view.findViewById(R.id.idTVSelectedTime);

        timePicker_demo_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_card_9_Fragment TimePicker= new B_card_9_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, TimePicker, "TimePicker Demo Back")
                        .commit();
            }
        });
        pickTimeBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                final Calendar c = Calendar.getInstance();

                int hour = c.get(Calendar.HOUR_OF_DAY);
                int minute = c.get(Calendar.MINUTE);

                TimePickerDialog timePickerDialog = new TimePickerDialog(getContext(),new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute)
                    {
                        selectedTimeTV.setText(hourOfDay + ":" + minute);
                    }
                }, hour, minute, false);
                timePickerDialog.show();
            }
        });

        return view;
    }
}