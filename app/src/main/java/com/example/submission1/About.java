package com.example.submission1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class About extends AppCompatActivity {

    private String title = "About Me";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        setActionBarTitle(title);
    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }
}
