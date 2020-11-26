package DB;

import java.sql.Date;
import java.util.List;

public class Person {
    private int persNo;
    private String firstName;
    private String lastName;
    private Department department;
    private float salary;
    private Date entryDate;
    private Date quitDate;
    private char gender;
    private List<Project> projects;
    private List<Project> headOfProjects;


    public List<Project> getHeadOfProjects() {
        return headOfProjects;
    }

    public void setHeadOfProjects(List<Project> headOfProjects) {
        this.headOfProjects = headOfProjects;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public int getPersNo() {
        return persNo;
    }

    public void setPersNo(int persNo) {
        this.persNo = persNo;
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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public Date getQuitDate() {
        return quitDate;
    }

    public void setQuitDate(Date quitDate) {
        this.quitDate = quitDate;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
