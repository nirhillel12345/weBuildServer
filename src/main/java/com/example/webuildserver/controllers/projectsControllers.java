package com.example.webuildserver.controllers;



import com.example.webuildserver.models.Project;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.*;
import java.awt.*;
import java.util.List;

@RestController
@RequestMapping(value = "projects")
public class projectsControllers {
    @GetMapping
    public responseEntity<List<Project>> getALlProjects() {
        ArrayList<Project> projects = new ArrayList<>();

        Project project = new Project("NOF YAMIM", "nof yamim is the new generation of building in the beutifaul are nof yam", "Nof yam", null );
        projects.add(project);
        return new responseEntity<>(projects, HttpStatus.OK);
    }
}