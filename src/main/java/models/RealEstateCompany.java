package models;

import interfaces.IInfrastructure;

import java.time.LocalDate;
import java.util.ArrayList;

public class RealEstateCompany {
    private String name;
    private String owner;
    private LocalDate dateOfEstablishment;
    private ArrayList<IInfrastructure> properties;
    private double revenue;

    public RealEstateCompany(String name, String owner, LocalDate date){
        this.name = name;
        this.owner = owner;
        this.dateOfEstablishment = date;
    }

    public void addProperty(Building building){
        this.properties.add(building);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public LocalDate getDateOfEstablishment() {
        return dateOfEstablishment;
    }

    public void setDateOfEstablishment(LocalDate dateOfEstablishment) {
        this.dateOfEstablishment = dateOfEstablishment;
    }

    public ArrayList<IInfrastructure> getProperties() {
        return properties;
    }

    public void setProperties(ArrayList<IInfrastructure> properties) {
        this.properties = properties;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }
}
