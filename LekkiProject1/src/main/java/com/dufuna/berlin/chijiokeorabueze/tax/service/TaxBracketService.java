package com.dufuna.berlin.chijiokeorabueze.tax.service;

import com.dufuna.berlin.chijiokeorabueze.tax.model.TaxBracket;

public interface TaxBracketService {

    void setBracketValues ();

    Iterable<TaxBracket> getBrackets ();

    double calculateTax(Double income);
}
