package com.udemy.oops;

public class Book {
  private int noOfCopies;

  Book() {

  }

  Book(int noOfCopies) {
    this.noOfCopies = noOfCopies;
  }

  public void setNoOfCopies(int noOfCopies) {
    if (noOfCopies > 0)
      this.noOfCopies = noOfCopies;
  }

  public int getNoOfCopies() {
    return this.noOfCopies;
  }

  public void increaseSpeed(int howMuch) {
    setNoOfCopies(this.noOfCopies + howMuch);
  }

  public void decreaseSpeed(int howMuch) {
    setNoOfCopies(this.noOfCopies - howMuch);
  }
}
