package com.udemy.java.array;

import java.math.BigDecimal;

public class StudentRunner {

  public static void main(String[] args) {
    int[] marks = {98, 89, 100};

    Student student = new Student("chan", marks);

    int number = student.getNumberOfMarks();
    System.out.println(number);

    int sum = student.getTotalSumOfMarks();
    System.out.println(sum);

    int maximumMark = student.getMaximumMark();
    System.out.println(maximumMark);

    int minimumMark = student.getMinimumMark();
    System.out.println(minimumMark);

    BigDecimal average = student.getAverageMarks();
    System.out.println(average);

  }

}
