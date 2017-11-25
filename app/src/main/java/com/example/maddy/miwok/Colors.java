package com.example.maddy.miwok;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

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
        objListView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                WordColors objWordColors=myColors.get(position);
                MediaPlayer mediaPlayer=MediaPlayer.create(Colors.this,objWordColors.getmColorAudio());
                mediaPlayer.start();
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        Toast.makeText(Colors.this, "Task playing sound is Completed", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }


    private void getColorsArray()
    {
       myColors.add(new WordColors(R.drawable.color_red,"Red","weṭeṭṭi",R.raw.color_red));
       myColors.add(new WordColors(R.drawable.color_gray,"Gray","ṭopoppi",R.raw.color_gray));
       myColors.add(new WordColors(R.drawable.color_green,"Green","chokokki",R.raw.color_green));
       myColors.add(new WordColors(R.drawable.color_brown,"Brown","ṭakaakki",R.raw.color_brown));
       myColors.add(new WordColors(R.drawable.color_dusty_yellow,"Dusty Yellow","ṭopiisә",R.raw.color_dusty_yellow));
       myColors.add(new WordColors(R.drawable.color_white,"White","Otepaya",R.raw.color_white));
       myColors.add(new WordColors(R.drawable.color_black,"Black","kululli",R.raw.color_black));
       myColors.add(new WordColors(R.drawable.color_mustard_yellow,"Mustard Yellow","chiwiiṭә",R.raw.color_mustard_yellow));
    }
}
