package com.example.custom_coloring;

import android.graphics.Color;
import android.util.Log;
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
    public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
        int red = 0;
        int green = 0;
        int blue = 0;

        switch (seekBar.getId()) {
            case R.id.seekBar:
                red = seekBar.getProgress();
            case R.id.seekBar2:
                green = seekBar.getProgress();
            case R.id.seekBar3:
                blue = seekBar.getProgress();
                break;
        }

        int color = Color.argb(255, red, green, blue);

        //switch (info.touched){
        //    case 0:
        //    case 1:
        //    case 2:
        //    case 3:
        //    case 4:
        //    case 5:
        //}

        picture.invalidate();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        /**
         External Citation
         Date: 7 February 2022
         Problem: Couldn't figure out how to do the handling for the cooridnates
         Resource:
         https://www.youtube.com/watch?v=Yx63M4k-EeE
         Solution: Turns out there's a thing that does that for you.
         */
        int x = (int)motionEvent.getX();
        int y = (int)motionEvent.getY();

        Log.d("touch","position: " + x + ", " + y);

        return false;
    }
}
