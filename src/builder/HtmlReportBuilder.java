package builder;

public class HtmlReportBuilder implements IReportBuilder {

    private Report r = new Report();

    public void setHeader(String h) { r.header = "<h1>" + h + "</h1>"; }
    public void addSection(String n, String c) { r.sections.add("<p>" + n + ": " + c + "</p>"); }
    public void setFooter(String f) { r.footer = "<footer>" + f + "</footer>"; }
    public void setStyle(ReportStyle s) { r.style = s; }

    public Report getReport() { return r; }
}
