package JDBC.Broker;

import DB.Person;
import JDBC.BrokerBase;
import org.hibernate.Session;

import javax.persistence.Query;
import java.io.Serializable;
import java.util.List;

public class PersonBroker extends BrokerBase<Person> {
    public PersonBroker() {
        super(Person.class);
    }
}
