public class SmartSocket {
    private boolean isOn;

    public void turnOn() {
        isOn = true;
        System.out.println("Умная розетка включена.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Умная розетка выключена.");
    }

    public boolean isOn() {
        return isOn;
    }
}
