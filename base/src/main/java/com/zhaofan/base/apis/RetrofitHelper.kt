package com.zhaofan.base.apis

import com.zhaofan.base.factory.CustomGsonConverterFactory
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import java.util.*
import java.util.concurrent.TimeUnit

class RetrofitHelper private constructor(){

    companion object {
        const val READ_TIME_OUT :Long = 3000
        const val CONNECT_TIME_OUT :Long = 3000


        val instance:RetrofitHelper by lazy{
            RetrofitHelper()
        }
    }

    val retroft:Retrofit

    private val interceptor:Interceptor = Interceptor {
        var language :String= Locale.getDefault().toString()
        language = when {
            language.contains("in-ID") -> "indo"
            language.contains("zh-CN") -> "zh-CN"
            else -> "en"
        }
        val build = it.request().newBuilder()
            .addHeader("Accept-Language",language)
            .build()

        it.proceed(build)
    }
    init {
        retroft = Retrofit.Builder()
            .baseUrl("https:wandroid.com/")
            .client(okHttpClient())
            .addConverterFactory(CustomGsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()

    }

    private fun okHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .callTimeout(CONNECT_TIME_OUT,TimeUnit.MILLISECONDS)
            .readTimeout(READ_TIME_OUT,TimeUnit.MILLISECONDS)
            .addInterceptor(initLoggerInterceptor())
            .addInterceptor(interceptor)
            .build()
    }

    private fun initLoggerInterceptor(): Interceptor {
        val okHttpLoggerInterceptor = HttpLoggingInterceptor()
        okHttpLoggerInterceptor.level = HttpLoggingInterceptor.Level.BODY
        return okHttpLoggerInterceptor
    }

    inline fun <reified T> createService():T{
        return this@RetrofitHelper.retroft.create(T::class.java)
    }

}