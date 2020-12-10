package JDBC;

import DB.*;
import JDBC.Broker.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

public class DbFacade {

    public DbFacade() {
    }

    public static List<Person> getAllPersons(){
        PersonBroker persBro = new PersonBroker();
        return persBro.getAll();
    }

    public static Person getPersonById(Integer id){
        PersonBroker persBro = new PersonBroker();
        return persBro.getById(id);
    }


    private static <T> T save(T val, BrokerBase<T> broker) {
        return broker.update(val);
    }
    
    public static Person save(Person val) {
        return save(val, new PersonBroker());
    }

    public static Department save(Department val) {
        return save(val, new DepartmentBroker());
    }

    public static Project save(Project val) {
        return save(val, new ProjectBroker());
    }

    public static <T> T delete(Object id, BrokerBase<T> broker) {
        return broker.delete(id);
    }

    public static Person delete(Person val) {
        return delete(val.getPersNo(), new PersonBroker());
    }

    public static Department delete(Department val) {
        return delete(val.getDeptNo(), new DepartmentBroker());
    }

    public static Project delete(Project val) {
        return delete(val.getProjNo(), new ProjectBroker());
    }

}
