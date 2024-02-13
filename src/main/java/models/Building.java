package models;

import interfaces.IInfrastructure;

import java.time.LocalDate;

public abstract class Building implements IInfrastructure {
    private int numberOfRooms;
    private LocalDate dateOfConstruction;
    private String zipcode;
    private double area;

    public Building(LocalDate date){
        this.dateOfConstruction = date;
        this.numberOfRooms = 0;
        this.zipcode = "";
        this.area = 0;
    }

    abstract String about();

    public void addRoom(int amount){
        this.numberOfRooms += amount;
    }

    public int getNumberOfRooms() {
        return this.numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public LocalDate getDateOfConstruction() {
        return this.dateOfConstruction;
    }

    public void setDateOfConstruction(LocalDate dateOfConstruction) {
        this.dateOfConstruction = dateOfConstruction;
    }

    public String getZipcode() {
        return this.zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public double getArea() {
        return this.area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
