package com.androidalians.androidpoint.DemoFragments;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.PopupMenu;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.androidalians.androidpoint.Fragment.Basic.B_card_16_Fragment;
import com.androidalians.androidpoint.R;
public class Popup_Menu_Fragment extends Fragment {

    AppCompatImageView popUp_Demo_arrow;
    Button button;

    public Popup_Menu_Fragment() {
        // Required empty public constructor
    }

     public static Popup_Menu_Fragment newInstance() {
        Popup_Menu_Fragment fragment = new Popup_Menu_Fragment();
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
        View view= inflater.inflate(R.layout.fragment_popup__menu_, container, false);

        popUp_Demo_arrow=view.findViewById(R.id.popUp_Demo_arrow);

        button=view.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                PopupMenu popup = new PopupMenu(getContext(), button);

                popup.getMenuInflater().inflate(R.menu.menu, popup.getMenu());

                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    public boolean onMenuItemClick(MenuItem item) {
                        Toast.makeText(getContext(), "You Clicked : " + item.getTitle(), Toast.LENGTH_SHORT).show();
                        return true;
                    }
                });
                popup.show();
            }
        });

        popUp_Demo_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_card_16_Fragment PopupMenu= new B_card_16_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, PopupMenu, "PopupMenu Demo Back")
                        .commit();
            }
        });

        return view;
    }
}