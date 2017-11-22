package de.michlb.demo.bff.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("customer-v1")
public interface CustomerClient {

  @RequestMapping(value = "api/customer/info", method = RequestMethod.GET)
  String info();

}
