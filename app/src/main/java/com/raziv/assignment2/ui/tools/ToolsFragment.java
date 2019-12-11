package com.raziv.assignment2.ui.tools;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.raziv.assignment2.R;

public class ToolsFragment extends Fragment implements View.OnClickListener {
    private Button btnSwap;
    private EditText etfirst, etsecond;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_tools, container, false);
        etfirst= view.findViewById(R.id.etfirst);
        etsecond= view.findViewById(R.id.etsecond);
        btnSwap= view.findViewById(R.id.btnSwap);

        btnSwap.setOnClickListener(this);

        return view;
    }

    public void onClick(View v){
        int first, second;

        first= Integer.parseInt(etfirst.getText().toString());
        second= Integer.parseInt(etsecond.getText().toString());

        etfirst.setText(Integer.toString(second));
        etsecond.setText(Integer.toString(first));
    }
}