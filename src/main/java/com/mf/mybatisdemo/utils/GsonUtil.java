package com.mf.mybatisdemo.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mf.mybatisdemo.bean.UserInfo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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


    public static void main(String[] args) {
        UserInfo userInfo = new UserInfo();
        userInfo.setId(1);
        userInfo.setUserMark("usermark");
        userInfo.setUserName("username");
        userInfo.setServerUpdateTime(new Date());
        UserInfo userInfo2 = new UserInfo();
        userInfo.setId(2);
        userInfo.setUserMark("usermark");
        userInfo.setUserName("username");
        userInfo.setServerUpdateTime(new Date());
        List<UserInfo> list = new ArrayList<>();
        list.add(userInfo);
        list.add(userInfo2);
        System.out.println(toJson(list));


    }
}