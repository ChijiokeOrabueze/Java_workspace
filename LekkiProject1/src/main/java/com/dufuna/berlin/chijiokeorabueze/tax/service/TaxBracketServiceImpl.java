package com.dufuna.berlin.chijiokeorabueze.tax.service;


import com.dufuna.berlin.chijiokeorabueze.tax.model.TaxBracket;
import com.dufuna.berlin.chijiokeorabueze.tax.repository.TaxBracketRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;


// This service implements both NoArgsConstructor and RequiredArgsConstructor to accomodate changes in Tax Brackets. The
// NoArgsConstructor will load the default tax brackets while the RequiredArgsConstructor can  be used to overide them.

@NoArgsConstructor
@Service
public class TaxBracketServiceImpl implements TaxBracketService{


    @Autowired
    private TaxBracketRepository repository;


    double[] bracket1 = {0.00, 0.00, 0.00};
    double[] bracket2 = {18200.00, 0.00, 0.19};
    double[] bracket3 = {37000.00, 3572.81, 0.325};
    double[] bracket4 = {90000.00, 20797.49, 0.37};
    double[] bracket5 = {180000.00, 54097.12, 0.45};



    public TaxBracketServiceImpl(double[] bracket1, double[] bracket2, double[] bracket3, double[] bracket4, double[] bracket5) {
        this.bracket1 = bracket1;
        this.bracket2 = bracket2;
        this.bracket3 = bracket3;
        this.bracket4 = bracket4;
        this.bracket5 = bracket5;
    }

    @PostConstruct
    public void setBracketValues () {
        double[][] passedBrackets = {this.bracket1, this.bracket2, this.bracket3, this.bracket4, this.bracket5};
        for (double[] bracket : passedBrackets) {
            repository.save(new TaxBracket(bracket[0], bracket[1], bracket[2]));
        }
    }

    public Iterable<TaxBracket> getBrackets () {
        return repository.findAll();
    };

    public double calculateTax(Double income) {
        ArrayList<TaxBracket> allBrackets = (ArrayList<TaxBracket>) getBrackets();

        for (int i = allBrackets.size() - 1; i >= 0; i--){
            if ( income - allBrackets.get(i).getBracket() >= 0 ) {
                TaxBracket targetBracket = allBrackets.get(i);
                double remainingTaskIncome = income - targetBracket.getBracket();

                double tax = targetBracket.getTaxAmount() + (remainingTaskIncome * targetBracket.getRate());
                return tax;
            }

        }
        throw new IllegalArgumentException("Income value passed is less than 0");
    };


//    @PostConstruct




}
