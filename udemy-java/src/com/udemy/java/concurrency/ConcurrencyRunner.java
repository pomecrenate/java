package com.udemy.java.concurrency;

public class ConcurrencyRunner {

  public static void main(String[] args) {
    BiCounterWithAtomicInteger counter = new BiCounterWithAtomicInteger();
    counter.incrementI();
    counter.incrementI();
    counter.incrementI();
    System.out.println(counter.getI());
  }

}
