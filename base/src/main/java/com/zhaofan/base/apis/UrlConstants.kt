//package com.zhaofan.base.apis
//
//import com.zhaofan.base.BuildConfig
//
//class UrlConstants {
//    /**
//     * 获取对应的host
//     *
//     * @param hostType host类型
//     * @return host
//     */
//    companion object {
//        @JvmStatic
//        fun getHost(hostType: Int): String {
//            val host: String
//            when (hostType) {
//                Constant.TEST_APIS -> host = BuildConfig.TEST_APIS_URL
//                Constant.ONLINE_APIS -> host = BuildConfig.ONLINE_APIS_URL
//                else -> host = ""
//            }
//            return host
//        }
//    }
//
//}