package com.example.sham.a11102016;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class transition extends Activity {

    private final int transitionDisplayLength = 1000;

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_transition);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainIntent = new Intent(transition.this, freeplay.class);
                transition.this.startActivity(mainIntent);
                transition.this.finish();
            }
        }, transitionDisplayLength);
    }
}
