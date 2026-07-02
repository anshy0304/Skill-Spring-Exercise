import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

class StudentDAO {
    private final String url;

    StudentDAO(String url) {
        this.url = url;
    }

    void createTable() throws SQLException {
        String sql = """
                CREATE TABLE IF NOT EXISTS students (
                    id INTEGER PRIMARY KEY,
                    name TEXT NOT NULL,
                    marks INTEGER NOT NULL
                )
                """;

        try (Connection connection = DriverManager.getConnection(url);
             Statement statement = connection.createStatement()) {
            statement.executeUpdate(sql);
        }
    }

    void insertStudent(int id, String name, int marks) throws SQLException {
        String sql = "INSERT INTO students (id, name, marks) VALUES (?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(url);
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, name);
            preparedStatement.setInt(3, marks);
            preparedStatement.executeUpdate();
        }
    }

    void updateStudent(int id, String name, int marks) throws SQLException {
        String sql = "UPDATE students SET name = ?, marks = ? WHERE id = ?";

        try (Connection connection = DriverManager.getConnection(url);
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, marks);
            preparedStatement.setInt(3, id);
            preparedStatement.executeUpdate();
        }
    }
}

class StudentDAOExample {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO("jdbc:sqlite:students.db");

        try {
            dao.createTable();
            dao.insertStudent(1, "Anita", 91);
            dao.updateStudent(1, "Anita Sharma", 95);
            System.out.println("Student inserted and updated.");
        } catch (SQLException exception) {
            System.out.println("Database error: " + exception.getMessage());
            System.out.println("Add a SQLite JDBC driver to the classpath before running this example.");
        }
    }
}
