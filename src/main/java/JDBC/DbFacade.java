package JDBC;

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
        PersonBroker persBro = new PersonBroker();
        return persBro.getAll();
    }

    public static Person getPersonById(Integer id){
        PersonBroker persBro = new PersonBroker();
        return persBro.getById(id);
    }
}
