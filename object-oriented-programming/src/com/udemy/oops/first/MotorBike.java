package com.udemy.oops.first;

public class MotorBike {
  //state, 인스턴스 변수
  private int speed; // member variable

  MotorBike() {
    this(5);
  }

  MotorBike(int speed) {
    this.speed = speed;
  }

  //behavior
  public void setSpeed(int speed) { // local variable
    if(speed > 0)
      this.speed = speed;
  }

  public int getSpeed() {
    return this.speed;
  }

  public void increaseSpeed(int howMuch) {
    setSpeed(this.speed + howMuch);
  }

  public void decreaseSpeed(int howMuch) {
    setSpeed(this.speed - howMuch);
  }

  public void start() {
    System.out.println("Bike Started");
  }

}
