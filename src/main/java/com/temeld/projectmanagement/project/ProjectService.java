package com.temeld.projectmanagement.project;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author duygutemel
 */


@Service
public class ProjectService {

    private ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public List<Project> getAllProjects() {
        List<Project> projects = new ArrayList<>();
        projectRepository.findAll().forEach(projects::add);
        return projects;
    }

    public Project getProject(Long id) {
        return projectRepository.getOne(id);
    }

    public void addProject(Project project) {
        projectRepository.save(project);
    }

    public void updateProject(Long id, Project project) {
        projectRepository.save(project);
    }

    public void deleteProject(Long id) {
        projectRepository.deleteById(id);
    }
}
