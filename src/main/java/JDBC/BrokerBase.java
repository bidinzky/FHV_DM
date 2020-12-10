package JDBC;

import DB.Person;
import org.hibernate.Session;

import javax.persistence.EntityManager;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

public abstract class BrokerBase<T>{
    // Was muss ein Broker können?

    protected EntityManager conn;
    Class<T> type;
    protected BrokerBase(Class<T> type) {
        conn = DbConn.getInstance().getConnection();
        this.type = type;
    }

    // CRUD
    public boolean insert(T data) {
        return update(data) != null;
    }

    public List<T> getAll() {
        var session = conn.unwrap(Session.class);
        var c = session.getCriteriaBuilder().createQuery(type);
        c.from(type);
        return session.createQuery(c).getResultList();
    }

    public T getById(Object id) {
        var session = conn.unwrap(Session.class);
        return session.get(type, (Serializable) id);
    }

    public T update(T data) {
        var session = conn.unwrap(Session.class);
        var tx = session.beginTransaction();
        session.saveOrUpdate(data);
        tx.commit();
        return data;
    }

    public T delete(Object id) {
        var session = conn.unwrap(Session.class);
        var tx = session.beginTransaction();
        var p = session.get(type, (Serializable) id);
        session.delete(p);
        tx.commit();
        return p;
    }

}
