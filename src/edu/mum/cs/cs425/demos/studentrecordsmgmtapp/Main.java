package edu.mum.cs.cs425.demos.studentrecordsmgmtapp;

import edu.mum.cs.cs425.demos.studentrecordsmgmtapp.model.Student;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Student> students = new ArrayList<>();
        Collection<Student> students1 = List.of(
                new Student(110001, "Dave", LocalDate.of(1951,11,18)),
                new Student(110002, "Anna", LocalDate.of(1990,12,07)),
                new Student(110004, "Erjca", LocalDate.of(1974,01,31)),
                new Student(110003, "Carlos", LocalDate.of(2009,8,22)),
                new Student(110005, "Bob", LocalDate.of(1990,03,05))
                );
        students.addAll(students1);
        Collections.sort(students, Comparator.comparingInt(Student::getStudentId));
        System.out.println("All Students---------");
        printListOfStudents(students);
        System.out.println("Platinum Students------------");
        List<Student> platinumStudents = getListOfPlatinumAlumniStudents(students);
        Collections.sort(platinumStudents, Comparator.comparing(Student::getDateOfAdmission).reversed());
        printListOfStudents(platinumStudents);

        List<Integer> integers = List.of(25, 21, 35, 22);
        helloWorld(integers);
        List<Integer> integers1 = new ArrayList<>();
        integers1.add(1);
        integers1.add(2);
        integers1.add(3);
        integers1.add(4);
        integers1.add(5);
        System.out.println(findSecondBiggest(integers1));


    }
    public static void  printListOfStudents(List<Student> students) {
        for (Student student: students) {
            System.out.println(student);
        }
    }
    public static List<Student>  getListOfPlatinumAlumniStudents(List<Student> students) {
        List<Student> platinumStudents = new ArrayList<>();
        for (Student student: students) {
            if(ChronoUnit.YEARS.between(student.getDateOfAdmission(), LocalDate.now()) > 30)
            platinumStudents.add(student);
        }
        return platinumStudents;
    }

    public static void helloWorld(List<Integer> integers) {
        for (Integer i:
             integers) {
            if(i % 5 == 0 && i % 7 == 0) {
                System.out.println("HelloWolrd");
            }else if (i % 7 == 0) {
                System.out.println("World");
            }else if(i % 5 == 0) {
                System.out.println("Hello");
            }
        }
    }
    public static Integer findSecondBiggest(List<Integer> integers) {
        if(integers.size() < 2) {
            return null;
        }
        Collections.sort(integers, Collections.reverseOrder());
        return integers.get(1);
    }
}
