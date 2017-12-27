package com.nab.currencyconversionservice.proxy;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.nab.currencyconversionservice.bean.CurrencyConversion;

@FeignClient(name="currency-exchange-service",url="localhost:8000")
public interface CurrencyExchangeServiceProxy {
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversion
		retrieveExchangeValue(@PathVariable("from") String from, @PathVariable("to") String to);

}
