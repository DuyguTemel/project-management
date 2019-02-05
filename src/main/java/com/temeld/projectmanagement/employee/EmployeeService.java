package com.temeld.projectmanagement.employee;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author duygutemel
 */

@Service
public class EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAllEmployees(Long id) {
        List<Employee> employees = new ArrayList<>();
        employeeRepository.findByProjectId(id).forEach(employees::add);
        return employees;
    }

    public Employee getEmployee(Long id) {
        return employeeRepository.getOne(id);
    }

    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    public void updateEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
}
