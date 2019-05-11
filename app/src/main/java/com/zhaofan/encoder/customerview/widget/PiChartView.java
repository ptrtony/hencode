package com.zhaofan.encoder.customerview.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;

public class PiChartView extends View {
    private Paint paint = new Paint();
    private int[] COLORS  =  new int[]{
       0xffffff,0xff0000,0xff0000
    };
    public PiChartView(Context context) {
        super(context);
    }

    public PiChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public PiChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }
}
