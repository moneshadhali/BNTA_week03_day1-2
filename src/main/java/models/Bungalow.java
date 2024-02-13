package models;

import java.time.LocalDate;

public class Bungalow extends Building{
    private boolean centralHeating;
    private boolean swimmingPool;
    private String type;
    public Bungalow(LocalDate date, String type){
        super(date);
        this.centralHeating = false;
        this.swimmingPool = false;
        this.type = type;
    }
    public String about(String about){
        return about;
    }
    public String about(){
        return "About: this is related to Bungalow";
    }
    public double calculateBuildCost(double price){
        double total = price * this.getArea();
        return total;
    }
    public boolean isCentralHeating() {
        return this.centralHeating;
    }

    public void setCentralHeating(boolean centralHeating) {
        this.centralHeating = centralHeating;
    }

    public boolean isSwimmingPool() {
        return this.swimmingPool;
    }

    public void setSwimmingPool(boolean swimmingPool) {
        this.swimmingPool = swimmingPool;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
