package com.dufuna.berlin.chijiokeorabueze.tax.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class TaxRequest {

    private double income;
}
