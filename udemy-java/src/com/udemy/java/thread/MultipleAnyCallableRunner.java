package com.udemy.java.thread;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultipleAnyCallableRunner {

  public static void main(String[] args) throws InterruptedException, ExecutionException {
    System.out.println("\n Main Started");

    ExecutorService executorService = Executors.newFixedThreadPool(3);

    List<CallableTask> tasks = List.of(new CallableTask("chan"),
        new CallableTask("ranga"),
        new CallableTask("adam"));

    System.out.println("\n CallableTask Executed");

    // Callable 객체가 값을 반환할 때까지 대기
    String welcomeMessage = executorService.invokeAny(tasks);

    System.out.println(welcomeMessage);

    executorService.shutdown();

    System.out.println("\n Main Done");
  }

}
