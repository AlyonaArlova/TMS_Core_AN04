package Lesson5;

public class MyGasTank {
    private int totalVolume;
    private int currentAmountOfGasoline;

    public MyGasTank(int totalVolume, int currentAmountOfGasoline) {
        if (totalVolume >= currentAmountOfGasoline && currentAmountOfGasoline >= 0) {
            this.currentAmountOfGasoline = currentAmountOfGasoline;
            this.totalVolume = totalVolume;
        } else {
            System.out.println("Smth wrong with GasTank, please double check!");
        }
    }

    public int getTotalVolume() {
        return totalVolume;
    }

    public int getCurrentAmountOfGasoline() {
        return currentAmountOfGasoline;
    }

    public void setCurrentAmountOfGasoline(int currentAmountOfGasoline) {
        this.currentAmountOfGasoline = currentAmountOfGasoline;
    }

    public void addGas(int addGas) {
        int newCurrentAmount = currentAmountOfGasoline + addGas;
        if (newCurrentAmount <= totalVolume) {
            currentAmountOfGasoline = newCurrentAmount;
            System.out.println("Fuel is added. It is " + currentAmountOfGasoline);
        } else {
            currentAmountOfGasoline = totalVolume;
            System.out.println("Not possible to add new fuel");
        }
    }
}
