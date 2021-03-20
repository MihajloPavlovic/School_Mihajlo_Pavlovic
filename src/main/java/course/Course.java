package course;

public class Course {
    
    private String name;
    private int numberOfClasses;
    private String codeName;
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String newName) {
        this.name = newName;
    }
    
    public int getNumberOfClasses() {
        return this.numberOfClasses;
    }
    
    public void setNumberOfClasses(int newNumberOfClasses) {
        this.numberOfClasses = newNumberOfClasses;
    }
    
    public String getCodeName() {
        return this.codeName;
    }
    
    public void setCodeName(String newCodeName) {
        this.codeName = newCodeName;
    }
    
    public Course() {
        
    }
    
    public Course(String name, int numberOfClasses, String codeName) {
        this.name = name;
        this.numberOfClasses = numberOfClasses;
        this.codeName = codeName;
    }
    
}
