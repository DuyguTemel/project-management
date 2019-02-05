package com.temeld.projectmanagement.project;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author duygutemel
 */


public interface ProjectRepository extends JpaRepository<Project, Long> {
}
