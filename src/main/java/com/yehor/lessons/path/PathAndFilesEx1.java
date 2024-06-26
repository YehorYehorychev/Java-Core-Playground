package com.yehor.lessons.path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class PathAndFilesEx1 {

    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("files/test15.txt");
        Path directoryPath = Paths.get("C:/Users/egory/IdeaProjects/JavaLessons/files");

        System.out.println("filePath.getFileName(): " + filePath.getFileName());
        System.out.println("directoryPath.getFileName(): " + directoryPath.getFileName());
        System.out.println("----------------------------------------");
        System.out.println("filePath.getParent(): " + filePath.getParent());
        System.out.println("directoryPath.getParent(): " + directoryPath.getParent());
        System.out.println("----------------------------------------");
        System.out.println("filePath.getRoot(): " + filePath.getRoot());
        System.out.println("directoryPath.getRoot(): " + directoryPath.getRoot());
        System.out.println("----------------------------------------");
        System.out.println("filePath.isAbsolute(): " + filePath.isAbsolute());
        System.out.println("directoryPath.isAbsolute(): " + directoryPath.isAbsolute());
        System.out.println("----------------------------------------");
        System.out.println("filePath.toAbsolutePath(): " + filePath.toAbsolutePath());
        System.out.println("directoryPath.toAbsolutePath: " + directoryPath.toAbsolutePath());
        System.out.println("----------------------------------------");
        System.out.println("filePath.toAbsolutePath().getParent()): " + filePath.toAbsolutePath().getParent());
        System.out.println("directoryPath.toAbsolutePath().getParent()): " + directoryPath.toAbsolutePath().getParent());
        System.out.println("----------------------------------------");
        System.out.println("filePath.toAbsolutePath().getParent()): " + filePath.toAbsolutePath().getParent());
        System.out.println("directoryPath.resolve(filePath): " + directoryPath.resolve(filePath));
        System.out.println("----------------------------------------");

        if (!Files.exists(filePath)) {
            Files.createFile(filePath);
        }
        if (!Files.exists(directoryPath)) {
            Files.createDirectory(directoryPath);
        }

        System.out.println("Files.isReadable(filePath): " + Files.isReadable(filePath));
        System.out.println("Files.isReadable(filePath): " + Files.isExecutable(filePath));
        System.out.println("----------------------------------------");

        Path filePath2 = Paths.get("C:/Users/egory/IdeaProjects/JavaLessons/files/test15.txt");
        System.out.println("Files.isSameFile(filePath, filePath2): " + Files.isSameFile(filePath, filePath2));
        System.out.println("----------------------------------------");
        System.out.println("Files.size(filePath): " + Files.size(filePath));
        System.out.println("----------------------------------------");
        System.out.println("Files.getAttribute(filePath, \"creationTime\"): " + Files.getAttribute(filePath, "creationTime"));
        System.out.println("----------------------------------------");
        System.out.println("Files.getAttribute(filePath, \"size\"): " + Files.getAttribute(filePath, "size"));
        System.out.println("----------------------------------------");
        System.out.println("Files.getAttribute(filePath, \"creationTime\"): " + Files.readAttributes(filePath, "*"));
        Map<String, Object> attributes = Files.readAttributes(filePath, "*");
        for (Map.Entry<String,Object> entry : attributes.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("----------------------------------------");
    }
}
