package org.example.arge;

public class ElectricCar extends CarSkeleton{
    private double avgKmPerLitre;
    private int batterySize;
    public ElectricCar(double avgKmPerLitre,int batterySize){
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
    }

    public double getAvgKmPerCharge() {
        return avgKmPerLitre;
    }

    public int getBatterySize() {
        return batterySize;
    }

    @Override
    public void startEngine(){
        System.out.println("ElectricCar start");
    }
    @Override
    public void drive(){
        System.out.println("ElectricCar drive");
    }
}
