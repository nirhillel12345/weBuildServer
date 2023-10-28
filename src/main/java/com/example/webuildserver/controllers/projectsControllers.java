package com.example.webuildserver.controllers;



import com.example.webuildserver.models.Project;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

import javax.print.DocFlavor;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.*;
import java.awt.*;
import java.util.List;

@RestController
@RequestMapping(value = "projects")
public class projectsControllers {
    @GetMapping("/{language}")
    public ResponseEntity<List<Project>> getALlProjects(@PathVariable String language) {
        HashMap<String, ArrayList<Project>> projects = new HashMap<String, ArrayList<Project>>();
        System.out.println("language is: " + language);
        ArrayList<Project> projectsInEnglish = new ArrayList<>();
        ArrayList<Project> projectsInHebrew = new ArrayList<>();

        Project project1english = new Project("NOF YAMIM", "office","nof yamim is the new generation of building in the beutifaul area nof yam", "Nof yam","populated", null);
        projectsInEnglish.add(project1english);
        Project project2english = new Project("Glil Yam","house" ,"Glil Yam  is the new generation of building in the beutifaul area Glil Yam", "Glil Yam","populated", null );
        projectsInEnglish.add(project2english);
        Project project3english = new Project("Tel Avivim", "office","Tel aviv rotchild the perfect locatin ", "Tel aviv","populated", null);
        projectsInEnglish.add(project3english);
        Project project4english = new Project("Pura Vida ","house" ,"private house in herzilya pituach ", "Herzeliya Pituach","populated", null );
        projectsInEnglish.add(project4english);
        Project project5english = new Project("Supreme", "apartment","Supreme the most beutifaul apratment in the cisy", "Tel aviv","populated", null);
        projectsInEnglish.add(project5english);
        Project project6english = new Project("Sharonim","house" ,"beatifaul privat ehouse in ramat asharon", "Ramat Asharon","populated", null );
        projectsInEnglish.add(project6english);
        Project project7english = new Project("Hal Hayam","apartment" ,"hal hayam project is the closest to leave in havean ", "Ramat Asharon","populated", null );
        projectsInEnglish.add(project7english);
        projects.put("english",projectsInEnglish);

        Project project1hebrew = new Project("נוף ימים", "משרד","נוף ים זה הדור החדש של בניינים יפים", "נוף ים","מאוכלס", null);
        projectsInHebrew.add(project1hebrew);
        Project project2hebrew = new Project("גליל ימים","בית" ,"גליל ים זה הדור החדש של בניינים יפים", "גליל ים","מאוכלס", null );
        projectsInHebrew.add(project2hebrew);
        Project project3hebrew = new Project("תל אביבים", "משרד","פרוייקט תל אביבים זה הדור החדש של בנייה ", "תל אביב","מאוכלס", null);
        projectsInHebrew.add(project3hebrew);
        Project project4hebrew = new Project("פורה וידה","בית" ,"בית פרטי בהרצליה פיתוח עם בנייה מהממת ", "הרצליה פיתוח","מאוכלס", null );
        projectsInHebrew.add(project4hebrew);
        Project project5hebrew = new Project("סופרים", "דירה","סופרים זה דירה מהממת במרכז תל אביב", "תל אביב","מאוכלס", null);
        projectsInHebrew.add(project5hebrew);
        Project project6hebrew = new Project("שרונים","בית" ,"בית פרטי מהממם ברמת שרון", "רמת השרון","מאוכלס", null );
        projectsInHebrew.add(project6hebrew);
        Project project7hebrew = new Project("על הים","דירה" ,"על הים זה פרויקט חדשני להרגיש לחיות בגן עדן", "רמת השרון","מאוכלס", null );
        projectsInHebrew.add(project7hebrew);
        projects.put("hebrew",projectsInHebrew);
        return new ResponseEntity<>(projects.get(language), HttpStatus.OK);
    }
}