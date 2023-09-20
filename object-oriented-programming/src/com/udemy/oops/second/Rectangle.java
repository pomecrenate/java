package com.udemy.oops.second;

import java.math.BigDecimal;

public class Rectangle {
  // 소수점 계산 정확성을 위해 BigDecimal 사용
  private BigDecimal length;
  private BigDecimal width;

  public Rectangle() {

  }

  // 사용자 편의성을 위해 String이 아닌 double로 인수받음
  public Rectangle(double length, double width) {
    // double -> String 변환
    String stringLength = String.valueOf(length);
    String stringWidth = String.valueOf(width);

    // this 대입
    this.length = new BigDecimal(stringLength);
    this.width = new BigDecimal(stringWidth);
  }

  // 넓이
  public BigDecimal area() {
    // length * width
    return length.multiply(width);
  }

  // 둘레
  public BigDecimal perimeter() {
    // (length + width) * 2
    return length.add(width).multiply(new BigDecimal("2"));
  }

  public BigDecimal getLength() {
    return length;
  }

  public void setLength(double length) {
    String stringLength = String.valueOf(length);
    this.length = new BigDecimal(stringLength);
  }

  public BigDecimal getWidth() {
    return width;
  }

  public void setWidth(double width) {
    String stringWidth = String.valueOf(width);
    this.width = new BigDecimal(stringWidth);
  }

  @Override
  public String toString() {
    return "Rectangle [length=" + length + ", width=" + width + ", area=" + area()
    + ", perimeter=" + perimeter() + "]";
  }


}
