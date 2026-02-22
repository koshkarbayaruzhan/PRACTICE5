package builder;

public class ReportDirector {

    public void construct(IReportBuilder b, ReportStyle s) {
        b.setHeader("Отчет");
        b.addSection("Продажи", "100 000");
        b.addSection("Расходы", "40 000");
        b.setFooter("Конец");
        b.setStyle(s);
    }
}
