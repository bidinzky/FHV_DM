package DB;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Department {
    private int deptNo;
    private String name;
    private Person deptHead;
    private BigDecimal budget;
    private Department parentDepartment;
    private LocalDate founded;
    private List<Person> members;
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
}
