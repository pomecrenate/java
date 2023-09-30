package com.udemy.java.exceptionhandling;

public class ExceptionHandlingRunner {

  public static void main(String[] args) {
    System.out.println("Main Started");
    method1();
    System.out.println("Maind Ended"); // 출력 안 됨
  }

  private static void method1() {
    System.out.println("Method1 Started");
    method2();
    System.out.println("Method1 Ended"); // 출력 안 됨
  }

  private static void method2() {
    System.out.println("Method2 Started");
    String str = null;
    System.out.println("Method2 Running");
    str.length(); // 오류 발생
    System.out.println("Method1 Ended"); // 출력 안 됨
  }

}
