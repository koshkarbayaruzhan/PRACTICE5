package singleton;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class Logger {

    private static volatile Logger instance;

    private LogLevel level = LogLevel.INFO;
    private String filePath = "app.log";

    private Logger() {
        loadConfig();
    }

    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    public synchronized void log(String msg, LogLevel msgLevel) {
        if (msgLevel.ordinal() < level.ordinal()) return;

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true))) {
            String time = new SimpleDateFormat("HH:mm:ss").format(new Date());
            bw.write(time + " [" + msgLevel + "] " + msg);
            bw.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void setLevel(LogLevel level) {
        this.level = level;
    }

    private void loadConfig() {
        Properties props = new Properties();
        try (FileInputStream fis = new FileInputStream("logger.properties")) {
            props.load(fis);
            level = LogLevel.valueOf(props.getProperty("level", "INFO"));
            filePath = props.getProperty("file", "app.log");
        } catch (Exception ignored) {}
    }
}
