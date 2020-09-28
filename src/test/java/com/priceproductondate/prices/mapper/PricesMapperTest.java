package com.priceproductondate.prices.mapper;

import com.priceproductondate.prices.domain.PricesResponse;
import com.priceproductondate.prices.domain.mapper.PricesMapper;
import org.junit.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.Assert.assertNull;

public class PricesMapperTest {

    PricesMapper pricesMapper = Mappers.getMapper(PricesMapper.class);

    @Test
    public void ondateMapperTest(){
        PricesResponse res = pricesMapper.priceToPricesResponse(null);
        assertNull(res);
    }
}
