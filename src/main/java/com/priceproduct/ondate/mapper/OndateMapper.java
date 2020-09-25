package com.priceproduct.ondate.mapper;

import org.mapstruct.Mapper;

import com.priceproduct.ondate.domain.OndateResponse;
import com.priceproduct.ondate.domain.Price;

@Mapper(componentModel="spring")
public interface OndateMapper {
	
	OndateResponse priceToOndateResponse(Price price);

}
