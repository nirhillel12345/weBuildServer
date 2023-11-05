package com.example.webuildserver.models;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Project {
    private int id;
    private String  name ;

    private String type ;
    private String paragraph ;
    private String title ;
    private String location  ;
    private String status  ;
    protected List<String> images ;

    public Project (int id, String name, String type, String title,String paragraph, String location, String status, List<String> images)
    {
        this.id = id ;
        this.name = name ;
        this.type = type ;
        this.title = title ;
        this.paragraph = paragraph;
        this.location = location ;
        this.status = status;
        this.images = images ;
    }
    public int getId ()
    {
        return id;
    }
    public String getName ()
    {
        return name;
    }
    public String getTitle ()
    {
        return title;
    }
    public String getLocation ()
    {
        return location;
    }
    public List<String>  getImages ()
    {
        return images;
    }
    public String getType ()
    {
        return type;
    }
    public String getStatus ()
    {
        return status;
    }
    public String getParagraph ()
    {
        return paragraph;
    }


}
