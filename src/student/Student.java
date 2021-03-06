
package student;

import computer.Computer;
import course.Course;

public class Student {
    
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private Course course;
    private Computer computer;

    public Computer getComputer() {
        return computer;
    }

    public Course getCourse() {
        return course;
    }
    
    public void setCourse(Course course) {
    	this.course = course;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
    
    public Student() {
              
        this.firstName = "defaultName";
        this.lastName = "defaultSurname";
        this.yearOfBirth = 1990;
        this.course = new Course();
        this.computer = new Computer();
        
    }
    
    public void info() {
        System.out.println("First name: " + this.getFirstName());
        System.out.println("Last name: " + this.getLastName());
        System.out.println("Year of birth: " + this.getYearOfBirth());
        System.out.println("Course name: " + this.getCourse().getName());
        System.out.println("Course number of classes: " + this.getCourse().getNumberOfClasses());
        System.out.println("Process tact: " + this.getComputer().getProcessTact() + " GHz");
        System.out.println("Memory: " + this.getComputer().getMemory() + " GB RAM");
        System.out.println("Hard drive: " + this.getComputer().getHardDrive() + " GB");
        System.out.println();
    }
}
