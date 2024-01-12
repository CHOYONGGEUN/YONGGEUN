package javabasic.CH9.overriding;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();


        GasCar gascar = new GasCar();
        gascar.move();

    }
}
