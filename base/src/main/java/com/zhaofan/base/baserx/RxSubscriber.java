//package com.zhaofan.base.baserx;
//
//import android.content.Context;
//
//import com.cashkilatindustri.sakudanarupiah.MCache;
//import com.cashkilatindustri.sakudanarupiah.R;
//import com.cashkilatindustri.sakudanarupiah.ui.activity.mine.verifycenter.realnameatt.RealNameAttestaActivity;
//import com.cashkilatindustri.sakudanarupiah.utils.NetworkUtils;
//import com.cashkilatindustri.sakudanarupiah.widget.XJLoadingDialog;
//
//import io.reactivex.subscribers.ResourceSubscriber;
//
//public abstract class RxSubscriber<T> extends ResourceSubscriber<T> {
//
//    private Context mContext;
//    private String msg;
//    private boolean showDialog = true;
//
//    /**
//     * 是否显示浮动dialog
//     */
//    public void showDialog() {
//        this.showDialog = true;
//    }
//
//    public void hideDialog() {
//        this.showDialog = true;
//    }
//
//    public RxSubscriber(Context context, String msg, boolean showDialog) {
//        this.mContext = context;
//        this.msg = msg;
//        this.showDialog = showDialog;
//    }
//
//    public RxSubscriber(Context context) {
//        this(context, context.getString(R.string.loading), true);
//    }
//
//    public RxSubscriber(Context context, boolean showDialog) {
//        this(context, context.getString(R.string.loading), showDialog);
//    }
//
//
//    @Override
//    public void onComplete() {
//        if (showDialog) {
//            XJLoadingDialog.cancelLoadingDialog(mContext);
//        }
//    }
//
//
//    @Override
//    public void onStart() {
//        super.onStart();
//        if (showDialog) {
//            try {
//                XJLoadingDialog.showLoadingDialog(mContext, msg, true);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//    }
//
//
//    @Override
//    public void onNext(T t) {
//        _onNext(t);
//    }
//
//    @Override
//    public void onError(Throwable e) {
//        RealNameAttestaActivity.isSubmit = false;
//        if (showDialog) {
//            XJLoadingDialog.cancelLoadingDialog(mContext);
//        }
//        e.printStackTrace();
//        //网络
//        if (!NetworkUtils.isConnected()) {
//            _onError(MCache.context.getString(R.string.net_unconn));
//        }
//        //服务器
//        else if (e instanceof ServerException) {
//            if (!e.getMessage().equals("")) {
//                _onError(e.getMessage());
//            }
//        }
////
////        else if (e instanceof NullPointerException){
////            _onError(e.getMessage());
////        }
//        //其它统一报服务器错误
//        else {
//            _onError("error:"+ e.getMessage());
//        }
//    }
//
//    protected abstract void _onNext(T t);
//
//    protected abstract void _onError(String message);
//
//}
