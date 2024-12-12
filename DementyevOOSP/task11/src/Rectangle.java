public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Рисуем прямоугольник");
    }

    @Override
    public Shape clone() {
        return new Rectangle();
    }
}
