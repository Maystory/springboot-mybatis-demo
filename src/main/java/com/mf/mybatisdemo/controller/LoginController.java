package com.mf.mybatisdemo.controller;

import com.mf.mybatisdemo.bean.UserInfo;
import com.mf.mybatisdemo.service.UserInfoService;
import com.mf.mybatisdemo.utils.SessionUtil;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import java.util.Objects;

/**
 * Created by Maven on 2018/9/27.
 * Description:
 */
@RequestMapping("/login")
@Controller
public class LoginController {


    private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);
    private final UserInfoService userInfoService;

    @Autowired
    public LoginController(UserInfoService userInfoService) {
        this.userInfoService = userInfoService;
    }

    @PostMapping("/user")
    public ModelAndView userLogin(@RequestParam("username") String username,
                                  @RequestParam("password") String password,
                                  @RequestParam(value = "rememberMe" ,defaultValue = "0")  String rememberMe,
                                  HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView();
        UserInfo userInfo = userInfoService.userLogin(username, password);
        if (Objects.isNull(userInfo)) {
            setFaileModel(modelAndView, "没有此用户，请检查用户名密码再试。。");
            return modelAndView;
        }
        if (Objects.equals(rememberMe, "1")) {
            SessionUtil.saveOrUpdateSession(request,"userInfo",userInfo);
        }
        modelAndView.setViewName("home/sucess");
        modelAndView.addObject("userInfo", userInfo);
        return modelAndView;
    }

    private void setFaileModel(ModelAndView modelAndView, String msg) {
        modelAndView.setViewName("pages/user/user_login");
        modelAndView.addObject("msg", msg);

    }



}