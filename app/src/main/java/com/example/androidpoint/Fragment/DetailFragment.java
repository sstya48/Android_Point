package com.example.androidpoint.Fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.androidpoint.R;

public class DetailFragment extends Fragment {


    TextView des_learn,title_learn;

    AppCompatImageView image_learn;

    String description,title,image;


    public DetailFragment() {
        // Required empty public constructor
    }


    public DetailFragment(String title,String description) {
       /* this.des_learn = des_learn;
        this.title_learn = title_learn;*/
        this.title = title;
        this.description = description;

    }


  public static DetailFragment newInstance() {
        DetailFragment fragment = new DetailFragment();
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
        View view= inflater.inflate(R.layout.fragment_detail, container, false);

        title_learn=view.findViewById(R.id.title_learn);
        des_learn=view.findViewById(R.id.des_learn);
        image_learn=view.findViewById(R.id.image_learn);

        title_learn.setText(title);

        des_learn.setText(description);

//        image.res(image);

        return view;

    }
}

