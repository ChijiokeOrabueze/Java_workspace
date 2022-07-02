package com.dufuna.berlin.chijiokeorabueze.tax.controller;



import com.dufuna.berlin.chijiokeorabueze.tax.dto.TaxRequest;
import com.dufuna.berlin.chijiokeorabueze.tax.dto.TaxResponse;
import com.dufuna.berlin.chijiokeorabueze.tax.service.TaxAPIService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tax/calculate")
@RequiredArgsConstructor
public class TaxController {

    private final TaxAPIService taxAPIService;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public TaxResponse getUserTaxAmount (@RequestBody TaxRequest taxRequest) {

        return taxAPIService.getUserTaxAmount(taxRequest);

    }



}
