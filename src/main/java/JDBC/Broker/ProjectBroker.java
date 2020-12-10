package JDBC.Broker;

import DB.Project;
import JDBC.BrokerBase;

import java.util.List;

public class ProjectBroker extends BrokerBase<Project> {
    public ProjectBroker() {
        super(Project.class);
    }
}
