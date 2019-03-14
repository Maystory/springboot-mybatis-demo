package com.mf.mybatisdemo.advise;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Maven
 * @since 2018-10-08 21:44
 */
@ControllerAdvice
public class ExceptionController {

    @ResponseBody
    @ExceptionHandler(Exception.class)
    public Map<String, Object> handException(Exception e) {
        Map<String, Object> errorMap = new HashMap<>(16);
        errorMap.put("code", 1000);
        errorMap.put("msg", e.getMessage());
        errorMap.put("cause", e.getCause());
        return errorMap;
    }

}