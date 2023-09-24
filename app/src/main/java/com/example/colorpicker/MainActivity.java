package com.example.colorpicker;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
 private SeekBar slide1;
 private SeekBar slide2;
 private SeekBar slide3;
 private TextView szin1;
 private TextView szin2;
 private TextView szin3;
 private View szinkep;
 private TextView szam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        slide1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                int R = slide1.getProgress();
                int G = slide2.getProgress();
                int B = slide3.getProgress();
                szinkep.setBackgroundColor(Color.rgb(R,G,B));
                szin1.setText("Red:" + String.valueOf(R));
                szin2.setText("Green:" + String.valueOf(G));
                szin3.setText("Blue:" + String.valueOf(B));
                szam.setText("("+ String.valueOf(R) + "," + String.valueOf(G) + "," + String.valueOf(B)+ ")");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                int R = slide1.getProgress();
                int G = slide2.getProgress();
                int B = slide3.getProgress();
                szinkep.setBackgroundColor(Color.rgb(R,G,B));
                szin1.setText("Red:" + String.valueOf(R));
                szin2.setText("Green:" + String.valueOf(G));
                szin3.setText("Blue:" + String.valueOf(B));
                szam.setText("("+ String.valueOf(R) + "," + String.valueOf(G) + "," + String.valueOf(B)+ ")");
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                int R = slide1.getProgress();
                int G = slide2.getProgress();
                int B = slide3.getProgress();
                szinkep.setBackgroundColor(Color.rgb(R,G,B));
                szin1.setText("Red:" + String.valueOf(R));
                szin2.setText("Green:" + String.valueOf(G));
                szin3.setText("Blue:" + String.valueOf(B));
                szam.setText("("+ String.valueOf(R) + "," + String.valueOf(G) + "," + String.valueOf(B)+ ")");
            }
        });
        slide2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                int R = slide1.getProgress();
                int G = slide2.getProgress();
                int B = slide3.getProgress();
                szinkep.setBackgroundColor(Color.rgb(R,G,B));
                szin1.setText("Red:" + String.valueOf(R));
                szin2.setText("Green:" + String.valueOf(G));
                szin3.setText("Blue:" + String.valueOf(B));
                szam.setText("("+ String.valueOf(R) + "," + String.valueOf(G) + "," + String.valueOf(B)+ ")");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                int R = slide1.getProgress();
                int G = slide2.getProgress();
                int B = slide3.getProgress();
                szinkep.setBackgroundColor(Color.rgb(R,G,B));
                szin1.setText("Red:" + String.valueOf(R));
                szin2.setText("Green:" + String.valueOf(G));
                szin3.setText("Blue:" + String.valueOf(B));
                szam.setText("("+ String.valueOf(R) + "," + String.valueOf(G) + "," + String.valueOf(B)+ ")");
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                int R = slide1.getProgress();
                int G = slide2.getProgress();
                int B = slide3.getProgress();
                szinkep.setBackgroundColor(Color.rgb(R,G,B));
                szin1.setText("Red:" + String.valueOf(R));
                szin2.setText("Green:" + String.valueOf(G));
                szin3.setText("Blue:" + String.valueOf(B));
                szam.setText("("+ String.valueOf(R) + "," + String.valueOf(G) + "," + String.valueOf(B)+ ")");
            }
        });
        slide3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                int R = slide1.getProgress();
                int G = slide2.getProgress();
                int B = slide3.getProgress();
                szinkep.setBackgroundColor(Color.rgb(R,G,B));
                szin1.setText("Red:" + String.valueOf(R));
                szin2.setText("Green:" + String.valueOf(G));
                szin3.setText("Blue:" + String.valueOf(B));
                szam.setText("("+ String.valueOf(R) + "," + String.valueOf(G) + "," + String.valueOf(B)+ ")");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                int R = slide1.getProgress();
                int G = slide2.getProgress();
                int B = slide3.getProgress();
                szinkep.setBackgroundColor(Color.rgb(R,G,B));
                szin1.setText("Red:" + String.valueOf(R));
                szin2.setText("Green:" + String.valueOf(G));
                szin3.setText("Blue:" + String.valueOf(B));
                szam.setText("("+ String.valueOf(R) + "," + String.valueOf(G) + "," + String.valueOf(B)+ ")");
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                int R = slide1.getProgress();
                int G = slide2.getProgress();
                int B = slide3.getProgress();
                szinkep.setBackgroundColor(Color.rgb(R,G,B));
                szin1.setText("Red:" + String.valueOf(R));
                szin2.setText("Green:" + String.valueOf(G));
                szin3.setText("Blue:" + String.valueOf(B));
                szam.setText("("+ String.valueOf(R) + "," + String.valueOf(G) + "," + String.valueOf(B)+ ")");
            }
        });
    }
    public void init() {
        slide1 = findViewById(R.id.slide1);
        slide2 = findViewById(R.id.slide2);
        slide3 = findViewById(R.id.slide3);
        szin1 = findViewById(R.id.szin1);
        szin2 = findViewById(R.id.szin2);
        szin3 = findViewById(R.id.szin3);
        szinkep = findViewById(R.id.szinkep);
        szam = findViewById(R.id.szam);


    }
}