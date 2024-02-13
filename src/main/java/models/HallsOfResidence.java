package models;

import java.time.LocalDate;

public class HallsOfResidence extends Building{
    private long numberOfPartiesHosted;
    private int capacity;
    public HallsOfResidence(LocalDate date){
        super(date);
        numberOfPartiesHosted = 0;
        capacity = 0;
    }
    public String about(String about){
        return about;
    }
    public String about(){
        return "About: this is related to student accommodation buildings which we call it as halls of residence";
    }
    public double calculateBuildCost(double price){
        double total = price * this.capacity;
        return total;
    }

    public long getNumberOfPartiesHosted() {
        return this.numberOfPartiesHosted;
    }

    public void setNumberOfPartiesHosted(long numberOfPartiesHosted) {
        this.numberOfPartiesHosted = numberOfPartiesHosted;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
