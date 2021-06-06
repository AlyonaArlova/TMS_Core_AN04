package Lesson5;

public class MyCar {

    private String name;
    private int year;
    private int distance;
    private final MyEngine myEngine;
    private final MyGasTank myGasTank;

    public MyCar(MyEngine myEngine, MyGasTank myGasTank) {
        this.myEngine = myEngine;
        this.myGasTank = myGasTank;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void runCar() {
        myEngine.turnOnEngine(myGasTank);
        if (myEngine.isStartedEngine) {
            distance += 100;
            System.out.println("Car is running");
        } else {
            System.out.println("Car is staying");
        }
    }

    public void stopCar() {
        if (myEngine.isStartedEngine) {
            System.out.println("Car is stopped");
            myEngine.turnOfEngine();
        } else {
            System.out.println("Car is already stopped: it is not possible to stop it twice");
        }
    }

    public void addGas(int addGas) {
        System.out.println("We will try to add " + addGas + " fuel");
        myGasTank.addGas(addGas);
    }

    @Override
    public String toString() {
        return "MyCar{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", distance=" + distance +
                '}';
    }
}


