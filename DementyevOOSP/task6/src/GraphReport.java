public class GraphReport extends Report {
    @Override
    protected void gatherData() {
        System.out.println("Сбор данных для графика...");
    }

    @Override
    protected void formatReport() {
        System.out.println("Форматирование графического отчета...");
    }

    @Override
    protected void exportReport() {
        System.out.println("Экспорт графического отчета в формат PNG...");
    }
}
