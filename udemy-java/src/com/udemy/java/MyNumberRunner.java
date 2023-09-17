package com.udemy.java;

public class MyNumberRunner {

  public static void main(String[] args) {
    MyNumber number = new MyNumber(3);

    boolean prime = number.isPrime();

    System.out.println(prime);

    int sum = number.sumUptoN();

    System.out.println(sum);

    int sumOfDivisors = number.sumOfDivisors();

    System.out.println(sumOfDivisors);

    number.printANumberTriangle();
  }

}
