package com.udemy.java.iteration;

public class ForPractice {
  // for문 개인 연습
  static void practice() {
    int i;
    for(i = 1; i <= 5; i++) {
      if(i>=3) {
        i++;
      }
      i++;
    }
    System.out.println(i);
  }

  public static void main(String[] args) {
    practice();
  }
}
