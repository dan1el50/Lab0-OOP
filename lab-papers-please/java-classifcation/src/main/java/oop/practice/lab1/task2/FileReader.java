package oop.practice.lab1.task2;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class FileReader {
    public static String readFileIntoString(String filepath){
        try {
            return Files.readString(Paths.get(filepath));
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
            return "";
        }
    }
}
