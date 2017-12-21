package com.nab.currencyexchangeservice.bean;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class ExchangeValue {
	
	@Id
	private Long id;
	
	@Column(name="currency_from")
	private String from;
	
	@Column(name="currency_to")
	private String to;
	
	@Column(name="conversion_multiple")
	private BigDecimal coversionMultiple;

	@Column(name="port")
	private int port;
	
	protected ExchangeValue() {
		
	}
	
	public ExchangeValue(Long id, String from, String to, BigDecimal coversionMultiple) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.coversionMultiple = coversionMultiple;
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

	public BigDecimal getCoverSionMultiple() {
		return coversionMultiple;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
	
}
