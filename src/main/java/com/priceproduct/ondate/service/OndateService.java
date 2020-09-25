package com.priceproduct.ondate.service;

import java.util.Date;

import com.priceproduct.ondate.domain.OndateResponse;

public interface OndateService {

	/**
	 * Return a Price for the output by filtering by date, productId and brandId parameters
	 * @param date
	 * @param productId
	 * @param brandId
	 * @return
	 */
	OndateResponse getPrice(Date date, Integer productId, Integer brandId);

}
