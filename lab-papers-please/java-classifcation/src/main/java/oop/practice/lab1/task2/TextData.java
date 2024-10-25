package oop.practice.lab1.task2;

public class TextData {
    private String fileName;
    private String text;
    private int numberOfVowels;
    private int numberOfConsonants;
    private int numberOfLetters;
    private int numberOfSentences;
    private String longestWord;

    public TextData(String text) {
        this.text = text;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public String getText() {
        return text;
    }

    public int getNumberOfVowels() {
        int count = 0;
        String vowels = "aeiou";
        for (int i = 0; i < text.length(); i++){
            if (vowels.contains(String.valueOf(text.toLowerCase().charAt(i)))){
                count++;
            }
        }
        return count;
    }

    public int getNumberOfConsonants() {
        int count = 0;
        String consonants = "bcdfghjklmnpqrstvwxyz";
        for (int i = 0; i < text.length(); i++){
            if(consonants.contains(String.valueOf(text.toLowerCase().charAt(i)))){
                count++;
            }
        }
        return count;
    }

    public int getNumberOfLetters() {
        int count = 0;
        for (int i = 0; i < text.length(); i++){
            if (Character.isLetter(text.toLowerCase().charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public int getNumberOfSentences() {
        int count = 0;
        for (int i = 0; i < text.length(); i++){
            if (String.valueOf(text.charAt(i)).equals(".")){
                count++;
            }
        }
        return count;
    }

    public String getLongestWord() {
        String[] words = text.split("\\W");
        String currentLongestWord = " ";
        for (String word : words) {
            if (word.length() > currentLongestWord.length()) {
                currentLongestWord = word;
            }
        }
        return currentLongestWord;
    }

}
