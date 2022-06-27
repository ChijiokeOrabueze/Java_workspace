package com.dufuna.berlin.chijiokeorabueze.lekki;

import com.dufuna.berlin.chijiokeorabueze.lekki.model.LekkiProperty;
import com.dufuna.berlin.chijiokeorabueze.lekki.service.MockLekkiPropertyService;

import java.util.ArrayList;
import java.util.Arrays;

public class MockLekkiPropertyApp {
    public static void main(String[] args) {
        MockLekkiPropertyService mockLekkiPropertyService = new MockLekkiPropertyService();

        String[][] propertiesToAdd = {
            {"No 24 Bishop Ajayi Street, Lagos.", "Mr Taiwo Baye", "Flat", "4", "4", "1", "3", "2", "23/05/2020", "23/05/2022",
                    "Beautiful suburban house"},
            {"No 56 Bolu Street, Awka.", "Mr Chinedu Asike", "Duplex", "5", "4", "1", "2", "2", "23/05/2022", "23/05/2024",
                    "Amazing house with pool"},
                {"No 13 Wallnut street, Lekki, Lagos.", "Mr Biodun Ajayi", "Commercial", "2", "2", "2", "1", "2", "13/05/2020", "23/05/2022",
                        "Beautiful suburban house"}
        };


        for (String[] property: propertiesToAdd) {
            LekkiProperty property1 = new LekkiProperty();
            property1.setPropertyId();
            property1.setPropertyAddress(property[0]);
            property1.setPropertyOwner(property[1]);
            property1.setPropertyType(property[2]);
            property1.setNumberOfBathrooms(Integer.parseInt(property[3]));
            property1.setNumberOfBedrooms(Integer.parseInt(property[4]));
            property1.setNumberOfKitchens(Integer.parseInt(property[5]));
            property1.setNumberOfToilets(Integer.parseInt(property[6]));
            property1.setNumberOfSittingRooms(Integer.parseInt(property[7]));
            property1.setValidFrom(property[8]);
            property1.setValidTo(property[9]);
            property1.setDescription(property[10]);

            mockLekkiPropertyService.saveProperty(property1);


        }








        // main method tests
//        System.out.println("property1.toString() " + property1.toString());
//        System.out.println("property1.equals(property1) " + property1.equals(property1));
//        System.out.println("property1.hashCode() " + property1.hashCode());


        // service method tests

        // find one property
        LekkiProperty foundProperty = mockLekkiPropertyService.getProperty(1);
        System.out.println("found property= " + foundProperty);

        // find multiple properties
        ArrayList allProperty = mockLekkiPropertyService.getProperties();
        System.out.println("All property= " + allProperty);






    }
}
