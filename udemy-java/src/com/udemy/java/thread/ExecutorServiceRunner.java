package com.udemy.java.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceRunner {

  public static void main(String[] args) {
    System.out.println("\n Main Started");

    ExecutorService executorService = Executors.newSingleThreadExecutor();

    // Task1
    executorService.execute(new Task1());

    // Task2
    executorService.execute(new Thread(new Task2()));

    // Task3
    System.out.println("\n Task3 Started");
    for (int i = 301; i <= 399; i++) {
      System.out.print(i + " ");
    }
    System.out.println("\n Task3 Done");

    executorService.shutdown();

    System.out.println("\n Main Done");
  }

}
