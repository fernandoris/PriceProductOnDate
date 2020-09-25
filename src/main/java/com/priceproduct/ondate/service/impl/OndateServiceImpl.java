package com.priceproduct.ondate.service.impl;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.priceproduct.ondate.domain.OndateResponse;
import com.priceproduct.ondate.domain.Price;
import com.priceproduct.ondate.mapper.OndateMapper;
import com.priceproduct.ondate.repository.OndateRepository;
import com.priceproduct.ondate.service.OndateService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class OndateServiceImpl implements OndateService {
	
	@Autowired
	OndateRepository ondateRepository;
	
	@Autowired
	OndateMapper ondateMapper;
	
	@Override	
	public OndateResponse getPrice(Date date, Integer productId, Integer brandId) {
		
		OndateResponse response = null;
		
		Optional<Price> priceOpt = ondateRepository.findFirstByProductIdAndBrandIdAndStartDateBeforeAndEndDateAfterOrderByPriorityDesc(productId,brandId,date,date);
		
		if(priceOpt.isPresent()) {			
			Price price = priceOpt.get();
			response = ondateMapper.priceToOndateResponse(price);
		}
		
		return response;
	}

}
