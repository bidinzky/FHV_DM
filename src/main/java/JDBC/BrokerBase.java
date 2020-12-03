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
    protected abstract boolean insert(T data);
    protected abstract LinkedList<T> getAll();
    protected abstract T getById(Object id);
    protected abstract boolean update(T data);
    protected abstract boolean delete(Object id);

}
