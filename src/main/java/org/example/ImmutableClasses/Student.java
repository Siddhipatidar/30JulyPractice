package org.example.ImmutableClasses;

import java.time.LocalDate;

//Suppose you want to represent a student's permanent details (ID, name, admission date).
public final class Student {
    private final  int id;
    private final String name;
    private final LocalDate admissionDate;

    public Student(int id, String name, LocalDate admissionDate) {
        this.id = id;
        this.name = name;
        this.admissionDate=admissionDate;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public LocalDate getAdmissionDate() {
        return admissionDate;
    }

    public static void main(String[] args) {
        Student std=new Student(1,"siddhi", LocalDate.of(2025, 7, 30));
        System.out.println( std.getAdmissionDate());
       // std.id=2; -> Compilation error
       // System.out.println( std.id);
    }
}

//if we try to get values then we will get compile time error
