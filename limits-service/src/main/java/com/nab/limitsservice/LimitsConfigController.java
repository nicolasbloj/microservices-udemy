package com.nab.limitsservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigController {

	@GetMapping("/limits")
	public LimitConfig retrieveLimitsForConfiguration(){
		return new LimitConfig(999,9);
	}
}
	