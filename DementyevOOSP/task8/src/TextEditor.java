public class TextEditor {
    private String text;

    public void setText(String text) {
        this.text = text;
        System.out.println("Текст установлен: " + text);
    }

    public String getText() {
        return text;
    }

    // Метод создания снимка
    public Memento save() {
        System.out.println("Сохранение состояния текста.");
        return new Memento(text);
    }

    // Метод восстановления текста из снимка
    public void restore(Memento memento) {
        this.text = memento.getState();
        System.out.println("Восстановление состояния текста: " + text);
    }
}
