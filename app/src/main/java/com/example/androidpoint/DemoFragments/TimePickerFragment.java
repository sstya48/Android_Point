package com.example.androidpoint.DemoFragments;

import android.app.TimePickerDialog;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import com.example.androidpoint.R;

import java.util.Calendar;


public class TimePickerFragment extends Fragment {

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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_time_picker, container, false);

        pickTimeBtn = view.findViewById(R.id.idBtnPickTime);
        selectedTimeTV = view.findViewById(R.id.idTVSelectedTime);
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