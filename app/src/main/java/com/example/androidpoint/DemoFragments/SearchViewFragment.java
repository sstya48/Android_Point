package com.example.androidpoint.DemoFragments;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import com.example.androidpoint.Fragment.Basic.B_card_11_Fragment;
import com.example.androidpoint.R;

import java.util.ArrayList;

public class SearchViewFragment extends Fragment {


    AppCompatImageView search_demo_arrow;
    SearchView searchView;
    ListView listView;
    ArrayList<String> list;
    ArrayAdapter<String> adapter;

    public SearchViewFragment() {
        // Required empty public constructor
    }

 public static SearchViewFragment newInstance() {
        SearchViewFragment fragment = new SearchViewFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_search_view, container, false);

        search_demo_arrow =view.findViewById(R.id.search_demo_arrow);

        searchView = (SearchView) view.findViewById(R.id.searchView);
        listView = (ListView) view.findViewById(R.id.listView);

        list = new ArrayList<>();
        list.add("Tiger");
        list.add("Giraffe");
        list.add("Bear");
        list.add("Zebra");
        list.add("Panda");
        list.add("Gorilla");
        list.add("Monkey");
        list.add("Wolf");
        list.add("Deer");
        list.add("Fox");
        list.add("Yak");
        list.add("Jaguar");
        list.add("Hyena");
        list.add("Squirrel");
        list.add("Elephant");
        list.add("Crocodile");
        list.add("Kangaroo");
        list.add("Rhinoceros");
        list.add("Hippopotamus");

        adapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1,list);
        listView.setAdapter(adapter);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {

                if(list.contains(query)){
                    adapter.getFilter().filter(query);
                }else{
                    Toast.makeText(getContext(), "No Match found", Toast.LENGTH_LONG).show();
                }
                return false;
            }
            @Override
            public boolean onQueryTextChange(String newText) {
                //    adapter.getFilter().filter(newText);
                return false;
            }
        });

        search_demo_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_card_11_Fragment SearchView= new B_card_11_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, SearchView, "SearchView Demo Back")
                        .commit();
            }
        });

        return view;
    }
}