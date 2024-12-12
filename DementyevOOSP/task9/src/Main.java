import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        DatabaseConnectionManager connectionManager = DatabaseConnectionManager.getInstance();

        // Получаем соединение
        Connection connection = connectionManager.getConnection();

        // Здесь можно использовать соединение для выполнения запросов к базе данных

        // Закрываем соединение
        connectionManager.closeConnection();
    }
}