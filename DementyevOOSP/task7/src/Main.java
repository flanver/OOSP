public class Main {
    public static void main(String[] args) {
        // Создание объекта User с использованием паттерна Builder
        User user = new User.UserBuilder()
                .setFirstName("Иван")
                .setLastName("Иванов")
                .setEmail("ivanov@example.com")
                .setAge(30)
                .build();

        // Вывод информации о пользователе
        System.out.println("Имя: " + user.getFirstName());
        System.out.println("Фамилия: " + user.getLastName());
        System.out.println("Электронная почта: " + user.getEmail());
        System.out.println("Возраст: " + user.getAge());
    }
}