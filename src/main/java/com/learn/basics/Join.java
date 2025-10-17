package com.learn.basics;

import com.learn.clock.Clock;

public class Join {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            for (int i = 0 ; i < 5 ; i++) {
                System.out.println("Thread 1 - " + i);
                Clock.sleep(1);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0 ; i < 5 ; i++) {
                System.out.println("Thread 2 - " + i);
                Clock.sleep(1);
            }
        });

        thread1.start();
        thread2.start();

        thread1.join(); // Doesn't proceed untill thread1 completes
        thread2.join();

        System.out.println("Both task completed");
    }
}
