package com.udemy.java.data_type;

public class BiNumber {
  // int 자료형 연습
  private int number1;
  private int number2;

  public BiNumber() {

  }

  public BiNumber(int n, int m) {
    this.number1 = n;
    this.number2 = m;
  }

  public int getNumber1() {
    return this.number1;
  }

  public void setNumber1(int number1) {
    this.number1 = number1;
  }

  public int getNumber2() {
    return this.number2;
  }

  public void setNumber2(int number2) {
    this.number2 = number2;
  }

  public int add() {
    return this.number1 + this.number2;
  }

  public int multiply() {
    return this.number1 * this.number2;
  }

  public void doubleValue() {
    setNumber1(this.number1 * 2);
    setNumber2(this.number2 * 2);
  }
}
