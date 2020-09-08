package be.vdab.springmvc.service;

import be.vdab.springmvc.model.EmployeeVO;

import java.util.List;

public interface EmployeeManager {
    public List<EmployeeVO> getAllEmployees();
}
