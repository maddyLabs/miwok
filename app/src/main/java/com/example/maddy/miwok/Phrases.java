package com.example.maddy.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
        myPhrases.add(new PhrasesList("Where are you going?", "chiwiiṭә"));
        myPhrases.add(new PhrasesList("What is your name?", "tinnә oyaase'nә"));
        myPhrases.add(new PhrasesList("My name is Mukund", "oyaaset Mukund"));
        myPhrases.add(new PhrasesList("How are you feeling?", "michәksәs?"));
        myPhrases.add(new PhrasesList("I am feeling Good", "kuchi achit"));
        myPhrases.add(new PhrasesList("Are you coming?", "әәnәs'aa?"));
        myPhrases.add(new PhrasesList("Yes, I am coming", "hәә’ әәnәm"));
        myPhrases.add(new PhrasesList("I am coming", "әәnәm"));
        myPhrases.add(new PhrasesList("Let's Go", "yoowutis"));
        myPhrases.add(new PhrasesList("Come here", "әnni'nem"));

    }

    public void setPhraseActivity() {
        listView = (ListView) findViewById(R.id.listView_phrases);
        objPhraseAdapter = new PhraseAdapter(getApplicationContext(), R.layout.phrases_view_layout, myPhrases);
        listView.setAdapter(objPhraseAdapter);
    }
}
