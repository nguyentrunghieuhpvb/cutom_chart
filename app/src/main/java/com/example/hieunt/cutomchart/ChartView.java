package com.example.hieunt.cutomchart;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class ChartView extends View {

    private Paint paint;
    Paint p1;
    int with, height;

    public ChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        p1 = new Paint();
        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(3);

        p1.setColor(Color.GRAY);
        p1.setStrokeWidth(1);
        inItview();
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        with = w;
        height = h;
    }

    void inItview() {
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int x = height / 4;
        int z = with / 13;

        for (int i = 0; i <= 12; i++) {
            canvas.drawLine(i * z, 0, i * z, height, p1);
        }
        for (int i = 0; i <= 4; i++) {
            canvas.drawLine(0, i * x, with, i * x, paint);
        }

        Bitmap b = BitmapFactory.decodeResource(getResources(), R.drawable.icon);
        canvas.drawBitmap(b, with / 13 - b.getWidth() / 2, height / 4 - b.getHeight() / 2, paint);


    }
}
