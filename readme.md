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
	curl -X POST http://localhost:port/bus/refresh UPDATE ALL INSTANCES OF MICROSERVICE
	
	port: port of any microservice's instance.
	
---RABBIT
	Ubuntu 16.04 LTS
	
apt-get update

Link to download erlang:
https://www.erlang-solutions.com/resources/download.html
	>=1.19	
		esl-erlang_20.2.2-1-ubuntu-artful_amd64.deb
	
apt-get install rabbitmq-server

systemctl enable rabbitmq-server

systemctl start rabbitmq-server

systemctl status rabbitmq-server

rabbitmq-plugins enable rabbitmq_management

rabbitmqctl add_user admin admin

rabbitmqctl set_user_tags admin administrator

rabbitmqctl set_permissions -p / admin ".*" ".*" ".*"

http://localhost:15672


--- PORTS AND PROFILES.
	java -jar -Dserver.port=8085 -Dspring.profile=qa application-0.0.1-SNAPSHOT.jar
	

