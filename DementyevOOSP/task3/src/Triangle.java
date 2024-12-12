public class Triangle extends Shape {
    private double x1, y1, x2, y2, x3, y3;

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3, DrawingAPI drawingAPI) {
        super(drawingAPI);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    public void draw() {
        drawingAPI.drawTriangle(x1, y1, x2, y2, x3, y3);
    }
    public void resize(double percent) {
        // For simplicity, we won't resize triangle in this example
    }
}
