package JDBC;


import org.hibernate.SessionFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.*;

public class DbConn {

    private static DbConn single_instance;

    private final EntityManager connection;

    private DbConn(String user, String password) {
        EntityManagerFactory fact = Persistence.createEntityManagerFactory("PersProj");
        connection = fact.createEntityManager();
    }

    private DbConn() {
        this("ITB19_vnn1234", "PW_NNVn");
    }

    public static DbConn getInstance(){
        if (single_instance == null) {
            single_instance = new DbConn();
        }

        return single_instance;
    }

    public EntityManager getConnection() {
        return connection;
    }
}

