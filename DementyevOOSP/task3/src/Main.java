public class Main {
    public static void main(String[] args) {
        DrawingAPI consoleDrawing = new ConsoleDrawingAPI();
        DrawingAPI printerDrawing = new PrinterDrawingAPI();

        Shape circle = new Circle(5, 10, 4, consoleDrawing);
        Shape square = new Square(10, 20, 5, printerDrawing);
        Shape triangle = new Triangle(0, 0, 1, 1, 2, 0, consoleDrawing);

        circle.draw();
        square.draw();
        triangle.draw();

        System.out.println("Resizing circle...");
        circle.resize(1.5);
        circle.draw();
    }
}