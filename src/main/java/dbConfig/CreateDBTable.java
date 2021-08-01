package dbConfig;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDBTable {

    private final String CREATE_TABLE = "create table USERS (ID int auto_increment primary key, USER_NAME varchar(50) not null, USER_EMAIL varchar(50) not null, USER_COUNTRY varchar(50) not null);";

    public void createTable() {
        try(Connection connection =  DbConnection.getConnection();) {
            Statement statement = connection.createStatement();
            statement.executeUpdate(CREATE_TABLE);
        }catch(SQLException e) {
            e.printStackTrace();
        }
    }

}
