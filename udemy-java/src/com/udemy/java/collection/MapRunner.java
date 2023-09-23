package com.udemy.java.collection;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {
  // 문자열에서 글자수, 단어수 세기
  public static void main(String[] args) {
    String str = "This is an awesome occasion. "
        + "This has never happened before.";

    // 마침표 제거
    str = str.replace(".", "");

    System.out.println(str);

    // 글자수 세기
    // hashmap 생성
    Map<Character, Integer> occurances = new HashMap<>();

    // String -> char arrays
    char[] characters = str.toCharArray();

    // char arrays 반복문 실행
    for(char character : characters) {
      // hashmap에 char arrays의 element가 key로 존재하면
      // value 반환, key로 존재하지 않으면 null 반환
      Integer integer = occurances.get(character);

      // key로 존재하지 않으면 hashmap에 value = 1로 추가
      // key로 존재하면 hashmap에 value += 1로 추가
      if (integer == null) {
        occurances.put(character, 1);
      } else {
        occurances.put(character, integer + 1);
      }
    }

    // 공백 key 제거
    System.out.println(occurances.remove(' '));

    System.out.println(occurances);

    // 단어수 세기
    // hashmap 생성
    Map<String, Integer> stringOccurances = new HashMap<>();

    // String -> 공백을 기준으로 String arrays 생성
    String[] words = str.split(" ");

    // String arrays 반복문 실행
    for(String word : words) {
      // hashmap에 String arrays의 element가 key로 존재하면
      // value 반환, key로 존재하지 않으면 null 반환
      Integer integer = stringOccurances.get(word);

      // key로 존재하지 않으면 hashmap에 value = 1로 추가
      // key로 존재하면 hashmap에 value += 1로 추가
      if (integer == null) {
        stringOccurances.put(word, 1);
      } else {
        stringOccurances.put(word, integer + 1);
      }
    }

    System.out.println(stringOccurances);
  }

}
