package org.example.arge;

public class GasPoweredCar extends CarSkeleton{
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(double avgKmLitre,int cylinders){
        this.avgKmPerLitre = avgKmLitre;
        this.cylinders = cylinders;
    }

    public double getAverageKmPerLiter() {
        return avgKmPerLitre;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public void startEngine(){
        System.out.println("GasPoweredCar start");
    }
    @Override
    public void drive(){
        System.out.println("GasPoweredCar drive");
    }
}