package com.example.androidpoint.DemoFragments;

import android.app.DatePickerDialog;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import com.example.androidpoint.R;

import java.util.Calendar;

public class DatePickerFragment extends Fragment {

    private Button btnpickdate;
    private TextView selectdate;
   public DatePickerFragment() {
        // Required empty public constructor
    }

     public static DatePickerFragment newInstance() {
        DatePickerFragment fragment = new DatePickerFragment();
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
        View view= inflater.inflate(R.layout.fragment_date_picker, container, false);


        btnpickdate=view.findViewById(R.id.btnpickdate);
        selectdate=view.findViewById(R.id.selectdate);

        btnpickdate.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(View view) {

                final Calendar c=Calendar.getInstance();

                int year =c.get(Calendar.YEAR);
                int month = c.get(Calendar.MONTH);
                int day =c.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog datePickerDialog = new DatePickerDialog(getContext(),
                        new DatePickerDialog.OnDateSetListener(){

                            @Override
                            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                                selectdate.setText(dayOfMonth + "-" + (monthOfYear +1 )+ "-" + year);
                            }
                        },

                        year,month, day);

                datePickerDialog.show();

            }
        });
        return view;
    }
}