package com.udemy.java.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileWriteRunner {

  public static void main(String[] args) throws IOException {
    Path pathFileToWrite = Paths.get("./resources/file-write.txt");

    List<String> list = List.of("Apple", "Boy", "Cap", "Dot", "Ester");

    Files.write(pathFileToWrite, list);

  }

}
