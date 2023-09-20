package com.udemy.oops.first;

public class BookRunner {

  public static void main(String[] args) {
    Book artOfComputerProgramming = new Book(100);
    Book effectiveJava = new Book();
    Book cleanCode = new Book();

    artOfComputerProgramming.setNoOfCopies(30);
    effectiveJava.setNoOfCopies(53);
    cleanCode.setNoOfCopies(24);
  }

}
