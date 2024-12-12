public class FordFactory implements CarComponentFactory {
    public Engine createEngine() {
        return new FordEngine();
    }

    public Wheel createWheel() {
        return new FordWheel();
    }

    public Body createBody() {
        return new FordBody();
    }
}
