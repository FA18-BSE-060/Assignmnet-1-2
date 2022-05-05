package com.example.abdullah;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class ActionFragment extends Fragment {
    Button input, Calculate;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_action, container, false);
        input = view.findViewById(R.id.button2);
        Calculate = view.findViewById(R.id.button3);
        fragmentManager = getChildFragmentManager();
        fragmentTransaction=fragmentManager.beginTransaction();

        input.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentTransaction.replace(R.id.right,new InputDataFragment());
                fragmentTransaction.commit();
            }
        });
        Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentTransaction.replace(R.id.right,new CalculateFragment());
                fragmentTransaction.commit();
            }
        });

        return view;
    }
}