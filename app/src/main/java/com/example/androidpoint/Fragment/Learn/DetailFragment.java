package com.example.androidpoint.Fragment.Learn;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import com.example.androidpoint.Model.LearnModel;
import com.example.androidpoint.R;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

public class DetailFragment extends Fragment  {


    TextView des_learn,title_learn,des_title;

    AppCompatImageView Image,back_learn_icon;

    String description,title,image;

    LearnModel learnModel;

    ProgressBar progressBar;




    public DetailFragment() {
        // Required empty public constructor
    }


    public DetailFragment(String title,String description,String image) {
       /* this.des_learn = des_learn;
        this.title_learn = title_learn;*/
        this.title = title;
        this.description = description;
        this.image=image;

    }


 /* public static LearnAdapterInterface newInstance() {
        DetailFragment fragment = new DetailFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }*/

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

        progressBar= view.findViewById(R.id.progressBarDetail);


        title_learn=view.findViewById(R.id.title_learn);
        des_title=view.findViewById(R.id.title_des);
        des_learn=view.findViewById(R.id.des_learn);
        Image=view.findViewById(R.id.image_learn);
        back_learn_icon=view.findViewById(R.id.back_learn_icon);

        title_learn.setText(title.toString().replace("\n", "\n"));
        des_title.setText(title.toString().replace("\n", "\n"));
        des_title.setSelected(true);

        des_learn.setText(description.toString().replace( "\\\\n", "\n  \n" ));


        Picasso.get().load(image).into(Image, new Callback() {
            @Override
            public void onSuccess() {
                //Image loaded successfully, now dismiss progress bar.
                progressBar.setVisibility(View.GONE);
            }

            @Override
            public void onError(Exception e) {
                progressBar.setVisibility(View.GONE);
            }
        }
        );



        back_learn_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Learn learn= new Learn();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, learn, "Back To Learn Listing....")
                        .commit();
            }
        });


//        image.res(image);

        return view;

    }

}

