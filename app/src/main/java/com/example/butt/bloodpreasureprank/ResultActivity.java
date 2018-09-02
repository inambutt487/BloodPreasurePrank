package com.example.butt.bloodpreasureprank;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ResultActivity extends Activity {

    ImageView stage;
    SharedPreferences sharedpreferences;
    TextView systolictv, diastolictv, plusestv;
    int age;
    int systolic=0, diastolic=0, pluses=0;
    Random rand = new Random();
    Intent intent;
//    public static final String mypreference = "mypref";
//    public static final String systolicKey = "systolicKey";
//    public static final String diastolicKey = "diastolicKey";
//    public static final String plusesKey = "plusesKey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
//        Bundle bundle = getIntent().getExtras();
//        age  = bundle.getInt("ageyear");
        age = AgeActivity.ageyear;
        stage = (ImageView) findViewById(R.id.stage);
        systolictv = (TextView) findViewById(R.id.systolic);
        diastolictv = (TextView) findViewById(R.id.diastolic);
        plusestv = (TextView) findViewById(R.id.plses);
        systolictv.setTypeface(Typeface.createFromAsset(getApplicationContext().getAssets(), "fonts/Digital.ttf"));
        diastolictv.setTypeface(Typeface.createFromAsset(getApplicationContext().getAssets(), "fonts/Digital.ttf"));
        plusestv.setTypeface(Typeface.createFromAsset(getApplicationContext().getAssets(), "fonts/Digital.ttf"));
        AdView adView10 = (AdView) findViewById(R.id.adView10);
        adView10.loadAd(new AdRequest.Builder().build());
        AdView adView11 = (AdView) findViewById(R.id.adView11);
        adView11.loadAd(new AdRequest.Builder().build());
        bloodPreasure();
    }

    public int displayPluss(int data1, int data2) {
        return data1 + data2 * 2 / 3 - 5;
    }

    public void bloodPreasure() {
        if (age < 15) {
            systolic =rand.nextInt((120 - 105) + 1) + 105;
            diastolic =rand.nextInt((81 - 75) + 1) + 75;
            pluses = displayPluss(systolic, diastolic);
            displayvalue();
        } else if (age >= 15 && age <= 19) {
            systolic =rand.nextInt((120 - 105) + 1) + 105;
            diastolic =rand.nextInt((81 - 75) + 1) + 75;
            pluses = displayPluss(systolic, diastolic);
            displayvalue();
        } else if (age >= 20 && age <= 24) {
            systolic =rand.nextInt((132 - 108) + 1) + 108;
            diastolic =rand.nextInt((83 - 75) + 1) + 75;
            pluses = displayPluss(systolic, diastolic);
            displayvalue();
        } else if (age >= 25 && age <= 29) {
            systolic =rand.nextInt((113 - 109) + 1) + 109;
            diastolic =rand.nextInt((84 - 76) + 1) + 76;
            pluses = displayPluss(systolic, diastolic);
            displayvalue();
        } else if (age >= 30 && age <= 34) {
            systolic =rand.nextInt((134 - 110) + 1) + 110;
            diastolic =rand.nextInt((85 - 77) + 1) + 77;
            pluses = displayPluss(systolic, diastolic);
            displayvalue();
        } else if (age >= 35 && age <= 39) {
            systolic =rand.nextInt((135 - 111) + 1) + 111;
            diastolic =rand.nextInt((86 - 78) + 1) + 78;
            pluses = displayPluss(systolic, diastolic);
            displayvalue();
        } else if (age >= 40 && age <= 44) {
            systolic =rand.nextInt((137 - 112) + 1) + 112;
            diastolic =rand.nextInt((87 - 79) + 1) + 79;
            pluses = displayPluss(systolic, diastolic);
            displayvalue();
        } else if (age >= 45 && age <= 49) {
            systolic =rand.nextInt((139 - 115) + 1) + 115;
            diastolic =rand.nextInt((88 - 80) + 1) + 80;
            pluses = displayPluss(systolic, diastolic);
            displayvalue();
        } else if (age >= 50 && age <= 54) {
            systolic =rand.nextInt((142 - 116) + 1) + 116;
            diastolic =rand.nextInt((89 - 81) + 1) + 81;
            pluses = displayPluss(systolic, diastolic);
            displayvalue();
        } else if (age >= 55 && age <= 59) {
            systolic =rand.nextInt((144 - 118) + 1) + 118;
            diastolic =rand.nextInt((90 - 82) + 1) + 82;
            pluses = displayPluss(systolic, diastolic);
            displayvalue();
        } else {
            systolic =rand.nextInt((147 - 121) + 1) + 121;
            diastolic =rand.nextInt((91 - 83) + 1) + 83;
            pluses = displayPluss(systolic, diastolic);
            displayvalue();
        }
    }

    public void displayvalue() {
        systolictv.setText("" + systolic);
        diastolictv.setText("" + diastolic);
        plusestv.setText("" + pluses);
        int value = rand.nextInt((4 - 1) + 1) + 1;
        if(value==1){
            stage.setImageResource(R.drawable.normal);
//            new Handler().postDelayed(new Runnable(){
//                @Override
//                public void run() {
//                    AlertDialog dialog = new AlertDialog.Builder(ResultActivity.this)
//                            .setTitle("Alert...")
//                            .setMessage("You Are Quite Healthy")
//                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
//
//                                @Override
//                                public void onClick(DialogInterface dialog, int which) {
//
//                                }
//
//                            }).show();
//                }
//            }, 2000);
        }
        else if(value==2){
            stage.setImageResource(R.drawable.prehypertension);
//            new Handler().postDelayed(new Runnable(){
//                @Override
//                public void run() {
//                    AlertDialog dialog = new AlertDialog.Builder(ResultActivity.this)
//                            .setTitle("Alert...")
//                            .setMessage("If You Feel Good then OK, Otherwise Consult Your Doctor")
//                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
//
//                                @Override
//                                public void onClick(DialogInterface dialog, int which) {
//
//                                }
//                            }).show();
//                }
//            }, 2000);
        }
        else if(value==3){
            stage.setImageResource(R.drawable.prehypertensions1);
//            new Handler().postDelayed(new Runnable(){
//                @Override
//                public void run() {
//                    AlertDialog dialog = new AlertDialog.Builder(ResultActivity.this)
//                            .setTitle("Alert...")
//                            .setMessage("Please Consult With Doctor")
//                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
//
//                                @Override
//                                public void onClick(DialogInterface dialog, int which) {
//
//                                }
//
//                            }).show();
//                }
//            }, 2000);
        }

        else {
            stage.setImageResource(R.drawable.prehypertensions2);
//            new Handler().postDelayed(new Runnable(){
//                @Override
//                public void run() {
//                    AlertDialog dialog = new AlertDialog.Builder(ResultActivity.this)
//                            .setTitle("Alert...")
//                            .setMessage("Please Consult Your Doctor As Soon As Possible")
//                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
//
//                                @Override
//                                public void onClick(DialogInterface dialog, int which) {
//
//                                }
//
//                            }).show();
//                }
//            }, 2000);
        }

//        sharedpreferences = getSharedPreferences(mypreference,
//                Context.MODE_PRIVATE);
//        SharedPreferences.Editor editor = sharedpreferences.edit();
//        editor.putString(systolicKey, String.valueOf(systolic));
//        editor.putString(diastolicKey, String.valueOf(diastolic));
//        editor.putString(plusesKey, String.valueOf(pluses));
//        editor.commit();
//        if (diastolic <= 80) {
//            stage.setImageResource(R.drawable.normal);
//            new Handler().postDelayed(new Runnable(){
//                @Override
//                public void run() {
//                    AlertDialog dialog = new AlertDialog.Builder(ResultActivity.this)
//                            .setTitle("Alert...")
//                            .setMessage("You Are Quite Healthy")
//                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
//
//                                @Override
//                                public void onClick(DialogInterface dialog, int which) {
//
//                                }
//
//                            }).show();
//                }
//            }, 2000);
//
//        } else if (diastolic >= 80 && diastolic <= 89) {
//            stage.setImageResource(R.drawable.prehypertension);
//            new Handler().postDelayed(new Runnable(){
//                @Override
//                public void run() {
//                    AlertDialog dialog = new AlertDialog.Builder(ResultActivity.this)
//                            .setTitle("Alert...")
//                            .setMessage("If You Feel Good then OK, Otherwise Consult Your Doctor")
//                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
//
//                                @Override
//                                public void onClick(DialogInterface dialog, int which) {
//
//                                }
//                            }).show();
//                }
//            }, 2000);
//
//        } else if (diastolic >= 90 && diastolic <= 99) {
//            stage.setImageResource(R.drawable.prehypertensions1);
//            new Handler().postDelayed(new Runnable(){
//                @Override
//                public void run() {
//                    AlertDialog dialog = new AlertDialog.Builder(ResultActivity.this)
//                            .setTitle("Alert...")
//                            .setMessage("Please Consult With Doctor")
//                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
//
//                                @Override
//                                public void onClick(DialogInterface dialog, int which) {
//
//                                }
//
//                            }).show();
//                }
//            }, 2000);
//
//        } else if (diastolic >= 100) {
//            stage.setImageResource(R.drawable.prehypertensions2);
//            new Handler().postDelayed(new Runnable(){
//                @Override
//                public void run() {
//                    AlertDialog dialog = new AlertDialog.Builder(ResultActivity.this)
//                            .setTitle("Alert...")
//                            .setMessage("Please Consult Your Doctor As Soon As Possible")
//                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
//
//                                @Override
//                                public void onClick(DialogInterface dialog, int which) {
//
//                                }
//
//                            }).show();
//                }
//            }, 2000);
//
//        } else {
//            stage.setImageResource(R.drawable.prehypertensions3);
//            new Handler().postDelayed(new Runnable(){
//                @Override
//                public void run() {
//                    AlertDialog dialog = new AlertDialog.Builder(ResultActivity.this)
//                            .setTitle("Alert...")
//                            .setMessage("Emergency Care Needed")
//                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
//                                @Override
//                                public void onClick(DialogInterface dialog, int which) {
//
//                                }
//                            }).show();
//                }
//            }, 2000);
//
//        }
    }

//    public void getShared(){
//        sharedpreferences = getSharedPreferences(mypreference,
//                Context.MODE_PRIVATE);
//        if (sharedpreferences.contains(systolicKey)) {
//            systolictv.setText(sharedpreferences.getString(systolicKey, ""));
//        }
//        if (sharedpreferences.contains(diastolicKey)) {
//            diastolictv.setText(sharedpreferences.getString(diastolicKey, ""));
//        }
//        if (sharedpreferences.contains(plusesKey)) {
//            plusestv.setText(sharedpreferences.getString(plusesKey, ""));
//        }
//    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
}
