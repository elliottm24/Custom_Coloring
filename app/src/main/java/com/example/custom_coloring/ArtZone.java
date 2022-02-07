package com.example.custom_coloring;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceView;

public class ArtZone extends SurfaceView {

    Paint eyePaint = new Paint();
    Paint facePaint = new Paint();
    Paint eyebrowPaint = new Paint();
    Paint hairPaint = new Paint();
    Paint mouthPaint = new Paint();
    Paint blushPaint = new Paint();
    private ArtData info;
    int height;
    int width;

    public ArtData getInfo() {
        return info;
    }

    public void setInfo(ArtData info) {
        this.info = info;
    }


    public ArtZone(Context context, AttributeSet attrs) {
        super(context, attrs);

        setWillNotDraw(false);

        eyePaint.setColor(info.eyeColor);
        eyePaint.setStyle(Paint.Style.FILL);
        facePaint.setColor(info.faceColor);
        facePaint.setStyle(Paint.Style.FILL);
        eyebrowPaint.setColor(info.eyebrowColor);
        eyebrowPaint.setStyle(Paint.Style.FILL);
        hairPaint.setColor(info.hairColor);
        hairPaint.setStyle(Paint.Style.FILL);
        mouthPaint.setColor(info.mouthColor);
        mouthPaint.setStyle(Paint.Style.FILL);
        blushPaint.setColor(info.blushColor);
        blushPaint.setStyle(Paint.Style.FILL);

        setBackgroundColor(Color.WHITE);

        //public void drawEyes(Canvas canvas, float x, float y){

        //}
    }

    @Override
    public void onDraw(Canvas canvas){
        height = canvas.getHeight();
        width = canvas.getWidth();

        drawHair(canvas);
        drawFace(canvas);
        drawEyebrows(canvas);
        drawBlush(canvas);
        drawEyes(canvas);
        drawMouth(canvas);
    }

    public void drawEyes(Canvas canvas){
        int centerH = height/2 + 300;
        int centerW = width/2 + 300;

        drawEye(canvas, centerH+50, centerW);
        drawEye(canvas, centerH+50, centerW);
    }

    public void drawEye(Canvas canvas, int x, int y){
        canvas.drawCircle(100.0f, 100.0f, 250.0f, eyePaint);
    }

    public void drawFace(Canvas canvas){
        int centerH = height/2 + 300;
        int centerW = width/2 + 300;

        canvas.drawCircle(centerW, centerH, 250.0f, facePaint);
    }

    public void drawHair(Canvas canvas){
        canvas.drawOval();
    }

    public void drawEyebrows(Canvas canvas){

    }

    public void drawMouth(Canvas canvas){

    }

    public void drawBlush(Canvas canvas){

    }
}
