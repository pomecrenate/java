package com.udemy.oops.second;

public class Address {
  private String basicAddress;
  private String detailAddress;
  private String zipCode;

  public Address() {
  }

  public Address(String basicAddress, String detailAddress, String zipCode) {
    super();
    this.basicAddress = basicAddress;
    this.detailAddress = detailAddress;
    this.zipCode = zipCode;
  }

  @Override
  public String toString() {
    return basicAddress + " " + detailAddress + " " + zipCode;
  }
}
