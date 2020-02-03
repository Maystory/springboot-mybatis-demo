package com.mf.mybatisdemo.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 *
 * @author Maven
 * @date 2018/9/29
 * Description:
 */
public class GsonUtil {

    private static final Gson GSON = new GsonBuilder()
            .setDateFormat("yyyy-MM-dd HH:mm:ss")
            .serializeNulls()
            .disableInnerClassSerialization()
            .create();


    public static String toJson(Object obj) {
        return GSON.toJson(obj);

    }

    public static <T> T fromJson(String json, Class<T> clazz) {
        return GSON.fromJson(json, clazz);
    }

}