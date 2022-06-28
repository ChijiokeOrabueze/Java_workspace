package com.dufuna.berlin.chijiokeorabueze.lekki.repository;

import com.dufuna.berlin.chijiokeorabueze.lekki.model.LekkiProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SimpleLekkiPropertyRepositoryImpl implements SimpleLekkiPropertyRepository{
    private Map<Integer, LekkiProperty> database = new HashMap<>();


    @Override
    public LekkiProperty save(LekkiProperty property) {
        database.put(property.getPropertyId(), property);
        return property;
    }

    @Override
    public LekkiProperty findById(int id) {
        if (database.containsKey(id)) {
            return database.get(id);
        }
        return null;
    }

    @Override
    public ArrayList findAll() {
        ArrayList<LekkiProperty> allProperty = new ArrayList<>(database.values());
        return allProperty;
    }

    @Override
    public void update(LekkiProperty newProperty) {
        database.replace(newProperty.getPropertyId(), newProperty);
    }
}
