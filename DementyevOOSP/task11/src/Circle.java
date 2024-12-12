public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Рисуем круг");
    }

    @Override
    public Shape clone() {
        return new Circle();
    }
}
