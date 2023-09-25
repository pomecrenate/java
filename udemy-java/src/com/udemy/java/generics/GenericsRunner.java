package com.udemy.java.generics;

import java.util.List;

public class GenericsRunner {

  // 어떤 매개변수든 받고 그 매개변수와 같은 타입의 변수를 반환한다.
  static <X> X doubleValue(X value) {
    return value;
  }

  // List 클래스의 모든 요소 복사
  static <X extends List> void duplicate(X list) {
    list.addAll(list);
  }

  // Number 클래스의 모든 요소 합산
  // 상한 경계 와일드카드(Upper Bound Wildcard) 사용
  static double sumOfNumberList(List<? extends Number> numbers) {
    double sum = 0.0;
    for (Number number : numbers) {
      sum += number.doubleValue();
    }
    return sum;
  }

  //하한 경계 와일드카드(Lower Bound Wildcard) 사용
  static void addACoupleOfValues(List<? super Number> numbers) {
    numbers.add(1);
    numbers.add(1.0);
    numbers.add(1.0f);
    numbers.add(1l);
  }

  public static void main(String[] args) {
    MyCustomList<String> list1 = new MyCustomList<>();
    list1.addElement("Element 1");
    list1.addElement("Element 2");
    String value = list1.get(0);

    System.out.println(list1);
    System.out.println(value);

    MyCustomList<Integer> list2 = new MyCustomList<>();
    list2.addElement(Integer.valueOf(5));
    list2.addElement(Integer.valueOf(7));
    Integer number = list2.get(0);

    System.out.println(list2);
    System.out.println(number);
  }
}
