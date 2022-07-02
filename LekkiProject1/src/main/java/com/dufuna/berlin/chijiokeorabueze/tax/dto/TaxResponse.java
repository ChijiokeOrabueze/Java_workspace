package com.dufuna.berlin.chijiokeorabueze.tax.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class TaxResponse {

    private double tax;

}
