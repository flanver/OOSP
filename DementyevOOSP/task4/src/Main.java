public class Main {
    public static void main(String[] args) {
        // Создаем умную розетку
        SmartSocket smartSocket = new SmartSocket();

        // Создаем адаптер для управления умной розеткой
        OldDevice adapter = new Adapter(smartSocket);

        // Управляем умной розеткой через адаптер
        adapter.switchOn();  // Включаем умную розетку
        adapter.switchOff(); // Выключаем умную розетку
    }
}