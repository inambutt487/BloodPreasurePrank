package com.example.butt.bloodpreasureprank;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.unity3d.ads.UnityAds;

import java.util.Timer;

public class ScannerActivity extends Activity {

    ImageView status,heartygif;
    ImageButton thumbscan;
    Animation animation;
    View bar;
    int j = 0;
    CountDownTimer count;
    long then = 0;
    Vibrator vibrator;
    InterstitialAd mInterstitialAd;
    MediaPlayer beepSoundMediaPlayer;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scanner);
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-3444255945927869/5588814436");
        requestNewInterstitial();
        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                switch (j) {
                    case 0:
                        break;
                    case 1:
                        Intent i = new Intent(getApplicationContext(), ResultActivity.class);
                        startActivity(i);
                        break;
                }
                requestNewInterstitial();
            }
        });
        status = (ImageView) findViewById(R.id.statusweight);
        status.setImageResource(R.drawable.click_scan);
        heartygif = (ImageView) findViewById(R.id.herat);
        bar = findViewById(R.id.bar);
        final Timer T = new Timer();
        animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scanner_animation);
        thumbscan = (ImageButton) findViewById(R.id.thumbscanbtn);
        AdView adView8 = (AdView) findViewById(R.id.adView8);
        adView8.loadAd(new AdRequest.Builder().build());
        AdView adView9 = (AdView) findViewById(R.id.adView9);
        adView9.loadAd(new AdRequest.Builder().build());
        vibrator = (Vibrator) getApplicationContext().getSystemService(VIBRATOR_SERVICE);


        thumbscan.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    status.setImageResource(R.drawable.gifme);
                    heartygif.setVisibility(View.VISIBLE);
                    heartygif.setImageResource(R.drawable.line);
                    bar.setVisibility(View.VISIBLE);
                    bar.startAnimation(animation);
                    beepSoundMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.beep);
                    beepSoundMediaPlayer.start();
                    count=  new CountDownTimer(3000, 1000) {
                        boolean b=true;
                        int count1=0;
                        public void onTick(long millisUntilFinished) {
                            count1=count1+1;
                            if(b)
                            {
                                vibrator.vibrate(10000);
                            }
                            if(count1==3)
                            {

                            }
                            b=false;
                        }

                        public void onFinish() {
                            vibrator.cancel();
                            if(count1==2) {
                                heartygif.setVisibility(View.GONE);
                                if (beepSoundMediaPlayer.isPlaying()) {
                                    beepSoundMediaPlayer.stop();
                                    beepSoundMediaPlayer.reset();
                                }
                                new Handler().postDelayed(new Runnable(){
                                    @Override
                                    public void run() {
                                        j = 1;
                                        if (mInterstitialAd.isLoaded()) {
                                            mInterstitialAd.show();
                                        } else {

                                            Intent i = new Intent(getApplicationContext(), ResultActivity.class);
                                            status.setImageResource(R.drawable.scanningcomplete);
                                            startActivity(i);
                                            finish();
                                        }
                                    }
                                }, 700);
                            }
                            else
                            {
                                //
                                Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_SHORT).show();
                            }
                            count1=0;
                            b=true;
                        }

                    }.start();

                    then = (Long) System.currentTimeMillis();
                }
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    vibrator.cancel();
                    count.cancel();
                    bar.clearAnimation();
                    bar.setVisibility(View.GONE);
                    heartygif.setVisibility(View.GONE);
                    if (beepSoundMediaPlayer.isPlaying()) {
                        beepSoundMediaPlayer.stop();
                        beepSoundMediaPlayer.reset();
                    }
                    status.setImageResource(R.drawable.scanning_not_complete);
                }
                return false;
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    private void requestNewInterstitial() {
        // TODO Auto-generated method stub
        AdRequest adRequest = new AdRequest.Builder().build();

        mInterstitialAd.loadAd(adRequest);
    }
}
