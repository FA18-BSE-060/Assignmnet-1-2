package com.example.abdullah;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class InputDataFragment extends Fragment {
    EditText ed1,ed2,ed3;
    Button btn;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_input_data, container, false);
        ed1= view.findViewById(R.id.Number1);
        ed2= view.findViewById(R.id.Number2);
        ed3= view.findViewById(R.id.Number3);
        btn= view.findViewById(R.id.StoreNumber);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float number1,number2,number3;
                number1 = Float.parseFloat(ed1.getText().toString());
                number2 = Float.parseFloat(ed2.getText().toString());
                number3 = Float.parseFloat(ed3.getText().toString());
                CalculateFragment cal= new CalculateFragment();
                Bundle args = new Bundle();

                args.putString("Number1",number1.toString());
                args.putString("Number2",number2.toString());
                args.putString("Number3",number3.toString());
                cal.setArguments(args);
                fragmentManager = getChildFragmentManager();
                fragmentTransaction=fragmentManager.beginTransaction();
                fragmentTransaction.add(new CalculateFragment(), String.valueOf(cal));
                fragmentTransaction.commit();
            }
        });




        return view;
    }
}