package be.vdab.springmvc.service;

import java.util.List;

import be.vdab.springmvc.dao.EmployeeDAO;
import be.vdab.springmvc.model.EmployeeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmployeeManagerImpl implements EmployeeManager {

    @Autowired
    EmployeeDAO dao;

    public List<EmployeeVO> getAllEmployees()
    {
        return dao.getAllEmployees();
    }
}
