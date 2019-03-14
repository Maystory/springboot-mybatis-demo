package com.mf.mybatisdemo.service.serviceImpl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mf.mybatisdemo.bean.UserInfo;
import com.mf.mybatisdemo.mapper.UserInfoMapper;
import com.mf.mybatisdemo.service.UserInfoService;
import com.mf.mybatisdemo.utils.MD5Util;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Objects;

/**
 * Created by Maven on 2018/9/29.
 * Description:
 */
@Service
@Transactional
public class UserInfoServiceImpl implements UserInfoService {

    private static final String IS_REMENBER ="1";

    private static final Logger LOGGER = LoggerFactory.getLogger(UserInfoServiceImpl.class);
    private final UserInfoMapper userInfoMapper;

    @Autowired
    public UserInfoServiceImpl(UserInfoMapper userInfoMapper) {
        this.userInfoMapper = userInfoMapper;
    }

    @Override
    public boolean registUser(UserInfo userInfo) {
        if (Objects.isNull(userInfo)
                || Objects.isNull(userInfo.getUserName())
                || Objects.isNull(userInfo.getUserPass())) {
            LOGGER.info("userInfo 用户数据校验失败");
            return false;

        }
        String originPass = userInfo.getUserPass();
        String md5Pass = MD5Util.getMD5(originPass);
        userInfo.setUserPass(md5Pass);
        try {
            userInfo.insert();
        } catch (Exception e) {
            LOGGER.info("插入用户信息异常:{}", e);
            return false;
        }
        return true;

    }

    @Override
    public UserInfo userLogin(String username, String password) {
        String md5Pass = MD5Util.getMD5(password);

        UserInfo userInfo = userInfoMapper.selectOne(new QueryWrapper<UserInfo>()
                .eq("user_name", username)
                .eq("user_pass", md5Pass));
        return userInfo;

    }
}