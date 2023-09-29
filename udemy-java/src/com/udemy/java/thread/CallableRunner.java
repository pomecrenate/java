package com.udemy.java.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTask implements Callable<String> {

  private String name;

  public CallableTask(String name) {
    this.name = name;
  }

  @Override
  public String call() throws Exception {
    Thread.sleep(1000);
    return "Hello " + name;
  }

}

public class CallableRunner {

  public static void main(String[] args) throws InterruptedException, ExecutionException {
    System.out.println("\n Main Started");

    ExecutorService executorService = Executors.newFixedThreadPool(1);
    Future<String> welcomeFuture = executorService.submit(new CallableTask("chan"));
    System.out.println("\n CallableTask Executed");

    // Callable 객체가 값을 반환할 때까지 대기
    String welcomeMessage = welcomeFuture.get();

    System.out.println(welcomeMessage);

    executorService.shutdown();

    System.out.println("\n Main Done");
  }

}
