package com.temeld.projectmanagement.employee;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author duygutemel
 */

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    public List<Employee> findByProjectId(Long projectId);
}
