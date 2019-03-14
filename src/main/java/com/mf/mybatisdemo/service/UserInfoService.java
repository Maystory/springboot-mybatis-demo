package com.mf.mybatisdemo.service;

import com.mf.mybatisdemo.bean.UserInfo;

public interface UserInfoService {
    boolean registUser(UserInfo userInfo);

    UserInfo userLogin(String username, String password);
}
