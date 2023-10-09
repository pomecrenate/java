package com.udemy.java.tips.blocks;

public class BlocksRunner {

  int j; // 멤버 변수: 인스턴스 변수는 할당없어도 디폴트 값 존재
  static int k; // 멤버 변수: 스태틱 변수(클래스 변수)는 할당없어도 디폴트 값 존재

  public static void main(String[] args) {
    if(3 > 2) {
      System.out.println("3 > 2");
    } // 중괄호 안에 있는 코드

    {
      int i = 0; // 지역 변수는 할당해줘야 함
      System.out.println(i);
    }
    // System.out.println(i); // 선언된 블록이 아니라 에러
    // System.out.println(j); // 스태틱 변수가 아니라 에러
    System.out.println(k);
  }

}
