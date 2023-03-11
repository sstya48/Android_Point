package com.example.androidpoint.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.androidpoint.R;

import java.util.ArrayList;

public class B_card_1_Fragment extends Fragment {
    TextView feedBack;

    ArrayList<String> list;

    ArrayAdapter<String> adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_b_card_1_, container, false);


        /*feedBack = (TextView) view.findViewById(R.id.feedBack);

        list = new ArrayList<>();
        list.add("Lion");

        adapter = new ArrayAdapter<String>(R.layout.fragment_b_card_1_,list);
        feedBack.setAdapter(adapter);
*/



        return view;
    }
}