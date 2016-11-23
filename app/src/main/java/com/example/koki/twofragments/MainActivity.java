package com.example.koki.twofragments;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("MGENG","Main Activity");

        MainActivityFragment mainFragment = new MainActivityFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.flMain,mainFragment,"").commit();
    }


}
