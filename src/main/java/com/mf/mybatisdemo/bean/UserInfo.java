package com.mf.mybatisdemo.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;



/**
 * <p>
 * 用户信息表
 * </p>
 *
 * @author 梅凡
 * @since 2018-09-27
 */
public class UserInfo extends Model<UserInfo> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 用户名
     */
    @NotNull
    private String userName;
    /**
     * 密码
     */
    @NotNull
    private String userPass;
    /**
     * 用户标识信息
     */
    private String userMark;
    /**
     * 创建时间
     */
    private Date serverCreateTime;
    /**
     * 更新时间
     */
    private Date serverUpdateTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public String getUserMark() {
        return userMark;
    }

    public void setUserMark(String userMark) {
        this.userMark = userMark;
    }

    public Date getServerCreateTime() {
        return serverCreateTime;
    }

    public void setServerCreateTime(Date serverCreateTime) {
        this.serverCreateTime = serverCreateTime;
    }

    public Date getServerUpdateTime() {
        return serverUpdateTime;
    }

    public void setServerUpdateTime(Date serverUpdateTime) {
        this.serverUpdateTime = serverUpdateTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
        ", id=" + id +
        ", userName=" + userName +
        ", userPass=" + userPass +
        ", userMark=" + userMark +
        ", serverCreateTime=" + serverCreateTime +
        ", serverUpdateTime=" + serverUpdateTime +
        "}";
    }
}
