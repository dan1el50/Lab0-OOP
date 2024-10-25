package oop.practice.lab1.task2;

import java.io.File;

public class MainTask2 {
    public static void main(String[] args) {
        String filepath = args[0];
        String fileText = FileReader.readFileIntoString(filepath);

        TextData text = new TextData(fileText);
        String fileName = new File(filepath).getName();
        text.setFileName(fileName);
        if (!filepath.isEmpty()) {
            System.out.println("The text is: " + text.getText());
        } else {
            System.out.println("The file is empty.");
        }

        System.out.println("\nThe file name is: " + text.getFileName());
        System.out.println("The number of vowels in the test is: " + text.getNumberOfVowels());
        System.out.println("The number of consonants in the text is: " + text.getNumberOfConsonants());
        System.out.println("The total number of letters in the text is: "  + text.getNumberOfLetters());
        System.out.println("The number of sentences in the text is: " + text.getNumberOfSentences());
        System.out.println("The longest word in the text is: " + text.getLongestWord());

    }
}
