import java.util.ArrayList;
import java.util.List;

public class TextEditorHistory {
    private final List<Memento> mementos = new ArrayList<>();

    public void push(Memento memento) {
        mementos.add(memento);
    }

    public Memento pop() {
        if (mementos.isEmpty()) {
            return null;
        }
        return mementos.remove(mementos.size() - 1);
    }
}
