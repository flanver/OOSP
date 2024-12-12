public class NotificationService implements Observer {
    private String username;

    public NotificationService(String username) {
        this.username = username;
    }

    @Override
    public void update(String activity) {
        System.out.println("Уведомление для " + username + ": " + activity);
    }
}
