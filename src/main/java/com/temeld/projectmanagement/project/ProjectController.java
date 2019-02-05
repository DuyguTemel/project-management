package com.temeld.projectmanagement.project;

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
public class ProjectController {

    private final ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @RequestMapping("/projects")
    public List<Project> getAllProjects() {
        return projectService.getAllProjects();
    }

    @RequestMapping("/projects/{id}")
    public Project getProject(@PathVariable Long id) {
        return projectService.getProject(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/projects")
    public void addProject(@RequestBody Project project) {
        projectService.addProject(project);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/projects/{id}")
    public void updateProject(@PathVariable Long id, @RequestBody Project project) {
        projectService.updateProject(id, project);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/projects/{id}")
    public void deleteProject(@PathVariable Long id) {
        projectService.deleteProject(id);
    }

}
