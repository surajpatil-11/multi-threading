package com.learn.basics;

public class ThreadCreation {
    public static void main(String[] args) {
        MyThread1 thread1 = new MyThread1();
        thread1.start();
        
        MyRunnable runnableTask = new MyRunnable();
        Thread thread2 = new Thread(runnableTask);
        thread2.start();

        Thread threadSimple = new Thread(() -> {
            System.out.println("In thread 3");
        });
        threadSimple.start();
    }
}

//1) By extending thread class

class MyThread1 extends Thread {
    
    @Override
    public void run() {
        System.out.println("In thread 1");
    }
}

//1) By extending thread class

class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("In thread 2");
    }
}