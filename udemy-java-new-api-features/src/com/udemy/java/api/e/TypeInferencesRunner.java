package com.udemy.java.api.e;

import java.util.List;

public class TypeInferencesRunner {

  public static void main(String[] args) {
    List<String> names1 = List.of("Ranga", "Ravi");
    List<String> names2 = List.of("Chan", "Adam");
    // 변수 선언이 복잡해짐
    List<List<String>> names3 = List.of(names1, names2);

    // 타입 추론 도임
    // 변수 타입을 정의하지 않음
    // 컴파일 시에 변수 타입 추론
    // null은 할당 불가
    var names4 = List.of(names1, names2);

    // 함수형 프로그래밍에도 사용 가능
    names4.stream().forEach(System.out::println);

    // 반복문에도 사용 가능
    for(var i = 1; i <= 10; i++) {
      System.out.println(i);
    }
    for(var name : names4) {
      System.out.println(name);
    }
  }

}
