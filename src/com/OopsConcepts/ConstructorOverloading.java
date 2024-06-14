package com.OopsConcepts;

public class ConstructorOverloading {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1);
    }
}

class Student {
    Integer rollNum;
    String name;
    Float marks;

    Student() {
        this(1, "Ankith", 95f);
    }

    Student(Integer rollNum, String name, Float marks) {
        this.rollNum = rollNum;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Rollnum : "+ this.rollNum + "\nName : "+ this.name + "\nMarks : "+this.marks;
    }
}
