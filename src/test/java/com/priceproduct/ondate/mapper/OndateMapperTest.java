package com.priceproduct.ondate.mapper;

import com.priceproduct.ondate.domain.OndateResponse;
import org.junit.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.Assert.assertNull;

public class OndateMapperTest {

    OndateMapper ondateMapper = Mappers.getMapper(OndateMapper.class);

    @Test
    public void ondateMapperTest(){
        OndateResponse res = ondateMapper.priceToOndateResponse(null);
        assertNull(res);
    }
}
