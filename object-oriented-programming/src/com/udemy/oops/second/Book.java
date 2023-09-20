package com.udemy.oops.second;

import java.util.ArrayList;

public class Book {
  private int id;
  private String name;
  private String author;
  private ArrayList<Review> review = new ArrayList<>();

  public Book() {
  }

  public Book(int id, String name, String author) {
    this.id = id;
    this.name = name;
    this.author = author;
  }

  public void addReview(Review review) {
    this.review.add(review);
  }

  @Override
  public String toString() {
    return "Book [id=" + id + ", name=" + name + ", author=" + author + ", review=" + review + "]";
  }

}
