
package course;


public class Course {
    
    private String name;
    private int numberOfClasses;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfClasses() {
        return numberOfClasses;
    }

    public void setNumberOfClasses(int numberOfClasses) {
        this.numberOfClasses = numberOfClasses;
    }
    
    public Course() {
        this.name = "QA course";
        this.numberOfClasses = 50;
    }
    
}
