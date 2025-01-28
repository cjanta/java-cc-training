import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class App 
{
    public static void main(String[] args) {
        String url = "jdbc:sqlite:sample.db";

        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                System.out.println("Connection to SQLite has been established.");

                // Create a new table
                String sql = "CREATE TABLE IF NOT EXISTS users (\n"
                        + " id integer PRIMARY KEY,\n"
                        + " name text NOT NULL,\n"
                        + " capacity real\n"
                        + ");";

                try (Statement stmt = conn.createStatement()) {
                    stmt.execute(sql);
                    System.out.println("Table 'users' created.");
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    /*mvn clean compile exec:java -Dexec.mainClass="com.example.App" */
}