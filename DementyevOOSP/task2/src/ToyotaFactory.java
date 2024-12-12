public class ToyotaFactory implements CarComponentFactory {
    public Engine createEngine() {
        return new ToyotaEngine();
    }

    public Wheel createWheel() {
        return new ToyotaWheel();
    }

    public Body createBody() {
        return new ToyotaBody();
    }
}
