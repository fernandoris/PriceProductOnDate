package com.priceproductondate.prices.infrastructure;

import com.priceproductondate.prices.domain.Price;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNull;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {PricesMapperInfrastructureImpl.class})
public class PricesMapperInfrastructureTest {
    
    @Autowired
    PricesMapperInfrastructure pricesMapperInfrastructure;

    @Test
    public void pricesMapperInfrastructureTest(){
        com.priceproductondate.prices.infrastructure.Price price = null;
        Price ret = pricesMapperInfrastructure.priceInfrastructureToDomain(price);
        assertNull(ret);
    }
}
