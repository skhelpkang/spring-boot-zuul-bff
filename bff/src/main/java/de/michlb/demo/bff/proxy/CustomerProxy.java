package de.michlb.demo.bff.proxy;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("customer-v1")
public interface CustomerProxy {

  @RequestMapping(value = "api/customer/info", method = RequestMethod.GET)
  String info();

}
