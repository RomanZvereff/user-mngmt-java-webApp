package dbConfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/USER_MANAGEMENT";
    private static final String USER_LOGIN = "root";
    private static final String USER_PASSWORD = "root";
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static Connection connection;

    protected static Connection getConnection() {
        try {
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(URL, USER_LOGIN, USER_PASSWORD);
        }catch(ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

}
