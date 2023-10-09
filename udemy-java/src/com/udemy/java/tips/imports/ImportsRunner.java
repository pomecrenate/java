package com.udemy.java.tips.imports;

import static java.lang.System.out; // PrintStream out은 static 변수
import static java.util.Collections.sort; // sort()는 static 메서드
import java.math.BigDecimal;
import java.util.ArrayList;

// java.lang.* 은 기본적으로 import됨
public class ImportsRunner {

  public static void main(String[] args) {
    String str = ""; // String은 java.lang 패키지에 들어있음
    BigDecimal bd = null;

    out.println(); // System 없이 호출 가능

    sort(new ArrayList<String>());// Collections 없이 호출 가능
  }

}
