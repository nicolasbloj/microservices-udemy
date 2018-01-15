package com.nab.limitsservice;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nab.limitsservice.bean.LimitConfig;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class LimitsConfigController {
	
	Logger log = Logger.getLogger(LimitsConfigController.class);
	
	@Autowired
	private Configuration config; 
	
	@GetMapping("/limits")
	public LimitConfig retrieveLimitsForConfiguration(){
		return new LimitConfig(config.getMinimum(),config.getMaximum());
	}

	@GetMapping("/fault-tolerance-example")
	@HystrixCommand(fallbackMethod = "fallbackRetrieveConfiguration")
	public LimitConfig retrieveConfiguration(){
		throw new RuntimeException("Not available");
	}
 
	public LimitConfig fallbackRetrieveConfiguration(){
		return new LimitConfig(1,999);
	}
	
}
	
