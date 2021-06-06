package Lesson5;

public class Main {
    public static void main(String[] args) {
        MyEngine engine = new MyEngine("V6", 2500);
        MyGasTank currentGT = new MyGasTank(1000, 56);
        MyCar car = new MyCar(engine, currentGT);
        car.setName("Volvo XC90");
        car.setYear(2001);
        car.setDistance(2600);
        System.out.println(car);
        car.addGas(50);
        car.runCar();
        car.stopCar();
        System.out.println("Total amount of distance is " + car.getDistance() + "km");

    }
}
