public class PrinterDrawingAPI implements DrawingAPI {
    public void drawCircle(double x, double y, double radius) {
        System.out.println("Printer: Circle at (" + x + ", " + y + ") with radius " + radius);
    }

    public void drawSquare(double x, double y, double side) {
        System.out.println("Printer: Square at (" + x + ", " + y + ") with side " + side);
    }

    public void drawTriangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        System.out.println("Printer: Triangle with vertices (" + x1 + ", " + y1 + "), (" + x2 + ", " + y2 + "), (" + x3 + ", " + y3 + ")");
    }
}