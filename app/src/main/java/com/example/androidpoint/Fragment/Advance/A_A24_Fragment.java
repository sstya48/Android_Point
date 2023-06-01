package com.example.androidpoint.Fragment.Advance;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.androidpoint.Activity.MainActivity;
import com.example.androidpoint.R;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;


public class A_A24_Fragment extends Fragment {

    Button resize, centrecrop, centreinside, fit, placeholder, error, fade, callback, rotate,complexrotate;
    ImageView iv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a__a24_, container, false);

        resize = view.findViewById(R.id.resize);
        centrecrop = view.findViewById(R.id.centrecrop);
        centreinside = view.findViewById(R.id.centreinside);
        fit = view.findViewById(R.id.fit);
        placeholder = view.findViewById(R.id.placeholder);
        error = view.findViewById(R.id.error);
        fade = view.findViewById(R.id.fade);
        callback = view.findViewById(R.id.callback);
        rotate = view.findViewById(R.id.rotate);
        iv = view.findViewById(R.id.iv);
        complexrotate = view.findViewById(R.id.complexrotation);
        getData();

        return view;
    }

    private void getData() {

        resize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Picasso.get()
                        .load("https://nordvpn.com/wp-content/uploads/android-vs-ios_1200x628-1.png")
                        .resize(600, 200)// resizes the image to these dimensions (in pixel). does not respect aspect ratio
                        .into(iv);
                Toast.makeText(getActivity(), "Resize called ", Toast.LENGTH_SHORT).show();

            }
        });

        centrecrop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Picasso.get()
                        .load("https://nordvpn.com/wp-content/uploads/android-vs-ios_1200x628-1.png")
                        .resize(100,100)
                        .centerCrop()
                        .into(iv);
                Toast.makeText(getActivity(), "Centrecrop called ", Toast.LENGTH_SHORT).show();
            }
        });
        centreinside.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Picasso.get()
                        .load("https://nordvpn.com/wp-content/uploads/android-vs-ios_1200x628-1.png")
                        .resize(100,100)
                        .centerInside()
                        .into(iv);
                Toast.makeText(getActivity(), "Centreinside called ", Toast.LENGTH_SHORT).show();
            }
        });
        fit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Picasso.get()
                        .load("https://nordvpn.com/wp-content/uploads/android-vs-ios_1200x628-1.png")
                        .fit()
                        .into(iv);
                Toast.makeText(getActivity(), "Fit called ", Toast.LENGTH_SHORT).show();
            }
        });

        placeholder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Picasso.get()

                        .load("https://nordvpn.com/wp-content/uploads/android-vs-ios_1200x628-1.png")

                       // .placeholder(R.drawable.defaultimage) // can also be a drawable

                        .into(iv);
                Toast.makeText(getActivity(), "Placeholder called ", Toast.LENGTH_SHORT).show();

            }
        });

        fade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Picasso.get()
                        .load("https://nordvpn.com/wp-content/uploads/android-vs-ios_1200x628-1.png")
                        .placeholder(R.mipmap.ic_launcher) // can also be a drawable
                        .noFade()
                        .into(iv);
                Toast.makeText(getActivity(), "Fade called ", Toast.LENGTH_SHORT).show();
            }
        });
        error.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Picasso.get()
                        .load("https://nordvpn.com/wp-content/uploads/android-vs-ios_1200x628-1.png")
                        .error(R.mipmap.ic_launcher) // will be displayed if the image cannot be loaded
                        .into(iv);

                Toast.makeText(getActivity(), "Error called ", Toast.LENGTH_SHORT).show();



            }
        });
        callback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callback();

            }
        });
        rotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Picasso.get()

                        .load("https://nordvpn.com/wp-content/uploads/android-vs-ios_1200x628-1.png")

                        .rotate(90f)
                        // .rotate(45f, 220f,100f)

                        .into(iv);
                Toast.makeText(getActivity(), "Rotate Called", Toast.LENGTH_SHORT).show();


            }
        });

        complexrotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Picasso.get()

                        .load("https://nordvpn.com/wp-content/uploads/android-vs-ios_1200x628-1.png")

                        //.rotate(90f)
                        .rotate(45f, 220f,100f)

                        .into(iv);
                Toast.makeText(getActivity(), "Complex Rotate Called", Toast.LENGTH_SHORT).show();


            }
        });


    }


    public void callback() {
        Picasso.get()
                .load("https://nordvpn.com/wp-content/uploads/android-vs-ios_1200x628-1.png")
                .into(iv, new com.squareup.picasso.Callback() {
                    @Override
                    public void onSuccess() {
                        //do smth when picture is loaded successfully
                        Toast.makeText(getActivity(), "Image is loaded succesfully", Toast.LENGTH_SHORT).show();


                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), "some Error occured", Toast.LENGTH_SHORT).show();
                    }
                });

    }
}