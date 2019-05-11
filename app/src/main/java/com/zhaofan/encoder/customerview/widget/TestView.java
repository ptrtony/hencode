package com.zhaofan.encoder.customerview.widget;

import android.content.Context;
import android.graphics.*;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.zhaofan.encoder.utils.DisplayUtils;


public class TestView  extends View {
    Path path = new Path();
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    private static final float RADIUS = (int) DisplayUtils.dp2Px(150);
    private static final float ANGLE = 120;
    private static final int CENTER_RADIUS = (int) DisplayUtils.dp2Px(3);
    private static final float LEGHT = DisplayUtils.dp2Px(100);
    private PathEffect pathEffect;
    private Path dash = new Path();

    public TestView(Context context) {
        super(context);
    }

    public TestView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public TestView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {
        path.addArc(getWidth()/2-RADIUS,getHeight()/2-RADIUS,getWidth()/2+RADIUS,getHeight()/2+RADIUS,90+ANGLE/2,360-ANGLE);
        PathMeasure pathMeasure = new PathMeasure();
        pathMeasure.setPath(path,false);

        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(DisplayUtils.dp2Px(3));
        dash.addRect(0,0,DisplayUtils.dp2Px(2),DisplayUtils.dp2Px(10), Path.Direction.CCW);
        pathEffect = new PathDashPathEffect(dash,(pathMeasure.getLength()-DisplayUtils.dp2Px(2))/20,0, PathDashPathEffect.Style.ROTATE);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //画刻度
        canvas.drawArc(getWidth()/2-RADIUS,getHeight()/2-RADIUS,getWidth()/2+RADIUS,getHeight()/2+RADIUS,90+ANGLE/2,360-ANGLE,false,paint);
        paint.setPathEffect(pathEffect);

        //画圆弧
        canvas.drawArc(getWidth()/2-RADIUS,getHeight()/2-RADIUS,getWidth()/2+RADIUS,getHeight()/2+RADIUS,90+ANGLE/2,360-ANGLE,false,paint);
        paint.setPathEffect(null);

        //画指针
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.BLACK);
        canvas.drawLine(getWidth()/2,getHeight()/2,
                (float) (getWidth()/2+Math.cos(Math.toRadians(getAngleForMart(3)))*LEGHT),
                (float)(getHeight()/2+Math.sin(Math.toRadians(getAngleForMart(3)))*LEGHT),paint);
    }


    private float getAngleForMart(int mark){
        return 90+ANGLE/2+(360-ANGLE)/20*mark;
    }
}
