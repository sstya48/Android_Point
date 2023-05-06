package com.example.androidpoint.Fragment.Learn;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.example.androidpoint.Adapter.LearnAdapter;
import com.example.androidpoint.Fragment.BaseFragment;
import com.example.androidpoint.Model.LearnModel;
import com.example.androidpoint.R;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;


public class Learn  extends BaseFragment {

    AdView adView_learn;


    private ArrayList<LearnModel> datalist;

    SwipeRefreshLayout mSwipeRefreshLayout;


    private RecyclerView recyclerView;

    FirebaseFirestore db;

//    ProgressBar progressBar;




    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_learn, container, false);

      /*  //Adss=============================================
        //Banner Ad id====================================
        adView_learn=view.findViewById(R.id.adView_learn);

        //====================================================

        MobileAds.initialize(getContext());

        AdRequest adRequest=new AdRequest.Builder().build();


        //banner ad load
        adView_learn.loadAd(adRequest);
//========================================================

*/

        return view;
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


//        progressBar= view.findViewById(R.id.progressBar);

       /* @SuppressLint("UseCompatLoadingForDrawables")
        Drawable progress_drawable = progressBar.getContext().getResources().getDrawable(R.drawable.progress_color);

        progressBar.setProgressDrawable(progress_drawable);
*/

        mSwipeRefreshLayout=view.findViewById(R.id.swipeToRefresh);
        mSwipeRefreshLayout.setColorSchemeResources(R.color.lightyellow);


        recyclerView= view.findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        datalist =new ArrayList<>();

        LearnAdapter myAdapter=new LearnAdapter(getContext(),datalist);

        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(myAdapter);

        mSwipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                recyclerView.setHasFixedSize(true);
                recyclerView.setAdapter(myAdapter);
                mSwipeRefreshLayout.setRefreshing(false);
            }
        });

        showProgressDialog();


        db= FirebaseFirestore.getInstance();


        db.collection("LearnAndroid").orderBy("id").get()
                .addOnSuccessListener(new OnSuccessListener<QuerySnapshot>() {
                    @Override
                    public void onSuccess(QuerySnapshot queryDocumentSnapshots) {

//                        c();

//                        progressBar.setVisibility(View.VISIBLE);

                        List<DocumentSnapshot> list= queryDocumentSnapshots.getDocuments();

                        dismissProgressDialog();

//                        progressBar.setVisibility(View.GONE);


                        for (DocumentSnapshot d:list)
                        {
                            LearnModel learnModel=d.toObject(LearnModel.class);
                            datalist.add(learnModel);
                        }
                        myAdapter.notifyDataSetChanged();

                    }
                });
    }

}