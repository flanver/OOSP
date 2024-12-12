public class Main {
    public static void main(String[] args) {
        // Создаем отдельные графические объекты
        Graphic circle = new Circle();
        Graphic square = new Square();
        Graphic triangle = new Triangle();

        // Создаем композитный объект
        CompositeGraphic compositeGraphic = new CompositeGraphic();
        compositeGraphic.add(circle);
        compositeGraphic.add(square);
        compositeGraphic.add(triangle);

        // Рисуем компоненты
        System.out.println("Drawing composite graphic:");
        compositeGraphic.draw();

        // Создаем ещё один уровень компоновки
        CompositeGraphic biggerComposite = new CompositeGraphic();
        biggerComposite.add(compositeGraphic);
        biggerComposite.add(new Circle());

        // Рисуем более крупный композитный объект
        System.out.println("Drawing bigger composite graphic:");
        biggerComposite.draw();
    }
}