package com.example.abdullah;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class CalculateFragment extends Fragment {
    TextView txt1,txt2;
    Button add,sub,mul,div;
    Float num1,num2,num3,result;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_calculate, container, false);
        txt1 = view.findViewById(R.id.textView2);
        txt2 = view.findViewById(R.id.textView3);
        add = view.findViewById(R.id.Add);
        sub = view.findViewById(R.id.Substract);
        mul = view.findViewById(R.id.Multiply);
        div = view.findViewById(R.id.Divide);
        Bundle bundle=getArguments();

       num1 = Float.parseFloat( String.valueOf(bundle.getString("Number1")));
       num2 = Float.parseFloat( String.valueOf(bundle.getString("Number2")));
       num3 = Float.parseFloat( String.valueOf(bundle.getString("Number3")));
       txt1.setText("Number 1 = "+num1.toString()+"\n Number 2 = "+num2.toString()+"\n Number 3 = "+num3.toString());
       add.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
              result= num1+num2+num3;
              txt2.setText("Addition is  "+result.toString());
           }
       });
       sub.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               result= num1-num2-num3;
               txt2.setText("Substraction is  "+result.toString());
           }
       });
       mul.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               result= num1*num2*num3;
               txt2.setText("Multipilcation is  "+result.toString());
           }
       });
       div.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               result= num1/num2/num3;
               txt2.setText("Division is  "+result.toString());
           }
       });
        return view;
    }
}