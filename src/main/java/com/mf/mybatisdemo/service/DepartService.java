package com.mf.mybatisdemo.service;

import com.mf.mybatisdemo.bean.Department;

public interface DepartService {
    Department findById(Integer id);
}
