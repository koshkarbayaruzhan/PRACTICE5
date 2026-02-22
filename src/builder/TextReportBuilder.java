package builder;

public class TextReportBuilder implements IReportBuilder {

    private Report r = new Report();

    public void setHeader(String h) { r.header = h; }
    public void addSection(String n, String c) { r.sections.add(n + ": " + c); }
    public void setFooter(String f) { r.footer = f; }
    public void setStyle(ReportStyle s) { r.style = s; }

    public Report getReport() { return r; }
}
