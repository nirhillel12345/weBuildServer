package com.example.webuildserver.models;

import java.awt.*;

public class Project {
    private String  name ;
    private String text ;
    private String location  ;
    protected Image img ;

    public Project (String name, String text, String location, Image img)
    {
        this.name = name ;
        this.text = text ;
        this.location = location ;
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


}
