package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import com.example.fragment.Fragmentos.FirstFragment;
import com.example.fragment.Fragmentos.SecondFragment;

public class MainActivity extends AppCompatActivity implements FirstFragment.DataListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //FragmentManager manager = getSupportFragmentManager();
        //manager.beginTransaction().add(R.id.mainActivity, firstFragment).commit();
    }
    @Override
    public void sendData(String text) {
        SecondFragment detailsFragment = (SecondFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentContainerView3);
        detailsFragment.renderText(text);
    }
}