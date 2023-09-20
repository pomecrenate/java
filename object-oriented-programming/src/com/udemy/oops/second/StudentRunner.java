package com.udemy.oops.second;

public class StudentRunner {

  public static void main(String[] args) {
    Student student = new Student();

    Employee employee = new Employee("Ranga", "Engineer");
    employee.setEmail("sdfsd@gmail.com");
    employee.setPhoneNumber("010-2342-4343");
    employee.setEmployeeGrade('A');
    employee.setTitle("Programer");

    System.out.println(employee);
  }

}
