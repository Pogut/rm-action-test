public class ReportService {
    public String createReport(String title, int count) {
        return formatHeader(title) + "\nItems: " + count;
    }

    private String formatHeader(String title) {
        return "Report: " + title.toUpperCase();
    }
}

class ReportFormatter {
}
