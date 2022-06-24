package com.dufuna.berlin.chijiokeorabueze.lekki.model;

public class LekkiProperty {
    static int numberOfProperty = 0;
    private int propertyId;
    private String propertyAddress;
    private String propertyType;
    private int numberOfBedrooms;
    private int numberOfSittingRooms;
    private int numberOfKitchens;
    private int numberOfBathrooms;
    private int numberOfToilets;
    private String propertyOwner;
    private String description;
    private String validFrom;
    private String validTo;

    public LekkiProperty() {
    }

    public static int getNumberOfProperty() {
        return numberOfProperty;
    }

    public static void setNumberOfProperty(int numberOfProperty) {
        LekkiProperty.numberOfProperty = numberOfProperty;
    }

    public int getPropertyId() {
        return propertyId;
    }

    public void setPropertyId() {
        this.propertyId = ++numberOfProperty;
    }

    public String getPropertyAddress() {
        return propertyAddress;
    }

    public void setPropertyAddress(String propertyAddress) {
        this.propertyAddress = propertyAddress;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public void setNumberOfBedrooms(int numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }

    public int getNumberOfSittingRooms() {
        return numberOfSittingRooms;
    }

    public void setNumberOfSittingRooms(int numberOfSittingRooms) {
        this.numberOfSittingRooms = numberOfSittingRooms;
    }

    public int getNumberOfKitchens() {
        return numberOfKitchens;
    }

    public void setNumberOfKitchens(int numberOfKitchens) {
        this.numberOfKitchens = numberOfKitchens;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public void setNumberOfBathrooms(int numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }

    public int getNumberOfToilets() {
        return numberOfToilets;
    }

    public void setNumberOfToilets(int numberOfToilets) {
        this.numberOfToilets = numberOfToilets;
    }

    public String getPropertyOwner() {
        return propertyOwner;
    }

    public void setPropertyOwner(String propertyOwner) {
        this.propertyOwner = propertyOwner;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(String validFrom) {
        this.validFrom = validFrom;
    }

    public String getValidTo() {
        return validTo;
    }

    public void setValidTo(String validTo) {
        this.validTo = validTo;
    }

    @Override
    public int hashCode() {
        return this.propertyId;
    }

    @Override
    public boolean equals(Object obj) {
        LekkiProperty property = (LekkiProperty) obj;
        if (this.propertyId == property.propertyId) return true;

        return false;

    }

    @Override
    public String toString() {
        return (this.getPropertyId() + "," +
                this.getPropertyAddress() + ","
                + this.getPropertyType());
    }
}
