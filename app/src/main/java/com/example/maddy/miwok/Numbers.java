package com.example.maddy.miwok;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.maddy.miwok.model.Word;

import java.util.ArrayList;

import Adapters.WordAdapter;

public class Numbers extends AppCompatActivity {
    ArrayList<Word> words;
    WordAdapter adapter;
    ListView listView;
    TextView text1;
    Word objWord;
    int index;
    private MediaPlayer mMediaPlayer;
    //View inflatedview;
    //LinearLayout.LayoutParams params=new LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Numbers");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        words= new ArrayList<Word>();
        setContentView(R.layout.activity_numbers);
        getArray();
        displayActivity();
    }
    public void displayActivity() {
        //numbers_txt_show=(TextView) findViewById(R.id.numbers_txt_show);
        adapter = new WordAdapter(this, R.layout.list_item, words);
        listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        /*listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> a, View v, int position,
                                    long id) {
                switch (v.getId())
                {
                    case R
                }
            }
        });
    }*/
    }
    private void getArray()
    {
        words.add(new Word(R.drawable.number_one,"One","Lutti",R.raw.number_one));
        words.add(new Word(R.drawable.number_two,"Two","Otiiko",R.raw.number_two));
        words.add(new Word(R.drawable.number_three,"Three","Tolookosu",R.raw.number_three));
        words.add(new Word(R.drawable.number_four,"Four","Oyyisa",R.raw.number_four));
        words.add(new Word(R.drawable.number_five,"Five","Massokka",R.raw.number_five));
        words.add(new Word(R.drawable.number_six,"Six","Temmokka",R.raw.number_six));
        words.add(new Word(R.drawable.number_seven,"Seven","Kenekaku",R.raw.number_seven));
        words.add(new Word(R.drawable.number_eight,"Eight","Kawinta",R.raw.number_eight));
        words.add(new Word(R.drawable.number_nine,"Nine","Wo'e",R.raw.number_nine));
        words.add(new Word(R.drawable.number_ten,"Ten","Na'aacha",R.raw.number_ten));

        WordAdapter adapter=new WordAdapter(this,0,words);
        ListView listView=(ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                Word word=words.get(position);
                mMediaPlayer=MediaPlayer.create(Numbers.this,word.getmNumberAudio());
                mMediaPlayer.start();
            }
        });
    }

}