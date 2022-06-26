package com.dufuna.berlin.chijiokeorabueze.lekki.repository;

import com.dufuna.berlin.chijiokeorabueze.lekki.model.LekkiProperty;

import java.util.ArrayList;
import java.util.HashMap;

public class SimpleLekkiPropertyRepositoryImpl implements SimpleLekkiPropertyRepository{
    private HashMap<Integer, LekkiProperty> database = new HashMap<>();

    @Override
    public LekkiProperty save(LekkiProperty property) {
        int id = property.getPropertyId();
        database.put(id, property);

        return property;
    }

    @Override
    public LekkiProperty findById(int id) {
        if (database.containsKey(id)) {
            LekkiProperty property = database.get(id);
            return property;
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
        int id = newProperty.getPropertyId();
        database.replace(id, newProperty);
    }
}
