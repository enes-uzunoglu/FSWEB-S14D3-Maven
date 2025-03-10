package org.example.arge;

public class HybridCar extends CarSkeleton{
    private double avgKmPerLitre;
    private int cylinders;
    private int batterySize;
    public HybridCar(double avgKmPerLitre,int cylinders,int batterySize){
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
        this.batterySize = batterySize;
    }

    public double getAvgKmPerLiter() {
        return avgKmPerLitre;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getBatterySize() {
        return batterySize;
    }

    @Override
    public void startEngine(){
        System.out.println("HybridCar start");
    }
    @Override
    public void drive(){
        System.out.println("HybridCar drive");
    }
}
