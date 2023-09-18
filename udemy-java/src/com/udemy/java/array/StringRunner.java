package com.udemy.java.array;

public class StringRunner {
  // 배열 연습
  // 가장 길이가 긴 값 구하기
  // 역순으로 배열 목록 출력하기
  public static void main(String[] args) {
    String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    String dayWithMostCharacters = "";
    for (String day : daysOfWeek) {
      if (day.length() > dayWithMostCharacters.length()) {
        dayWithMostCharacters = day;
      }
    }
    System.out.println(dayWithMostCharacters);

    for (int i = daysOfWeek.length - 1; i >= 0; i--) {
      System.out.println(daysOfWeek[i]);
    }
  }

}
