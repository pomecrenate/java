package com.udemy.java.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread {

  private int number;

  // 생성자를 이용하여 Thread 다양화
  public Task(int number) {
    this.number = number;
  }

  @Override
  public void run() {
    System.out.println("\n Task" + number + " Started");
    for (int i = number * 100; i <= number * 100 + 99; i++) {
      System.out.print(i + " ");
    }
    System.out.println("\n Task" + number + " Done"); // thread 상태: TERMINATED/DEAD
  }

}

public class ExecutorServiceRunner {

  public static void main(String[] args) {
    System.out.println("\n Main Started");
    // 싱글쓰레드
    //    ExecutorService executorService = Executors.newSingleThreadExecutor();
    // 멀티쓰레드
    ExecutorService executorService = Executors.newFixedThreadPool(2);

    // Task1
    executorService.execute(new Task(1));

    // Task2
    executorService.execute(new Task(2));

    // Task3
    executorService.execute(new Task(3));

    // Task4
    executorService.execute(new Task(4));

    // Task5
    executorService.execute(new Task(5));

    executorService.shutdown();

    System.out.println("\n Main Done");
  }

}
