package javabasic.CH9.ex3;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();
        electricCar.openDoor();

        GasCar gascar = new GasCar();
        gascar.move();
        gascar.fillUP();
        gascar.openDoor();

        HydrogenCar hydrogencar = new HydrogenCar();
        hydrogencar.move();
        hydrogencar.fillHydrogen();
        hydrogencar.openDoor();

    }
}
