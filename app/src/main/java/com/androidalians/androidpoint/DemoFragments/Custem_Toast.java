package com.androidalians.androidpoint.DemoFragments;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.androidalians.androidpoint.Fragment.Basic.B_card_20_Fragment;
import com.androidalians.androidpoint.R;

public class Custem_Toast extends Fragment {

    Button btnShow;
    AppCompatImageView custem_toast_demo_arrow;

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_custem__toast, container, false);


        Button btn = view.findViewById(R.id.btnShow);
        custem_toast_demo_arrow = view.findViewById(R.id.custem_toast_demo_arrow);

        custem_toast_demo_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B_card_20_Fragment ExplicitIntent= new B_card_20_Fragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_container, ExplicitIntent, "Demo Back2")
                        .commit();
            }
        });


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater inflater = getLayoutInflater();
                @SuppressLint({"MissingInflatedId", "LocalSuppress"}) View layout = inflater.inflate(R.layout.custem_toast_create, (ViewGroup) view.findViewById(R.id.custom_toast_layout));
                TextView tv = (TextView) layout.findViewById(R.id.txtvw);
                tv.setText("Custom Toast Notification");
                Toast toast = new Toast(getContext());
                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 180);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.setView(layout);
                toast.show();
            }
        });

        return view;
    }
}