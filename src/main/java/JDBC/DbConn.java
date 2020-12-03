package JDBC;

import java.sql.*;

public class DbConn {

    private static DbConn single_instance;

    private Connection connection;

    private DbConn(String user, String password) {
        try {
        connection = DriverManager.getConnection("jdbc:oracle:thin:@//elmo.hostingcenter.uclv.net:1521/xepdb1",
                user,
                password);
        } catch (SQLException e) {
            e.printStackTrace();
        }

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

    public Connection getConnection() {
        return connection;
    }
}

