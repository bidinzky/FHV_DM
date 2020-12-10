package DB;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;


@Entity
@Table(name = "Person")
public class Person {
    @Id
    @Column(name = "PERSNO")
    private int persNo;
    @Column(name = "FNAME")
    private String firstName;
    @Column(name = "LNAME")
    private String lastName;
    @ManyToOne
    @JoinColumn(name = "DEPARTMENT")
    private Department department;
    @Column(name = "SALARY")
    private BigDecimal salary;
    @Column(name = "FDATE")
    private LocalDate entryDate;
    @Column(name = "LDATE")
    private LocalDate quitDate;
    @Column(name = "GENDER")
    private char gender;
    @ManyToMany
    @JoinTable(
            name = "PERS_PROJ",
            joinColumns = {
                    @JoinColumn(name = "PERSNO")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "PROJNO")
            }
    )
    private List<Project> projects;
    @OneToMany(mappedBy = "head")
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public LocalDate getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(LocalDate entryDate) {
        this.entryDate = entryDate;
    }

    public LocalDate getQuitDate() {
        return quitDate;
    }

    public void setQuitDate(LocalDate quitDate) {
        this.quitDate = quitDate;
    }


    public String getName() {
        return firstName + " " + lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "persNo=" + persNo +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", department='" + (Objects.nonNull(department)?department.getName():"") + '\'' +
                ", salary=" + salary +
                ", entryDate=" + entryDate +
                ", quitDate=" + quitDate +
                ", gender=" + gender +
                ", projects={" + (projects != null?(projects.stream().map(Project::getName).collect(Collectors.joining(","))):"") + "}" +
                ", headOfProjects={" + (headOfProjects != null?headOfProjects.stream().map(Project::getName).collect(Collectors.joining(",")):"") + '\'' +
                '}';
    }
}
