package com.nab.currencyexchangeservice.bean;

import java.math.BigDecimal;

public class ExchangeValue {
	
	private Long id;
	private String from;
	private String to;
	private BigDecimal covertionMultiple;
	private int port;
	
	protected ExchangeValue() {
		
	}
	
	public ExchangeValue(Long id, String from, String to, BigDecimal covertionMultiple) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.covertionMultiple = covertionMultiple;
	}

	public Long getId() {
		return id;
	}

	public String getFrom() {
		return from;
	}

	public String getTo() {
		return to;
	}

	public BigDecimal getCovertionMultiple() {
		return covertionMultiple;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
	
	
	
	
}
