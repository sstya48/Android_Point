package com.androidalians.androidpoint.Adapter;

import android.content.Context;
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
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;
import java.util.Random;

public class LearnAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private int adLoadedCount = 0;
    Context context;
    ArrayList<LearnModel> datalist;

    private static final int VIEW_TYPE_CONTENT = 0;
    private static final int VIEW_TYPE_NATIVE_AD = 1;

    private static final int MAX_ADS = 3; // Maximum number of ads to show
    private static final int AD_INTERVAL_1 = 6; // Show the first ad after 3 list items
    private static final int AD_INTERVAL_2 = 12; // Show the second ad after 10 list items
    private static final int AD_INTERVAL_3 = 19; // Show the third ad after 15 list items

    private String nativeAdUnitId;


    public LearnAdapter(Context context, ArrayList<LearnModel> datalist) {

        this.context= context;
        this.datalist= datalist;
        nativeAdUnitId = context.getString(R.string.NativeLearn3Ad_unit_id);
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
        TextView title_learn, des_learn, card_title;
        AppCompatImageView image_learn;
        CardView card_learn, title_letter;
        int[] androidColors = context.getResources().getIntArray(R.array.listcolor);
        int randomAndroidColor = androidColors[new Random().nextInt(androidColors.length)];

        public ContentViewHolder(View v) {
            super(v);
            title_learn = itemView.findViewById(R.id.title_learn);
            des_learn = itemView.findViewById(R.id.des_learn);
            image_learn = itemView.findViewById(R.id.image_learn);
            card_learn = itemView.findViewById(R.id.card_learn);
            card_title = itemView.findViewById(R.id.card_title);
            title_letter = itemView.findViewById(R.id.title_letter);
        }


        public void bind(LearnModel datalist) {
            title_learn.setText(datalist.getTitle());
            title_learn.setSelected(true);

            if (datalist.getTitle() != null && datalist.getTitle().length() > 0) {
                card_title.setText(datalist.getTitle().substring(0, 1));
            }

            title_letter.setCardBackgroundColor(randomAndroidColor);
            card_learn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AppCompatActivity appCompatActivity = (AppCompatActivity) view.getContext();
                    appCompatActivity.getSupportFragmentManager().beginTransaction().replace(R.id.frame_container, new DetailFragment(datalist.getTitle(), datalist.getDescription(), datalist.getImage())).commit();
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


    public void loadNativeAds() {
        AdLoader.Builder builder = new AdLoader.Builder(context, /*nativeAdUnitId*/"ca-app-pub-3471867131564882/4877785910");
        builder.forNativeAd(new NativeAd.OnNativeAdLoadedListener() {
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
        adLoader.loadAds(new AdRequest.Builder().build(), MAX_ADS - adLoadedCount);

    }
}
