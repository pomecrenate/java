package com.udemy.java.concurrency;

public class Counter {
  private int i;

  synchronized public void increment() {
    i++;
    // i++ is not Atomic
    // 1. get i
    // 2. increment i
    // 3. set i
    // 3가지 연산 수행
    // 쓰레드 안전하지 않음
    // synchronized 키워드를 쓰면 메서드를 한 번에 하나의 쓰레드만
    // 실행 가능하므로 쓰레드 안전해짐
  }

  public int getI() {
    return i;
  }

}
