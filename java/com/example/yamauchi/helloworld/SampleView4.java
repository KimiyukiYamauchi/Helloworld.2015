package com.example.yamauchi.helloworld;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.MotionEvent;
import android.view.View;
import android.graphics.Paint;
import android.graphics.PointF;

import java.util.ArrayList;

/**
 * Created by yamauchi on 2015/07/28.
 */
public class SampleView4 extends View{

    private Bitmap bmp;
    private Paint paint = new Paint();
    private ArrayList<PointF> points = new ArrayList<PointF>();

    public SampleView4(Context context) {
        super(context);
        setBackgroundColor(Color.WHITE);
        Resources res = context.getResources();
        bmp = BitmapFactory.decodeResource(res, R.drawable.cat);
        setFocusable(true);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawBitmap(bmp, 0, 0, null);     //  背景画像の表示

        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);

        // タップしたところの点の表示
        for(int i=0; i<points.size(); i++){
            canvas.drawCircle(points.get(i).x, points.get(i).y, 6, paint);
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        int action = event.getAction();
        if((action & MotionEvent.ACTION_MASK) == MotionEvent.ACTION_DOWN){
            points.add(new PointF(event.getX(), event.getY()));
            invalidate(); // 再描画を実行する
        }
        return true;
    }
}
