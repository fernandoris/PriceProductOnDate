package com.priceproduct.ondate.controller;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.priceproduct.ondate.domain.OndateResponse;
import com.priceproduct.ondate.utils.Constants;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(path = "/prices")
@Slf4j
public class OndateController {
	
	/**
	 * Endpoint for price query
	 * @param date
	 * @param productId
	 * @param brandId
	 * @return
	 */
	@GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<OndateResponse> getPrice(
    		@RequestParam(required = false) @DateTimeFormat(pattern = Constants.DATE_REQUEST_PATTERN) Date  date, 
    		@RequestParam(required = false) Integer productId,
			@RequestParam(required = false) Integer brandId 
    ){
		log.info("Starting getPrice() method : date {} productId {} brandId {}",date.toString(),productId,brandId);
		
		OndateResponse response = new OndateResponse();
		
		log.info("Finishing getPrice() method");
        return ResponseEntity.ok(response);
    
	}

}
