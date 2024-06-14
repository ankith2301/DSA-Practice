package com.GarbageCollector;

public class GarbageCollectorPractice {
    public static void main(String[] args) {
        // Create an object and assign it to a reference
        MyClass obj1 = new MyClass(1);

        // Create another object and assign it to another reference
        MyClass obj2 = new MyClass(2);

        // Make obj1 eligible for garbage collection
        obj1 = null;

        // Requesting JVM for running Garbage Collector
        System.gc();

        // Wait for some time to let garbage collector do its job
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Make obj2 eligible for garbage collection
        obj2 = null;

        // Requesting JVM for running Garbage Collector again
        System.gc();

        // Wait for some time to let garbage collector do its job
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class MyClass {
    private int id;

    MyClass(int id) {
        this.id = id;
        System.out.println("Creating MyClass object with id: " + id);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collecting MyClass object with id: " + id);
        super.finalize();
    }
}

