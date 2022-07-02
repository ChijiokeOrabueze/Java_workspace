package com.dufuna.berlin.chijiokeorabueze.tax.service;

import com.dufuna.berlin.chijiokeorabueze.tax.dto.TaxRequest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class TaxAPIServiceTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void requestIsAcceptedTaxIsCalculatedAndReturned () throws Exception {

        TaxRequest taxRequest = getTaxRequest();
        String taxRequestString = objectMapper.writeValueAsString(taxRequest);

        mockMvc.perform(MockMvcRequestBuilders.post("/api/tax/calculate")
                .contentType(MediaType.APPLICATION_JSON)
                .content(taxRequestString))
                .andExpect(status().isOk());
    }

    private TaxRequest getTaxRequest() {
        return TaxRequest.builder()
                .income(120000)
                .build();
    }

}