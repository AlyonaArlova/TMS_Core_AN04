package Lesson5;

public class MyEngine {
    boolean isStartedEngine = false;
    private final String typeOfEngine;
    private final int volumeOfEngine;

    public MyEngine(String typeOfEngine, int volumeOfEngine) {
        this.typeOfEngine = typeOfEngine;
        this.volumeOfEngine = volumeOfEngine;
    }

    public void turnOnEngine(MyGasTank myGasTank) {
        if (myGasTank.getCurrentAmountOfGasoline() > 0) {
            isStartedEngine = true;
            System.out.println("Engine is turn on");
        } else {
            System.out.println("There is no fuel, car can not run");
        }
    }

    public void turnOfEngine() {
        isStartedEngine = false;
        System.out.println("Engine is stopped");
    }

    public boolean currentStateOfEngine() {
        return isStartedEngine;
    }
}