package oop.practice.lab1.task1;

public class MainTask1 {
    public static void main(String[] args) {
        Display display1 = new Display(1920, 1080, 400, "Monitor A");
        Display display2 = new Display(2560, 1440, 350, "Monitor B");
        Display display3 = new Display(1920, 1080, 400, "Monitor C");

        display1.compareSize(display2);
        display2.compareSharpness(display3);
        display3.compareWithMonitor(display1);
    }
}
