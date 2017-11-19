package com.example.maddy.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.example.maddy.miwok.model.WordColors;

import java.util.ArrayList;

import Adapters.ColorsAdapter;

public class Colors extends AppCompatActivity {
    LinearLayout llo_colors;
    ArrayList<WordColors> myColors;
    ColorsAdapter adapter;
    ListView objListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myColors=new ArrayList<>();
        setContentView(R.layout.activity_colors);
        getSupportActionBar().setTitle("Colors");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getColorsArray();
        setValues();
    }

    private void setValues()
    {
        objListView=(ListView) findViewById(R.id.list_view_colors);
        adapter=new ColorsAdapter(this,R.layout.colors_layout,myColors);
        objListView=(ListView) findViewById(R.id.list_view_colors);
        objListView.setAdapter(adapter);
    }


    private void getColorsArray()
    {
       myColors.add(new WordColors(R.drawable.color_red,"Red","weṭeṭṭi"));
       myColors.add(new WordColors(R.drawable.color_gray,"Gray","ṭopoppi"));
       myColors.add(new WordColors(R.drawable.color_green,"Green","chokokki"));
       myColors.add(new WordColors(R.drawable.color_brown,"Brown","ṭakaakki"));
       myColors.add(new WordColors(R.drawable.color_dusty_yellow,"Dusty Yellow","ṭopiisә"));
       myColors.add(new WordColors(R.drawable.color_white,"White","Otepaya"));
       myColors.add(new WordColors(R.drawable.color_black,"Black","kululli"));
       myColors.add(new WordColors(R.drawable.color_mustard_yellow,"Mustard Yellow","chiwiiṭә"));
    }
}
