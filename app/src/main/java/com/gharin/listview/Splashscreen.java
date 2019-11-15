package com.gharin.listview;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splashscreen extends AppCompatActivity {
    private int masuk = 2500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent home = new Intent(Splashscreen.this, MainActivity.class);
                startActivity(home);
                finish();
            }
        },masuk);
    }
}
