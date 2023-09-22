package com.udemy.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Comparator 구현
class DescendingStudentComparator implements Comparator<Student> {

  @Override
  public int compare(Student student1, Student student2) {
    return Integer.compare(student2.getId(), student1.getId());
  }

}

public class StudentsCollectionRunner {

  public static void main(String[] args) {
    List<Student> students = List.of(
        new Student(1, "Ranga"),
        new Student(5, "Chan"),
        new Student(3, "Adam"));

    System.out.println(students);

    List<Student> studentsAl = new ArrayList<>(students);

    Collections.sort(studentsAl);
    System.out.println(studentsAl);

    Collections.sort(studentsAl, new DescendingStudentComparator());
    System.out.println(studentsAl);
  }

}
