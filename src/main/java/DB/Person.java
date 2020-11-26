package DB;

import java.sql.Date;
import java.util.List;

public class Person {
    private int persno;
    private String fname;
    private String lname;
    private Department department;
    private float salary;
    private Date fdate;
    private Date ldate;
    private char gender;
    private List<Project> pers_proj;

    public List<Project> getPers_proj() {
        return pers_proj;
    }

    public void setPers_proj(List<Project> pers_proj) {
        this.pers_proj = pers_proj;
    }

    public int getPersno() {
        return persno;
    }

    public void setPersno(int persno) {
        this.persno = persno;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
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

    public Date getFdate() {
        return fdate;
    }

    public void setFdate(Date fdate) {
        this.fdate = fdate;
    }

    public Date getLdate() {
        return ldate;
    }

    public void setLdate(Date ldate) {
        this.ldate = ldate;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
