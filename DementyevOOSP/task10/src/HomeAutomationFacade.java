public class HomeAutomationFacade {
    private Light light;
    private Thermostat thermostat;
    private AudioSystem audioSystem;

    public HomeAutomationFacade() {
        this.light = new Light();
        this.thermostat = new Thermostat();
        this.audioSystem = new AudioSystem();
    }

    public void startEveningRoutine() {
        light.turnOn();
        thermostat.setTemperature(22);
        audioSystem.turnOn();
        audioSystem.setVolume(5);
        System.out.println("Вечерняя рутина начата.");
    }

    public void endEveningRoutine() {
        light.turnOff();
        audioSystem.turnOff();
        System.out.println("Вечерняя рутина завершена.");
    }
}
