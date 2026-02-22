package singleton;

import java.io.*;

public class LogReader {

    public static void read(String file, LogLevel filter) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;

        while ((line = br.readLine()) != null) {
            if (line.contains("[" + filter + "]")) {
                System.out.println(line);
            }
        }
    }
}
