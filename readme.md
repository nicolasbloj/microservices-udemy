--SLEUTH

http://localhost:8765/currency-conversion-service/currency-converter/feign/from/EUR/to/INR/quantity/150
  
  REQUEST -> UNIQUE ID 

  [currency-conversion-service,d3638a1df504009e,f074a1135f0cd93f,true]
  [currency-exchange-service,d3638a1df504009e,3a51df6adda3767c,true]
  [zuul-api-gateway-server,d3638a1df504009e,3a51df6adda3767c,true]
  
  
---ACTUATOR -> Spring Boot 1.5.2.RELEASE, Spring Cloud Dalston.RELEASE

application.properties
	management.security.enabled=false
	
GET /health
POST /refresh --> update config changes


---SPRING CLOUD BUS

Testing:
	POST /refresh - UPDATE ALL INSTANCES OF MICROSERVICE
	
	

