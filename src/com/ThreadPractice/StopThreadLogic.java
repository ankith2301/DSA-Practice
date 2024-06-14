package com.ThreadPractice;

public class StopThreadLogic implements Runnable{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName()+" Thread Running!!!!");
        while (!isStopRequested()){
            sleep(1000);
            System.out.println(".........");
        }
        System.out.println(Thread.currentThread().getName()+ " Thread Stopped!!!!");
    }
    private boolean stopRequested = false;
    public synchronized void requestStop(){
        this.stopRequested = true;
    }
    public synchronized boolean isStopRequested(){
        return this.stopRequested;
    }
    private void sleep(long millis){
        try {
            Thread.sleep(millis);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        StopThreadLogic s1 = new StopThreadLogic();
        Thread thread = new Thread(s1, "StoppingThreadLogic");
        thread.start();


        try {
            Thread.sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("Requesting Stop");
        s1.requestStop();
        System.out.println("Stop requested");
    }
}
