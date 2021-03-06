package javaapplication18;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoJavaDB {

    private static Connection instancia = null;

    public static Connection getConnection() throws Exception {
        if (instancia == null) {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            String driverUrl = "jdbc:derby://localhost:1527/2017-3-DCC171";
            instancia = DriverManager.getConnection(driverUrl, "usuario", "senha");
        } 

        return instancia;
    }
}
