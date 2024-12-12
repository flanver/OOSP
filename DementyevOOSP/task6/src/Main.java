public class Main {
    public static void main(String[] args) {
        Report graphReport = new GraphReport();
        graphReport.generateReport();

        System.out.println(); // Разделитель для вывода

        Report textReport = new TextReport();
        textReport.generateReport();

        System.out.println(); // Разделитель для вывода

        Report tableReport = new TableReport();
        tableReport.generateReport();
    }
}