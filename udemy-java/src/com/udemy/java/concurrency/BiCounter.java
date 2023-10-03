package com.udemy.java.concurrency;

public class BiCounter {
  private int i;
  private int j;

  synchronized public void incrementI() {
    i++;
  }

  synchronized public void incrementJ() {
    j++;
    // 여러 메서드가 synchronized 키워드를 쓰면
    // 쓰레드가 하나의 메서드만 사용하고 있더라도
    // 모든 메서드는 그 하나의 쓰레드만 접근 가능
    // 다른 쓰레드는 다른 메서드를 쓰고 싶어도 기다려야 함
  }

  public int getI() {
    return i;
  }

  public int getJ() {
    return j;
  }

}
