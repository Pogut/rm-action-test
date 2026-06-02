public class ReportService {
    private final ReportFormatter formatter = new ReportFormatter();

    public String createReport(String title, int count) {
        return formatter.formatHeader(title) + "\nItems: " + count;
    }
}

class ReportFormatter {
    public String formatHeader(String title) {
        return "Report: " + title.toUpperCase();
    }
}
