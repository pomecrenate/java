package com.udemy.java.collection;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

// 문자열 길이 순으로 정렬
class StringLengthComparator implements Comparator<String> {

  @Override
  public int compare(String value1, String value2) {
    return Integer.compare(value1.length(), value2.length());
  }

}

public class QueueRunner {

  public static void main(String[] args) {
    Queue<String> queue = new PriorityQueue<>(new StringLengthComparator());
    queue.addAll(List.of("Apple", "Zebra", "Cat", "Monkey"));
    System.out.println(queue);

    System.out.println(queue.poll());
    System.out.println(queue.poll());
    System.out.println(queue.poll());
    System.out.println(queue.poll());
    System.out.println(queue.poll());
  }

}
