package com.example.webuildserver.models;

import java.awt.*;

public class Project {
    private String  name ;

    private String type ;
    private String text ;
    private String location  ;
    private String status  ;
    protected Image img ;

    public Project (String name, String type, String text, String location, String status, Image img)
    {
        this.name = name ;
        this.type = type ;
        this.text = text ;
        this.location = location ;
        this.status = status;
        this.img = img ;
    }
    public String getName ()
    {
        return name;
    }
    public String getText ()
    {
        return text;
    }
    public String getLocation ()
    {
        return location;
    }
    public Image getImage ()
    {
        return img;
    }
    public String getType ()
    {
        return type;
    }
    public String getStatus ()
    {
        return status;
    }


}
