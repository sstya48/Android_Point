package com.example.androidpoint.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.androidpoint.R;

public class ViewPagerAdapter extends PagerAdapter {

    Context context;

    int images[] = {
            R.drawable.onboard1,
            R.drawable.onboard2,
            R.drawable.onboard1,
//            R.drawable.image4
    };

    int heading[] = {
            R.string.heading_one,
            R.string.heading_two,
            R.string.heading_one,
            /*R.string.heading_three,
            R.string.heading_fourth*/
    };

    int description[] = {
            R.string.desc_one,
            R.string.desc_two,
            R.string.desc_three,
//            R.string.desc_fourth
    };


    public ViewPagerAdapter(Context context) {
        this.context = context;
    }


    @Override
    public int getCount() {
        return heading.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == (LinearLayout) object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) {
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

            View view = layoutInflater.inflate(R.layout.slider_layout, container, false);

            ImageView slidetitleimage = (ImageView) view.findViewById(R.id.title_image);
            TextView slideheading = (TextView) view.findViewById(R.id.text_title);
            TextView slideDesc = (TextView) view.findViewById(R.id.text_des);


            slidetitleimage.setImageResource(images[position]);
            slideheading.setText(heading[position]);
            slideDesc.setText(description[position]);


            container.addView(view);

            return view;

        }

        return true;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        container.removeView((LinearLayout)object);

    }
}