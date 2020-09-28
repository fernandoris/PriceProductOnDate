package com.priceproductondate.prices.domain.service;

import java.util.Date;
import java.util.Optional;

import com.priceproductondate.prices.domain.PricesResponse;

public interface PricesService {

	/**
	 * Return a Price for the output by filtering by date, productId and brandId parameters
	 * @param date
	 * @param productId
	 * @param brandId
	 * @return
	 */
	Optional<PricesResponse> getPrice(Date date, Integer productId, Integer brandId);

}
