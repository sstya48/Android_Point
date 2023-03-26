package com.example.androidpoint.DemoFragments;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.androidpoint.R;

public class ContextMenuFragment extends Fragment {

    TextView textView;
    LinearLayout relativeLayout;

    public ContextMenuFragment() {
        // Required empty public constructor
    }

    public static ContextMenuFragment newInstance() {
        ContextMenuFragment fragment = new ContextMenuFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_context_menu, container, false);

        textView = view.findViewById(R.id.textView);
        relativeLayout = view.findViewById(R.id.relLayout);
        registerForContextMenu(textView);
        return view;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Choose a color");
        menu.add(0, v.getId(), 0, "LightYello");
        menu.add(0, v.getId(), 0, "Purple");
        menu.add(0, v.getId(), 0, "Green");
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if (item.getTitle() == "LightYello") {
            relativeLayout.setBackgroundColor(Color.argb(100,255,193,7));
        } else if (item.getTitle() == "Purple") {
            relativeLayout.setBackgroundColor(R.color.lightpurple);
        } else if (item.getTitle() == "Green") {
            relativeLayout.setBackgroundColor(Color.argb(100,3,209,111));
        }
        return true;
    }
}