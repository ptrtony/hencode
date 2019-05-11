package com.zhaofan.base.apis;

/**
 * Created by tongxiaobo on 2017/9/25.
 */

public interface Apis {
//
//    //获取轮播图
//    @POST("getactivityimgs")
//    Flowable<BaseResponse<List<CarouselPicResponseBean>>> getCarouselPic(@Body RequestBody requestBody);
//
//    //检查更新
//    @POST("checkupdate")
//    Flowable<BaseResponse<CheckUpdateResponseBean>> checkUpdate(@Body RequestBody requestBody);
//
//    //上传联系人列表
//    @POST("submitaddrbook")
//    Flowable<BaseResponse<List<NoneResponseBean>>> uploadContactList(@Body RequestBody requestBody);
//
//    //上传紧急联系人
//    @POST("submitelinkman")
//    Flowable<BaseResponse<List<NoneResponseBean>>> uploadEmergencyContact(@Body RequestBody requestBody);
//
//    //token登录
//    @POST("getcustinfobytoken")
//    Flowable<BaseResponse<UserInfoResponseBean>> tokenLogin(@Body RequestBody requestBody);
//
//    //账号密码登录
//    @POST("loginbyphone")
//    Flowable<BaseResponse<UserInfoResponseBean>> mobileLogin(@Body RequestBody requestBody);
//
//    //账号密码登录
//    @POST("loginbycashkilat")
//    Flowable<BaseResponse<UserInfoResponseBean>> cashkilatLogin(@Body RequestBody requestBody);
//
//    //facebook登录
//    @POST("loginbyaccountkit")
//    Flowable<BaseResponse<UserInfoResponseBean>> facebookLogin(@Body RequestBody requestBody);
//
//    //注册登录
//    @POST("registerappcust")
//    Flowable<BaseResponse<UserInfoResponseBean>> mobileRegister(@Body RequestBody requestBody);
//
//    //检查更新
//    @POST("getverificationcode")
//    Flowable<BaseResponse<VerifyCodeResponseBean>> getVerifyCode(@Body RequestBody requestBody);
//
//    //退出登录
//    @POST("logoutbytoken")
//    Flowable<BaseResponse<List<NoneResponseBean>>> loginoutByToken(@Body RequestBody requestBody);
//
//    //获取未读消息数目
//    @POST("getunreadmsgcount")
//    Flowable<BaseResponse<MessageNumResponseBean>> getMessageNum(@Body RequestBody requestBody);
//
//    //获取消息列表
//    @POST("getmsglist")
//    Flowable<BaseResponse<List<MessageListResponseBean>>> getMessageList(@Body RequestBody requestBody);
//
//    //删除消息
//    @POST("updatemsgstatus")
//    Flowable<BaseResponse<List<NoneResponseBean>>> delMessage(@Body RequestBody requestBody);
//
//    //验证码设置密码
//    @POST("resetcustpassword")
//    Flowable<BaseResponse<List<NoneResponseBean>>> setPasswordByCode(@Body RequestBody requestBody);
//
//    //旧密码设置密码
//    @POST("modifycustpassword")
//    Flowable<BaseResponse<List<NoneResponseBean>>> setPassword(@Body RequestBody requestBody);
//
//    //获取利率计算参数
//    @POST("getconfig")
//    Flowable<BaseResponse<MoneyRateResponseBean>> getMoneyRate(@Body RequestBody requestBody);
//
//    //获取借款列表
//    @POST("get-loan-list")
//    Flowable<BaseResponse<List<LoanListResponseBean>>> getLoanList(@Body RequestBody requestBody);
//
//    //获取借款详情
//    @POST("get-loan-detail")
//    Flowable<BaseResponse<LoanListDetailResponseBean>> getLoanListDetail(@Body RequestBody requestBody);
//
//    //提交订单
//    @POST("submitloan")
//    Flowable<BaseResponse<List<NoneResponseBean>>> submitLoan(@Body RequestBody requestBody);
//
//    //提交头像
//    @POST("updatecustheadimg")
//    Flowable<BaseResponse<List<NoneResponseBean>>> updateHeadImgUrl(@Body RequestBody requestBody);
//
//    //提交实名认证
//    @POST("submitcertify")
//    Flowable<BaseResponse<List<NoneResponseBean>>> submitRealName(@Body RequestBody requestBody);
//
//    //重新提交实名认证
//    @POST("modify-certify")
//    Flowable<BaseResponse<List<NoneResponseBean>>> reSubmitRealName(@Body RequestBody requestBody);
//
//    //获取实名认证信息
//    @POST("querycertify")
//    Flowable<BaseResponse<RealNameInfoResponseBean>> getRealNameInfo(@Body RequestBody requestBody);
//
//    //编辑实名认证信息
//    @POST("get-certify")
//    Flowable<BaseResponse<RealNameResubmitInfoResponseBean>> getRealNameResubmitInfo(@Body RequestBody requestBody);
//
//    //获取还款列表
//    @POST("get-repayment-detail")
//    Flowable<BaseResponse<RepaymentListResponseBean>> getRepaymentList(@Body RequestBody requestBody);
//
//    //获取立即还款详情
//    @POST("repayment")
//    Flowable<BaseResponse<RepaymentImmediatelyResponseBean>> getRepaymentImmediatelyDetail(@Body RequestBody requestBody);
//
//    //获取续借详情
//    @POST("continue")
//    Flowable<BaseResponse<RenewalDetailResponseBean>> getRenewalDetail(@Body RequestBody requestBody);
//
//    //获取详情
//    @POST("display")
//    Flowable<BaseResponse<RepaymentDisplayResponseBean>> getRepaymentDisplay(@Body RequestBody requestBody);
//
//    //获取银行卡信息
//    @POST("querycardbind")
//    Flowable<BaseResponse<BankCardInfoResponseBean>> getBankCardInfo(@Body RequestBody requestBody);
//
//    //获取银行卡列表
//    @POST("getbanklist")
//    Flowable<BaseResponse<List<BankCardListResponseBean>>> getBankCardList(@Body RequestBody requestBody);
//
//    //提交银行卡认证
//    @POST("submitcardbind")
//    Flowable<BaseResponse<List<NoneResponseBean>>> submitBankCard(@Body RequestBody requestBody);
//
//    //提交客服认证
//    @POST("submitcustservice")
//    Flowable<BaseResponse<List<NoneResponseBean>>> submitCustService(@Body RequestBody requestBody);
//
//    //重新提交客服认证
//    @POST("modify-customer-service")
//    Flowable<BaseResponse<List<NoneResponseBean>>> reSubmitCustService(@Body RequestBody requestBody);
//
//    //编辑客服认证信息
//    @POST("get-customer-service")
//    Flowable<BaseResponse<CustomerServiceResubmitInfoResponseBean>> getCustServiceResubmitInfo(@Body RequestBody requestBody);
//
//    //上传通话记录
//    @POST("submitphonelog")
//    Flowable<BaseResponse<List<NoneResponseBean>>> submitphonelog(@Body RequestBody requestBody);
//
//    //上传地理位置 经纬度
//    @POST("save-position")
//    Flowable<BaseResponse<List<NoneResponseBean>>> savePosition(@Body RequestBody requestBody);
//
//    //上传手机App
//    @POST("submitapplog")
//    Flowable<BaseResponse<List<NoneResponseBean>>> submitapplog(@Body RequestBody requestBody);
//
//    //上传手机短信
//    @POST("submitsmslog")
//    Flowable<BaseResponse<List<NoneResponseBean>>> submitsmslog(@Body RequestBody requestBody);
//
//    //上传手机信息
//    @POST("save-system")
//    Flowable<BaseResponse<List<NoneResponseBean>>> saveSystem(@Body RequestBody requestBody);
//
//    //上传手机绑定账户
//    @POST("save-social")
//    Flowable<BaseResponse<List<NoneResponseBean>>> saveSocial(@Body RequestBody requestBody);
//
//    //获取分享列表
//    @POST("get-invite-list")
//    Flowable<BaseResponse<ShareCountListResponseBean>> getShareCountList(@Body RequestBody requestBody);
//
//    //获取邀请好友
//    @POST("get-exchange-list")
//    Flowable<BaseResponse<InviteFriendListResponseBean>> getInviteFriendList(@Body RequestBody requestBody);
//
//    //提交积分兑换
//    @POST("exchange-do")
//    Flowable<BaseResponse<ExchangePointsResponseBean>> submitExchangePoints(@Body RequestBody requestBody);
//
//    //上传百度推广安装信息
//    @POST("adv")
//    Flowable<BaseResponse<List<NoneResponseBean>>> uploadAdv(@Body RequestBody requestBody);
//    //获取职业列表
//    @POST("get-work-type")
//    Flowable<BaseResponse<List<WorkTypeResponseBean>>> getWorkType(@Body RequestBody requestBody);
//

}
