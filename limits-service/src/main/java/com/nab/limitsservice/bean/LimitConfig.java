package com.nab.limitsservice.bean;

public class LimitConfig {

	private int minimun;
	private int maximun;
	
	protected LimitConfig() {
		
	}
	
	public LimitConfig(int min, int max) {
		super();
		this.minimun=min;
		this.maximun=max;
	}

	public int getMinimun() {
		return minimun;
	}

	public void setMinimun(int minimun) {
		this.minimun = minimun;
	}

	public int getMaximun() {
		return maximun;
	}

	public void setMaximun(int maximun) {
		this.maximun = maximun;
	}
	
	

}
