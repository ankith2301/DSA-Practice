package com.ThreadPractice;

public class DaemonThread implements Runnable {
    @Override
    public void run() {
        while (true) {
            sleep(1000L);
            System.out.println("Running App");
        }
    }

    public void sleep(Long millis) {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new DaemonThread());
        t1.setDaemon(true);
        t1.start();

        try {
            Thread.sleep(10000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
