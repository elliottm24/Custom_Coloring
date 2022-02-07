package com.example.custom_coloring;

import android.view.MotionEvent;
import android.view.View;
import android.widget.SeekBar;

public class ArtControl implements SeekBar.OnSeekBarChangeListener, View.OnTouchListener{

    private ArtZone picture;
    private ArtData info;

    public ArtControl (ArtZone picture){
        this.picture = picture;
        info = picture.getInfo();
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return false;
    }
}
