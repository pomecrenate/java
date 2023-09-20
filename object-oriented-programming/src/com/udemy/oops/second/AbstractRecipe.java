package com.udemy.oops.second;

public abstract class AbstractRecipe {

  public AbstractRecipe() {
  }

  public void execute() {
    getReady();
    doTheDish();
    cleanUp();
  }

  // prepare
  public abstract void getReady();

  // recipe
  public abstract void doTheDish();

  // cleanup
  public abstract void cleanUp();
}
