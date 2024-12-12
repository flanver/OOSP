public abstract class Report {
    // Шаблонный метод, задающий общий алгоритм создания отчета
    public final void generateReport() {
        gatherData();
        formatReport();
        exportReport();
    }

    // Шаги, которые должны быть реализованы в подклассах
    protected abstract void gatherData();
    protected abstract void formatReport();
    protected abstract void exportReport();
}
