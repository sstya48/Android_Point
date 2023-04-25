package com.example.androidpoint.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidpoint.Fragment.Learn.DetailFragment;
import com.example.androidpoint.Model.LearnModel;
import com.example.androidpoint.R;
import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;

public class LearnAdapter extends RecyclerView.Adapter<LearnAdapter.MyViewHolder> implements LearnAdapterInterface {


    Context context;
    ArrayList<LearnModel> datalist;
//    ArrayList<News> newsArrayList;

    static ProgressBar progressBar;

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

        holder.title_learn.setText(datalist.get(position).getTitle().trim());
//        holder.des_learn.setText(datalist.get(position).getDescription());



        holder.card_learn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {


                AppCompatActivity appCompatActivity= (AppCompatActivity) view.getContext();



                appCompatActivity.getSupportFragmentManager().beginTransaction().replace(R.id.frame_container,
                        new DetailFragment(datalist.get(position).getTitle().toString(),
                                datalist.get(position).getDescription(),
//                                Picasso.get().load(datalist.get(position).getImage().toString()).into(image_learn),
                                datalist.get(position).getImage()))/*.addToBackStack(null)*/.commit();





/*
                Intent i=new Intent(holder.title_learn.getContext(), DetailFragment.class);
                i.putExtra("title",datalist.get(position).getTitle());
                i.putExtra("description",datalist.get(position).getDescription());

                i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

                holder.title_learn.getContext().startActivity(i);*/

            }
        });

       /* News news=newsArrayList.get(position);

        holder.des_learn.setText(news.title);
        holder.title_learn.setText(news.title);
        holder.item_image.setImageResource(news.item_image);*/

    }

    @Override
    public int getItemCount() {
        return datalist.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        ShapeableImageView item_image;
        TextView title_learn,des_learn;

        AppCompatImageView image_learn;
        CardView card_learn;



        public MyViewHolder(@NonNull View itemView) {
            super(itemView);


            progressBar= itemView.findViewById(R.id.progressBar);
            title_learn= itemView.findViewById(R.id.title_learn);
            des_learn= itemView.findViewById(R.id.des_learn);
            image_learn= itemView.findViewById(R.id.image_learn);
            card_learn= itemView.findViewById(R.id.card_learn);
//            item_image= itemView.findViewById(R.id.item_image);


/*            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    int position= getAdapterPosition();


                }
            });*/
        }

    }
    @Override
    public void onDataChanged(){
        if (progressBar != null){
            progressBar.setVisibility(View.GONE);
        }
    }


}
