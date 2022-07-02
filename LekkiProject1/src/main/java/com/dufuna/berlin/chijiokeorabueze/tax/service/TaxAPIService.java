package com.dufuna.berlin.chijiokeorabueze.tax.service;


import com.dufuna.berlin.chijiokeorabueze.tax.dto.TaxRequest;
import com.dufuna.berlin.chijiokeorabueze.tax.dto.TaxResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaxAPIService {

    @Autowired
    TaxBracketService taxBracketService;

    public TaxResponse getUserTaxAmount (TaxRequest taxRequest) {

        double calculatedTax = taxBracketService.calculateTax(taxRequest.getIncome());

        return TaxResponse.builder()
                .tax(calculatedTax)
                .build();
    }


}
