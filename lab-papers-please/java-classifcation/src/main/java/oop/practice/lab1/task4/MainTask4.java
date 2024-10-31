package oop.practice.lab1.task4;

import oop.practice.lab1.task2.FileReader;
import oop.practice.lab1.task2.TextData;

import java.io.File;

public class MainTask4 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please insert a path into the program arguments.");
            return;
        }
        for (String arg : args) {
            try {
                String fileText = FileReader.readFileIntoString(arg);
                TextData text = new TextData(fileText);
                String fileName = new File(arg).getName();
                text.setFileName(fileName);

                System.out.println("\nThe file name is: " + text.getFileName());
                System.out.println(text.getText() + "\n");
                System.out.println("The number of vowels in the test is: " + text.getNumberOfVowels());
                System.out.println("The number of consonants in the text is: " + text.getNumberOfConsonants());
                System.out.println("The total number of letters in the text is: "  + text.getNumberOfLetters());
                System.out.println("The number of sentences in the text is: " + text.getNumberOfSentences());
                System.out.println("The longest word in the text is: " + text.getLongestWord());
                System.out.println("\n");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
