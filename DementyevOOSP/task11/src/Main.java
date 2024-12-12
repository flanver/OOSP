public class Main {
    public static void main(String[] args) {
        // Создание оригиналов фигур
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        // Клонирование фигур
        Shape clonedCircle = circle.clone();
        Shape clonedRectangle = rectangle.clone();

        // Отрисовка оригиналов
        System.out.println("Оригиналы:");
        circle.draw();
        rectangle.draw();

        // Отрисовка клонов
        System.out.println("Клоны:");
        clonedCircle.draw();
        clonedRectangle.draw();
    }
}