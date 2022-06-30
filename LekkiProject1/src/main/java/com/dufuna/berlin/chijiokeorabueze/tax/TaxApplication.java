package com.dufuna.berlin.chijiokeorabueze.tax;

import com.dufuna.berlin.chijiokeorabueze.tax.service.TaxBracketService;
import com.dufuna.berlin.chijiokeorabueze.tax.service.TaxBracketServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class TaxApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaxApplication.class, args);
	}

	double income = 120000;



	// Bean created with the RequiredArgsconstructor to overide default tax brackets.
	@Bean
	TaxBracketService taxBracketService() {
		return new TaxBracketServiceImpl(new double[] {0.00, 0.00, 0.00},
				new double[] {18200.00, 0.00, 0.19},
				new double[] {37000.00, 3572.81, 0.33},
				new double[] {90000.00, 20797.49, 0.37},
				new double[] {180000.00, 54097.12, 0.45}) ;
	}

	// Bean created with the NoArgsconstructor to use default tax brackets.
	@Bean
	TaxBracketService taxBracketService1() {
		return new TaxBracketServiceImpl() ;
	}


	@Bean
    public CommandLineRunner run() {
        return (args -> {
            System.out.println(taxBracketService().calculateTax(income));
			System.out.println(taxBracketService1().calculateTax(income));
        });
    }

}
