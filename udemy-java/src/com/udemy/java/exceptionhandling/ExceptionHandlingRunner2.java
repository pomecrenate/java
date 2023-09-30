package com.udemy.java.exceptionhandling;

public class ExceptionHandlingRunner2 {

  public static void main(String[] args) {
    System.out.println("Main Started");
    method1();
    System.out.println("Maind Ended");
  }

  private static void method1() {
    System.out.println("Method1 Started");
    method2();
    System.out.println("Method1 Ended");
  }

  private static void method2() {
    System.out.println("Method2 Started");
    String str = null;
    int[] i = {1, 2};
    try {
      System.out.println("Method2 Running1");
      //      str.length(); // 오류 발생
      int number = i[3];
      System.out.println("Method2 Running2"); // 출력 안 됨
    } catch (NullPointerException ex) {
      System.out.println("Method2 Running3");
      System.out.println("NullPointerException");
      ex.printStackTrace(); // 오류 정보 출력
      System.out.println("Method2 Running4");
    } catch (ArrayIndexOutOfBoundsException ex) {
      System.out.println("Method2 Running5");
      System.out.println("ArrayIndexOutOfBoundsException");
      ex.printStackTrace(); // 오류 정보 출력
      System.out.println("Method2 Running6");
    } catch (IndexOutOfBoundsException ex) {
      System.out.println("Method2 Running7");
      System.out.println("IndexOutOfBoundsException");
      ex.printStackTrace(); // 오류 정보 출력
      System.out.println("Method2 Running8");
    } catch (Exception ex) {
      System.out.println("Method2 Running9");
      System.out.println("Exception");
      ex.printStackTrace(); // 오류 정보 출력
      System.out.println("Method2 Running10");
    }
    System.out.println("Method2 Ended");
  }

}
