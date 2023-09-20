package com.udemy.oops.second;

public class CustomerRunner {

  public static void main(String[] args) {
    Customer customer = new Customer("chan",
        new Address("Incheon", "1601", "22222"));

    customer.setWorkAddress(new Address("Seoul", "102-1", "33333"));

    System.out.println(customer);
  }

}
