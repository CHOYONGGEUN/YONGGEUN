package javabasic.CH9.ex1;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();

        GasCar gascar = new GasCar();
        gascar.move();
        gascar.fillup();

    }
}
