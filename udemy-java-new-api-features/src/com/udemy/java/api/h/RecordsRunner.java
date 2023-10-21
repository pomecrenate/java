package com.udemy.java.api.h;

public class RecordsRunner {

  // 접근자, 생성자, equals(), hashcode(), toString() 모두 자동 생성
  // public으로 생성됨
  // 스태틱 멤버 사용 가능
  // 인스턴스 멤버 사용 불가
  record Person(String name, String email, String phoneNumber) {
    // 커스터마이징 가능
    // 레코드는 컴팩트 생성자를 사용할 수 있다
    Person {
      if (name == null)
        throw new IllegalArgumentException("Name is null");
    }

    public String name() {
      System.out.println("hi");
      return name;
    }
  }

  public static void main(String[] args) {
    Person person1 = new Person("Chan", "11@google.com", "123-213-2132");
    Person person2 = new Person("Chan", "11@google.com", "123-213-2132");
    Person person3 = new Person("Chan2", "11@google.com", "123-213-2132");
    System.out.println(person1);
    System.out.println(person1.equals(person3));
    System.out.println(person1.name());

  }

}
