package DBCONN;

import DB.Person;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
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

        LinkedList<Person> resList = DbFacade.getAllPersons();
        ListIterator<Person> listIterator = resList.listIterator();
        while(listIterator.hasNext()) {
            System.out.println(listIterator.next().toString());
        }

    }
}
