package models;

import interfaces.IInfrastructure;

public class Bridge implements IInfrastructure {
    private String materialUsed;
    private int amountOfMaterial;
    public Bridge(String materialUsed, int amountOfMaterial){
        this.materialUsed = materialUsed;
        this.amountOfMaterial = amountOfMaterial;
    }

    public double calculateBuildCost(double price){
        double total = price * this.amountOfMaterial;
        return total;
    }

    public double calculateBuildCost(double price, double priceOfMaterial){
        double total = price * ( this.amountOfMaterial * priceOfMaterial);
        return total;
    }

    public String getMaterialUsed() {
        return materialUsed;
    }

    public void setMaterialUsed(String materialUsed) {
        this.materialUsed = materialUsed;
    }

    public int getAmountOfMaterial() {
        return amountOfMaterial;
    }

    public void setAmountOfMaterial(int amountOfMaterial) {
        this.amountOfMaterial = amountOfMaterial;
    }
}
