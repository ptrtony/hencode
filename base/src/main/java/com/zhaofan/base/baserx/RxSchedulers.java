//package com.zhaofan.base.baserx;
//
//import org.reactivestreams.Publisher;
//
//import io.reactivex.Flowable;
//import io.reactivex.FlowableTransformer;
//import io.reactivex.android.schedulers.AndroidSchedulers;
//import io.reactivex.annotations.NonNull;
//import io.reactivex.schedulers.Schedulers;
//
//
////rx1.0
////public class RxSchedulers {
////    public static <T> Observable.Transformer<T, T> io_main() {
////        return new Observable.Transformer<T, T>() {
////            @Override
////            public Observable<T> call(Observable<T> observable) {
////                return observable.subscribeOn(Schedulers.io())
////                        .observeOn(AndroidSchedulers.mainThread());
////            }
////        };
////    }
////}
//
////rx2.0
//public class RxSchedulers {
//    public static <T> FlowableTransformer<T, T> io_main() {
//        return new FlowableTransformer<T, T>() {
//            @Override
//            public Publisher<T> apply(@NonNull Flowable<T> upstream) {
//                return upstream.subscribeOn(Schedulers.io())
//                        .observeOn(AndroidSchedulers.mainThread());
//            }
//        };
//    }
//}