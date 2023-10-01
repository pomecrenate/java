package com.udemy.java.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class DirectoryScanRunner {
  // 함수형 프로그래밍을 이용하여 파일, 디렉토리 스캔
  public static void main(String[] args) throws IOException {
    Path currentDirectory = Paths.get(".");

    // Path를 인자로 받아 Stream 반환
    //    Files.list(currentDirectory).forEach(System.out::println);

    // .java를 포함하는 것만
    Predicate<? super Path> predicate
    = path -> String.valueOf(path).contains(".java");

    // Path와 탐색깊이를 인자로 받아 Stream 반환
    Files.walk(currentDirectory, 2)
    .filter(predicate)
    .forEach(System.out::println);

    // .java를 포함하는 것만
    BiPredicate<Path, BasicFileAttributes> javaMatcher
    = (path, attributes) -> String.valueOf(path).contains(".java");

    // 디렉토리 속성만
    BiPredicate<Path, BasicFileAttributes> directoryMatcher
    = (path, attributes) -> attributes.isDirectory();

    // Path와 탐색깊이와 를 인자로 받아 Stream 반환
    Files.find(currentDirectory, 2, directoryMatcher)
    .forEach(System.out::println);

  }

}
