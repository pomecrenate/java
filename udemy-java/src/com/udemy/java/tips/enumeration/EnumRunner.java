package com.udemy.java.tips.enumeration;

import java.util.Arrays;

public class EnumRunner {
  Season season;

  public static void main(String[] args) {
    Season season1 = Season.FALL;

    Season season2 = Season.valueOf("WINTER");

    System.out.println(season2); // WINTER
    System.out.println(season2.name()); // WINTER
    System.out.println(season2.ordinal()); // 0 // 순서가 바뀌면 번호도 바뀜
    System.out.println(Season.values()); // [Lcom.udemy.java.tips.enumeration.Season;@1d81eb93
    System.out.println(Arrays.toString(Season.values())); // [WINTER, SPRING, SUMMER, FALL]
    System.out.println(season2.getValue()); // 1 // 순서에 상관없이 고정
  }

}
