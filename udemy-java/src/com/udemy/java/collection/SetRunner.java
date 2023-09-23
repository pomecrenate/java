package com.udemy.java.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {

  public static void main(String[] args) {
    List<Character> characters = List.of('A', 'Z', 'A', 'B', 'Z', 'F');
    System.out.println(characters);
    // unique = Set
    // Tree
    // Hash
    // LinkedHash
    // Collection 생성자 사용
    
    // 정렬 순서
    Set<Character> treeSet = new TreeSet<>(characters);
    System.out.println(treeSet);

    // 순서 없음
    Set<Character> hashSet = new HashSet<>(characters);
    System.out.println(hashSet);

    // 삽입 순서
    Set<Character> linkedHashSet = new LinkedHashSet<>(characters);
    System.out.println(linkedHashSet);
  }

}
