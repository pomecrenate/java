package com.udemy.java.api.g;

public class TextBlocksRunner {

  public static void main(String[] args) {
    // 따옴표 3개 다음에는 무조건 줄바꿈하고 시작해야 함
    // 따옴표, 들여쓰기, 줄바꿈 모두 인식됨
    // 문자 뒤 공백은 제거됨
    String str = """
              "Line 1"
                Line 2
              Line 3
                  Line 4
                   Line 5
            Line 6""";
    System.out.print(str);

    String textBlock = """
            Line 1: %s
            Line 2: %s
            """.formatted("Some Value", "Some Other Value");

    System.out.print(textBlock);
  }

}
