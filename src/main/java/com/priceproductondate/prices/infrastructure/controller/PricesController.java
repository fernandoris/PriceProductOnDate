package com.priceproductondate.prices.infrastructure.controller;

import java.util.Date;
import java.util.Optional;

import com.priceproductondate.prices.domain.PricesResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.priceproductondate.prices.domain.service.PricesService;
import com.priceproductondate.prices.domain.utils.Constants;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class PricesController {
	
	@Autowired
	PricesService pricesService;
	
	/**
	 * Endpoint for price query
	 * @param date
	 * @param productId
	 * @param brandId
	 * @return
	 */
	@GetMapping(path="/prices",produces=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PricesResponse> getPrice(
    		@RequestParam(required = true) @DateTimeFormat(pattern = Constants.DATE_REQUEST_PATTERN) Date  date, 
    		@RequestParam(required = true) Integer productId,
			@RequestParam(required = true) Integer brandId 
    ){
		log.info("Starting getPrice() method : date {} productId {} brandId {}",date.toString(),productId,brandId);

		Optional<PricesResponse> result = pricesService.getPrice(date, productId, brandId);
		
		log.info("Finishing getPrice() method");
        return ResponseEntity.of( result );
    
	}

}
