package com.mf.mybatisdemo.service;

import com.mf.mybatisdemo.bean.Employee;
import com.mf.mybatisdemo.vo.EmpVO;

import java.util.List;

public interface EmpService {
    List<EmpVO> getAllEmps();

    Boolean addEmp(Employee employee);

    Boolean delEmpById(Integer id);

    Boolean updateById(Employee employee);

    EmpVO findEmpVOById(Integer id);


}
