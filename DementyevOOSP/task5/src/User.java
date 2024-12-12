import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<Observer> observers = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    public void follow(Observer observer) {
        observers.add(observer);
    }

    public void unfollow(Observer observer) {
        observers.remove(observer);
    }

    public void publishPost(String post) {
        notifyObservers(name + " опубликовал пост: " + post);
    }

    public void comment(String comment) {
        notifyObservers(name + " прокомментировал: " + comment);
    }

    public void like(String post) {
        notifyObservers(name + " лайкнул пост: " + post);
    }

    private void notifyObservers(String activity) {
        for (Observer observer : observers) {
            observer.update(activity);
        }
    }

    public String getName() {
        return name;
    }
}
