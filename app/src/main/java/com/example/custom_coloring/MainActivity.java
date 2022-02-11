package com.example.custom_coloring;

import androidx.appcompat.app.AppCompatActivity;
import com.example.custom_coloring.R;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

/**
*@author Maja Elliott
 * Impliments seekbar and ontouch
* */

public class MainActivity extends AppCompatActivity {
    private ArtZone picture;
    private ArtControl controls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        picture = (ArtZone) findViewById(R.id.artzone);
        TextView textView = (TextView) findViewById(R.id.textView2);

        SeekBar redC = (SeekBar) findViewById(R.id.seekBar);
        SeekBar greenC = (SeekBar) findViewById(R.id.seekBar2);
        SeekBar blueC = (SeekBar) findViewById(R.id.seekBar3);

        controls = new ArtControl(picture, textView, redC, greenC, blueC);

        redC.setOnSeekBarChangeListener(controls);
        greenC.setOnSeekBarChangeListener(controls);
        blueC.setOnSeekBarChangeListener(controls);

        picture.setOnTouchListener(controls);
    }
}