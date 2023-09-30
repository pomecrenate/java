package com.udemy.java.exceptionhandling;

public class CheckedExceptionRunner {

  public static void main(String[] args) {
    try {
      someOtherMethod1(); // throws로 예외를 main에 떠넘기기 전까지 오류 발생 됨
      Thread.sleep(2000); // InterruptedException 발생
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    //    someOtherMethod2(); // 오류 발생 됨, 예외 처리 필요
    someOtherMethod3(); // 오류 발생 안 됨
  }

  private static void someOtherMethod1() throws InterruptedException {
    Thread.sleep(2000); // InterruptedException 발생
  }

  private static void someOtherMethod2() throws InterruptedException {
    // 점검 예외
  }

  private static void someOtherMethod3() throws RuntimeException {
    // 비점검 예외
  }

}
