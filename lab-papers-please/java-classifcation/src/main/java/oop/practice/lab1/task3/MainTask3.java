package oop.practice.lab1.task3;

import oop.practice.lab1.task1.Display;
import java.util.ArrayList;

public class MainTask3 {
    public static void main(String[] args) {
        Display display1 = new Display(1920, 1080, 400, "Monitor A");
        Display display2 = new Display(2560, 1440, 350, "Monitor B");
        Display display3 = new Display(1920, 1080, 400, "Monitor C");

        Assistant assistant = new Assistant("John", new ArrayList<>());

        assistant.assignDisplay(display1);
        assistant.assignDisplay(display2);
        assistant.assignDisplay(display3);

        System.out.println("Hello my name is " + assistant.getAssistantName() + " and I will be helping you to choose" +
                " a suitable screen for you.");
        System.out.println("We will be choosing from the following displays: \n" + assistant.getAssignedDisplays());
        System.out.println("\nBelow you can see the comparison of each screen.");
        assistant.assist();
        System.out.println("\nThank you " + assistant.getAssistantName() + " for helping me. \nI will choose " +
                assistant.buyDisplay(display1));
    }
}
