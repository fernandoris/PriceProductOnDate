package com.priceproduct.ondate.service.impl;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.priceproduct.ondate.domain.OndateResponse;
import com.priceproduct.ondate.service.OndateService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class OndateServiceImpl implements OndateService {
	
	@Override	
	public OndateResponse getPrice(Date date, Integer productId, Integer brandId) {
		// TODO Auto-generated method stub
		return new OndateResponse();
	}

}
