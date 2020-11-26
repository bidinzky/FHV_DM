package DB;

import java.util.List;

public class Project {
    private int projno;
    private String projname;
    private Person projhead;
    private Project in_proj;
    private List<Person> pers_proj;

    public int getProjno() {
        return projno;
    }

    public void setProjno(int projno) {
        this.projno = projno;
    }

    public String getProjname() {
        return projname;
    }

    public void setProjname(String projname) {
        this.projname = projname;
    }

    public Person getProjhead() {
        return projhead;
    }

    public void setProjhead(Person projhead) {
        this.projhead = projhead;
    }

    public Project getIn_proj() {
        return in_proj;
    }

    public void setIn_proj(Project in_proj) {
        this.in_proj = in_proj;
    }

    public List<Person> getPers_proj() {
        return pers_proj;
    }

    public void setPers_proj(List<Person> pers_proj) {
        this.pers_proj = pers_proj;
    }
}
