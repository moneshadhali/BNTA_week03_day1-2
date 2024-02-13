package models;

import java.time.LocalDate;

public class Office extends Building{
    private boolean gym;
    private boolean restaurant;
    public Office(LocalDate date){
        super(date);
        this.gym = false;
        this.restaurant = false;
    }
    public double calculateBuildCost(double price){
        double total = price * this.getNumberOfRooms();
        return total;
    }
    public boolean isGym() {
        return gym;
    }

    public void setGym(boolean gym) {
        this.gym = gym;
    }

    public boolean isRestaurant() {
        return restaurant;
    }

    public void setRestaurant(boolean restaurant) {
        this.restaurant = restaurant;
    }
}
