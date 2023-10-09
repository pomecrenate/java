package com.udemy.java.tips.nonaccess;

final class FinalClass {
  // 하위 클래스를 가질 수 없음
}

//class SubClass extends FinalClass {}

class SomeClass {
  final public void doSomething() {} // 오버라이딩 불가능
  public void doSomethingElse(final int para) {
    // 매개변수 값 변경 불가
    //    para = 5;
  }
}

class ExtendingClass extends SomeClass {
  //  public void doSomething() {}
}

public class FinalNonAccessModifierRunner {

  public static void main(String[] args) {
    final int i; // 1번 할당 뒤 변수값 변경 불가

    i = 8;

    //    i = 9;
  }

}
