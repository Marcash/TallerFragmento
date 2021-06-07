package com.example.fragment.Frags;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.fragment.R;


public class SecondFragment extends Fragment {

    private TextView recibir;

    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_second, container, false);
        recibir = (TextView)v.findViewById(R.id.correoMensaje);

        return v;
    }
    public void renderText(String text){
        recibir.setText(text);
    }

}