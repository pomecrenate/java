package com.udemy.java.exceptionhandling;

import java.util.Scanner;

public class TryWithResourcesRunner {

  public static void main(String[] args) {
    System.out.println("출력 됨");
    try (Scanner scanner = new Scanner(System.in)) {
      // 자동으로 리소스 반환하므로 scanner.close()가 필요없음
      int[] numbers = {1, 2, 3, 4, 5};
      System.out.println("출력 됨");
      int number = numbers[5];
      System.out.println("출력 안 됨");
    }
    System.out.println("출력 안 됨");
  }

}
