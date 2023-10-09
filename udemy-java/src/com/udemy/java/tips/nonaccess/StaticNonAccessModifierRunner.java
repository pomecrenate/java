package com.udemy.java.tips.nonaccess;

class Player {
  private String name; // instance variable
  private static int count; // static variable // instance 간 공유 가능

  public Player(String name) {
    super();
    this.name = name;
    count++;
  }

  public static int getCount() { // static method
    // class 명으로 바로 접근 가능
    // instance member에 접근 불가
    return count;
  }

  public String getName() { // instance method
    // static member에 접근 가능
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}

public class StaticNonAccessModifierRunner {

  public static void main(String[] args) {
    Player player1 = new Player("Ronaldo");
    System.out.println(Player.getCount());

    Player player2 = new Player("Messi");
    System.out.println(Player.getCount());
  }

}
