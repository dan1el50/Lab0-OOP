package oop.practice.lab2.task1_2_3;

class SyrupCappuccino extends Cappuccino {
    private final SyrupType syrup;

    public SyrupCappuccino(Intensity coffeeIntensity, int mlOfMilk,  SyrupType syrup) {
        super(coffeeIntensity, mlOfMilk, "SyrupCappuccino");
        this.syrup = syrup;
    }

    public void makeSyrupCappuccino(){
        super.makeCappuccino();
        System.out.println("Adding " + syrup + "syrup");
    }
}
