package com.nab.currencyexchangeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nab.currencyexchangeservice.bean.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue,Long>{
	
	ExchangeValue findByFromAndTo(String from, String to);
	
}
