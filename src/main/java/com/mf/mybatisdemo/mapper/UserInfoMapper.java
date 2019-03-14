package com.mf.mybatisdemo.mapper;



import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mf.mybatisdemo.bean.UserInfo;

import java.util.List;

/**
 * <p>
 * 用户信息表 Mapper 接口
 * </p>
 *
 * @author 梅凡
 * @since 2018-09-27
 */
public interface UserInfoMapper extends BaseMapper<UserInfo> {
    /**
     * 查询所有用户数据
     * @return
     */
    List<UserInfo> findAll();


}
