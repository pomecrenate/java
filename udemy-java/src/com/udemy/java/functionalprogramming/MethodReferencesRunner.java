package com.udemy.java.functionalprogramming;

import java.util.List;

public class MethodReferencesRunner {

  public static void main(String[] args) {
    List.of("Ant", "Bat", "Cat", "Dot", "Elephant").stream()
    .map(s -> s.length())
    .forEach(s -> System.out.println(s));

    // 메서드 참조
    List.of("Ant", "Bat", "Cat", "Dot", "Elephant").stream()
    .map(String::length)
    .forEach(System.out::println);

    Integer max1 = List.of(23, 45, 57, 34).stream()
        .filter(n -> n % 2 == 0)
        .max((n1, n2) -> Integer.compare(n1, n2))
        .orElse(0);
    System.out.println(max1);

    // 메서드 참조
    Integer max2 = List.of(23, 45, 57, 34).stream()
        .filter(MethodReferencesRunner::isEven)
        .max(Integer::compare)
        .orElse(0);
    System.out.println(max2);
  }

  public static boolean isEven(Integer number) {
    return number % 2 == 0;
  }

}
