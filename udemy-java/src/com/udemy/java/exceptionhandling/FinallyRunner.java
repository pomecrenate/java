package com.udemy.java.exceptionhandling;

import java.util.Scanner;

public class FinallyRunner {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] numbers = {1, 2, 3, 4, 5};

    try {
      int number = numbers[5];
    } catch (Exception e) {
      e.printStackTrace();
    } finally { // 항상 실행됨
      scanner.close(); // scanner가 Null일 경우 IOException 발생 가능
      System.out.println("Scanner Closed");
    }
  }

}
