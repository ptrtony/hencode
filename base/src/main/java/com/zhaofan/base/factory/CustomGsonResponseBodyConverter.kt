package com.zhaofan.base.factory

import com.alibaba.fastjson.JSON
import com.google.gson.Gson
import com.google.gson.TypeAdapter
import okhttp3.MediaType
import okhttp3.ResponseBody
import org.json.JSONObject
import retrofit2.Converter
import java.io.IOException

internal class CustomGsonResponseBodyConverter<T>(private val gson: Gson, private val adapter: TypeAdapter<T>) :
    Converter<ResponseBody, T> {

    @Throws(IOException::class)
    override fun convert(value: ResponseBody): T? {
        val s = value.string().trim { it <= ' ' }
        val json = JSON.parseObject(s)

        if (json.get("status") is String) {
            //获取位置信息返回


        } else {
            if (json.getIntValue("status") !== 0) {
                if (json.get("result") != null) {
                    json.remove("result")
                }
            }
            if (json.get("result") is Boolean) {
                json.remove("result")
                json.put("result", JSONObject())
            }

            if (json.get("errors") != null) {
                if (json.get("errors") !is Int) {
                    json.remove("errors")
                }
            }
        }
        val jsonReader = gson.newJsonReader(ResponseBody.create(MediaType.parse("utf-8"),JSON.toJSONString(json)).charStream())
        try {
            return adapter.read(jsonReader)
        } finally {
            value.close()
        }
    }
}