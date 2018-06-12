package main;

import course.Course;
import student.Student;

public class Main {
    
    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.setFirstName("Milan");
        s1.setLastName("Zelenovic");
        s1.setYearOfBirth(2000);
        
        s1.getCourse().setName("Java course");
        s1.getCourse().setNumberOfClasses(55);
        s1.getComputer().setProcessTact(3);
        s1.getComputer().setMemory(12);
        s1.getComputer().setHardDrive(768);
        
        s1.info();
        
        Course QA_course = new Course();
        QA_course.setName("QA course");
        QA_course.setNumberOfClasses(50);
        
        s1.setCourse(new Course(QA_course));
        
        s1.info();
        
    }
    
}


// probati da se napravi novi objekat klase Course i da se onda to dodeli kao kurs nekom objektu klase student, kod kuce