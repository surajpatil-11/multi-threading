package com.learn.clock;

public class Clock {
    private static Long start = System.currentTimeMillis();

    public static Long currentTime() {
        return (System.currentTimeMillis() - start) / 100;
    }

    public static void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 100);
        }
        catch (InterruptedException e) {
        }
    }
}
