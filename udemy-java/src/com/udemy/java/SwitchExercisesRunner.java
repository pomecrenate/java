package com.udemy.java;

public class SwitchExercisesRunner {
  // switch문 연습
  public static void main(String[] args) {
    System.out.println(determineNameOfDay(2));
    System.out.println(determineNameOfMonth(4));
    System.out.println(isWeekDay(2));

  }

  public static boolean isWeekDay(int dayNumber) {
    switch (dayNumber) {
      case 0:
      case 6:
        return true;
      default:
        return false;
    }
  }

  public static String determineNameOfMonth(int monthNumber) {
    switch (monthNumber) {
      case 1:
        return "January";
      case 2:
        return "February";
      case 3:
        return "March";
      case 4:
        return "April";
      case 5:
        return "May";
      case 6:
        return "June";
      case 7:
        return "July";
      case 8:
        return "August";
      case 9:
        return "September";
      case 10:
        return "October";
      case 11:
        return "November";
      case 12:
        return "December";
      default:
        return "Invalid Month";
    }
  }

  public static String determineNameOfDay(int dayNumber) {
    switch (dayNumber) {
      case 0:
        return "Sunday";
      case 1:
        return "Monday";
      case 2:
        return "Tuesday";
      case 3:
        return "Wendnesday";
      case 4:
        return "Thursday";
      case 5:
        return "Friday";
      case 6:
        return "Saturday";
      default:
        return "Invalid day";
    }
  }
}
