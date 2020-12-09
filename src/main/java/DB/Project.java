package DB;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Project {
    @Id
    @Column(name = "PROJNO")
    private int projNo;
    @Column(name = "PROJNAME")
    private String name;
    @ManyToMany(mappedBy = "projects")
    private List<Person> members;
    @ManyToOne
    @JoinColumn(name = "PROJHEAD")
    private Person head;
    @ManyToOne
    @JoinColumn(name = "IN_PROJ")
    private Project parentProject;
    @OneToMany(mappedBy = "parentProject")
    private List<Project> subProjects;

    public List<Project> getSubProjects() {
        return subProjects;
    }

    public void setSubProjects(List<Project> subProjects) {
        this.subProjects = subProjects;
    }

    public int getProjNo() {
        return projNo;
    }

    public void setProjNo(int projNo) {
        this.projNo = projNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getHead() {
        return head;
    }

    public void setHead(Person head) {
        this.head = head;
    }

    public Project getParentProject() {
        return parentProject;
    }

    public void setParentProject(Project parentProject) {
        this.parentProject = parentProject;
    }

    public List<Person> getMembers() {
        return members;
    }

    public void setMembers(List<Person> members) {
        this.members = members;
    }

    @Override
    public String toString() {
        return "Project{" +
                "projNo=" + projNo +
                ", name='" + name + '\'' +
                ", members=" + members +
                ", head=" + head +
                ", parentProject='" + (Objects.nonNull(parentProject)?parentProject.name:"") + '\'' +
                ", subProjects=" + subProjects +
                '}';
    }
}
