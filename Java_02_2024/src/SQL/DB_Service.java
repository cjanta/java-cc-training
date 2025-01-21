package SQL;

import java.sql.*;
import java.io.File;

public class DB_Service {

    private String dbPath;

    public DB_Service() {
        // Der Pfad zur Datenbank wird relativ zum Pfad der ausführbaren Datei gesetzt.
        dbPath = new File("").getAbsolutePath() + File.separator + "Datenbank.db";
        initializeDatabase();
    }

    private void initializeDatabase() {
        if (!databaseExists()) {
            createNewDatabase();
            createTable();
        }
    }

    private boolean databaseExists() {
        File dbFile = new File(dbPath);
        return dbFile.exists();
    }

    private void createNewDatabase() {
        try (Connection conn = this.connect()) {
            if (conn != null) {
                System.out.println("Eine neue Datenbank wurde erstellt.");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS Personen ("
                + " id integer PRIMARY KEY,"
                + " name text NOT NULL,"
                + " vorname text NOT NULL"
                + ");";

        try (Connection conn = this.connect(); Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Tabelle 'Personen' wurde erstellt.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private Connection connect() {
        String url = "jdbc:sqlite:" + dbPath;
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public void showAllPersons() {
        String sql = "SELECT id, name, vorname FROM Personen";

        try (Connection conn = this.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            // loop through the result set
            while (rs.next()) {
                System.out.println(rs.getInt("id") + "\t" +
                        rs.getString("name") + "\t" +
                        rs.getString("vorname"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        DB_Service dbService = new DB_Service();
        dbService.showAllPersons();
    }
}
