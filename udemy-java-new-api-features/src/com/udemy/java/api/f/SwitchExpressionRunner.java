package com.udemy.java.api.f;

public class SwitchExpressionRunner {

  // 일반 switch문
  public static String findDayOfTheWeek(int dayNumber) {
    String dayOfWeek = "";
    switch(dayNumber) {
      case 0: dayOfWeek = "Sunday"; break;
      case 1: dayOfWeek = "Monday"; break;
      case 2: dayOfWeek = "Tuesday"; break;
      case 3: dayOfWeek = "Wendnesday"; break;
      case 4: dayOfWeek = "Thursday"; break;
      case 5: dayOfWeek = "Friday"; break;
      case 6: dayOfWeek = "Saturday"; break;
      default: throw new IllegalArgumentException("Invalid Option" + dayNumber);
    }
    return dayOfWeek;
  }

  // switch Expression
  // break가 없어도 밀리지 않고 간단해짐
  public static String findDayOfTheWeekWithSwitchExpression(int dayNumber) {
    String dayOfWeek = switch(dayNumber) {
      case 0 -> {
        System.out.println("Do Some Complex Logic Here");
        // 문장이 최종 계산된 값 반환
        yield "Sunday";
      }
      case 1 -> "Monday";
      case 2 -> "Tuesday";
      case 3 -> "Wendnesday";
      case 4 -> "Thursday";
      case 5 -> "Friday";
      case 6 -> "Saturday";
      default -> throw new IllegalArgumentException("Invalid Option" + dayNumber);
    };
    return dayOfWeek;
  }

  public static void main(String[] args) {

  }

}
