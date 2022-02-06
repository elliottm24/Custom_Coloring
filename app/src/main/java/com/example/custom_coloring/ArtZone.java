package com.example.custom_coloring;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.SurfaceView;

public class ArtZone extends SurfaceView {

    Paint eyePaint = new Paint();
    Paint facePaint = new Paint();
    Paint eyebrowPaint = new Paint();
    Paint hairPaint = new Paint();
    Paint mouthPaint = new Paint();
    Paint blushPaint = new Paint;

    public ArtZone(Context context) {
        super(context);

        setWillNotDraw(false);

        eyePaint.setColor();
        eyePaint.setStyle(Paint.Style.FILL);
        facePaint.setColor();
        facePaint.setStyle(Paint.Style.FILL);
        eyebrowPaint.setColor();
        eyebrowPaint.setStyle(Paint.Style.FILL);
        hairPaint.setColor();
        hairPaint.setStyle(Paint.Style.FILL);
        mouthPaint.setColor();
        mouthPaint.setStyle(Paint.Style.FILL);
        blushPaint.setColor();
        blushPaint.setStyle(Paint.Style.FILL);

        setBackgroundColor(Color.WHITE);

        public void drawEyes(Canvas canvas, float x, float y){

        }

        @Override
        public void onDraw(Canvas canvas){

        }
    }
}
