package com.example.sham.a11102016;

import android.graphics.Color;
import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class freeplay extends AppCompatActivity {

    SoundPool mySound;
    int openhhId, closehhId, rideId, bassId, floorId, crash2Id, tom3Id, tom2Id, tom1Id, splashId, crash1Id, snareId;
    RelativeLayout bg;
    Button HiHatClose, HiHatOpen, RideCymbal, Bass1, Floor, Crash2, Tom3, Snare, Splash, Crash1, Bass2, Tom1, Tom2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_freeplay);
        mySound = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
        openhhId = mySound.load(this, R.raw.openhh, 1);
        closehhId = mySound.load(this, R.raw.closehh,1);
        rideId = mySound.load(this, R.raw.ride,1);
        bassId = mySound.load(this, R.raw.kick,1);
        floorId = mySound.load(this, R.raw.floor,1);
        crash2Id = mySound.load(this, R.raw.crash2,1);
        tom3Id = mySound.load(this, R.raw.tom3,1);
        splashId = mySound.load(this, R.raw.splash,1);
        crash1Id = mySound.load(this, R.raw.crash1,1);
        snareId = mySound.load(this, R.raw.snare,1);
        tom2Id = mySound.load(this, R.raw.tom2,1);
        tom1Id = mySound.load(this, R.raw.tom1,1);

        HiHatClose = (Button)findViewById(R.id.HiHatClose);
        HiHatOpen = (Button)findViewById(R.id.HiHatOpen);
        RideCymbal = (Button)findViewById(R.id.RideCymbal);
        Bass1 = (Button)findViewById(R.id.Bass1);
        Floor = (Button)findViewById(R.id.Floor);
        Crash2 = (Button)findViewById(R.id.Crash2);
        Tom3 = (Button)findViewById(R.id.Tom3);
        Snare = (Button)findViewById(R.id.Snare);
        Splash = (Button)findViewById(R.id.Splash);
        Crash1 = (Button)findViewById(R.id.Crash1);
        Bass2 = (Button)findViewById(R.id.Bass2);
        Tom1 = (Button)findViewById(R.id.Tom1);
        Tom2 = (Button)findViewById(R.id.Tom2);

        bg = (RelativeLayout)findViewById(R.id.RelativeLayout);


    }

public void playHiHatOpen(View view) {
    mySound.play(openhhId, 1, 1, 1, 0, 1);
    bg.setBackgroundColor(Color.parseColor("#33ff33"));

    }

public void playHiHatClose(View view) {
        mySound.play(closehhId, 1, 1, 1, 0, 1);
        bg.setBackgroundColor(Color.parseColor("#00ffff"));

    }

public void playRide(View view) {
    mySound.play(rideId, 1, 1, 1, 0, 1);
    bg.setBackgroundColor(Color.parseColor("#ffff33"));

    }

public void playBass1(View view) {
        mySound.play(bassId, 1, 1, 1, 0, 1);
    bg.setBackgroundColor(Color.parseColor("#ff0000"));

    }

public void playBass2(View view) {
        mySound.play(bassId, 1, 1, 1, 0, 1);
        bg.setBackgroundColor(Color.parseColor("#3333ff"));

    }

public void playFloor(View view) {
        mySound.play(floorId, 1, 1, 1, 0, 1);
    bg.setBackgroundColor(Color.parseColor("#ff9933"));

    }

public void playCrash2(View view) {
        mySound.play(crash2Id, 1, 1, 1, 0, 1);
    bg.setBackgroundColor(Color.parseColor("#ff99cc"));

    }

public void playCrash1(View view) {
    mySound.play(crash1Id, 1, 1, 1, 0, 1);
    bg.setBackgroundColor(Color.parseColor("#b2ff66"));

}

public void playSnare(View view) {
        mySound.play(snareId, 1, 1, 1, 0, 1);
    bg.setBackgroundColor(Color.parseColor("#000000"));

    }

    public void playSplash(View view) {
        mySound.play(splashId, 1, 1, 1, 0, 1);
        bg.setBackgroundColor(Color.parseColor("#66ffb2"));

    }

    public void playTom1(View view) {
        mySound.play(tom1Id, 1, 1, 1, 0, 1);
        bg.setBackgroundColor(Color.parseColor("#ff33ff"));

    }

    public void playTom2(View view) {
        mySound.play(tom2Id, 1, 1, 1, 0, 1);
        bg.setBackgroundColor(Color.parseColor("#808080"));

    }

    public void playTom3(View view) {
        mySound.play(tom3Id, 1, 1, 1, 0, 1);
        bg.setBackgroundColor(Color.parseColor("#0080ff"));

    }
}


