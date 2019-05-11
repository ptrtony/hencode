//package com.zhaofan.base.base;
//
//import com.cashkilatindustri.sakudanarupiah.model.bean.base.BaseRequest;
//import com.cashkilatindustri.sakudanarupiah.utils.EncryptUtils;
//import com.google.gson.Gson;
//import com.cashkilatindustri.sakudanarupiah.BuildConfig;
//import com.cashkilatindustri.sakudanarupiah.model.bean.base.BaseRequest;
//import com.cashkilatindustri.sakudanarupiah.utils.EncryptUtils;
//
//
//public abstract class BaseEncryptModel implements EncryptModel {
//
//    @Override
//    public <T> String encryptData(BaseRequest<T> request) {
//        final Gson gson = new Gson();
//        String encryptStr = null;
//        String jsonStr = gson.toJson(request);
//        if(BuildConfig.Build_Type == 1){
//            return jsonStr;
//        }else {
//              encryptStr = EncryptUtils.encryptDESString(jsonStr);
//        }
//        return encryptStr;
//    }
//
//    public static <M> String encryptDatas(BaseRequest<M> request) {
//        final Gson gson = new Gson();
//        String encryptStr = null;
//        String jsonStr = gson.toJson(request);
//        if(BuildConfig.Build_Type == 1){
//            return jsonStr;
//        }else {
//            encryptStr = EncryptUtils.encryptDESString(jsonStr);
//        }
//        return encryptStr;
//    }
//}
