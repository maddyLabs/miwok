package com.example.maddy.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.example.maddy.miwok.model.PhrasesList;

import java.util.ArrayList;
import java.util.List;

import Adapters.PhraseAdapter;

public class Phrases extends AppCompatActivity {

    //LinearLayout llo_phrases;
    ListView listView;
    List<PhrasesList> myPhrases;
    PhraseAdapter objPhraseAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);
        myPhrases = new ArrayList<>();
        //llo_phrases=(LinearLayout) findViewById(R.id.llo_phrases);
        getSupportActionBar().setTitle("Phrases");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getPhraseArray();
        setPhraseActivity();
    }

    protected void getPhraseArray() {
        myPhrases.add(new PhrasesList("Where are you going?", "chiwiiṭә",R.raw.phrase_where_are_you_going));
        myPhrases.add(new PhrasesList("What is your name?", "tinnә oyaase'nә",R.raw.phrase_what_is_your_name));
        myPhrases.add(new PhrasesList("My name is Mukund", "oyaaset Mukund",R.raw.phrase_my_name_is));
        myPhrases.add(new PhrasesList("How are you feeling?", "michәksәs?",R.raw.phrase_how_are_you_feeling));
        myPhrases.add(new PhrasesList("I am feeling Good", "kuchi achit",R.raw.phrase_im_feeling_good));
        myPhrases.add(new PhrasesList("Are you coming?", "әәnәs'aa?",R.raw.phrase_are_you_coming));
        myPhrases.add(new PhrasesList("Yes, I am coming", "hәә’ әәnәm",R.raw.phrase_yes_im_coming));
        myPhrases.add(new PhrasesList("I am coming", "әәnәm",R.raw.phrase_im_coming));
        myPhrases.add(new PhrasesList("Let's Go", "yoowutis",R.raw.phrase_lets_go));
        myPhrases.add(new PhrasesList("Come here", "әnni'nem",R.raw.phrase_come_here));

    }

    public void setPhraseActivity() {
        listView = (ListView) findViewById(R.id.listView_phrases);
        objPhraseAdapter = new PhraseAdapter(getApplicationContext(), R.layout.phrases_view_layout, myPhrases);
        listView.setAdapter(objPhraseAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                PhrasesList objPhraseList= myPhrases.get(position);
                MediaPlayer objMediaPlayer= MediaPlayer.create(Phrases.this,objPhraseList.getmPhraseAudio());
                objMediaPlayer.start();
            }
        });
    }
}
