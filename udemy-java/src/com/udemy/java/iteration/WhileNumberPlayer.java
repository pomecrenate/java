package com.udemy.java.iteration;

public class WhileNumberPlayer {
  // while문 연습
  private int limit;

  public WhileNumberPlayer() {

  }

  public WhileNumberPlayer(int limit) {
    this.limit = limit;
  }

  public void printSquaresUptoLimit() {
    int i = 1;

    while (i * i <= limit) {
      System.out.print(i * i + " ");
      i++;
    }
    System.out.println();
  }

  public void printCubesUptoLimit() {
    int i = 1;

    while (i * i * i <= limit) {
      System.out.print(i * i * i + " ");
      i++;
    }
    System.out.println();
  }

}