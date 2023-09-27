package com.udemy.java.functionalprogramming;

import java.util.List;
import java.util.stream.IntStream;

public class FPNumberRunner {

  public static void main(String[] args) {
    List<Integer> numbers = List.of(4, 6, 8, 13, 3, 15);


    numbers.stream()
    .forEach(element -> System.out.println(element));

    //    normalSum(numbers);

    int sum = fpSum(numbers);

    System.out.println(sum);

    // 숫자 제곱
    IntStream.range(1, 11)
    .map(element -> element * element)
    .forEach(element -> System.out.println(element));

    // 문자열 소문자화
    List.of("Apple", "Bat", "Cat", "Dog").stream()
    .map(element -> element.toLowerCase())
    .forEach(element -> System.out.println(element));

    // 문자열 길이 출력
    List.of("Apple", "Bat", "Cat", "Dog").stream()
    .map(element -> element.length())
    .forEach(element -> System.out.println(element));
  }

  private static int fpSum(List<Integer> numbers) {
    return numbers.stream()
        .filter(number -> number % 2 == 1)
        .reduce(0, (number1, number2) -> number1 + number2);
  }

  private static int normalSum(List<Integer> numbers) {
    int sum = 0;
    for (int number : numbers) {
      sum += number;
    }
    return sum;
  }

}
