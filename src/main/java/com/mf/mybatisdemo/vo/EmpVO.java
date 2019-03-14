package com.mf.mybatisdemo.vo;

import com.mf.mybatisdemo.bean.Department;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Maven
 * @since 2018-09-30 16:27
 */
public class EmpVO implements Serializable {
    private Integer id;
    private String lastName;
    private String email;
    private Integer gender;
    private Date date;
    private Department department;
    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Date getDate() {
        // if (date != null) {
        //     return date;
        // }
        // return new Date();
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}