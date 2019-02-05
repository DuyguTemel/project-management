package com.temeld.projectmanagement.employee;

import com.temeld.projectmanagement.project.Project;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author duygutemel
 */

@RestController
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @RequestMapping("/projects/{id}/employees")
    public List<Employee> getAllEmployees(@PathVariable Long id) {
        return employeeService.getAllEmployees(id);
    }

    @RequestMapping("/projects/{projectId}/employees/{id}")
    public Employee getEmployee(@PathVariable Long id) {
        return employeeService.getEmployee(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/projects/{projectId}/employees")
    public void addEmployee(@RequestBody Employee employee, @PathVariable Long projectId) {
        employee.setProject(new Project(projectId, "", ""));
        employeeService.addEmployee(employee);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/projects/{projectId}/employees/{id}")
    public void updateEmployee(@RequestBody Employee employee, @PathVariable Long projectId, @PathVariable Long id) {
        employee.setProject(new Project(projectId, "", ""));
        employeeService.updateEmployee(employee);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/projects/{projectId}/employees/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
    }

}
