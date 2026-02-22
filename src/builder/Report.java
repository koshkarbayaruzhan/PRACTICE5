package builder;

import java.util.*;

public class Report {

    public String header;
    public String footer;
    public List<String> sections = new ArrayList<>();
    public ReportStyle style;

    public void export() {
        System.out.println("HEADER: " + header);
        sections.forEach(System.out::println);
        System.out.println("FOOTER: " + footer);
        System.out.println("STYLE: " + style.fontColor + " " + style.fontSize);
    }
}
