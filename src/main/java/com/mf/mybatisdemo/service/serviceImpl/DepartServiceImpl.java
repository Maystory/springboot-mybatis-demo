package com.mf.mybatisdemo.service.serviceImpl;

import com.mf.mybatisdemo.bean.Department;
import com.mf.mybatisdemo.mapper.DepartmentMapper;
import com.mf.mybatisdemo.service.DepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Maven
 * @date 2018/9/30
 * Description:
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class DepartServiceImpl implements DepartService {

    private final DepartmentMapper departmentMapper;

    @Autowired
    public DepartServiceImpl(DepartmentMapper departmentMapper) {
        this.departmentMapper = departmentMapper;
    }

    @Override
    public Department findById(Integer id) {
        return departmentMapper.selectById(id);
    }

}