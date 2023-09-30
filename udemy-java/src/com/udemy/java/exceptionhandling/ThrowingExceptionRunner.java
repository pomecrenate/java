package com.udemy.java.exceptionhandling;

class Amount {
  private String currency;
  private int amount;

  public Amount(String currency, int amount) {
    super();
    this.currency = currency;
    this.amount = amount;
  }

  public void add(Amount that) throws CurrenciesDoNotMatchException {
    // 통화가 다르면 예외로 넘김
    if (!this.currency.equals(that.currency)) {
      //      throw new Exception("Currencies Don't Match " + this.currency + " & " + that.currency);
      throw new CurrenciesDoNotMatchException("Currencies Don't Match " + this.currency + " & " + that.currency);
    }
    this.amount = this.amount + that.amount;
  }

  @Override
  public String toString() {
    return currency + " " + amount;
  }
}

// 커스텀 Exception 생성
class CurrenciesDoNotMatchException extends Exception {
  public CurrenciesDoNotMatchException(String message) {
    super(message);
  }
}

public class ThrowingExceptionRunner {

  public static void main(String[] args) throws CurrenciesDoNotMatchException {
    Amount amount1 = new Amount("USD", 10);
    Amount amount2 = new Amount("EUR", 20);
    amount1.add(amount2);
    System.out.println(amount1);
  }

}
