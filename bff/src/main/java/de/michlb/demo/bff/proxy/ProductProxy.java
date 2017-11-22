package de.michlb.demo.bff.proxy;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("product-v1")
public interface ProductProxy {

  @RequestMapping(value = "api/product/detail", method = RequestMethod.GET)
  String detail();
}
