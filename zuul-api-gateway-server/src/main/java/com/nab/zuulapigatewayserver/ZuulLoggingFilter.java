package com.nab.zuulapigatewayserver;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

@Component
public class ZuulLoggingFilter extends ZuulFilter {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public Object run() {

		HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
		
		logger.info("request -> {} request uri -> {} ", request, request.getRequestURI());

		return null;

	} 
	// http://localhost:8765/{SERVICE-NAME}/{URI}
	// http://localhost:8765/currency-exchange-service/currency-exchange/from/EUR/to/INR/

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public int filterOrder() {
		// Podemos tener varios filtros.
		return 1;
	}

	@Override
	public String filterType() {
		// pre, post, error
		return "pre";
	}

}
