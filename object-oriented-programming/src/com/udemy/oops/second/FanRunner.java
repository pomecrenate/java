package com.udemy.oops.second;

public class FanRunner {

  public static void main(String[] args) {
    Fan fan = new Fan("chan", 15.5, "Red");

    fan.switchOn();
    System.out.println(fan);

    fan.setSpeed((byte) 3);
    System.out.println(fan);

    fan.switchOff();
    System.out.println(fan);
  }

}
