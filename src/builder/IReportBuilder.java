package builder;

public interface IReportBuilder {
    void setHeader(String header);
    void addSection(String name, String content);
    void setFooter(String footer);
    void setStyle(ReportStyle style);
    Report getReport();
}
