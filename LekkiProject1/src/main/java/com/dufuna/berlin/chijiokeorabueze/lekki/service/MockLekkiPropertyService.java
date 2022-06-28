package com.dufuna.berlin.chijiokeorabueze.lekki.service;

import com.dufuna.berlin.chijiokeorabueze.lekki.model.LekkiProperty;
import com.dufuna.berlin.chijiokeorabueze.lekki.repository.SimpleLekkiPropertyRepository;
import com.dufuna.berlin.chijiokeorabueze.lekki.repository.SimpleLekkiPropertyRepositoryImpl;

import java.util.ArrayList;


public class MockLekkiPropertyService implements LekkiPropertyService {
    SimpleLekkiPropertyRepository repo = new SimpleLekkiPropertyRepositoryImpl();

    @Override
    public LekkiProperty saveProperty(LekkiProperty property) {
        System.out.println("MockLekkiPropertyService.saveProperty called");
        return repo.save(property);
    }

    @Override
    public LekkiProperty getProperty(int id) {
        System.out.println("MockLekkiPropertyService.getProperty called");
        return repo.findById(id);
    }

    @Override
    public ArrayList getProperties() {
        return repo.findAll();
    }
}
