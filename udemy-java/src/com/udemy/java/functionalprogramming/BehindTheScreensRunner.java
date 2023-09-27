package com.udemy.java.functionalprogramming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class EvenNumberPredicate implements Predicate<Integer> {

  @Override
  public boolean test(Integer number) {
    return number % 2 == 0;
  }

}

class SystemOutConsumer implements Consumer<Integer> {

  @Override
  public void accept(Integer number) {
    System.out.println(number);
  }

}

class NumberSquareMapper implements Function<Integer, Integer> {

  @Override
  public Integer apply(Integer number) {
    return number * number;
  }

}

public class BehindTheScreensRunner {

  public static void main(String[] args) {
    List.of(23, 43, 34, 45, 36, 48).stream()
    .filter(createEvenPredicate())
    .map(n -> n * n)
    .forEach(e -> System.out.println(e));

    List.of(23, 43, 34, 45, 36, 48).stream()
    .filter(new EvenNumberPredicate())
    .map(new NumberSquareMapper())
    .forEach(new SystemOutConsumer());

    // 메서드를 변수로 저장
    Predicate<? super Integer> evenPredicate = createEvenPredicate();
    Predicate<? super Integer> oddPredicate = createOddPredicate();

    List.of(23, 43, 34, 45, 36, 48).stream()
    .filter(evenPredicate) // 메서드를 매개변수로 사용
    .map(n -> n * n)
    .forEach(e -> System.out.println(e));
  }

  private static Predicate<? super Integer> createOddPredicate() {
    return n -> n % 2 == 1; // 메서드를 리턴값으로 사용
  }

  private static Predicate<? super Integer> createEvenPredicate() {
    return n -> n % 2 == 0; // 메서드를 리턴값으로 사용
  }

}
