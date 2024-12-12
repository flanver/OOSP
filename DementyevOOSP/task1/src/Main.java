public class Main {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.createShape("circle");
        circle.draw();

        Shape triangle = ShapeFactory.createShape("triangle");
        triangle.draw();

        Shape rectangle = ShapeFactory.createShape("rectangle");
        rectangle.draw();
    }
}