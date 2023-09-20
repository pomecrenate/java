package com.udemy.oops.second;

public class Customer {

  private String name;
  private Address homeAddress;
  private Address workAddress;

  public Customer() {
  }

  public Customer(String name, Address homeAddress) {
    this.name = name;
    this.homeAddress = homeAddress;
  }

  public Address getHomeAddress() {
    return homeAddress;
  }

  public void setHomeAddress(Address homeAddress) {
    this.homeAddress = homeAddress;
  }

  public Address getWorkAddress() {
    return workAddress;
  }

  public void setWorkAddress(Address workAddress) {
    this.workAddress = workAddress;
  }

  // 이름은 한번 설정하면 바꿀 수 없으므로 setter는 없음
  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "Customer [name=" + name + ", homeAddress=" + homeAddress + ", workAddress="
        + workAddress + "]";
  }

}
