package com.udemy.java.quiz;

import java.util.Arrays;

// 아나그램 체커
// 아나그램: 어떤 단어가 구의 철자를 재배치한 단어나 구
public class StringMagic {
  // str1과 str2가 서로의 아나그램이면 true, 아니면 false 반환
  // 대소문자 구분 X
  // str1이나 str2가 null이면 false 반환
  // str1과 str2가 길이가 다르면 false 반환
  public boolean areAnagrams(String str1, String str2) {

    //str1, str2가 null이면 false 반환
    // null인 상태로 replace() 실행 시 에러 발생
    if (str1 == null || str2 == null) {
      return false;
    }

    // 공백, 마침표, 물음표, 느낌표, 늘임표 제거
    str1 = str1.replace(" ", "");
    str1 = str1.replace(".", "");
    str1 = str1.replace("?", "");
    str1 = str1.replace("!", "");
    str1 = str1.replace("~", "");
    str2 = str2.replace(" ", "");
    str2 = str2.replace(".", "");
    str2 = str2.replace("?", "");
    str2 = str2.replace("!", "");
    str2 = str2.replace("~", "");

    // 모든 대문자는 소문자화
    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();

    // str1, str2 길이다르면 false 반환
    if (str1.length() != str2.length()) {
      return false;
    }

    // character arrays 생성
    char[] characters1 = str1.toCharArray();
    char[] characters2 = str2.toCharArray();

    // character arrays 정렬
    Arrays.sort(characters1);
    Arrays.sort(characters2);

    // character arrays 비교
    return Arrays.equals(characters1, characters2);
  }
}

//    // 같은 문자 수 세기
//    int equalCharacter = 0;
//
//    for (char character1 : characters1) {
//      for (char character2 : characters2) {
//        if (character1 == character2) {
//          equalCharacter += 1;
//        }
//      }
//    }
//
//    // 같은 문자 수가 총 문자 수와 다르면 false 반환
//    if (equalCharacter != str1.length()) {
//      return false;
//    }
//
//    return true;