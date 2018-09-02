package com.example.butt.bloodpreasureprank;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class RecommendedAps extends AppCompatActivity {

    int app;
    ImageView imageViewapp1, imageViewapp2, imageViewapp3, imageViewapp4, imageViewapp5, imageViewapp6, imageViewapp7, imageViewapp8, imageViewapp9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommended_aps);
        imageViewapp1 = (ImageView) findViewById(R.id.app1);
        imageViewapp2 = (ImageView) findViewById(R.id.app2);
        imageViewapp3 = (ImageView) findViewById(R.id.app3);
        imageViewapp4 = (ImageView) findViewById(R.id.app4);
        imageViewapp5 = (ImageView) findViewById(R.id.app5);
        imageViewapp6 = (ImageView) findViewById(R.id.app6);
        imageViewapp7 = (ImageView) findViewById(R.id.app7);
        imageViewapp8 = (ImageView) findViewById(R.id.app8);
        imageViewapp9 = (ImageView) findViewById(R.id.app9);
        AdView adView12 = (AdView) findViewById(R.id.adView12);
        adView12.loadAd(new AdRequest.Builder().build());
        imageViewapp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                app = 1;
                installApps(app);
            }
        });
        imageViewapp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                app = 2;
                installApps(app);
            }
        });
        imageViewapp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                app = 3;
                installApps(app);
            }
        });
        imageViewapp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                app = 4;
                installApps(app);
            }
        });
        imageViewapp5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                app = 5;
                installApps(app);
            }
        });
        imageViewapp6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                app = 6;
                installApps(app);
            }
        });
        imageViewapp7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                app = 7;
                installApps(app);
            }
        });
        imageViewapp8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                app = 8;
                installApps(app);
            }
        });
        imageViewapp9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                app = 9;
                installApps(app);
            }
        });
    }
    public  void installApps(int install){
            if(install==1){
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("market://details?id="
                                + "com.jalsawasiapps.gps.driving.route.tracking.live.map.navigation")));
            }
            else if(install==2){
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("market://details?id="
                                + "com.jalsawasiapps.superboost.cache.cleanerr.batterymasterr")));

            }
            else if(install==3){
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("market://details?id="
                                + "com.jalsawasiapps.find.mylostphone.mobile.tracker")));

            }
            else if(install==4){
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("market://details?id="
                                + "com.jalsawasiapps.music.player.musicbox")));

            }
            else if(install==5){
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("market://details?id="
                                + "com.jalsawasiapps.number.callblocker.blacklist.easycallcontrol")));

            }
            else if(install==6){
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("market://details?id="
                                + "com.jalsawasiapps.musicplayer.mediaplayer.hd.videoplayer")));

            }
            else if(install==7){
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("market://details?id="
                                + "com.jalsawasi.weightfinger.scannerprank.fingerprint.sensor")));

            }
            else if(install==8){
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("market://details?id="
                                + "com.jalsawasi.livestreetview.satellitemapsview")));

            }
            else {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("market://details?id="
                                + "com.jalsawasiapps.super.private.vpn&hl=en")));

            }
    }
}
