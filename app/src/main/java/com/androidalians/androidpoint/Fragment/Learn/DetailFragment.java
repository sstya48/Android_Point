package com.androidalians.androidpoint.Fragment.Learn;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.appcompat.widget.AppCompatImageView;

import com.ceylonlabs.imageviewpopup.ImagePopup;
import com.androidalians.androidpoint.Fragment.BaseFragment;
import com.androidalians.androidpoint.R;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

public class DetailFragment extends BaseFragment {
    TextView des_learn, des_title;
    AppCompatImageView back_learn_icon;
    AppCompatImageView Image;
    String description, title, image;

    public DetailFragment(String title, String description, String image) {
        this.title = title;
        this.description = description;
        this.image = image;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_detail, container, false);


        des_title = view.findViewById(R.id.title_des);
        des_learn = view.findViewById(R.id.des_learn);
        Image = view.findViewById(R.id.image_learn);
        back_learn_icon = view.findViewById(R.id.back_learn_icon);

        showProgressDialog();
        des_title.setText(title.toString().replace("\n", "\n"));
        des_title.setSelected(true);

        des_learn.setText(description.toString().replace("\\\\n", "\n  \n"));

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
        imagePopup.setBackgroundColor(Color.WHITE);
        imagePopup.setFullScreen(true);
        imagePopup.setHideCloseIcon(true);
        imagePopup.setImageOnClickClose(true);

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
                Learn learn = new Learn();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, learn, "Back To Learn Listing....")
                        .commit();
            }
        });
        return view;
    }
}

