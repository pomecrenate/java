package com.udemy.oops.second;

public class RectangleRunner {

  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle(17.9, 18);

    System.out.println(rectangle);

    rectangle.setLength(20);
    System.out.println(rectangle);

    System.out.println(rectangle.getLength());

    System.out.println(rectangle.area());

    System.out.println(rectangle.perimeter());
  }

}
