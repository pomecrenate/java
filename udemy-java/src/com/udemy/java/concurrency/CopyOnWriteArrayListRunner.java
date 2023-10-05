package com.udemy.java.concurrency;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListRunner {

  public static void main(String[] args) {
    List<String> list = new CopyOnWriteArrayList<>();

    // 삽입하는 Thread 3개
    list.add("Ant");
    list.add("Bat");
    list.add("Cat");

    // 조회하는 Thread 1000개
    for (String element : list) {
      System.out.println(element);
    }
  }

}
