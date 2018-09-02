package com.example.butt.bloodpreasureprank;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class GenderActivity extends Activity {


    private ImageView malebtn, femalebtn;
    int code = 0;
    Intent i;
    int j = 0;
    InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender);
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
                        code = 1;
                        i = new Intent(GenderActivity.this, AgeActivity.class);
                        i.putExtra("code", code);
                        startActivity(i);
                        break;
                    case 2:
                        code = 2;
                        i = new Intent(GenderActivity.this, AgeActivity.class);
                        i.putExtra("code", code);
                        startActivity(i);
                        break;
                }
                requestNewInterstitial();

            }
        });
        AdView adView2 = (AdView) findViewById(R.id.adView2);
        adView2.loadAd(new AdRequest.Builder().build());
        AdView adView3 = (AdView) findViewById(R.id.adView3);
        adView3.loadAd(new AdRequest.Builder().build());
        malebtn = (ImageView) findViewById(R.id.male);
        femalebtn = (ImageView) findViewById(R.id.female);
        malebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                j = 1;
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    code = 1;
                    i = new Intent(GenderActivity.this, AgeActivity.class);
                    i.putExtra("code", code);
                    startActivity(i);
                }
            }
        });

        femalebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                j = 2;
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    code = 2;
                    i = new Intent(GenderActivity.this, AgeActivity.class);
                    i.putExtra("code", code);
                    startActivity(i);
                }
            }
        });
    }

    private void requestNewInterstitial() {
        // TODO Auto-generated method stub
        AdRequest adRequest = new AdRequest.Builder().build();

        mInterstitialAd.loadAd(adRequest);
    }

}
