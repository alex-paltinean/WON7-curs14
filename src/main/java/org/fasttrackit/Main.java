package org.fasttrackit;

public class Main {
    public static void main(String[] args) {
        System.out.println("This is my first Maven project!");

        Student student = new Student();
        student.setAge(10);
        System.out.println(student.getAge());
    }
}
