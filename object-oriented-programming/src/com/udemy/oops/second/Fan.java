package com.udemy.oops.second;

public class Fan {
  // state
  // 필수: 생성자로 값 설정 가능해야 함
  // 값이 불변: setter 필요없음
  private String make;
  private double radius;
  private String color;

  // 선택: 생성자로 값 설정 할 필요없음
  // 값이 변화 가능: setter 필요
  private boolean isOn;
  private byte speed; // 0 ~ 5

  // creation
  public Fan() {

  }

  public Fan(String make, double radius, String color) {
    this.make = make;
    this.radius = radius;
    this.color = color;
  }

  // isOn
  public void switchOn() {
    this.isOn = true;
    setSpeed((byte) 1);
  }

  public void switchOff() {
    this.isOn = false;
    setSpeed((byte) 0);
  }

  // speed
  public byte getSpeed() {
    return speed;
  }

  public void setSpeed(byte speed) {
    this.speed = speed;
  }

  // print the state
  @Override
  public String toString() {
    return "Fan [make=" + make + ", radius=" + radius + ", color=" + color + ", isOn=" + isOn
        + ", speed=" + speed + "]";
  }


}
