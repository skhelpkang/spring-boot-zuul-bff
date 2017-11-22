package de.michlb.demo.bff.controller;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import de.michlb.demo.bff.feign.CustomerClient;
import de.michlb.demo.bff.feign.ProductClient;

@RestController
@RequestMapping("/bff/customer-product")
public class ProductController {

	private static Logger log = LoggerFactory.getLogger(ProductController.class);

	@Autowired
	private ProductClient productClient;

	@Autowired
	private CustomerClient customerClient;

	/**
	 * This call needs to be split into at least two calls and the result needs to
	 * be aggreagted
	 *
	 * @return Map of String of the service as key and the JSON result ass the value
	 */
	@RequestMapping(value = "/detail", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Map<String, String> productDetail(HttpServletRequest request) {
		printHeader(request);

		Map<String, String> aggregatedResult = new HashMap<>();

		aggregatedResult.put("product", productClient.detail());
		aggregatedResult.put("customer", customerClient.info());

		return aggregatedResult;
	}

	private void printHeader(HttpServletRequest request) {
		Enumeration headerNames = request.getHeaderNames();
		while (headerNames.hasMoreElements()) {
			String key = (String) headerNames.nextElement();
			String value = request.getHeader(key);
			log.info("header, {}={}",key, value);
		}
	}
}
