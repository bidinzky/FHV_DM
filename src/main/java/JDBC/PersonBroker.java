package JDBC;

import DB.Person;

import java.sql.*;
import java.util.LinkedList;

public class PersonBroker extends BrokerBase<Person> {

    @Override
    protected boolean insert(Person data) {
        return false;
    }

    public LinkedList<Person> getAll() {
        LinkedList<DB.Person> outputList = new LinkedList<>();

        try {
            Statement stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM PERSON");

            while (res.next()) {
                DB.Person p = new DB.Person();
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

    @Override
    protected Person getById(Object id) {
        Person output = null;

        try {
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM PERSON WHERE PERSNO=?");
            stmt.setInt(1, (Integer) id);
            ResultSet res = stmt.executeQuery();

            if (res.next()) {
                DB.Person p = new DB.Person();
                p.setPersNo(res.getInt("PERSNO"));
                p.setLastName(res.getString("LNAME"));
                p.setFirstName(res.getString("FNAME"));
                //p.setDepartment(res.getInt("DEPTNO"));
                p.setSalary(res.getBigDecimal("SALARY"));
                //p.setEntryDate(res.getDate("FDATE"));
                //p.setQuitDate(res.getDate("LDATE"));
                //p.setGender(res.getString("GENDER"));
                // TODO add other args and convert types

                output = p;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return output;
    }

    @Override
    protected boolean update(Person data) {
        return false;
    }

    @Override
    protected boolean delete(Object id) {
        return false;
    }
}
