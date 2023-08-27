package edu.mum.cs.cs425.demos.studentrecordsmgmtapp.model;

import java.time.LocalDate;

public class Student {

    private int studentId;
    private String name;
    private LocalDate dateOfAdmission;

    public Student() {

    }

    public Student(int studentId, String name, LocalDate dateOfAdmission) {
        this.studentId = studentId;
        this.name = name;
        this.dateOfAdmission = dateOfAdmission;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfAdmission() {
        return dateOfAdmission;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfAdmission(LocalDate dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }

    @Override
    public String toString() {
        return "StudentId => " + studentId + ", Name: " + name + ", Date Of Admission: " + dateOfAdmission;
    }
}
