package com.priceproductondate.prices.application;

import com.priceproductondate.prices.domain.PricesResponse;
import com.priceproductondate.prices.domain.service.PricesService;

import java.util.Date;
import java.util.Optional;

public class GetPriceUseCaseImpl implements GetPriceUseCase {

    public GetPriceUseCaseImpl(PricesService pricesService){
        this.pricesService = pricesService;
    }

    private PricesService pricesService;

    @Override
    public Optional<PricesResponse> getPrice(Date date, Integer productId, Integer brandId) {
        return pricesService.getPrice(date,productId,brandId);
    }

}
