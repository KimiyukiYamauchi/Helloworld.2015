package com.example.yamauchi.helloworld;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.View;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/**
 * Created by yamauchi on 2015/07/28.
 */
public class SampleView3 extends View{

    private Bitmap bmp;

    public SampleView3(Context context) {
        super(context);
        setBackgroundColor(Color.WHITE);
        Resources res = context.getResources();
        bmp = BitmapFactory.decodeResource(res, R.drawable.cat);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawBitmap(bmp, 0, 0, null);


    }
}
