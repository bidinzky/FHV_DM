package DB;

import java.sql.Date;

public class Department {
    private int deptno;
    private String deptname;
    private Person depthead;
    private float budget;
    private Department in_dept;
    private Date founded;

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public Person getDepthead() {
        return depthead;
    }

    public void setDepthead(Person depthead) {
        this.depthead = depthead;
    }

    public float getBudget() {
        return budget;
    }

    public void setBudget(float budget) {
        this.budget = budget;
    }

    public Department getIn_dept() {
        return in_dept;
    }

    public void setIn_dept(Department in_dept) {
        this.in_dept = in_dept;
    }

    public Date getFounded() {
        return founded;
    }

    public void setFounded(Date founded) {
        this.founded = founded;
    }
}
