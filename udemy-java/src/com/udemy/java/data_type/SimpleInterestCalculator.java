package com.udemy.java.data_type;

import java.math.BigDecimal;

public class SimpleInterestCalculator {
  // BigDecimal 클래스 연습 - 이자 단리 계산기
  private BigDecimal principal;
  private BigDecimal interest;
  private BigDecimal noOfYears;

  public SimpleInterestCalculator() {

  }

  public SimpleInterestCalculator(String principal, String interest) {
    this.principal = new BigDecimal(principal);
    this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
  }

  public BigDecimal calculateTotalValue(int noOfYears) {
    return principal.add(
        principal.multiply(
            interest.multiply(new BigDecimal(noOfYears))));
  }

  public BigDecimal getPrincipal() {
    return principal;
  }

  public void setPrincipal(BigDecimal principal) {
    this.principal = principal;
  }

  public BigDecimal getInterest() {
    return interest;
  }

  public void setInterest(BigDecimal interest) {
    this.interest = interest;
  }

  public BigDecimal getNoOfYears() {
    return noOfYears;
  }

  public void setNoOfYears(BigDecimal noOfYears) {
    this.noOfYears = noOfYears;
  }

}
