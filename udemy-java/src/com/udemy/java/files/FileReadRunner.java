package com.udemy.java.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReadRunner {

  public static void main(String[] args) throws IOException {
    Path pathFileToRead = Paths.get("./resources/data.txt");

    // 경로의 파일의 모든 내용 List화
    List<String> readAllLines = Files.readAllLines(pathFileToRead);
    System.out.println(readAllLines);

    // 경로의 파일의 모든 내용 String화
    Files.lines(pathFileToRead)
    .map(String::toUpperCase)
    .filter(str -> str.contains("D"))
    .forEach(System.out::println);

  }

}
