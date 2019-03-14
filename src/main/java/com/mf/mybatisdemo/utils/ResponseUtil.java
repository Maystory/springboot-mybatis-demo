package com.mf.mybatisdemo.utils;


import com.mf.mybatisdemo.response.PageResponse;



/**
 *
 * @author Maven
 * @date 2018/9/29
 * Description:
 */
public class ResponseUtil {

    public static PageResponse error(Object data, String msg){
        PageResponse pageResponse = new PageResponse();
        pageResponse.setCode(000);
        pageResponse.setMessage(msg);
        pageResponse.setData(data);
        return pageResponse;
    }

    public static PageResponse error(String msg){
        PageResponse pageResponse = new PageResponse();
        pageResponse.setCode(000);
        pageResponse.setMessage(msg);
        return pageResponse;
    }


}