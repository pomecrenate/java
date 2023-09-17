package com.udemy.java;

public class MyNumber {
  // for문 연습
  private int number;

  public MyNumber() {

  }

  public MyNumber(int number) {
    this.number = number;
  }

  // 소수찾기
  public boolean isPrime() {
    // 음수, 0, 1은 소수 아님
    if (number < 2) {
      return false;
    }

    // 모든 수는 1과 자기 자신으로 나누어지므로
    // 그 외의 수로 나누어지는 값만 제외하면 됨
    for (int i = 2; i <= number - 1; i++) {
      if (number % i == 0) {
        return false;
      }
    }
    return true;
  }

  // 합구하기
  public int sumUptoN() {
    int sum = 0;

    for (int i = 1; i <= number; i++) {
      sum += i;
    }
    return sum;
  }

  // 약수 중 1과 자기 자신을 제외한 합 구하기
  public int sumOfDivisors() {
    int sum = 0;

    for (int i = 2; i <= number - 1; i++) {
      if (number % i == 0) {
        sum += i;
      }
    }
    return sum;
  }

  // 피라미드
  public void printANumberTriangle() {
    for (int i = 1; i <= number; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }
}
