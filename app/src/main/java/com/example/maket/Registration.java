package com.example.maket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Registration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        final int flags = View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;
    }

    public void goGoogle(View v){
        Intent browserIntent = new
                Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.ru/"));
        startActivity(browserIntent);
    }

    public void goFacebook(View v){
        Intent browserIntent = new
                Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/"));
        startActivity(browserIntent);
    }

    public void goAuto(View v){
        startActivity(new Intent(this, MainActivity.class));
    }
    public void goMainPage(View v){
        startActivity(new Intent(this, MainPage.class));
    }

}