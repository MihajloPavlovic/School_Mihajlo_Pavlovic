package student;

import computer.Computer;
import course.Course;

public class Student {
    
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private Course course;
    private Computer computer;
    
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
    
    public Course getCourse() {
        return this.course;
    }
    
    public Computer getComputer() {
        return this.computer;
    }
    
    public Student() {
        this.course = new Course();
        this.computer = new Computer();
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
