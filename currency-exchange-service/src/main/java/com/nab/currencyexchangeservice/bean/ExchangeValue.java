package com.nab.currencyexchangeservice.bean;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity //(name="exchange_value")
public class ExchangeValue {
	
	@Id
	private Long id;
	
	@Column(name="currency_from")
	private String from;
	
	@Column(name="currency_to")
	private String to;
	
	@Column(name="convertion_multiple")
	private BigDecimal covertionMultiple;

	@Column(name="port")
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
