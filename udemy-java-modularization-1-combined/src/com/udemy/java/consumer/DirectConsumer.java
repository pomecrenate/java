package com.udemy.java.consumer;

import java.util.List;
import java.util.logging.Logger;
import com.udemy.java.sorting.algorithm.BubbleSort;
// MySortingUtil을 거치는 대신 BubbleSort 직접 사용
public class DirectConsumer {
  // Logger 객체 생성
  private static Logger logger =
      Logger.getLogger(DirectConsumer.class.getName());

  public static void main(String[] args) {
    // 문제없이 작동되지만 MySortingUtil에서 BubbleSort 대신 QuikSort를 사용하게 된다면
    // 이 컨슈머엔 반영되지 않음
    BubbleSort util = new BubbleSort();
    List<String> sorted = util.sort(List.of("Ranga", "Ravi", "Sathish", "Adam", "Eve"));

    // 로그로 출력
    logger.info(sorted.toString());
  }
}
