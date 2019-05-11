package com.zhaofan.encoder.customerview.widget;

import android.content.Context;
import android.graphics.*;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.zhaofan.encoder.utils.DisplayUtils;

public class DashBoardView extends View {
    private Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    private static final float RADIUS = DisplayUtils.dp2Px(100);
    private static final int ANGLE = 120;
    private Path dash = new Path();
    private PathEffect pathEffect;
    public DashBoardView(Context context) {
        super(context);
    }

    public DashBoardView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DashBoardView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    {
//        dash.addRect(0,0,DisplayUtils.dp2Px(2),DisplayUtils.dp2Px(10), Path.Direction.CCW);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(DisplayUtils.dp2Px(3));
//        pathEffect = new PathDashPathEffect(dash,50,0, PathDashPathEffect.Style.ROTATE);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
//        paint.setPathEffect(pathEffect);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawArc(getWidth()/2-RADIUS,getHeight()-RADIUS,getWidth()/2+RADIUS,getHeight()/2+RADIUS,90+ANGLE/2,360-ANGLE,false,paint);


    }
}
