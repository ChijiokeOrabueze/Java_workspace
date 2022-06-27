package com.dufuna.berlin.chijiokeorabueze.lekki.service;

import com.dufuna.berlin.chijiokeorabueze.lekki.model.LekkiProperty;
import com.dufuna.berlin.chijiokeorabueze.lekki.repository.SimpleLekkiPropertyRepositoryImpl;

import java.util.ArrayList;


public class MockLekkiPropertyService implements LekkiPropertyService {
    SimpleLekkiPropertyRepositoryImpl repo = new SimpleLekkiPropertyRepositoryImpl();

    @Override
    public LekkiProperty saveProperty(LekkiProperty property) {
        LekkiProperty savedProperty = repo.save(property);
        System.out.println("MockLekkiPropertyService.saveProperty called");
        return savedProperty;
    }

    @Override
    public LekkiProperty getProperty(int id) {
        LekkiProperty foundProperty = repo.findById(id);
        System.out.println("MockLekkiPropertyService.getProperty called");
        return foundProperty;
    }

    @Override
    public ArrayList getProperties() {
        ArrayList allProperties = repo.findAll();
        return allProperties;
    }
}
