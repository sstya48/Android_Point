package com.example.androidpoint.Fragment.Learn;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import com.ceylonlabs.imageviewpopup.ImagePopup;
import com.example.androidpoint.Fragment.BaseFragment;
import com.example.androidpoint.Model.LearnModel;
import com.example.androidpoint.R;
import com.ortiz.touchview.TouchImageView;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

public class DetailFragment extends BaseFragment {


    TextView des_learn,title_learn,des_title;

    AppCompatImageView back_learn_icon;

//    TouchImageView Image;

    AppCompatImageView Image;

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

//        progressBar= view.findViewById(R.id.progressBarDetail);


        title_learn=view.findViewById(R.id.title_learn);
        des_title=view.findViewById(R.id.title_des);
        des_learn=view.findViewById(R.id.des_learn);
        Image=view.findViewById(R.id.image_learn);
        back_learn_icon=view.findViewById(R.id.back_learn_icon);


        showProgressDialog();

        title_learn.setText(title.toString().replace("\n", "\n"));
        des_title.setText(title.toString().replace("\n", "\n"));
        des_title.setSelected(true);

        des_learn.setText(description.toString().replace( "\\\\n", "\n  \n" ));

        //list image

        Picasso.get().load(image).into(Image, new Callback() {
                    @Override
                    public void onSuccess() {
                        dismissProgressDialog();
                    }

                    @Override
                    public void onError(Exception e) {
                        dismissProgressDialog();
                    }
                }
        );




//POPUP IMAGE=================================

        final ImagePopup imagePopup = new ImagePopup(getContext());
      /*  imagePopup.setWindowHeight(800); // Optional
        imagePopup.setWindowWidth(800);*/ // Optional
        imagePopup.setBackgroundColor(Color.WHITE);  // Optional
        imagePopup.setFullScreen(true); // Optional
        imagePopup.setHideCloseIcon(true);  // Optional
        imagePopup.setImageOnClickClose(true);  // Optional


        imagePopup.initiatePopupWithPicasso(image);

        Image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imagePopup.viewPopup();

            }
        });



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

