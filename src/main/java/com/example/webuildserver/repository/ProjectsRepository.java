package com.example.webuildserver.repository;
import com.example.webuildserver.models.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.io.File;

@Repository
public class ProjectsRepository {

    @Autowired
    private Environment environment;
    public HashMap<String, ArrayList<Project>> findAll(){
        HashMap<String, ArrayList<Project>> projects = new HashMap<String, ArrayList<Project>>();
        ArrayList<Project> projectsInEnglish = new ArrayList<>();
        ArrayList<Project> projectsInHebrew = new ArrayList<>();

        List<String> imagesFilesNamesProject1 = getFilesNameInFolder(environment.getProperty("environment.projectsImagesPath") + "1");
        imagesFilesNamesProject1.forEach((n) -> System.out.println(n +" 11111111"));
        Project project1english = new Project(1, "NOF YAMIM", "Office&Commerce","nof yamim is the new generation of building in the beutifaul area nof yam", "The Nof Yam project is a breathtaking project of a complex of buildings in which thinking was invested in the last detail","Nof yam","populated", imagesFilesNamesProject1);
        projectsInEnglish.add(project1english);

        List<String> imagesFilesNamesProject2 = getFilesNameInFolder(environment.getProperty("environment.projectsImagesPath") + "2");
        Project project2english = new Project(2, "Glil Yam","House" ,"Glil Yam  is the new generation of luxury house in the beutifaul area Glil Yam", "This is a luxury house that was built in the process of an amazing collaboration between the owners of the conference and the performers", "Glil Yam","populated", imagesFilesNamesProject2 );
        projectsInEnglish.add(project2english);

        List<String> imagesFilesNamesProject3 = getFilesNameInFolder(environment.getProperty("environment.projectsImagesPath") + "3");
        Project project3english = new Project(3, "Tel Avivim", "Office&Commerce","Tel aviv rotchild the perfect locatin", "Tel Avivim is a project in which a shell was built for an office building in which thinking was invested in all the small details and forms of the company" , "Tel aviv","populated", imagesFilesNamesProject3);
        projectsInEnglish.add(project3english);

        List<String> imagesFilesNamesProject4 = getFilesNameInFolder(environment.getProperty("environment.projectsImagesPath") + "4");
        Project project4english = new Project(4, "Pura Vida ","House" ,"private house in herzilya pituach ", "Fora Vida is the construction and finishing of luxury residences where customers can live the level of life they dreamed of without worries","Herzeliya Pituach","populated", imagesFilesNamesProject4 );
        projectsInEnglish.add(project4english);

        List<String> imagesFilesNamesProject5 = getFilesNameInFolder(environment.getProperty("environment.projectsImagesPath") + "4");
        Project project5english = new Project(5, "Supreme", "Apartment","Supreme the most beutifaul apratment in the cisy", "The Sofrim project is a construction project of the stunning apartment located in the center of Tel Aviv, therefore it has been adapted to a chic construction that will connect to the place where it is located", "Tel aviv","populated", imagesFilesNamesProject5);
        projectsInEnglish.add(project5english);

        List<String> imagesFilesNamesProject6 = getFilesNameInFolder(environment.getProperty("environment.projectsImagesPath") + "4");
        Project project6english = new Project(6, "Sharonim","House" ,"beatifaul privat house in ramat asharon", "Sharonim is a project in which a residence will be built for a family so that we can live at the standard of living in which she dreamed of aliyah all her life", "Ramat Asharon","populated", imagesFilesNamesProject6 );
        projectsInEnglish.add(project6english);

        List<String> imagesFilesNamesProject7 = getFilesNameInFolder(environment.getProperty("environment.projectsImagesPath") + "4");
        Project project7english = new Project(7, "Hal Hayam","Apartment" ,"hal hayam project is the closest to leave in havean ", "On the sea This is an apartment on the sea that has been renovated from the ground up with the highest level of finish at the customer's request and to match the level of the apartment to where it is located", "Herzilya pituach ","populated", imagesFilesNamesProject7 );
        projectsInEnglish.add(project7english);

        projects.put("english",projectsInEnglish);

        Project project1hebrew = new Project(1, "נוף ימים", "משרדים ומסחר","נוף ים זה הדור החדש של בניינים יפים","פרויקט נוף ים זה פרויקט עוצר נשימה של קומפלקס בניינים שהושקע בהם חשיבה יד הפרט האחרון","נוף ים","מאוכלס", imagesFilesNamesProject1);
        projectsInHebrew.add(project1hebrew);
        Project project2hebrew = new Project(2, "גליל ימים","בית" ,"גליל ים זה הדור החדש של בניינים יפים", "גליל ים זה פרוויקט של בית יוקרה שנותן לך להרגיש לגור כמו בגן עדן זה בית יוקרה שנבה בתהליך של שיתוף מדהים בין בעלי הכנס לבין צוות המבצעים", "גליל ים","מאוכלס", imagesFilesNamesProject2 );
        projectsInHebrew.add(project2hebrew);
        Project project3hebrew = new Project(3, "תל אביבים", "משרדים ומסחר","פרוייקט תל אביבים זה הדור החדש של בנייה ", "תל אביבים זה פרויקט שבו נבנה מעטפת לבניין משרדים שהושקע בו חשיבה על כל הפרטים הקטנים וצורי החברה ","תל אביב","מאוכלס", imagesFilesNamesProject3);
        projectsInHebrew.add(project3hebrew);
        Project project4hebrew = new Project(4, "פורה וידה","בית" ,"בית פרטי בהרצליה פיתוח עם בנייה מהממת ", "פורה וידה זה בנייה וגימור של מגורי יוקרה שבו ניתן ללקוחות לחיות רמת חיים שבו הם חלמו עליו מבלי דאגות ", "הרצליה פיתוח","מאוכלס", imagesFilesNamesProject4 );
        projectsInHebrew.add(project4hebrew);
        Project project5hebrew = new Project(5, "סופרים", "דירה","סופרים זה דירה מהממת במרכז תל אביב", "פרויקט סופרים הוא פרוויקט בנייה של הדירה המהממת שנמצאת במרכז תל אביב ולכן הותאם לה בנייה שיקית שתתחבר למקום שבו היא נמצאת ", "תל אביב","מאוכלס", imagesFilesNamesProject5);
        projectsInHebrew.add(project5hebrew);
        Project project6hebrew = new Project(6, "שרונים","בית" ,"בית פרטי מהממם ברמת שרון", "שרונים זה פרויקט שבו נבנה בית מגורים למשפחה שנוכל לחיות ברמת החיים שבו היא חלמה עלייה כל החיים.","רמת השרון","מאוכלס", imagesFilesNamesProject6 );
        projectsInHebrew.add(project6hebrew);
        Project project7hebrew = new Project(7, "על הים","דירה" ,"על הים זה פרויקט חדשני להרגיש לחיות בגן עדן", "על הים זוהי דירה על הים ששופצה מהיסוד ברמת גימור הכי גבוה לבקשת הלקוח ולהתאמת רמת הדירה למקום בו היא נמצאת ", "הרצליה פיתוח","מאוכלס", imagesFilesNamesProject7 );
        projects.put("hebrew",projectsInHebrew);
        projectsInHebrew.add(project7hebrew);
        return projects;
    }
    public static List<String> getFilesNameInFolder(String folderPath){
        File folder = new File(folderPath);
        File[] listOfFiles = folder.listFiles();
        List<String> listOfFilesNames = new ArrayList<String>();
        for (int i = 0; i < listOfFiles.length; i++) {
            if (!listOfFiles[i].getName().contains("main.")) {
                listOfFilesNames.add(listOfFiles[i].getName());
            }
        }
        return listOfFilesNames;
    }
}

