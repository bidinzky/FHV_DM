package DBCONN;

import DB.Person;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

public class DbFacade {

    public DbFacade() {
    }

    public static LinkedList<Person> getAllPersons(){

        Connection conn = DbConn.getInstance().getConnection();

        LinkedList<Person> outputList = new LinkedList<>();

        try {

            Statement stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM PERSON");

            while (res.next()) {

                Person p = new Person();
                p.setPersNo(res.getInt("PERSNO"));
                p.setLastName(res.getString("LNAME"));
                p.setFirstName(res.getString("FNAME"));
                //p.setDepartment(res.getInt("DEPTNO"));
                p.setSalary(res.getBigDecimal("SALARY"));
                //p.setEntryDate(res.getDate("FDATE"));
                //p.setQuitDate(res.getDate("LDATE"));
                //p.setGender(res.getString("GENDER"));
                // TODO add other args and convert types

                outputList.add(p);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


        return outputList;
    }

}
