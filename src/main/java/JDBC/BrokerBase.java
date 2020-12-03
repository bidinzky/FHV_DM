package JDBC;

import java.sql.Connection;
import java.util.LinkedList;

public abstract class BrokerBase<T>{
    // Was muss ein Broker können?

    protected Connection conn;

    protected BrokerBase() {
        conn = DbConn.getInstance().getConnection();
    }

    // CRUD
    public abstract boolean insert(T data);
    public abstract LinkedList<T> getAll();
    public abstract T getById(Object id);
    public abstract T update(T data);
    public abstract T delete(Object id);

}
