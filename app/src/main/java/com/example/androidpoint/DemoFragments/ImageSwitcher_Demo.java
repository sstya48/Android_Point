package com.example.androidpoint.DemoFragments;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import com.example.androidpoint.Fragment.Basic.B_card_24_Fragment;
import com.example.androidpoint.R;

public class ImageSwitcher_Demo extends Fragment {

   /* ImageSwitcher imageSwitcher;

    Button nextButton;

    int imageSwitcherImages[] =
            {R.drawable.pc1, R.drawable.pc2, R.drawable.pc3, R.drawable.pc4, R.drawable.pc5};

    int switcherImageLength = imageSwitcherImages.length;
    int counter = -1;*/
    AppCompatImageView switcher_arrow;

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_image_switcher__demo, container, false);

        switcher_arrow= view.findViewById(R.id.switcher_arrow);

//        imageSwitcher = (ImageSwitcher)  view.findViewById(R.id.imageSwitcher);
//        nextButton = (Button) view.findViewById(R.id.button);


        switcher_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_card_24_Fragment B_card_24_Fragment= new B_card_24_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, B_card_24_Fragment, "Back Button Basic")
                        .commit();
            }
        });

/*        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            public ImageView makeView() {
                ImageView switcherImageView = new ImageView(getContext());
                switcherImageView.setLayoutParams(new ImageSwitcher.LayoutParams(
                        ActionBar.LayoutParams.FILL_PARENT, ActionBar.LayoutParams.FILL_PARENT
                ));
                switcherImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
              //  switcherImageView.setImageResource(R.drawable.hadoop);
                //switcherImageView.setMaxHeight(100);
                return switcherImageView;
            }
        });

        Animation aniOut = AnimationUtils.loadAnimation(getContext(), android.R.anim.slide_out_right);
        Animation aniIn = AnimationUtils.loadAnimation(getContext(), android.R.anim.slide_in_left);

        imageSwitcher.setOutAnimation(aniOut);
        imageSwitcher.setInAnimation(aniIn);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                if (counter == switcherImageLength){
                    counter = 0;
                    imageSwitcher.setImageResource(imageSwitcherImages[counter]);
                }
                else{
                    imageSwitcher.setImageResource(imageSwitcherImages[counter]);
                }
            }
        });*/

        return view;
    }
}