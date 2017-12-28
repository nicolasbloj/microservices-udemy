package com.nab.currencyexchangeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nab.currencyexchangeservice.bean.ExchangeValue;
import com.nab.currencyexchangeservice.repository.ExchangeValueRepository;

@RestController
public class CurrencyExchangeController {

  @Autowired
  Environment environment;

  @Autowired
  ExchangeValueRepository exchangeValueRepository;

  @GetMapping("/currency-exchange/from/{from}/to/{to}")
  public ExchangeValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {
    ExchangeValue exchangeValue = exchangeValueRepository.findByFromAndTo(from, to);
    exchangeValue.setPort((Integer.parseInt(environment.getProperty("local.server.port"))));
    // Usamos el puerto para determinar que instancia nos esta respondiendo cuando hagamos uso de
    // este servicio
    // ya que estaremos trabajando con LOAD BALANCE - RIBBON

    return exchangeValue;
  }
}
