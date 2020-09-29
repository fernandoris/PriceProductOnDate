package com.priceproductondate.prices.application;

import com.priceproductondate.prices.domain.PricesResponse;

import java.util.Date;
import java.util.Optional;

public interface GetPriceUseCase {

    Optional<PricesResponse> getPrice(Date date, Integer productId, Integer brandId);

}
