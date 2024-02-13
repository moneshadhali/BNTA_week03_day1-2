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
        this.properties = new ArrayList<IInfrastructure>();
        this.revenue = 0;
    }

    public void addProperty(IInfrastructure property){
        this.properties.add(property);
    }
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public LocalDate getDateOfEstablishment() {
        return this.dateOfEstablishment;
    }

    public void setDateOfEstablishment(LocalDate dateOfEstablishment) {
        this.dateOfEstablishment = dateOfEstablishment;
    }

    public ArrayList<IInfrastructure> getProperties() {
        return this.properties;
    }

    public void setProperties(ArrayList<IInfrastructure> properties) {
        this.properties = properties;
    }

    public double getRevenue() {
        return this.revenue;
    }

    public double getRevenue(double lossMade) {
        return this.revenue-lossMade;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }
}
