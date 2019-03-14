package com.mf.mybatisdemo.service.serviceImpl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mf.mybatisdemo.bean.Department;
import com.mf.mybatisdemo.bean.Employee;
import com.mf.mybatisdemo.mapper.DepartmentMapper;
import com.mf.mybatisdemo.mapper.EmployeeMapper;
import com.mf.mybatisdemo.service.EmpService;
import com.mf.mybatisdemo.vo.EmpVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Maven
 * @date 2018/9/29
 * Description:
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class EmpServiceImpl implements EmpService {
    private static final Logger LOGGER = LoggerFactory.getLogger(EmpServiceImpl.class);


    private final EmployeeMapper employeeMapper;
    private final DepartmentMapper departmentMapper;

    @Autowired
    public EmpServiceImpl(EmployeeMapper employeeMapper, DepartmentMapper departmentMapper) {
        this.employeeMapper = employeeMapper;
        this.departmentMapper = departmentMapper;
    }

    @Override
    public List<EmpVO> getAllEmps() {
        QueryWrapper<Employee> queryWrapper = new QueryWrapper<>();
        List<Employee> employees = employeeMapper.selectList(queryWrapper);
        List<EmpVO> resultList = new LinkedList<>();
        for (Employee employee : employees) {
            resultList.add(setEmpVO(employee));
        }
        return resultList;
    }

    /**
     * 设置部门返回数据
     * @param employee
     * @return
     */
    private EmpVO setEmpVO(Employee employee) {
        EmpVO empVO = new EmpVO();
        empVO.setId(employee.getId());
        empVO.setLastName(employee.getLastName());
        empVO.setEmail(employee.getEmail());
        empVO.setGender(employee.getGender());
        empVO.setDate(employee.getBirth());
        empVO.setImage(employee.getImage());
        Department department = departmentMapper.selectById(employee.getdId());
        empVO.setDepartment(department);
        return empVO;
    }

    @Override
    public Boolean addEmp(Employee employee) {
        try {
            employeeMapper.insert(employee);
        } catch (Exception e) {
            LOGGER.error("插入{}--->失败：{}", employee.getLastName(), e.getMessage());
            return false;
        }
        return true;
    }

    @Override
    public Boolean delEmpById(Integer id) {

        try {
            employeeMapper.deleteById(id);
        } catch (Exception e) {
            LOGGER.error("删除{}---->失败：{}", id, e.getMessage());
            return false;
        }
        return true;
    }

    @Override
    public Boolean updateById(Employee employee) {
        try {
            employeeMapper.updateById(employee);
        } catch (Exception e) {
            LOGGER.error("更新{}---->失败：{}", employee.getId(), e.getMessage());
            return false;
        }
        return true;
    }

    @Override
    public EmpVO findEmpVOById(Integer id) {
        Employee employee = employeeMapper.selectById(id);
        return setEmpVO(employee);
    }
}