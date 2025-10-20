package com.learn.basics;

import com.learn.clock.Clock;

public class WaitNotify {
    public static void main(String[] args) {
        // wait can only be called in synchronized block/ method. It release the lock on object and waits
        // untill it reacquire the lock.

        Object obj = new Object();
        Thread waiter = new Thread(() -> {
            synchronized(obj) {
                System.out.println("Going into waiting state...");
                try {
                    obj.wait();
                    System.out.println("Reacquired the lock...");
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        Thread notify = new Thread(() -> {
            synchronized (obj) {
                System.out.println("Under notifier and calling it...");
                obj.notify();
            }
        });

        waiter.start();
        Clock.sleep(1);
        notify.start();
    }
}
