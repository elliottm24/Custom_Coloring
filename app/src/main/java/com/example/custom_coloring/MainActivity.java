package com.example.custom_coloring;

import androidx.appcompat.app.AppCompatActivity;
import com.example.custom_coloring.R;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

// @author Maja Elliott

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
        redC.setOnSeekBarChangeListener(controls);

        SeekBar greenC = (SeekBar) findViewById(R.id.seekBar2);
        greenC.setOnSeekBarChangeListener(controls);

        SeekBar blueC = (SeekBar) findViewById(R.id.seekBar3);
        blueC.setOnSeekBarChangeListener(controls);

        controls = new ArtControl(picture, textView, redC, greenC, blueC);
        picture.setOnTouchListener(controls);
    }
}