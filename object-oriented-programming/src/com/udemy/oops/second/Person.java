package com.udemy.oops.second;

public class Person {
  // 필수
  private String name;

  // 선택
  private String email;
  private String phoneNumber;

  public Person() {
    System.out.println("Person Constructor");
  }

  public Person(String name) {
    super();
    this.name = name;
    System.out.println("Person Name Constructor");
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  @Override
  public String toString() {
    return "name=" + name + ", email=" + email + ", phoneNumber=" + phoneNumber;
  }

}
