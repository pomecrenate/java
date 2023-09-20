package com.udemy.oops.second;

public class Recipe1 extends AbstractRecipe {

  @Override
  public void getReady() {
    System.out.println("Get the raw materials");
    System.out.println("Get the utensils");
  }

  @Override
  public void doTheDish() {
    System.out.println("Do the dish");
  }

  @Override
  public void cleanUp() {
    System.out.println("Cleanup the utensils");
  }

}
