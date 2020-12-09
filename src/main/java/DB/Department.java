package DB;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Entity
public class Department {
    @Id
    @Column(name = "DEPTNO")
    private int deptNo;
    @Column(name = "DEPTNAME")
    private String name;
    @ManyToOne
    @JoinColumn(name = "DEPTHEAD")
    private Person deptHead;
    @Column(name = "BUDGET")
    private BigDecimal budget;
    @ManyToOne
    @JoinColumn(name = "IN_DEPT")
    private Department parentDepartment;
    @Column(name = "FOUNDED")
    private LocalDate founded;
    @OneToMany(mappedBy = "department")
    private List<Person> members;
    @OneToMany(mappedBy = "parentDepartment")
    private List<Department> subDepartments;

    public List<Person> getMembers() {
        return members;
    }

    public void setMembers(List<Person> members) {
        this.members = members;
    }

    public List<Department> getSubDepartments() {
        return subDepartments;
    }

    public void setSubDepartments(List<Department> subDepartments) {
        this.subDepartments = subDepartments;
    }

    public int getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getDeptHead() {
        return deptHead;
    }

    public void setDeptHead(Person deptHead) {
        this.deptHead = deptHead;
    }

    public BigDecimal getBudget() {
        return budget;
    }

    public void setBudget(BigDecimal budget) {
        this.budget = budget;
    }

    public Department getParentDepartment() {
        return parentDepartment;
    }

    public void setParentDepartment(Department parentDepartment) {
        this.parentDepartment = parentDepartment;
    }

    public LocalDate getFounded() {
        return founded;
    }

    public void setFounded(LocalDate founded) {
        this.founded = founded;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptNo=" + deptNo +
                ", name='" + name + '\'' +
                ", deptHead=" + deptHead.getName() +
                ", budget=" + budget +
                ", parentDepartment=" + parentDepartment +
                ", founded=" + founded +
                ", members={" + members.stream().map(Person::getName).collect(Collectors.joining(",")) + "}" +
                ", subDepartments={" + subDepartments.stream().map(Department::getName).collect(Collectors.joining(",")) + "}" +
                '}';
    }
}
