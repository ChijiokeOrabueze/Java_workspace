package com.dufuna.berlin.chijiokeorabueze.lekki.service;

import com.dufuna.berlin.chijiokeorabueze.lekki.model.LekkiProperty;



public class MockLekkiPropertyService implements LekkiPropertyService {
    @Override
    public void saveProperty(LekkiProperty property) {
        System.out.println("MockLekkiPropertyService.saveProperty called");
    }

    @Override
    public LekkiProperty getProperty() {
        System.out.println("MockLekkiPropertyService.getProperty called");
        return null;
    }
}
