package com.udemy.java.api.d;

public class StringNewApiRunner {

  public static void main(String[] args) {
    // 문자열이 비었거나 공백만 있을 경우 true 반환
    System.out.println("".isBlank());

    // 양측 공백 제거, trim()과 완전히 같은 역할
    System.out.println(" L R ".strip().replace(" ", "@"));

    // 좌측 공백 제거
    System.out.println(" L R ".stripLeading().replace(" ", "@"));

    // 우측 공백 제거
    System.out.println(" L R ".stripTrailing().replace(" ", "@"));

    // \n으로 구분하여 문자열을 쪼개고 String Stream 반환
    "Line1\nLine2\nLine3".lines().forEach(System.out::println);

    // 람다식으로 문자열 변형
    System.out.println("UPPER".transform(s -> s.substring(2)));

    // 문자열 포맷
    System.out.println("My name is %s%d".formatted("Chan", 1));
  }

}
