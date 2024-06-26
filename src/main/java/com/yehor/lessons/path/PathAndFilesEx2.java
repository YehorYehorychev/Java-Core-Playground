package com.yehor.lessons.path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathAndFilesEx2 {

    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("files/test15.txt");
        Path directoryPath = Paths.get("C:/Users/egory/IdeaProjects/JavaLessons/files");
        Path directoryFolderPath = Paths.get("C:/Users/egory/IdeaProjects/JavaLessons/files/Folder");

//        Files.copy(filePath, directoryPath.resolve(filePath));
//        Files.copy(filePath, directoryPath.resolve("test16.txt"), StandardCopyOption.REPLACE_EXISTING);
//        System.out.println("Done!");
//        Files.copy(directoryFolderPath, directoryPath.resolve("Folder"));
//
//        Files.move(Paths.get("files/test10.txt"), (Paths.get("files/test11.txt")));
//        System.out.println("Done!");
//        Files.delete(Paths.get("files/test5.txt"));
//        System.out.println("Done!");
        Files.delete(Paths.get("files/M"));
        System.out.println("Done!");
    }
}
