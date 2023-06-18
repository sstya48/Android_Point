package com.androidalians.androidpoint.Fragment.Advance;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.androidalians.androidpoint.R;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;

import java.util.ArrayList;


public class A_A12_Fragment extends Fragment {

    LineChart lineChart;

    AppCompatImageView Btn_arrow;
    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a__a12_, container, false);

        lineChart=view.findViewById(R.id.lineChart);

        LineDataSet lineDataSet= new LineDataSet(DataValue(),"Data Set 1");
        ArrayList<ILineDataSet> datasets= new ArrayList<>();
        datasets.add(lineDataSet);

        LineData data=new LineData(datasets);
        lineChart.setData(data);
        lineChart.invalidate();


        Btn_arrow=view.findViewById(R.id.Btn_arrow);

        Btn_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A_card_12_Fragment A_card_12_Fragment = new A_card_12_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, A_card_12_Fragment, "Back Button Basic")
                        .addToBackStack(null)
                        .commit();
            }
        });



        return view;
    }

   private ArrayList<Entry> DataValue()
    {


        ArrayList<Entry> dataval = new ArrayList<Entry>();
        dataval.add(new Entry(0, 20));
        dataval.add(new Entry(1, 25));
        dataval.add(new Entry(2, 10));
        dataval.add(new Entry(3, 24));
        dataval.add(new Entry(4, 30));
        dataval.add(new Entry(5, 28));

        return dataval;

    }
}