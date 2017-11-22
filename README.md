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


# Test Url
## Eureka Server

http://localhost:8071/ 

##Zuul Server mappings

http://localhost:8081/mappings 

## product-detail

http://localhost:8082/api/product/detail direct
http://localhost:8081/product-v1/api/product/detail G/W

## cutomer-info

http://localhost:8083/api/customer/info  direct 
http://localhost:8081/customer-v1/api/customer/info G/W

## BFF
http://localhost:8084/bff/customer-product/detail direct
http://localhost:8081/bff-v1/bff/customer-product/detail G/W
