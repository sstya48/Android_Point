package com.androidalians.androidpoint.Fragment.Learn;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.androidalians.androidpoint.Adapter.LearnAdapter;
import com.androidalians.androidpoint.Fragment.BaseFragment;
import com.androidalians.androidpoint.Model.LearnModel;
import com.androidalians.androidpoint.R;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;

public class Learn extends BaseFragment {
    SwipeRefreshLayout mSwipeRefreshLayout;
    FirebaseFirestore db;
    private ArrayList<LearnModel> datalist;
    private RecyclerView recyclerView;

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_learn, container, false);
        return view;
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mSwipeRefreshLayout = view.findViewById(R.id.swipeToRefresh);
        mSwipeRefreshLayout.setColorSchemeResources(R.color.lightyellow);
        recyclerView = view.findViewById(R.id.recyclerview);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        datalist = new ArrayList<>();
        LearnAdapter myAdapter = new LearnAdapter(getContext(), datalist);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(myAdapter);
        myAdapter.loadNativeAds();
        mSwipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                recyclerView.setHasFixedSize(true);
                recyclerView.setAdapter(myAdapter);
                myAdapter.loadNativeAds();
                mSwipeRefreshLayout.setRefreshing(false);
            }
        });

        showProgressDialog();
        db = FirebaseFirestore.getInstance();
        db.collection("LearnAndroid").orderBy("id").get()
                .addOnSuccessListener(new OnSuccessListener<QuerySnapshot>() {
                    @Override
                    public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                        List<DocumentSnapshot> list = queryDocumentSnapshots.getDocuments();
                        dismissProgressDialog();

                        for (DocumentSnapshot d : list) {
                            LearnModel learnModel = d.toObject(LearnModel.class);
                            datalist.add(learnModel);
                        }
                        myAdapter.notifyDataSetChanged();
                    }
                });
    }
}