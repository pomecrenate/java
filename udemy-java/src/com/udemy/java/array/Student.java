package com.udemy.java.array;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {
  // 배열 연습
  private String name;
  // 새 객체를 생성하지 않으면 nullpointerexception 에러 발생
  private ArrayList<Integer> marks = new ArrayList<Integer>();

  public Student() {

  }
  // 가변 인수 리팩토링
  public Student(String name, int... marks) {
    this.name = name;
    for (int mark : marks) {
      this.marks.add(mark);
    }
  }

  public int getNumberOfMarks() {
    return marks.size();
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
    return Collections.max(marks);
  }

  public int getMinimumMark() {
    return Collections.min(marks);
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

  // 배열 목록 출력하는 메소드 오버라이딩
  // Runner에서 toString()을 호출하지 않고 객체명만으로 목록 출력 가능
  @Override
  public String toString() {
    return "Student [name=" + name + ", marks=" + marks + "]";
  }

  // 요소 추가, 삭제 기능 추가
  public void addNewMark(int mark) {
    marks.add(mark);
  }

  public void removeMarkAtIndex(int index) {
    marks.remove(index);
  }

}
