package JDBC;

import DB.Department;
import DB.Person;
import DB.Project;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class MainDbConn {
    //Execute this to test the connection basically
    public static void main(String[] args) {

        /*

        Connection conn = DbConn.getInstance().getConnection();

        try {

            Statement stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery("SELECT LNAME FROM PERSON");

            while (res.next()) {

                Person p = new Person();
                p.setLastName(res.getString("LNAME"));

                System.out.println(p.getLastName());
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


         */

        /*LinkedList<Person> resList = DbFacade.getAllPersons();
        ListIterator<Person> listIterator = resList.listIterator();
        while(listIterator.hasNext()) {
            System.out.println(listIterator.next().toString());
        }

        System.out.println("----");

        System.out.println(DbFacade.getPersonById(728));*/

        EntityManagerFactory fact = Persistence.createEntityManagerFactory("PersProj");
        EntityManager entityManager = fact.createEntityManager();
        var persons = (List<Person>) entityManager.createQuery("from Person ").getResultList();
        for (Person p : persons) {System.out.println(p.toString());}
    }
}
