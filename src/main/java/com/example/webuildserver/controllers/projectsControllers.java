package com.example.webuildserver.controllers;



import com.example.webuildserver.models.Project;
import com.example.webuildserver.repository.ProjectsRepository;
import com.example.webuildserver.service.ProjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

import java.util.*;
import java.util.List;

@RestController
@RequestMapping(value = "projects")
class ProjectsControllers {
    @Autowired
    private ProjectsService projectsService;

    @GetMapping("/{language}")
    public ResponseEntity<List<Project>> getALlProjects(@PathVariable String language) {
        try{
            return new ResponseEntity<>(projectsService.getProjectsByLanguage(language), HttpStatus.OK);
        }
        catch(Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
    @GetMapping("/{language}/{projectId}")
    public ResponseEntity<Project> getProjectById(@PathVariable String language, @PathVariable int projectId) {
        try{
            return new ResponseEntity<>(projectsService.getProjectByIdAndLanguage(projectId, language), HttpStatus.OK);
        }
        catch(Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
}