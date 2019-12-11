package com.raziv.assignment2.ui.home;

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

public class HomeFragment extends Fragment implements View.OnClickListener {
    private Button btnArea;
    private EditText etnum;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);
        etnum= view.findViewById(R.id.etnum);
        btnArea= view.findViewById(R.id.btnArea);

        btnArea.setOnClickListener(this);
        return view;
    }

    public void onClick(View v){
        int num = Integer.parseInt(etnum.getText().toString());
        float Area= 3.1415f *num*num;

        Toast.makeText(getActivity(), "Area of Circle is" +Area, Toast.LENGTH_SHORT).show();

    }
}