public class Adapter implements OldDevice {
    private SmartSocket smartSocket;

    public Adapter(SmartSocket smartSocket) {
        this.smartSocket = smartSocket;
    }

    @Override
    public void switchOn() {
        smartSocket.turnOn();
    }

    @Override
    public void switchOff() {
        smartSocket.turnOff();
    }
}
