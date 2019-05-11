package com.zhaofan.encoder.customerview.widget;

import android.content.Context;
import android.graphics.*;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.zhaofan.encoder.R;
import com.zhaofan.encoder.utils.DisplayUtils;

public class AvatorView extends View {
    private static final int width = (int) DisplayUtils.dp2Px(150);
    private Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    private static final int PADDING = (int) DisplayUtils.dp2Px(20);
    private static final int BORDER_WIDTH = (int) DisplayUtils.dp2Px(10);
    Bitmap avator;
    private RectF cut =  new RectF();
    private RectF border = new RectF();
    Xfermode xfermode = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
    public AvatorView(Context context) {
        super(context);
    }

    public AvatorView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public AvatorView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {
        paint.setColor(Color.WHITE);
        avator = getAvator(width);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        cut.set(PADDING,PADDING,PADDING+width,PADDING+width);
        border.set(PADDING-BORDER_WIDTH,PADDING-BORDER_WIDTH,PADDING+width+BORDER_WIDTH,PADDING+width+BORDER_WIDTH);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawOval(border,paint);
        int saved = canvas.saveLayer(cut,paint);
        canvas.drawOval(cut,paint);
        paint.setXfermode(xfermode);
        canvas.drawBitmap(avator,PADDING,PADDING,paint);
        paint.setXfermode(null);
        canvas.restoreToCount(saved);
    }

    private Bitmap getAvator(int width){
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(getResources(),R.drawable.points_bg,options);
        options.inJustDecodeBounds = false;
        options.inDensity = options.outWidth;
        options.inTargetDensity = width;
        return BitmapFactory.decodeResource(getResources(),R.drawable.points_bg,options);
    }
}
