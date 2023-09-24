package com.udemy.java.quiz;

public class StringMagicRunner {

  public static void main(String[] args) {
    String str1 = "Ads ~?!.";
    String str2 = "dsa";

    StringMagic stringMagic = new StringMagic();

    boolean anagram = stringMagic.areAnagrams(str1, str2);

    System.out.println(anagram);
  }

}
