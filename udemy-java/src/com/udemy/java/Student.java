package com.udemy.java;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class Student {
  private String name;
  private int[] marks;

  public Student() {

  }

  public Student(String name, int[] marks) {
    this.name = name;
    this.marks = marks;
  }

  public int getNumberOfMarks() {
    return marks.length;
  }

  public int getTotalSumOfMarks() {
    int sum = 0;
    for (int mark : marks) {
      sum += mark;
    }
    return sum;
  }

  // 강의에선 enhanced for문과 if문으로 최댓값, 최솟값을 검색했으나
  // 이게 연산 갯수, 깔끔함 면에서 더 나아보인다.
  public int getMaximumMark() {
    Arrays.sort(marks);
    return marks[marks.length - 1];
  }

  public int getMinimumMark() {
    Arrays.sort(marks);
    return marks[0];
  }

  public BigDecimal getAverageMarks() {
    int sum = getTotalSumOfMarks();
    int number = getNumberOfMarks();

    BigDecimal bigDecimalSum = new BigDecimal(sum);
    BigDecimal bigDecimalNumber = new BigDecimal(number);

    // divide 시, 정확히 값이 떨어지지 않으면 에러 발생
    // 2번째 인자 = 표기할 소수점 자릿수
    // 3번째 인자 = 반올림, 반내림 등
    return bigDecimalSum.divide(bigDecimalNumber, 2, RoundingMode.HALF_UP);
  }

}
