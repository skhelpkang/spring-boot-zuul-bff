# Sample for Zuul usage with integrated BFF Pattern Controller

## eureka
Netfilx Eureka Discovery Server

## zuul
Netfilx Zuul Proxy Server

## product
Spring Boot RESTful service for a simple sample
- gives a simple Product object as JSON

## customer
Spring Boot RESTful service for a simple sample
- gives a simple Customer object as JSON


## Test Url
### Eureka Server
http://localhost:8071/ 

### Zuul Server mappings
http://localhost:8081/mappings 

### product-detail
http://localhost:8082/api/product/detail Product Service direct

http://localhost:8081/product-v1/api/product/detail Product Service via Zuul

### cutomer-info
http://localhost:8083/api/customer/info Customer Service direct 

http://localhost:8081/customer-v1/api/customer/info Customer Service via Zuul

### Aggregation
http://localhost:8081/bff/customer-product/detail Call Zuul for aggregated info
