package com.dufuna.berlin.chijiokeorabueze.lekki.service;

import com.dufuna.berlin.chijiokeorabueze.lekki.model.LekkiProperty;

import java.util.ArrayList;

public interface LekkiPropertyService {

    public LekkiProperty saveProperty(LekkiProperty property);

    public LekkiProperty getProperty(int id);

    public ArrayList getProperties();
}
