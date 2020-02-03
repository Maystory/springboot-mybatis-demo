// package com.mf.mybatisdemo.controller;
//
// import com.mf.mybatisdemo.bean.UserInfo;
// import com.mf.mybatisdemo.service.UserInfoService;
// import com.mf.mybatisdemo.utils.GsonUtil;
// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
//
// /**
//  * Created by Maven on 2018/9/22.
//  * Description:
//  */
// @Controller
// @RequestMapping("/index")
// public class IndexController {
//
//     private static final Logger LOGGER = LoggerFactory.getLogger(IndexController.class);
//
//     private final UserInfoService userInfoService;
//
//     @Autowired
//     public IndexController(UserInfoService userInfoService) {
//         this.userInfoService = userInfoService;
//     }
//
//     @PostMapping("/regist")
//     public String userRegist(UserInfo userInfo) {
//         LOGGER.info("注册信息userInfo是：{}", GsonUtil.toJson(userInfo));
//         boolean isSuccess = userInfoService.registUser(userInfo);
//         if (isSuccess) {
//             return "redirect:/toLogin";
//         } else {
//             return "edirect:/index";
//         }
//
//     }
//
//
// }