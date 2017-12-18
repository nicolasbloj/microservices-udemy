package com.nab.limitsservice;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nab.limitsservice.bean.LimitConfig;

@RestController
public class LimitsConfigController {
	
	Logger log = Logger.getLogger(LimitsConfigController.class);
	
	@Autowired
	private Configuration config; 
	
	@GetMapping("/limits")
	public LimitConfig retrieveLimitsForConfiguration(){
		return new LimitConfig(config.getMinimum(),config.getMaximum());
	}
}
	