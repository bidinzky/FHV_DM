package DB;

import java.util.List;

public class Project {
    private int projNo;
    private String name;
    private Person head;
    private Project parentProject;
    private List<Person> members;
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
}
