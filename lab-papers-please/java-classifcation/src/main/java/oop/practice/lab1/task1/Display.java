package oop.practice.lab1.task1;

public class Display {
    private int width;
    private int height;
    private float ppi;
    private String model;


    public Display(int width, int height, float ppi, String model) {
        this.width = width;
        this.height = height;
        this.ppi = ppi;
        this.model = model;
    }

    // Compare the surface of each screen
    public void compareSize(Display other) {
        int thisArea = this.width * this.height;
        int otherArea = other.width * other.height;

        if (thisArea > otherArea) {
            System.out.println(this.model + " is larger than " + other.model);
        } else if (thisArea < otherArea) {
            System.out.println(this.model + " is smaller than " + other.model);
        } else {
            System.out.println(this.model + " is the same size as " + other.model);
        }
    }

    // Compare the sharpness of 2 screens by ppi
    public void compareSharpness(Display other) {
        if (this.ppi > other.ppi) {
            System.out.println(this.model + " is sharper than " + other.model);
        } else if (this.ppi < other.ppi) {
            System.out.println(this.model + " is less sharp than " + other.model);
        } else {
            System.out.println(this.model + " has the same sharpness as " + other.model);
        }
    }

    // Compare both size and sharpness
    public void compareWithMonitor(Display other) {
        compareSize(other);
        compareSharpness(other);
    }
}
