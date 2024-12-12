public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        TextEditorHistory history = new TextEditorHistory();

        // Устанавливаем текст и сохраняем состояние
        editor.setText("Первый текст");
        history.push(editor.save());

        editor.setText("Второй текст");
        history.push(editor.save());

        editor.setText("Третий текст");

        // Восстанавливаем последнее сохраненное состояние
        Memento lastMemento = history.pop();
        if (lastMemento != null) {
            editor.restore(lastMemento);
        }

        // Восстанавливаем предыдущее состояние
        Memento secondLastMemento = history.pop();
        if (secondLastMemento != null) {
            editor.restore(secondLastMemento);
        }

        // Текущий текст после восстановления
        System.out.println("Текущий текст: " + editor.getText());
    }
}