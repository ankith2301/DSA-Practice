package com.ThreadPractice;

public class CreatingThreads {
    static class Type1 extends Thread {
        @Override
        public void run() {
            System.out.println("Thread Executed Type1!!! by c");
        }
    }

    static class Type2 implements Runnable{
        @Override
        public void run(){
            System.out.println("Thread Execution of Type2!!! implementing Runnable interface");
        }
    }

    public static void main(String[] args) {
        Type1 t1 = new Type1();
        t1.start();

        Thread t2 = new Thread(new Type2());
        t2.start();

        Runnable runnable1 = new Runnable(){
            @Override
            public void run(){
                System.out.println("Thread Execution of Type3!!!! implementing runnable interface with ananonymous class");
            }
        };
        Thread t3 = new Thread(runnable1);
        t3.start();

        Runnable runnable2 = ()->{
            System.out.println("Thread Execution of Type4!!! implementing runnable interface with lamda expression");
        };
        Thread t4 = new Thread(runnable2);
        t4.start();


    }
}
