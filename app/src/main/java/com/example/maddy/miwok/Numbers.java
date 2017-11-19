package com.example.maddy.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.maddy.miwok.model.Word;

import java.util.ArrayList;

import Adapters.WordAdapter;

public class Numbers extends AppCompatActivity {
    ArrayList<Word> words;
    WordAdapter adapter;
    ListView listView;
    TextView text1;
    int index;
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
        /*listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
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
        words.add(new Word(R.drawable.number_one,"One","Lutti"));
        words.add(new Word(R.drawable.number_two,"Two","Otiiko"));
        words.add(new Word(R.drawable.number_three,"Three","Tolookosu"));
        words.add(new Word(R.drawable.number_four,"Four","Oyyisa"));
        words.add(new Word(R.drawable.number_five,"Five","Massokka"));
        words.add(new Word(R.drawable.number_six,"Six","Temmokka"));
        words.add(new Word(R.drawable.number_seven,"Seven","Kenekaku"));
        words.add(new Word(R.drawable.number_eight,"Eight","Kawinta"));
        words.add(new Word(R.drawable.number_nine,"Nine","Wo'e"));
        words.add(new Word(R.drawable.number_ten,"Ten","Na'aacha"));
        /*words.add("One");
        words.add("Two");
        words.add("Three");
        words.add("Four");
        words.add("Five");
        words.add("Six");
        words.add("Seven");
        words.add("Eight");
        words.add("Nine");
        words.add("Ten");
        words.add("Eleven");
        words.add("Twelve");*/
        WordAdapter adapter=new WordAdapter(this,0,words);
        ListView listView=(ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }

}