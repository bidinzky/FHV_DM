package JDBC.Broker;

import DB.Department;
import DB.Person;
import JDBC.BrokerBase;

import java.util.List;

public class DepartmentBroker extends BrokerBase<Department> {
    public DepartmentBroker() {
        super(Department.class);
    }
}
