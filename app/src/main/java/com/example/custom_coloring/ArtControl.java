package com.example.custom_coloring;

import static android.graphics.Color.blue;
import static android.graphics.Color.green;
import static android.graphics.Color.red;

import android.graphics.Color;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class ArtControl implements SeekBar.OnSeekBarChangeListener, View.OnTouchListener{

    private ArtZone picture;
    private ArtData info;

    private TextView textView;
    private SeekBar redC;
    private SeekBar greenC;
    private SeekBar blueC;
    private int selected = 0;

    public ArtControl (ArtZone picture, TextView textView, SeekBar redC, SeekBar greenC, SeekBar blueC){
        this.picture = picture;
        info = picture.getInfo();

        this.textView = textView;
        this.redC = redC;
        this.greenC = greenC;
        this.blueC = blueC;
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
        int red = 0;
        int green = 0;
        int blue = 0;

        switch (seekBar.getId()) {
            case R.id.seekBar:
                red = redC.getProgress();
                Log.d("seekbar", "red = "+red);
                break;
            case R.id.seekBar2:
                green = greenC.getProgress();
                Log.d("seekbar", "green = "+green);
                break;
            case R.id.seekBar3:
                blue = blueC.getProgress();;
                Log.d("seekbar", "blue = "+blue);
                break;
        }

        int color = Color.argb(255, red, green, blue);

        switch (selected) {
            case 1:
                //blush
                picture.blushPaint.setColor(color);
                break;
            case 2:
                //eyes
                picture.eyePaint.setColor(color);
                break;
            case 3:
                //mouth
                picture.mouthPaint.setColor(color);
                break;
            case 4:
                //unibrow
                picture.eyebrowPaint.setColor(color);
                break;
            case 5:
                //face
                picture.facePaint.setColor(color);
                break;
            case 6:
                //hair
                picture.hairPaint.setColor(color);
                break;
        }

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

        //Log.d("touch","position: " + x + ", " + y);


        if (((605 <= x) && (x <= 711) && (611 <= y) && (y <= 708)) ||
                ((367 <= x) && (x <= 470) && (611 <= y) && (y <= 708))){
            //blush
            textView.setText("Selected: Blush");
            redC.setProgress(red(picture.blushPaint.getColor()));
            greenC.setProgress(green(picture.blushPaint.getColor()));
            blueC.setProgress(blue(picture.blushPaint.getColor()));
            selected = 1;
        }
        else if (((461 <= x) && (x <= 514) && (564 <= y) && (y <= 614)) ||
                ((564 <= x) && (x <= 614) && (564 <= y) && (y <= 614))){
            //eyes
            textView.setText("Selected: Eyes");
            redC.setProgress(red(picture.eyePaint.getColor()));
            greenC.setProgress(green(picture.eyePaint.getColor()));
            blueC.setProgress(blue(picture.eyePaint.getColor()));
            selected = 2;
        }
        else if ((388 <= x) && (x <= 685) && (758 <= y) && (y <= 781)){
            //mouth
            textView.setText("Selected: Mouth");
            redC.setProgress(red(picture.mouthPaint.getColor()));
            greenC.setProgress(green(picture.mouthPaint.getColor()));
            blueC.setProgress(blue(picture.mouthPaint.getColor()));
            selected = 3;
        }
        else if ((426 <= x) && (x <= 646) && (532 <= y) && (y <= 552)){
            //unibrow
            textView.setText("Selected: Eyebrow");
            redC.setProgress(red(picture.eyebrowPaint.getColor()));
            greenC.setProgress(green(picture.eyebrowPaint.getColor()));
            blueC.setProgress(blue(picture.eyebrowPaint.getColor()));
            selected = 4;
        }
        else if ((238 <= x) && (x <= 837) && (340 <= y) && (y <= 940)){
            //face
            textView.setText("Selected: Face");
            redC.setProgress(red(picture.facePaint.getColor()));
            greenC.setProgress(green(picture.facePaint.getColor()));
            blueC.setProgress(blue(picture.facePaint.getColor()));
            selected = 5;
        }
        else if ((188 <= x) && (x <= 885) && (332 <= y) && (y <= 1090)){
            //hair
            textView.setText("Selected: Hair");
            redC.setProgress(red(picture.hairPaint.getColor()));
            greenC.setProgress(green(picture.hairPaint.getColor()));
            blueC.setProgress(blue(picture.hairPaint.getColor()));
            selected = 6;
        }
        else {
            textView.setText("Selected: Nothing");
            selected = 0;
        }

        picture.invalidate();
        return false;
    }
}
