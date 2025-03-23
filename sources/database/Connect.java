
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {

    private static final String userName = "root";
    private static final String password = "Root1+-%";
    private static final String connString = "jdbc:mysql://localhost:3306/storejava?useSSL=false&serverTimezone=UTC";

    public Connect() {}

    public Connection getConnection(){
        Connection conn = null;
        try {
            // Charger le driver MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Établir la connexion
            conn = DriverManager.getConnection(connString, userName, password);
            System.out.println("Connexion réussie !");
        } catch (ClassNotFoundException e) {
            System.out.println("Erreur : Driver MySQL introuvable !");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Erreur SQL : " + e.getMessage());
            e.printStackTrace();
        }

        return conn;
    }
}
