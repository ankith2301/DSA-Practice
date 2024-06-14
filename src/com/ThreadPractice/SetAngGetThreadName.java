package com.ThreadPractice;

public class SetAngGetThreadName implements Runnable{
    @Override
    public void run(){
        try {
            Thread.sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Name of the current thread is : "+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new SetAngGetThreadName(), "Thread 1");
        thread1.start();
        Thread thread2 = new Thread(new SetAngGetThreadName(), "Thread 2");
        thread2.start();
    }
}
