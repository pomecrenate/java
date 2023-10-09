package com.udemy.java.tips.nestedclass;

class DefaultClass {

}

public class NestedClassRunner {

  int i; // instance variable

  class InnerClass {
    public void method() {
      i = 5;
    }
  }

  static class StaticNestedClass {
    public void method() {
      //      i = 5; // instance member에 접근 불가
    }
  }

  public static void main(String[] args) {
    //    InnerClass innerClass = new InnerClass(); // enclosing class의 instance 없이 생성 불가
    StaticNestedClass staticNestedClass = new StaticNestedClass(); // enclosing class의 instance 없이 생성 가능

    NestedClassRunner nestedClassRunner = new NestedClassRunner(); // enclosing class의 instance 생성
    InnerClass innerClass = nestedClassRunner.new InnerClass(); // 생성 가능해짐
  }

}
