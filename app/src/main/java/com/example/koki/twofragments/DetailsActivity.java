package com.example.koki.twofragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class DetailsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("MGENG","Details Activity");
        setContentView(R.layout.activity_details);
        Intent sentIntent = getIntent();
        Bundle sentBundle = sentIntent.getExtras();
        DetailsFragment myDetailsFragment = new DetailsFragment();
        myDetailsFragment.setArguments(sentBundle);
        getSupportFragmentManager().beginTransaction().add(R.id.flDetails , myDetailsFragment ,"").commit();

    }
}
