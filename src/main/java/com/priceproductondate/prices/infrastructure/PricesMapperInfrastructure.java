package com.priceproductondate.prices.infrastructure;

import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public interface PricesMapperInfrastructure {

    com.priceproductondate.prices.domain.Price priceInfrastructureToDomain(
            Price price
    );

}
