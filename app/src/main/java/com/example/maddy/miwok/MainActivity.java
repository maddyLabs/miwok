package com.example.maddy.miwok;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView numbers,colors,phrases,family;
    ArrayList<String> words= new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        colors=(TextView) findViewById(R.id.colors);
        numbers=(TextView) findViewById(R.id.numbers);
        family=(TextView) findViewById(R.id.family);
        phrases=(TextView) findViewById(R.id.phrases);
        colors.setOnClickListener(this);
        numbers.setOnClickListener(this);
        phrases.setOnClickListener(this);
        family.setOnClickListener(this);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Miwok");
//        Log.v("Numbers Activity"," word at index o "+words.get(0));
//        Log.v("Numbers Activity"," word at index o "+words.get(1));
//        Log.v("Numbers Activity"," word at index o "+words.get(2));
//        Log.v("Numbers Activity"," word at index o "+words.get(3));
//        Log.v("Numbers Activity"," word at index o "+words.get(4));
//        Log.v("Numbers Activity"," word at index o "+words.get(5));
//        Log.v("Numbers Activity"," word at index o "+words.get(6));
//        Log.v("Numbers Activity"," word at index o "+words.get(7));
//        Log.v("Numbers Activity"," word at index o "+words.get(8));
//        Log.v("Numbers Activity"," word at index o "+words.get(9));
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.numbers:
                {
//                    Intent k=new Intent(MainActivity.this,Numbers.class);
//                    startActivity(k);
                     startActivity(new Intent(MainActivity.this,Numbers.class));
                }break;
            case R.id.colors:
                {
                    Intent k=new Intent(MainActivity.this,Colors.class);
                    startActivity(k);
                }break;
            case R.id.family:
                {
                    startActivity(new Intent(MainActivity.this,Family.class));
                }break;
            case R.id.phrases:
                {
                    Intent k=new Intent(MainActivity.this,Phrases.class);
                    startActivity(k);
                }break;
            default:
                {
                    //
                }
        }
    }
}
