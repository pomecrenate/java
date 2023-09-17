package com.udemy.java;

public class MyChar {
  // char 자료형 연습
  private char ch;

  public MyChar() {

  }

  public MyChar(char ch) {
    this.ch = ch;
  }

  public char getCh() {
    return ch;
  }

  public void setCh(char ch) {
    this.ch = ch;
  }

  public boolean isVowel() {
    if(this.ch == 65 ||
        this.ch == 69 ||
        this.ch == 73 ||
        this.ch == 79 ||
        this.ch == 85 ||
        this.ch == 97 ||
        this.ch == 101 ||
        this.ch == 105 ||
        this.ch == 111 ||
        this.ch == 117) {
      return true;
    }
    return false;
  }

  public boolean isConsonant() {
    if(isAlphabet() && !isVowel()) {
      return true;
    }
    return false;
  }

  public boolean isDigit() {
    if(48 <= this.ch && this.ch <= 57) {
      return true;
    }
    return false;
  }

  public boolean isAlphabet() {
    if(65 <= this.ch && this.ch <= 90 ||
        97 <= this.ch && this.ch <= 122) {
      return true;
    }
    return false;
  }

  public static void printLowerCaseAlphabets() {
    for (char ch = 97; ch <= 122; ch++) {
      System.out.println(ch);
    }
  }

  public static void printUpperCaseAlphabets() {
    for (char ch = 65; ch <= 90; ch++) {
      System.out.println(ch);
    }
  }
}
