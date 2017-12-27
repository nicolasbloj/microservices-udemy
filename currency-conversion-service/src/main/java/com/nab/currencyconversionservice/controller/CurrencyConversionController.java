package com.nab.currencyconversionservice.controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.nab.currencyconversionservice.bean.CurrencyConversion;
import com.nab.currencyconversionservice.proxy.CurrencyExchangeServiceProxy;

@RestController 
@RequestMapping("/currency-converter")
public class CurrencyConversionController {
	
	@Autowired
	private CurrencyExchangeServiceProxy proxy;
	
	@GetMapping("/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversion retrieveCurrencyConversion(
			@PathVariable String from, 
			@PathVariable String to,
			@PathVariable BigDecimal quantity
	) {
		
		String url_currency_exchange = "http://localhost:8000/currency-exchange/from/{from}/to/{to}";
		
		Map<String, String> uriVariables = new HashMap<String, String>();
		uriVariables.put("from",from);
		uriVariables.put("to",to);
		
		ResponseEntity<CurrencyConversion> responseEntity = 
				new RestTemplate().getForEntity(
						url_currency_exchange, 
						CurrencyConversion.class, 
						uriVariables);
		
		CurrencyConversion currencyConversion = responseEntity.getBody();
		currencyConversion.setQuantity(quantity);
		currencyConversion.calculateTotalAmount();
		
		return currencyConversion;
		
		
		//return new CurrencyConversion(1L,from,to,BigDecimal.ONE,quantity,quantity,0);
	}
	
	@GetMapping("/feign/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversion retrieveCurrencyConversionFeign(
			@PathVariable String from, 
			@PathVariable String to,
			@PathVariable BigDecimal quantity
	) {
		
		
		CurrencyConversion currencyConversion = proxy.retrieveExchangeValue(from, to);
		
		currencyConversion.setQuantity(quantity);
		currencyConversion.calculateTotalAmount();
		
		return currencyConversion;
		
		
		//return new CurrencyConversion(1L,from,to,BigDecimal.ONE,quantity,quantity,0);
	}
}
