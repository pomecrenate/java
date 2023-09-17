package com.udemy.java;

public class MultiplicationTable {
  // 메소드 연습
  void print() {
    print(1);
  }

  void print(int n) {
    print(n, 1, 10);
  }

  void print(int n, int from, int to) {
    for(int i = from; i <= to; i++) {
      System.out.printf("%d * %d = %d", n, i, n*i).println();
    }
  }

}
