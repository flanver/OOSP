public class Main {
    public static void main(String[] args) {
        // Использование фабрики Toyota
        CarComponentFactory toyotaFactory = new ToyotaFactory();
        Engine toyotaEngine = toyotaFactory.createEngine();
        Wheel toyotaWheel = toyotaFactory.createWheel();
        Body toyotaBody = toyotaFactory.createBody();

        System.out.println("Toyota Components:");
        System.out.println(toyotaEngine.getType());
        System.out.println(toyotaWheel.getSize());
        System.out.println(toyotaBody.getShape());

        // Использование фабрики Ford
        CarComponentFactory fordFactory = new FordFactory();
        Engine fordEngine = fordFactory.createEngine();
        Wheel fordWheel = fordFactory.createWheel();
        Body fordBody = fordFactory.createBody();

        System.out.println("Ford Components:");
        System.out.println(fordEngine.getType());
        System.out.println(fordWheel.getSize());
        System.out.println(fordBody.getShape());
    }
}