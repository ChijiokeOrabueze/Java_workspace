package com.dufuna.berlin.chijiokeorabueze.tax.repository;

import com.dufuna.berlin.chijiokeorabueze.tax.model.TaxBracket;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaxBracketRepository extends CrudRepository<TaxBracket, Long> {

}
