package com.raziv.assignment2.ui.slideshow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.raziv.assignment2.R;

public class SlideshowFragment extends Fragment implements View.OnClickListener {
    private Button btnautomor;
    private EditText etNum;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_slideshow, container, false);
        etNum= view.findViewById(R.id.etNum);
        btnautomor= view.findViewById(R.id.btnautomor);

        btnautomor.setOnClickListener(this);
        return view;
    }

    public void onClick(View v){
        int a, square, counter=1;
        int n= Integer.parseInt(etNum.getText().toString());
        a=n;
        square=n*n;
        while(n!=0){
            counter=counter*10;
            n=n/10;
        }
        if(square%counter==a){
            Toast.makeText(getActivity(),a+"is Automorphic", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(getActivity(), a+"is not Automorphic", Toast.LENGTH_SHORT).show();
        }
    }
}