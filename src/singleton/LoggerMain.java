package main;

import singleton.*;

public class LoggerMain {

    public static void main(String[] args) throws Exception {

        Runnable task = () -> {
            Logger log = Logger.getInstance();
            log.log("Thread work", LogLevel.INFO);
            log.log("Warning detected", LogLevel.WARNING);
            log.log("Critical error", LogLevel.ERROR);
        };

        for (int i = 0; i < 5; i++) {
            new Thread(task).start();
        }

        Thread.sleep(1000);

        LogReader.read("app.log", LogLevel.ERROR);
    }
}
