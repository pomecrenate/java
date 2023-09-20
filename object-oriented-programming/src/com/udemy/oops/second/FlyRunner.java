package com.udemy.oops.second;

public class FlyRunner {

  public static void main(String[] args) {
    Flyable[] flyingObjects = {new Bird(), new Aeroplane()};

    for (Flyable flyingObject : flyingObjects) {
      flyingObject.fly();
    }
  }

}
