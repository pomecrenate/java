package com.udemy.java.consumer;

import java.util.List;
import java.util.logging.Logger;
import com.udemy.java.sorting.util.MySortingUtil;

public class MySortingUtilConsumer {
  // Logger 객체 생성
  private static Logger logger =
      Logger.getLogger(MySortingUtilConsumer.class.getName());

  public static void main(String[] args) {
    MySortingUtil util = new MySortingUtil();
    List<String> sorted = util.sort(List.of("Ranga", "Ravi", "Sathish", "Adam", "Eve"));

    // 로그로 출력
    logger.info(sorted.toString());
  }
}
