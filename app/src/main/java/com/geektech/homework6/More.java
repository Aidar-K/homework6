package com.geektech.homework6;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class More extends Fragment {
    SwitchCompat switchCompat;
    Boolean aBoolean = false;
    ImageView imageView,imageView2;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.more, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        switchCompat = view.findViewById(R.id.switchC);
        imageView = view.findViewById(R.id.imageView);
        imageView2 = view.findViewById(R.id.imageView2);
        More m1 = new More();

        switchCompat.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (aBoolean) {
                    imageView.setVisibility(View.VISIBLE);
                    imageView2.setVisibility(View.GONE);
                    aBoolean=false;
                } else {
                    imageView2.setVisibility(View.VISIBLE);
                    imageView.setVisibility(View.GONE);
                    aBoolean=true;
                }
            }

        });




    }
}