package com.zatsando.cardock;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openMaps(View view) {
        Uri gmmIntentUri = Uri.parse("geo:37.983810, 23.727539");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }

    public void openMusic(View view) {
        Intent intent = new Intent(MediaStore.INTENT_ACTION_MUSIC_PLAYER);
        startActivity(intent);
    }

    public void openPhone(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:"));
        startActivity(intent);
    }

    public void getcurrentSpeed(){
    //in the future this will get the current speed of the vehicle lol
    }
}