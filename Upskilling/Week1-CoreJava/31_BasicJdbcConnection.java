import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class BasicJdbcConnection {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:students.db";

        try (Connection connection = DriverManager.getConnection(url);
             Statement statement = connection.createStatement()) {

            statement.executeUpdate("""
                    CREATE TABLE IF NOT EXISTS students (
                        id INTEGER PRIMARY KEY,
                        name TEXT NOT NULL
                    )
                    """);
            statement.executeUpdate("INSERT OR IGNORE INTO students (id, name) VALUES (1, 'Anita')");

            try (ResultSet resultSet = statement.executeQuery("SELECT id, name FROM students")) {
                while (resultSet.next()) {
                    System.out.println(resultSet.getInt("id") + " - " + resultSet.getString("name"));
                }
            }
        } catch (SQLException exception) {
            System.out.println("Database error: " + exception.getMessage());
            System.out.println("Add a SQLite JDBC driver to the classpath before running this example.");
        }
    }
}
