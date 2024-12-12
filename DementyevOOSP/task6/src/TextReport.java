public class TextReport extends Report {
    @Override
    protected void gatherData() {
        System.out.println("Сбор текстовых данных...");
    }

    @Override
    protected void formatReport() {
        System.out.println("Форматирование текстового отчета...");
    }

    @Override
    protected void exportReport() {
        System.out.println("Экспорт текстового отчета в формат TXT...");
    }
}
