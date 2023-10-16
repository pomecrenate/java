package com.udemy.java.api.b;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadWriteRunner {

  public static void main(String[] args) throws IOException {
    // 파일 읽기
    Path path = Paths.get("./resources/sample.txt");

    // 경로의 파일의 모든 내용 String화
    String fileContent = Files.readString(path);
    System.out.println(fileContent);

    // 특정 문자열 교체
    String newFileContent = fileContent.replace("Line", "Lines");

    // 빈 파일 생성
    Path newFilePath = Paths.get("./resources/sample-new.txt");

    // 인자2를 인자1에 쓰기
    Files.writeString(newFilePath, newFileContent);
  }

}
