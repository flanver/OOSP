public class TableReport extends Report {
    @Override
    protected void gatherData() {
        System.out.println("Сбор данных для таблицы...");
    }

    @Override
    protected void formatReport() {
        System.out.println("Форматирование таблицы...");
    }

    @Override
    protected void exportReport() {
        System.out.println("Экспорт таблицы в формат CSV...");
    }
}
