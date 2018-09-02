package com.example.butt.bloodpreasureprank;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.unity3d.ads.IUnityAdsListener;
import com.unity3d.ads.UnityAds;

public class AgeActivity extends Activity {


    EditText age;
    ImageView calculate;
    static int ageyear;
    int blood;
    ImageView imageView1, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age);
        blood=0;
        AdView adView6 = (AdView) findViewById(R.id.adView6);
        adView6.loadAd(new AdRequest.Builder().build());
        AdView adView7 = (AdView) findViewById(R.id.adView7);
        adView7.loadAd(new AdRequest.Builder().build());
        age = (EditText) findViewById(R.id.agetb);
        age.setText("");
        imageView1 = (ImageView) findViewById(R.id.blood1);
        imageView1.setImageResource(R.drawable.abnus);
        imageView2 = (ImageView) findViewById(R.id.blood2);
        imageView2.setImageResource(R.drawable.onus);
        imageView3 = (ImageView) findViewById(R.id.blood3);
        imageView3.setImageResource(R.drawable.apus);
        imageView4 = (ImageView) findViewById(R.id.blood4);
        imageView4.setImageResource(R.drawable.opus);
        imageView5 = (ImageView) findViewById(R.id.blood5);
        imageView5.setImageResource(R.drawable.bnus);
        imageView6 = (ImageView) findViewById(R.id.blood6);
        imageView6.setImageResource(R.drawable.bpus);
        imageView7 = (ImageView) findViewById(R.id.blood7);
        imageView7.setImageResource(R.drawable.anus);
        imageView8 = (ImageView) findViewById(R.id.blood8);
        imageView8.setImageResource(R.drawable.abpus);
        calculate = (ImageView) findViewById(R.id.calculatebtn);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (age.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Age Can Not Be Empty", Toast.LENGTH_SHORT).show();
                } else {
                    ageyear = Integer.parseInt(age.getText().toString());
                    if (ageyear > 0 && ageyear <= 90) {
                    }  if (ageyear < 0) {
                        Toast.makeText(getApplicationContext(), "Age Must Be Unsigned Number", Toast.LENGTH_SHORT).show();
                    } else if (ageyear > 90) {
                        Toast.makeText(getApplicationContext(), "Age Must Be Below 90", Toast.LENGTH_SHORT).show();
                    } else if(ageyear == 0) {
                        Toast.makeText(getApplicationContext(), "Age Must Be Above 0", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        if(blood==1) {
                            Intent intent = new Intent(getApplicationContext(), ScannerActivity.class);
//                        intent.putExtra("ageyear",ageyear);
                            startActivity(intent);
                        }
                        else {
                            Toast.makeText(getApplicationContext(), "Please Select Blood Group", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            }
        });

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blood=1;
                imageView1.setImageResource(R.drawable.abns);
                imageView2.setImageResource(R.drawable.onus);
                imageView3.setImageResource(R.drawable.apus);
                imageView4.setImageResource(R.drawable.opus);
                imageView5.setImageResource(R.drawable.bnus);
                imageView6.setImageResource(R.drawable.bpus);
                imageView7.setImageResource(R.drawable.anus);
                imageView8.setImageResource(R.drawable.abpus);

            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blood=1;
                imageView2.setImageResource(R.drawable.ons);
                imageView1.setImageResource(R.drawable.abnus);
                imageView3.setImageResource(R.drawable.apus);
                imageView4.setImageResource(R.drawable.opus);
                imageView5.setImageResource(R.drawable.bnus);
                imageView6.setImageResource(R.drawable.bpus);
                imageView7.setImageResource(R.drawable.anus);
                imageView8.setImageResource(R.drawable.abpus);

            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blood=1;
                imageView3.setImageResource(R.drawable.aps);
                imageView1.setImageResource(R.drawable.abnus);
                imageView2.setImageResource(R.drawable.onus);
                imageView4.setImageResource(R.drawable.opus);
                imageView5.setImageResource(R.drawable.bnus);
                imageView6.setImageResource(R.drawable.bpus);
                imageView7.setImageResource(R.drawable.anus);
                imageView8.setImageResource(R.drawable.abpus);
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blood=1;
                imageView4.setImageResource(R.drawable.ops);
                imageView1.setImageResource(R.drawable.abnus);
                imageView2.setImageResource(R.drawable.onus);
                imageView3.setImageResource(R.drawable.apus);
                imageView5.setImageResource(R.drawable.bnus);
                imageView6.setImageResource(R.drawable.bpus);
                imageView7.setImageResource(R.drawable.anus);
                imageView8.setImageResource(R.drawable.abpus);
            }
        });
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blood=1;
                imageView5.setImageResource(R.drawable.bns);
                imageView1.setImageResource(R.drawable.abnus);
                imageView2.setImageResource(R.drawable.onus);
                imageView3.setImageResource(R.drawable.apus);
                imageView4.setImageResource(R.drawable.opus);
                imageView6.setImageResource(R.drawable.bpus);
                imageView7.setImageResource(R.drawable.anus);
                imageView8.setImageResource(R.drawable.abpus);
            }
        });
        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blood=1;
                imageView6.setImageResource(R.drawable.bps);
                imageView1.setImageResource(R.drawable.abnus);
                imageView2.setImageResource(R.drawable.onus);
                imageView3.setImageResource(R.drawable.apus);
                imageView4.setImageResource(R.drawable.opus);
                imageView5.setImageResource(R.drawable.bnus);
                imageView7.setImageResource(R.drawable.anus);
                imageView8.setImageResource(R.drawable.abpus);
            }
        });
        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blood=1;
                imageView7.setImageResource(R.drawable.ans);
                imageView1.setImageResource(R.drawable.abnus);
                imageView2.setImageResource(R.drawable.onus);
                imageView3.setImageResource(R.drawable.apus);
                imageView4.setImageResource(R.drawable.opus);
                imageView5.setImageResource(R.drawable.bnus);
                imageView6.setImageResource(R.drawable.bpus);
                imageView8.setImageResource(R.drawable.abpus);
            }
        });
        imageView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blood=1;
                imageView8.setImageResource(R.drawable.abps);
                imageView1.setImageResource(R.drawable.abnus);
                imageView2.setImageResource(R.drawable.onus);
                imageView3.setImageResource(R.drawable.apus);
                imageView4.setImageResource(R.drawable.opus);
                imageView5.setImageResource(R.drawable.bnus);
                imageView6.setImageResource(R.drawable.bpus);
                imageView7.setImageResource(R.drawable.anus);
            }
        });

    }
}