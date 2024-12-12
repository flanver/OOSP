public class Main {
    public static void main(String[] args) {
        HomeAutomationFacade homeAutomation = new HomeAutomationFacade();

        // Начнем вечернюю рутину
        homeAutomation.startEveningRoutine();

        // Закончим вечернюю рутину
        homeAutomation.endEveningRoutine();
    }
}