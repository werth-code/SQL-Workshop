package werth.matt;

import java.sql.*;
import java.util.UUID;

// TODO: 1/4/21 This connects us to a docker container we set up with mysql on port 3306

public class App {

    public void startConnection() {
        try{
            Connection connection = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/cdDb?createDatabaseIfNotExist=true&useSSL=false", "developer01", "pass");
            System.out.println("Successful Connection!");
            connection.setAutoCommit(false);
        }
        catch (Exception e) {
            System.out.println("FAILED CONNECTION! " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        App app = new App();
        app.startConnection();
    }


}
