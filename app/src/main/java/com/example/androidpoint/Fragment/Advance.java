package com.example.androidpoint.Fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.androidpoint.R;

public class Advance extends Fragment {

    CardView card_view1, card_view2, card_view3, card_view4,card_view5,card_view6,
            card_view7,card_view8,card_view9,card_view10,card_view11,card_view12,
            card_view13,card_view14,card_view15,card_view16,card_view17,card_view18, card_view19,
            card_view20, card_view21, card_view22 ;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_advance, container, false);

        card_view1 = view.findViewById(R.id.card1);
        card_view2 = view.findViewById(R.id.card2);
        card_view3 = view.findViewById(R.id.card3);
        card_view4 = view.findViewById(R.id.card4);
        card_view5 = view.findViewById(R.id.card5);
        card_view6 = view.findViewById(R.id.card6);
        card_view7 = view.findViewById(R.id.card7);
        card_view8 = view.findViewById(R.id.card8);
        card_view9 = view.findViewById(R.id.card9);
        card_view10 = view.findViewById(R.id.card10);
        card_view11 = view.findViewById(R.id.card11);
        card_view12 = view.findViewById(R.id.card12);
        card_view13 = view.findViewById(R.id.card13);
        card_view14 = view.findViewById(R.id.card14);
        card_view15 = view.findViewById(R.id.card15);
        card_view16 = view.findViewById(R.id.card16);
        card_view17 = view.findViewById(R.id.card17);
        card_view18 = view.findViewById(R.id.card18);
        card_view19 = view.findViewById(R.id.card19);
        card_view20 = view.findViewById(R.id.card20);
        card_view21 = view.findViewById(R.id.card21);
        card_view22 = view.findViewById(R.id.card22);

        card_view1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A_card_1_Fragment nextFrag= new A_card_1_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, nextFrag, "findThisFragment")
                        .addToBackStack(null)
                        .commit();

            }
        });
        card_view2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A_card_2_Fragment nextFrag= new A_card_2_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, nextFrag, "findThisFragment")
                        .addToBackStack(null)
                        .commit();

            }
        });
        card_view3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A_card_3_Fragment nextFrag= new A_card_3_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, nextFrag, "findThisFragment")
                        .addToBackStack(null)
                        .commit();

            }
        });
        card_view4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A_card_4_Fragment nextFrag= new A_card_4_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, nextFrag, "findThisFragment")
                        .addToBackStack(null)
                        .commit();

            }
        });
        card_view5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A_card_5_Fragment nextFrag= new A_card_5_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, nextFrag, "findThisFragment")
                        .addToBackStack(null)
                        .commit();

            }
        });
        card_view6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A_card_6_Fragment nextFrag= new A_card_6_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, nextFrag, "findThisFragment")
                        .addToBackStack(null)
                        .commit();

            }
        });
        card_view7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A_card_7_Fragment nextFrag= new A_card_7_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, nextFrag, "findThisFragment")
                        .addToBackStack(null)
                        .commit();

            }
        });
        card_view8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A_card_8_Fragment nextFrag= new A_card_8_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, nextFrag, "findThisFragment")
                        .addToBackStack(null)
                        .commit();

            }
        });
        card_view9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A_card_9_Fragment nextFrag= new A_card_9_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, nextFrag, "findThisFragment")
                        .addToBackStack(null)
                        .commit();

            }
        });
        card_view10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A_card_10_Fragment nextFrag= new A_card_10_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, nextFrag, "findThisFragment")
                        .addToBackStack(null)
                        .commit();

            }
        });
        card_view11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A_card_11_Fragment nextFrag= new A_card_11_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, nextFrag, "findThisFragment")
                        .addToBackStack(null)
                        .commit();

            }
        });
        card_view12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A_card_12_Fragment nextFrag= new A_card_12_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, nextFrag, "findThisFragment")
                        .addToBackStack(null)
                        .commit();

            }
        });
        card_view13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A_card_13_Fragment nextFrag= new A_card_13_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, nextFrag, "findThisFragment")
                        .addToBackStack(null)
                        .commit();

            }
        });
        card_view14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A_card_14_Fragment nextFrag= new A_card_14_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, nextFrag, "findThisFragment")
                        .addToBackStack(null)
                        .commit();

            }
        });
        card_view15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A_card_15_Fragment nextFrag= new A_card_15_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, nextFrag, "findThisFragment")
                        .addToBackStack(null)
                        .commit();

            }
        });
        card_view16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A_card_16_Fragment nextFrag= new A_card_16_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, nextFrag, "findThisFragment")
                        .addToBackStack(null)
                        .commit();

            }
        });
        card_view17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A_card_17_Fragment nextFrag= new A_card_17_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, nextFrag, "findThisFragment")
                        .addToBackStack(null)
                        .commit();

            }
        });
        card_view18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A_card_18_Fragment nextFrag= new A_card_18_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, nextFrag, "findThisFragment")
                        .addToBackStack(null)
                        .commit();

            }
        });

        card_view19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A_card_19_Fragment nextFrag= new A_card_19_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, nextFrag, "findThisFragment")
                        .addToBackStack(null)
                        .commit();

            }
        });
        card_view20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A_card_20_Fragment nextFrag= new A_card_20_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, nextFrag, "findThisFragment")
                        .addToBackStack(null)
                        .commit();

            }
        });

        card_view21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A_card_21_Fragment nextFrag= new A_card_21_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, nextFrag, "findThisFragment")
                        .addToBackStack(null)
                        .commit();

            }
        });

        card_view22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A_card_22_Fragment nextFrag= new A_card_22_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, nextFrag, "findThisFragment")
                        .addToBackStack(null)
                        .commit();

            }
        });
        return view;
    }
}