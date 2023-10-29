package com.example.webuildserver.service;
import com.example.webuildserver.models.Project;
import com.example.webuildserver.repository.ProjectsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectsService {
    @Autowired
    private ProjectsRepository projectsRepository;

    public List<Project> getProjectsByLanguage(String language)
    {
        return projectsRepository.findAll().get(language);
    }
    public Project getProjectByIdAndLanguage(int projectId, String language)
    {
        return projectsRepository.findAll().get(language).stream().filter((project) -> project.getId() == projectId).findFirst().orElse(null);
    }
}
