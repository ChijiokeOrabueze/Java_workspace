package com.dufuna.berlin.chijiokeorabueze.lekki.repository;

import com.dufuna.berlin.chijiokeorabueze.lekki.model.LekkiProperty;

import java.util.ArrayList;


public interface SimpleLekkiPropertyRepository {
    public LekkiProperty save(LekkiProperty property);

    public LekkiProperty findById(int id);

    public ArrayList findAll();

    public void update(LekkiProperty newProperty);
}
