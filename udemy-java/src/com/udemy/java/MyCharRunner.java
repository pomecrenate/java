package com.udemy.java;

public class MyCharRunner {

  public static void main(String[] args) {
    MyChar myChar = new MyChar('A');
    System.out.println(myChar.isVowel());
    myChar.isConsonant();
    System.out.println(myChar.isDigit());
    System.out.println(myChar.isAlphabet());
    MyChar.printLowerCaseAlphabets();
    MyChar.printUpperCaseAlphabets();
  }

}
