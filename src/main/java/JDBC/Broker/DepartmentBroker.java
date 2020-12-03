package JDBC.Broker;

import java.util.LinkedList;

import DB.Department;
import JDBC.BrokerBase;

public class DepartmentBroker extends BrokerBase<Department> {
    
    @Override
    public boolean insert(Department data) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public LinkedList<Department> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Department getById(Object id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean update(Department data) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean delete(Object id) {
        // TODO Auto-generated method stub
        return false;
    }
    
}
