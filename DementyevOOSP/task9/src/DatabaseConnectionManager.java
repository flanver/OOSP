import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager {
    private static DatabaseConnectionManager instance;
    private Connection connection;

    // Параметры подключения к базе данных
    private String url = "jdbc:mysql://localhost:3306/your_database"; // Замените на ваш URL
    private String username = "your_username"; // Замените на ваше имя пользователя
    private String password = "your_password"; // Замените на ваш пароль

    private DatabaseConnectionManager() {
        try {
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Соединение с базой данных установлено.");
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Не удалось установить соединение с базой данных.", e);
        }
    }

    public static DatabaseConnectionManager getInstance() {
        if (instance == null) {
            synchronized (DatabaseConnectionManager.class) {
                if (instance == null) {
                    instance = new DatabaseConnectionManager();
                }
            }
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }

    public void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Соединение с базой данных закрыто.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
