package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;
    public CarSkeleton(){
        this.name = "Unknown";
        this.description = "No description available.";
    }
    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void startEngine(){
        System.out.println("engine start");
    }
    protected  void runEngine(){
        System.out.println("engine run");
    }
    public void drive(){
        runEngine();
    }
}
