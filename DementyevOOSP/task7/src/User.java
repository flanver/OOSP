public class User {
    private String firstName;
    private String lastName;
    private String email;
    private int age;

    // Конструктор класса User объявлен как private
    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.age = builder.age;
    }

    // Геттеры
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    // Статический класс Builder
    public static class UserBuilder {
        private String firstName;
        private String lastName;
        private String email;
        private int age;

        // Метод для установки имени
        public UserBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        // Метод для установки фамилии
        public UserBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        // Метод для установки электронной почты
        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        // Метод для установки возраста
        public UserBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        // Метод для создания объекта User
        public User build() {
            return new User(this);
        }
    }
}
