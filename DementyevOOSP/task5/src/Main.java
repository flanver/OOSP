public class Main {
    public static void main(String[] args) {
        User user1 = new User("Алексей");
        User user2 = new User("Мария");

        NotificationService notificationService1 = new NotificationService("Иван");
        NotificationService notificationService2 = new NotificationService("Елена");

        user1.follow(notificationService1);
        user1.follow(notificationService2);
        user2.follow(notificationService1);

        user1.publishPost("Новый пост о программировании");
        user2.comment("Согласен с тобой!");
        user1.like("Пост о Java паттернах");

        user1.unfollow(notificationService1);

        user2.publishPost("Обновление в проекте");
    }
}