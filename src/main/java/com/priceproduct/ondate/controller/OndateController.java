package com.priceproduct.ondate.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.priceproduct.ondate.domain.OndateResponse;
import com.priceproduct.ondate.service.OndateService;
import com.priceproduct.ondate.utils.Constants;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class OndateController {
	
	@Autowired
	OndateService ondateService;
	
	/**
	 * Endpoint for price query
	 * @param date
	 * @param productId
	 * @param brandId
	 * @return
	 */
	@GetMapping(path="/prices",produces=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<OndateResponse> getPrice(
    		@RequestParam(required = true) @DateTimeFormat(pattern = Constants.DATE_REQUEST_PATTERN) Date  date, 
    		@RequestParam(required = true) Integer productId,
			@RequestParam(required = true) Integer brandId 
    ){
		log.info("Starting getPrice() method : date {} productId {} brandId {}",date.toString(),productId,brandId);
		
		ResponseEntity<OndateResponse> result;		
		OndateResponse response = ondateService.getPrice(date,productId,brandId);
		
		if(response == null) {
			result = ResponseEntity.noContent().build();
		}else {
			result = ResponseEntity.ok(response);
		}
		
		log.info("Finishing getPrice() method");
        return result;
    
	}

}
