package com.endorphinapps.kemikal.djsdinos;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity {

    private ImageView iv_splashScreenImage;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        findViews();

        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.splashscreen_sound);
        mediaPlayer.start();

        iv_splashScreenImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void findViews() {
        iv_splashScreenImage = (ImageView) findViewById(R.id.iv_splashscreen_image);
    }
}
