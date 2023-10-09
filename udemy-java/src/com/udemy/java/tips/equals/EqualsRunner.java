package com.udemy.java.tips.equals;

import java.util.Objects;

class Client {
  private int id;

  public Client(int id) {
    super();
    this.id = id;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public boolean equals(Object that) {
    if (this == that)
      return true;
    if (that == null)
      return false;
    if (getClass() != that.getClass())
      return false;
    Client other = (Client) that;
    return this.id == other.id;
    // c1.id == c2.id = true
    // c1.id == c3.id = false
  }

}

public class EqualsRunner {

  public static void main(String[] args) {
    Client c1 = new Client(1);
    Client c2 = new Client(1);
    Client c3 = new Client(2);
    // 같은 id라도 별개의 객체이므로 false
    // equals() 오버라이딩하면 true
    System.out.println(c1.equals(c2));
    // 같은 id라도 별개의 객체이므로 false
    // equals() 오버라이딩해도 false
    System.out.println(c1.equals(c3));
  }

}
