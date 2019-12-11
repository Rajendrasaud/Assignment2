package com.raziv.assignment2.ui.gallery;

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

public class GalleryFragment extends Fragment implements View.OnClickListener{
    private Button btnPal;
    private EditText etNumber;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_gallery, container, false);
        etNumber= view.findViewById(R.id.etNumber);
        btnPal= view.findViewById(R.id.btnPal);

        btnPal.setOnClickListener(this);
        return view;
    }

    public void onClick(View v){
        int num = Integer.parseInt(etNumber.getText().toString());
        Palindrome pal =new Palindrome();
        int result = pal.reverse(num);

        if(result == num)
        {
            Toast.makeText(getActivity(), result+"Palindrom of this Number is", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(getActivity(),result+"This is not Palindrome", Toast.LENGTH_SHORT).show();
        }

    }
}