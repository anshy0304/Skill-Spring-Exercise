import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

class TransactionHandlingJdbc {
    static void transfer(Connection connection, int fromAccountId, int toAccountId, double amount) throws SQLException {
        String debitSql = "UPDATE accounts SET balance = balance - ? WHERE id = ? AND balance >= ?";
        String creditSql = "UPDATE accounts SET balance = balance + ? WHERE id = ?";

        try (PreparedStatement debit = connection.prepareStatement(debitSql);
             PreparedStatement credit = connection.prepareStatement(creditSql)) {
            debit.setDouble(1, amount);
            debit.setInt(2, fromAccountId);
            debit.setDouble(3, amount);

            int debitedRows = debit.executeUpdate();
            if (debitedRows != 1) {
                throw new SQLException("Debit failed. Check account balance.");
            }

            credit.setDouble(1, amount);
            credit.setInt(2, toAccountId);

            int creditedRows = credit.executeUpdate();
            if (creditedRows != 1) {
                throw new SQLException("Credit failed. Check destination account.");
            }
        }
    }

    public static void main(String[] args) {
        String url = "jdbc:sqlite:bank.db";

        try (Connection connection = DriverManager.getConnection(url);
             Statement statement = connection.createStatement()) {
            statement.executeUpdate("""
                    CREATE TABLE IF NOT EXISTS accounts (
                        id INTEGER PRIMARY KEY,
                        balance REAL NOT NULL
                    )
                    """);
            statement.executeUpdate("INSERT OR IGNORE INTO accounts (id, balance) VALUES (1, 1000.0)");
            statement.executeUpdate("INSERT OR IGNORE INTO accounts (id, balance) VALUES (2, 500.0)");

            connection.setAutoCommit(false);
            try {
                transfer(connection, 1, 2, 250.0);
                connection.commit();
                System.out.println("Transfer completed successfully.");
            } catch (SQLException exception) {
                connection.rollback();
                System.out.println("Transfer failed. Transaction rolled back: " + exception.getMessage());
            } finally {
                connection.setAutoCommit(true);
            }
        } catch (SQLException exception) {
            System.out.println("Database error: " + exception.getMessage());
            System.out.println("Add a SQLite JDBC driver to the classpath before running this example.");
        }
    }
}
