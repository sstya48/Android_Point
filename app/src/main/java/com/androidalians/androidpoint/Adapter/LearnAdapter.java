package com.androidalians.androidpoint.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.androidalians.androidpoint.Fragment.Learn.DetailFragment;
import com.androidalians.androidpoint.Model.LearnModel;
import com.androidalians.androidpoint.R;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.ads.nativead.NativeAdViewHolder;
import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*public class LearnAdapter extends RecyclerView.Adapter<LearnAdapter.MyViewHolder> {


    Context context;
    ArrayList<LearnModel> datalist;
//    ArrayList<News> newsArrayList;



    public LearnAdapter(Context context, ArrayList<LearnModel> datalist) {

        this.context= context;
        this.datalist= datalist;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, @SuppressLint("RecyclerView") int position) {


        int[] androidColors = context.getResources().getIntArray(R.array.listcolor);
        int randomAndroidColor = androidColors[new Random().nextInt(*//*13*//* androidColors.length)];

        *//*int[] androidColors = context.getResources().getIntArray(R.array.androidcolors);
        int randomAndroidColor = androidColors[new Random().nextInt(*//**//*13*//**//* androidColors.length)];*//*

        holder.title_learn.setText(datalist.get(position).getTitle()*//*.trim()*//*);
        holder.title_learn.setTextColor(randomAndroidColor);
        holder.title_learn.setSelected(true);
        holder.card_title.setText(datalist.get(position).getTitle().substring(0,1));

        holder.title_letter.setCardBackgroundColor(randomAndroidColor);
//        holder.des_learn.setText(datalist.get(position).getDescription());



        holder.card_learn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {


                AppCompatActivity appCompatActivity= (AppCompatActivity) view.getContext();



                appCompatActivity.getSupportFragmentManager().beginTransaction().replace(R.id.frame_container,
                        new DetailFragment(datalist.get(position).getTitle().toString(),
                                datalist.get(position).getDescription(),
//                                Picasso.get().load(datalist.get(position).getImage().toString()).into(image_learn),
                                datalist.get(position).getImage()))*//*.addToBackStack(null)*//*.commit();





*//*
                Intent i=new Intent(holder.title_learn.getContext(), DetailFragment.class);
                i.putExtra("title",datalist.get(position).getTitle());
                i.putExtra("description",datalist.get(position).getDescription());

                i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

                holder.title_learn.getContext().startActivity(i);*//*

            }
        });

       *//* News news=newsArrayList.get(position);

        holder.des_learn.setText(news.title);
        holder.title_learn.setText(news.title);
        holder.item_image.setImageResource(news.item_image);*//*

    }


    @Override
    public int getItemCount() {
        return datalist.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        ShapeableImageView item_image;
        TextView title_learn,des_learn,card_title;

        AppCompatImageView image_learn;
        CardView card_learn,title_letter;



        public MyViewHolder(@NonNull View itemView) {
            super(itemView);


            title_learn= itemView.findViewById(R.id.title_learn);
            des_learn= itemView.findViewById(R.id.des_learn);
            image_learn= itemView.findViewById(R.id.image_learn);
            card_learn= itemView.findViewById(R.id.card_learn);

            card_title= itemView.findViewById(R.id.card_title);
            title_letter= itemView.findViewById(R.id.title_letter);
//            item_image= itemView.findViewById(R.id.item_image);


*//*            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    int position= getAdapterPosition();


                }
            });*//*
        }

    }
  *//*  @Override
    public void onDataChanged(){
        if (progressBar != null){
            progressBar.setVisibility(View.GONE);
        }
    }*//*

}*/

public class LearnAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    Context context;
    ArrayList<LearnModel> datalist;

    private static final int VIEW_TYPE_CONTENT = 0;
    private static final int VIEW_TYPE_NATIVE_AD = 1;

    private static final int MAX_ADS = 3; // Maximum number of ads to show
    private static final int AD_INTERVAL_1 = 6; // Show the first ad after 3 list items
    private static final int AD_INTERVAL_2 = 12; // Show the second ad after 10 list items
    private static final int AD_INTERVAL_3 = 19; // Show the third ad after 15 list items


    public LearnAdapter(Context context, ArrayList<LearnModel> datalist) {

        this.context= context;
        this.datalist= datalist;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        if (viewType == VIEW_TYPE_CONTENT) {
            View v = inflater.inflate(R.layout.list_item, parent, false);
            return new ContentViewHolder(v);
        } else if (viewType == VIEW_TYPE_NATIVE_AD) {
            View view = LayoutInflater.from(context).inflate(R.layout.item_native_ad, parent, false);
            return new NativeAdViewHolder(view);
        } else {
            throw new IllegalArgumentException("Invalid view type");
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        final LearnModel item  = datalist.get(position);

        int[] androidColors = context.getResources().getIntArray(R.array.listcolor);
        int randomAndroidColor = androidColors[new Random().nextInt(androidColors.length)];

        if (holder instanceof ContentViewHolder) {
            ContentViewHolder contentViewHolder =(ContentViewHolder) holder;
            contentViewHolder.bind(item);
        } else if (holder instanceof NativeAdViewHolder) {
            NativeAdViewHolder nativeAdViewHolder = (NativeAdViewHolder) holder;
            NativeAd nativeAd = datalist.get(position).getNativeAd();
            nativeAdViewHolder.bind(nativeAd);

        }

    }

    @Override
    public int getItemViewType(int position) {
        if (datalist.get(position).getNativeAd() != null) {
            return VIEW_TYPE_NATIVE_AD;
        } else {
            return VIEW_TYPE_CONTENT;
        }
    }

    @Override
    public int getItemCount() {
        return datalist.size();
    }

    private class ContentViewHolder extends RecyclerView.ViewHolder {

        ShapeableImageView item_image;
        TextView title_learn,des_learn,card_title;

        AppCompatImageView image_learn;
        CardView card_learn,title_letter;

        int[] androidColors = context.getResources().getIntArray(R.array.listcolor);
        int randomAndroidColor = androidColors[new Random().nextInt(androidColors.length)];

        public ContentViewHolder(View v) {
            super(v);

            title_learn= itemView.findViewById(R.id.title_learn);
            des_learn= itemView.findViewById(R.id.des_learn);
            image_learn= itemView.findViewById(R.id.image_learn);
            card_learn= itemView.findViewById(R.id.card_learn);

            card_title= itemView.findViewById(R.id.card_title);
            title_letter= itemView.findViewById(R.id.title_letter);
//            item_image= itemView.findViewById(R.id.item_image);
        }



        public void bind(LearnModel datalist) {
            title_learn.setText(datalist.getTitle());
                    title_learn.setTextColor(randomAndroidColor);
            title_learn.setSelected(true);
//            card_title.setText(datalist.getTitle().substring(0,1));

            if (datalist.getTitle() != null && datalist.getTitle().length() > 0) {
                card_title.setText(datalist.getTitle().substring(0, 1));
            } /*else {
                // Handle the case where the title is null or empty
                card_title.setText("");
            }*/

            title_letter.setCardBackgroundColor(randomAndroidColor);

            card_learn.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {


                    AppCompatActivity appCompatActivity= (AppCompatActivity) view.getContext();

                    appCompatActivity.getSupportFragmentManager().beginTransaction().replace(R.id.frame_container,
                            new DetailFragment(datalist.getTitle(),
                                    datalist.getDescription(),
                                    datalist.getImage())).commit();


                 /*   Intent i=new Intent(title_learn.getContext(), DetailFragment.class);
                    i.putExtra("title",datalist.getTitle());
                    i.putExtra("description",datalist.getDescription());

                    i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

                    title_learn.getContext().startActivity(i);*/

                }
            });


        }
    }

    public class NativeAdViewHolder extends RecyclerView.ViewHolder {
        NativeAdView nativeAdView;

        public NativeAdViewHolder(View itemView) {
            super(itemView);
            nativeAdView = itemView.findViewById(R.id.nativeAdView);
        }

        public void bind(NativeAd nativeAd) {
            // Set the native ad components
            nativeAdView.setHeadlineView(nativeAdView.findViewById(R.id.nativeAdTitle));
            nativeAdView.setBodyView(nativeAdView.findViewById(R.id.nativeAdDescription));
//            nativeAdView.setCallToActionView(nativeAdView.findViewById(R.id.nativeAdCallToAction));
            nativeAdView.setIconView(nativeAdView.findViewById(R.id.nativeAdIcon));
//            nativeAdView.setMediaView(nativeAdView.findViewById(R.id.nativeAdMedia));
//            nativeAdView.setAdvertiserView(nativeAdView.findViewById(R.id.nativeAdAttribution));

            // Populate the native ad view with the ad data
            ((TextView) nativeAdView.getHeadlineView()).setText(nativeAd.getHeadline());
            ((TextView) nativeAdView.getBodyView()).setText(nativeAd.getBody());
//            ((Button) nativeAdView.getCallToActionView()).setText(nativeAd.getCallToAction());
            ((ImageView) nativeAdView.getIconView()).setImageDrawable(nativeAd.getIcon().getDrawable());
            nativeAdView.setNativeAd(nativeAd);
        }
    }

    // Declare the adLoadedCount variable as an instance variable
    private int adLoadedCount = 0;
    public void loadNativeAds() {
        AdLoader.Builder builder = new AdLoader.Builder(context, "ca-app-pub-3940256099942544/2247696110");
        builder.forNativeAd(new NativeAd.OnNativeAdLoadedListener() {
//            private int adLoadedCount = 0; // Counter for loaded ads

            @Override
            public void onNativeAdLoaded(NativeAd nativeAd) {

                if (adLoadedCount < MAX_ADS) {
                    int insertPosition = 0;
                    int listSize = datalist.size();

                    if (adLoadedCount == 0 && listSize >= AD_INTERVAL_1) {
                        insertPosition = AD_INTERVAL_1;
                        adLoadedCount++;
                    } else if (adLoadedCount == 1 && listSize >= AD_INTERVAL_2) {
                        insertPosition = AD_INTERVAL_2;
                        adLoadedCount++;
                    } else if (adLoadedCount == 2 && listSize >= AD_INTERVAL_3) {
                        insertPosition = AD_INTERVAL_3;
                        adLoadedCount++;
                    }

                    if (insertPosition > 0) {
                        datalist.add(insertPosition, new LearnModel(nativeAd));
                        notifyDataSetChanged();
                    }
                }
            }
        });

        NativeAdOptions adOptions = new NativeAdOptions.Builder()
                .build();

        builder.withNativeAdOptions(adOptions);

        AdLoader adLoader = builder.build();
        adLoader.loadAds(new AdRequest.Builder().addKeyword("user search keyword").build(), MAX_ADS - adLoadedCount);

    }
}
