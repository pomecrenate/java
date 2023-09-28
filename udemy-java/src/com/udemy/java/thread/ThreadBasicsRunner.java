package com.udemy.java.thread;

class Task1 extends Thread {

  @Override
  public void run() {
    System.out.println("\n Task1 Started");
    for (int i = 101; i <= 199; i++) {
      System.out.print(i + " ");
    }
    System.out.println("\n Task1 Done"); // thread 상태: TERMINATED/DEAD
  }

}

class Task2 implements Runnable {

  @Override
  public void run() {
    System.out.println("\n Task2 Started");
    for (int i = 201; i <= 299; i++) {
      System.out.print(i + " ");
    }
    System.out.println("\n Task2 Done"); // thread 상태: TERMINATED/DEAD
  }

}

public class ThreadBasicsRunner {

  public static void main(String[] args) throws InterruptedException {
    System.out.println("\n Main Started");

    // Task1
    Task1 task1Thread = new Task1(); // thread 상태: NEW
    task1Thread.setPriority(1);
    task1Thread.start();

    // Task2
    Task2 task2Runnable = new Task2();
    Thread task2Thread = new Thread(task2Runnable); // thread 상태: NEW
    task2Thread.setPriority(10);
    task2Thread.start();

    // task1 실행 완료 시까지 아래 코드 실행 보류
    task1Thread.join();

    // Task3
    System.out.println("\n Task3 Started");
    for (int i = 301; i <= 399; i++) {
      System.out.print(i + " ");
    }
    System.out.println("\n Task3 Done");

    System.out.println("\n Main Done");
  }

}
