package com.udemy.java.iteration;

import java.util.Scanner;

public class DoWhileRepeatedQuestionRunner {
  // do-while문 연습
  public static void main(String[] args) {
    // Scanner는 scanner가 있다면 언제든 반복 사용 가능하므로
    // 반복문에서 제외
    Scanner scanner = new Scanner(System.in);
    // while 조건에서 사용하기 위해 do 밖으로 뺌
    // 초기값이 없으면 Cube is 문에서 오류나므로 초기화
    int number = -1;
    do {
      // 처음 실행 시 초기값 출력 방지
      if (number != -1) {
        System.out.println("Cube is " + number * number * number);
      }
      System.out.println("Enter Number: ");
      number = scanner.nextInt();
    } while (number >= 0);
    System.out.println("Thank You! Have A Fun!");
  }

}
