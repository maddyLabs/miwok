package com.example.maddy.miwok;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

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
        familyList.add(new FamilyList(R.drawable.family_grandfather,"Grandfather","paapa"));
        familyList.add(new FamilyList(R.drawable.family_grandmother,"Grandmother","ama"));
        familyList.add(new FamilyList(R.drawable.family_father,"Father","әpә"));
        familyList.add(new FamilyList(R.drawable.family_mother,"Mother","әṭa"));
        familyList.add(new FamilyList(R.drawable.family_older_brother,"Elder Brother","taachi"));
        familyList.add(new FamilyList(R.drawable.family_younger_brother,"Younger Brother","chalitti"));
        familyList.add(new FamilyList(R.drawable.family_older_sister,"Elder Sister","teṭe"));
        familyList.add(new FamilyList(R.drawable.family_younger_sister,"Younger Sister","kolliti"));
        familyList.add(new FamilyList(R.drawable.family_son,"Son","kolliti"));
        familyList.add(new FamilyList(R.drawable.family_daughter,"Daughter","tune"));
    }

    public void setWorking()
    {
        adapter=new FamilyAdapter(this,R.layout.family_layout,familyList);
        listView_family=(ListView) findViewById(R.id.listView_family);
        listView_family.setAdapter(adapter);
    }
}