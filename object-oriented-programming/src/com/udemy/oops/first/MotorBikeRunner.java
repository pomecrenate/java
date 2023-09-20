package com.udemy.oops.first;

public class MotorBikeRunner {

  public static void main(String[] args) {
    MotorBike bmw = new MotorBike(100);
    MotorBike yamaha = new MotorBike();

    System.out.println(bmw.getSpeed());
    System.out.println(yamaha.getSpeed());
    
    bmw.start();
    yamaha.start();

    bmw.increaseSpeed(100);
    yamaha.increaseSpeed(100);

    yamaha.decreaseSpeed(200);

    System.out.println(bmw.getSpeed());
    System.out.println(yamaha.getSpeed());
  }

}
