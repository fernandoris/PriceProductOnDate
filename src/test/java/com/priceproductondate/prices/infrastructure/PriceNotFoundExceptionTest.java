package com.priceproductondate.prices.infrastructure;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(MockitoJUnitRunner.class)
public class PriceNotFoundExceptionTest {

    @Test
    public void priceNotFoundExceptionTest(){
        PriceNotFoundException priceNotFoundException = new PriceNotFoundException("sfd",new Throwable());
        assertNotNull(priceNotFoundException);
    }
}
