package main;

import builder.*;

public class BuilderMain {

    public static void main(String[] args) {

        ReportDirector d = new ReportDirector();
        ReportStyle style = new ReportStyle("white","black",14);

        IReportBuilder b = new HtmlReportBuilder();
        d.construct(b, style);

        b.getReport().export();
    }
}
