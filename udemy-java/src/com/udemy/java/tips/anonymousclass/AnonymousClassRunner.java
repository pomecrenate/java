package com.udemy.java.tips.anonymousclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class LengthComparator implements Comparator<String> {
  // 일반 클래스
  @Override
  public int compare(String str1, String str2) {
    return Integer.compare(str1.length(), str2.length());
  }

}

public class AnonymousClassRunner {

  public static void main(String[] args) {
    List<String> animals = new ArrayList<>(List.of("Bat", "Ant", "Elephant", "Dog", "Cat"));

    //    Collections.sort(animals, new LengthComparator());
    Collections.sort(animals, new Comparator<String>() {
      // 익명 클래스 사용
      @Override
      public int compare(String str1, String str2) {
        return Integer.compare(str1.length(), str2.length());
      }

    });
    System.out.println(animals);
  }

}
