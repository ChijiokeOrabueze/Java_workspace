package com.dufuna.berlin.chijiokeorabueze.lekki;

import com.dufuna.berlin.chijiokeorabueze.lekki.model.LekkiProperty;
import com.dufuna.berlin.chijiokeorabueze.lekki.repository.SimpleLekkiPropertyRepositoryImpl;
import com.dufuna.berlin.chijiokeorabueze.lekki.service.MockLekkiPropertyService;

import java.util.ArrayList;

public class MockLekkiPropertyApp {
    public static void main(String[] args) {
        LekkiProperty property1 = new LekkiProperty();
        property1.setPropertyId();
        property1.setPropertyAddress("No 24 Bishop Ajayi Street, Lagos.");
        property1.setPropertyOwner("Mr Taiwo Baye");
        property1.setPropertyType("Flat");
        property1.setNumberOfBathrooms(4);
        property1.setNumberOfBedrooms(4);
        property1.setNumberOfKitchens(1);
        property1.setNumberOfToilets(3);
        property1.setNumberOfSittingRooms(2);
        property1.setValidFrom("23/05/2020");
        property1.setValidTo("23/05/2022");
        property1.setDescription("Beautiful suburban house");



        // main method tests
        System.out.println("property1.toString() " + property1.toString());
        System.out.println("property1.equals(property1) " + property1.equals(property1));
        System.out.println("property1.hashCode() " + property1.hashCode());


        // service method tests
        MockLekkiPropertyService mockLekkiPropertyService = new MockLekkiPropertyService();
        mockLekkiPropertyService.saveProperty(property1);
        mockLekkiPropertyService.getProperty();

        // repository method tests
        SimpleLekkiPropertyRepositoryImpl repo = new SimpleLekkiPropertyRepositoryImpl();
        LekkiProperty savedProperty = repo.save(property1);
        System.out.println("saved property= " + savedProperty);
        LekkiProperty foundProperty = repo.findById(1);
        System.out.println("found property= " + foundProperty);
        ArrayList allProperty = repo.findAll();
        System.out.println("All property= " + allProperty);

    }
}
