package com.example.maddy.miwok;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.maddy.miwok.model.FamilyList;

import java.util.ArrayList;

import Adapters.FamilyAdapter;

public class Family extends AppCompatActivity {
    LinearLayout llo_family;
    ArrayList<FamilyList> familyList;
    FamilyAdapter adapter;
    ListView listView_family;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        familyList=new ArrayList<>();
        //llo_family=(LinearLayout)findViewById(R.id.llo_family);
        setContentView(R.layout.activity_family);
        getSupportActionBar().setTitle("Family");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getFamily();
        setWorking();
    }
    public void getFamily()
    {
        familyList.add(new FamilyList(R.drawable.family_grandfather,"Grandfather","paapa",R.raw.family_grandfather));
        familyList.add(new FamilyList(R.drawable.family_grandmother,"Grandmother","ama",R.raw.family_grandmother));
        familyList.add(new FamilyList(R.drawable.family_father,"Father","әpә",R.raw.family_father));
        familyList.add(new FamilyList(R.drawable.family_mother,"Mother","әṭa",R.raw.family_mother));
        familyList.add(new FamilyList(R.drawable.family_older_brother,"Elder Brother","taachi",R.raw.family_older_brother));
        familyList.add(new FamilyList(R.drawable.family_younger_brother,"Younger Brother","chalitti",R.raw.family_younger_brother));
        familyList.add(new FamilyList(R.drawable.family_older_sister,"Elder Sister","teṭe",R.raw.family_older_sister));
        familyList.add(new FamilyList(R.drawable.family_younger_sister,"Younger Sister","kolliti",R.raw.family_younger_sister));
        familyList.add(new FamilyList(R.drawable.family_son,"Son","kolliti",R.raw.family_son));
        familyList.add(new FamilyList(R.drawable.family_daughter,"Daughter","tune",R.raw.family_daughter));
    }

    public void setWorking()
    {
        adapter=new FamilyAdapter(this,R.layout.family_layout,familyList);
        listView_family=(ListView) findViewById(R.id.listView_family);
        listView_family.setAdapter(adapter);
        listView_family.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                FamilyList objFamilyList=familyList.get(position);
                MediaPlayer objMediaPlayer=MediaPlayer.create(Family.this,objFamilyList.getmFamilyAudio());
                objMediaPlayer.start();
                objMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        Toast.makeText(Family.this, "Playing sound task is Completed", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }
}