package com.example.custom_coloring;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceView;

/**
 *@author Maja Elliott
 * This is the file that compiles all the information that's put into the surface view.
 * */

public class ArtZone extends SurfaceView {

    //sets the paints for all the items
    //also makes an ArtData object
    public Paint eyePaint = new Paint();
    public Paint facePaint = new Paint();
    public Paint eyebrowPaint = new Paint();
    public Paint hairPaint = new Paint();
    public Paint mouthPaint = new Paint();
    public Paint blushPaint = new Paint();
    private ArtData info;

    public ArtData getInfo() {
        return info;
    }

    public ArtZone(Context context, AttributeSet attrs) {
        super(context, attrs);

        info = new ArtData();

        setWillNotDraw(false);

        //initializing colors
        eyePaint.setColor(Color.GREEN);
        eyePaint.setStyle(Paint.Style.FILL);
        facePaint.setColor(Color.BLUE);
        facePaint.setStyle(Paint.Style.FILL);
        eyebrowPaint.setColor(Color.BLACK);
        eyebrowPaint.setStyle(Paint.Style.FILL);
        hairPaint.setColor(Color.BLACK);
        hairPaint.setStyle(Paint.Style.FILL);
        mouthPaint.setColor(Color.BLACK);
        mouthPaint.setStyle(Paint.Style.FILL);
        blushPaint.setColor(Color.RED);
        blushPaint.setStyle(Paint.Style.FILL);

        setBackgroundColor(Color.WHITE);
    }

    @Override
    public void onDraw(Canvas canvas){
        info.height = canvas.getHeight();
        info.width = canvas.getWidth();
        //Log.d("size","canvas size: "+info.width+"x"+info.height);
        info.centerH = info.height/2;
        info.centerW = info.width/2;

        drawHair(canvas);
        drawFace(canvas);
        drawEyebrows(canvas);
        drawBlushes(canvas);
        drawEyes(canvas);
        drawMouth(canvas);
    }

    public void drawEyes(Canvas canvas){
        drawEye(canvas, info.centerH-50, info.centerW+50);
        drawEye(canvas, info.centerH-150, info.centerW+50);
    }

    public void drawEye(Canvas canvas, int x, int y){
        //draws the individual eyes
        canvas.drawCircle(x, y, 25, eyePaint);
    }

    public void drawFace(Canvas canvas){
        canvas.drawCircle(info.centerW, info.centerH, 300, facePaint);
    }

    public void drawHair(Canvas canvas){
        canvas.drawOval(info.centerW-350, info.centerH-310, info.centerW+350, info.centerH+450, hairPaint);
    }

    public void drawEyebrows(Canvas canvas){
        canvas.drawRect(info.centerW-110, info.centerH-90, info.centerW+110, info.centerH-110, eyebrowPaint);
    }

    public void drawMouth(Canvas canvas){
        canvas.drawRect(info.centerW-150, info.centerH+120, info.centerW+150, info.centerH+150, mouthPaint);
    }

    public void drawBlushes(Canvas canvas){
        drawBlush(canvas, info.centerW-120, info.centerH+20);
        drawBlush(canvas, info.centerW+120, info.centerH+20);
    }

    public void drawBlush(Canvas canvas, int x, int y) {
        canvas.drawCircle(x, y, 50, blushPaint);
    }
}
