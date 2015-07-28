package com.example.yamauchi.helloworld;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;

/**
 * Created by yamauchi on 2015/07/28.
 */
public class SampleView extends View{

    private Paint paint = new Paint();

    public SampleView(Context context) {
        super(context);
        setBackgroundColor(Color.WHITE);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);paint.setTextSize(60);

        paint.setColor(Color.rgb(255, 255, 0));
        canvas.drawText("Hello!はろー", 0, 100, paint);

        paint.setTypeface(Typeface.DEFAULT_BOLD);
        paint.setColor(Color.argb(255, 255, 0, 0));
        canvas.drawText("Hello!はろー", 20, 160, paint);

        paint.setFakeBoldText(true);
        paint.setColor(Color.rgb(80, 80, 80));
        canvas.drawText("Hello!はろー", 40, 220, paint);

        paint.setTextSkewX(-0.25f);
        paint.setColor(Color.rgb(80, 80, 255));
        canvas.drawText("Hello!はろー", 60, 280, paint);


    }
}
