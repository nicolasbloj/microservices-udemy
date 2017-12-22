package com.nab.currencyconversionservice.bean;

import java.math.BigDecimal;

public class CurrencyConversion {

	private Long id;
	private String from;
	private String to;
	private int port;

	private BigDecimal quantity;

	private BigDecimal conversionMultiple;
	private BigDecimal totalAmount;

	protected CurrencyConversion() {

	}

	public CurrencyConversion(Long id, String from, String to,
			BigDecimal conversionMultiple, int port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.port = port;

		this.conversionMultiple = conversionMultiple;
	
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

	public BigDecimal getQuantity() {
		return quantity;
	}

	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}

	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public int getPort() {
		return port;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	public void calculateTotalAmount() {
		totalAmount = this.quantity.multiply(this.conversionMultiple);
	}
	
	
	
	
}
