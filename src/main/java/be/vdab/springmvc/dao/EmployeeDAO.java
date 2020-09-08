package be.vdab.springmvc.dao;

import be.vdab.springmvc.model.EmployeeVO;

import java.util.List;

public interface EmployeeDAO
{
    public List<EmployeeVO> getAllEmployees();
}
