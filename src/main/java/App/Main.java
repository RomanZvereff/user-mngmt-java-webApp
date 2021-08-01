package App;

import dbConfig.CreateDBTable;

public class Main {

    public static void main(String[] args) {
        CreateDBTable createDBTable = new CreateDBTable();
        createDBTable.createTable();
    }

}
