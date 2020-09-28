package com.priceproductondate.prices.domain.mapper;

import com.priceproductondate.prices.domain.Price;
import com.priceproductondate.prices.domain.PricesResponse;
import org.mapstruct.Mapper;



@Mapper(componentModel="spring")
public interface PricesMapper {
	
	PricesResponse priceToPricesResponse(Price price);

}
