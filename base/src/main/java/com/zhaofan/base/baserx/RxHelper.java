//package com.zhaofan.base.baserx;
//
//
//import com.cashkilatindustri.sakudanarupiah.model.bean.base.BaseResponse;
//import com.cashkilatindustri.sakudanarupiah.model.bean.eventbus.KillActivityEvent;
//import com.cashkilatindustri.sakudanarupiah.model.bean.eventbus.QuitLoginEvent;
//import com.cashkilatindustri.sakudanarupiah.ui.activity.loan.DialogActivity;
//
//import org.greenrobot.eventbus.EventBus;
//
//import io.reactivex.BackpressureStrategy;
//import io.reactivex.Flowable;
//import io.reactivex.FlowableTransformer;
//import io.reactivex.android.schedulers.AndroidSchedulers;
//import io.reactivex.schedulers.Schedulers;
//
//public class RxHelper {
//
//    public static <T> FlowableTransformer<BaseResponse<T>, T> handleResult() {
//
//
//        return upstream -> upstream.flatMap(tBaseResponse1 -> {
//            if (tBaseResponse1.success()) {
//                return createData(tBaseResponse1.result);
//            }else if(tBaseResponse1.status == 22){
//                DialogActivity.isClicked = false;
//                EventBus.getDefault().post(new KillActivityEvent());
//                return Flowable.error(new ServerException(tBaseResponse1.message));
//            } else {
//
//                if (tBaseResponse1.errors == 0) {
//                    return Flowable.error(new ServerException(tBaseResponse1.message));
//                } else {
//                    if (tBaseResponse1.errors == 401) {
//                        //token失效
//                        QuitLoginEvent quitLoginEvent = new QuitLoginEvent();
//                        quitLoginEvent.setTyep(1);
//                        EventBus.getDefault().post(quitLoginEvent);
//                        EventBus.getDefault().post(new KillActivityEvent());
//                        return Flowable.error(new ServerException(""));
//                    } else {
//                        return Flowable.error(new ServerException(tBaseResponse1.message + "!!" + tBaseResponse1.errors));
//                    }
//                }
//            }
//        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
//    }
//
//
//    /**
//     * 生成Flowable
//     *
//     * @param <T>
//     * @return
//     */
//    public static <T> Flowable<T> createData(final T t) {
//        return Flowable.create(emitter -> {
//            try {
//                emitter.onNext(t);
//                emitter.onComplete();
//
//            } catch (Exception e) {
//                emitter.onError(e);
//            }
//        }, BackpressureStrategy.BUFFER);
//    }
//
//}
