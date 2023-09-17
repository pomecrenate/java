package com.udemy.java;

import java.util.Scanner;

public class MenuRunner {
  // 모든 조건문 연습
  // Exit 추가 및 do-while 리팩토링
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int choice;
    do {
      System.out.println("Enter Number1: ");
      int number1 = scanner.nextInt();

      System.out.println("Enter Number2: ");
      int number2 = scanner.nextInt();

      System.out.println("Choices Available are ");
      System.out.println("1 - Add");
      System.out.println("2 - Subract");
      System.out.println("3 - Divide");
      System.out.println("4 - Multiply");
      System.out.println("5 - Exit");

      System.out.println("Enter Choice: ");
      choice = scanner.nextInt();

      System.out.println("Your Choices are ");
      System.out.println("Number1: " + number1);
      System.out.println("Number2: " + number2);
      System.out.println("Choice: " + choice);

      performOperationUsingSwitch(number1, number2, choice);
    } while (choice != 5);
  }

  private static void performOperationUsingNestedIfElse
  (int number1, int number2, int choice) {
    if (choice == 1) {
      System.out.println("Result: " + (number1 + number2));
    } else if (choice == 2) {
      System.out.println("Result: " + (number1 - number2));
    } else if (choice == 3) {
      System.out.println("Result: " + (number1 / number2));
    } else if (choice == 4) {
      System.out.println("Result: " + (number1 * number2));
    } else if (choice == 5) {
      System.out.println("Bye!");
    } else {
      System.out.println("Invalid Operation");
    }
  }

  private static void performOperationUsingSwitch
  (int number1, int number2, int choice) {
    switch (choice) {
      case 1:
        System.out.println("Result: " + (number1 + number2));
        break;
      case 2:
        System.out.println("Result: " + (number1 - number2));
        break;
      case 3:
        System.out.println("Result: " + (number1 / number2));
        break;
      case 4:
        System.out.println("Result: " + (number1 * number2));
        break;
      case 5:
        System.out.println("Bye!");
        break;
      default:
        System.out.println("Invalid Operation");
        break;
    }
  }
}
