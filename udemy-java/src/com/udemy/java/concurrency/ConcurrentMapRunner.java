package com.udemy.java.concurrency;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentMapRunner {
  // 문자열에서 글자수 세기
  public static void main(String[] args) {
    String str = "ABCD ABCD ABCD";

    // 마침표 제거
    str = str.replace(".", "");

    System.out.println(str);

    // concurrenthashmap 생성
    Map<Character, LongAdder> occurances = new ConcurrentHashMap<>();

    // String -> char arrays
    char[] characters = str.toCharArray();

    // char arrays 반복문 실행
    for(char character : characters) {
      // concurrenthashmap에 char arrays의 element가 key로 존재하면
      // value 반환, key로 존재하지 않으면 null 반환
      // key로 존재하지 않으면 concurrenthashmap에 value = new instance 추가
      // concurrenthashmap에 value += 1로 추가
      occurances.computeIfAbsent(character, ch -> new LongAdder())
      .increment();

      //      LongAdder longAdder = occurances.get(character);
      //
      //      if (longAdder == null) {
      //        longAdder = new LongAdder();
      //      }
      //      longAdder.increment();
      //      occurances.put(character, longAdder);
    }

    // 공백 key 제거
    System.out.println(occurances.remove(' '));

    System.out.println(occurances);
  }

}
