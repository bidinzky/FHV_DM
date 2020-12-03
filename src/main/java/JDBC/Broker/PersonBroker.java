package JDBC.Broker;

import DB.Person;
import JDBC.BrokerBase;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class PersonBroker extends BrokerBase<Person> {

    @Override
    public boolean insert(Person data) {
        return false;
    }

    private LinkedList<Person> stmtToPerson(ResultSet res) throws SQLException {
        LinkedList<Person> out = new LinkedList<>();
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
            out.add(p);
        }
        return out;
    }

    public LinkedList<Person> getAll() {
        LinkedList<DB.Person> outputList = new LinkedList<>();

        try {
            Statement stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM PERSON");
            outputList = stmtToPerson(res);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return outputList;
    }

    @Override
    public Person getById(Object id) {
        try {
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM PERSON WHERE PERSNO=?");
            stmt.setInt(1, (Integer) id);
            ResultSet res = stmt.executeQuery();
            return stmtToPerson(res).pollFirst();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public Person update(Person data) {
        try {
            PreparedStatement stmt = conn.prepareStatement("UPDATE PERSON SET firstName = ?, lastName = ?,  salary = ? where persNo = ?");
            stmt.setString(1, data.getFirstName());
            stmt.setString(2, data.getLastName());
            stmt.setBigDecimal(3, data.getSalary());
            stmt.setInt(4, data.getPersNo());
            ResultSet res = stmt.executeQuery();
            return stmtToPerson(res).pollFirst();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public Person delete(Object id) {
        try {
            PreparedStatement stmt = conn.prepareStatement("UPDATE PERSON where persNo = ?");
            stmt.setInt(1, (Integer) id);
            ResultSet res = stmt.executeQuery();
            return stmtToPerson(res).pollFirst();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
