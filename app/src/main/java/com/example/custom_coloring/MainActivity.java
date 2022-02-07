package com.example.custom_coloring;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;

// @author Maja Elliott

public class MainActivity extends AppCompatActivity {
    private ArtZone picture;
    private ArtControl controls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        picture = (ArtZone) findViewById(R.id.artzone);
        controls = new ArtControl(picture);

        SeekBar redC = (SeekBar) findViewById(R.id.seekBar);
        redC.setOnSeekBarChangeListener(controls);

        SeekBar greenC = (SeekBar) findViewById(R.id.seekBar2);
        greenC.setOnSeekBarChangeListener(controls);

        SeekBar blueC = (SeekBar) findViewById(R.id.seekBar3);
        blueC.setOnSeekBarChangeListener(controls);
    }
}