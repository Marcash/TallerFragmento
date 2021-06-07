package com.example.fragment.Frags;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.fragment.R;




public class FirstFragment extends Fragment {
    TextView correo1;
    TextView correo2;
    TextView correo3;
    private DataListener callback;

    public FirstFragment() {

    }
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        try {
            callback = (DataListener) context;
        }catch (Exception e){
            throw new ClassCastException(context.toString()+" should implement DataListener ");
        }
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       View v = inflater.inflate(R.layout.fragment_first, container, false);

       correo1 = v.findViewById(R.id.Correo1);
       correo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textToSend = correo1.getText().toString();
                callback.sendData(textToSend);
            }
        });

        correo2 = v.findViewById(R.id.Correo2);
        correo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textToSend = correo2.getText().toString();
                callback.sendData(textToSend);
            }
        });
        correo3 = v.findViewById(R.id.Correo3);
        correo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textToSend = correo3.getText().toString();
                callback.sendData(textToSend);
            }
        });


        return v;
    }
    public interface DataListener {
        void sendData(String text);
    }
}