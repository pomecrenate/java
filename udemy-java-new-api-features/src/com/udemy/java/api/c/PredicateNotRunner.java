package com.udemy.java.api.c;

import java.util.List;
import java.util.function.Predicate;

public class PredicateNotRunner {

  public static boolean isEven(Integer number) {
    return number % 2 == 0;
  }

  public static void main(String[] args) {
    List<Integer> numbers = List.of(2, 3, 6, 324, 43);

    Predicate<Integer> evenNumberPredicate = number -> number % 2 == 0;

    // 일반 Predicate 객체의 not 연산
    numbers.stream()
    .filter(evenNumberPredicate.negate())
    .forEach(System.out::println);

    // 메서드 참조의 not 연산
    numbers.stream()
    .filter(Predicate.not(PredicateNotRunner::isEven))
    .forEach(System.out::println);
  }

}
