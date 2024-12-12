public class ShapeFactory {
    public static Shape createShape(String shapeType) {
        switch (shapeType.toLowerCase()) {
            case "circle":
                return new Circle();
            case "triangle":
                return new Triangle();
            case "rectangle":
                return new Rectangle();
            default:
                throw new IllegalArgumentException("Неизвестный тип фигуры: " + shapeType);
        }
    }
}
