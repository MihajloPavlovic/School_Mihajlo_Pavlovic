package student;

public class Student {
    
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private String course;
    private String computer;
    
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }
    
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }
    
    public int getYearOfBirth() {
        return this.yearOfBirth;
    }
  
    public void setYearOfBirth(int newYearOfBirth) {
        this.yearOfBirth = newYearOfBirth;
    }
    
    public String getCourse() {
        return this.course;
    }
    
    public String getComputer() {
        return this.computer;
    }
  
    public Student(String firstName, String lastName, int yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
    }
    
    public void info() {
        System.out.println("First name: " + this.getFirstName());
        System.out.println("Last name: " + this.getLastName());
        System.out.println("Year of birth: " + this.getYearOfBirth());
    }
}
