package main;

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
        
    }
    
}
