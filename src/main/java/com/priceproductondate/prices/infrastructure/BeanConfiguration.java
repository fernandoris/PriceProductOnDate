package com.priceproductondate.prices.infrastructure;

import com.priceproductondate.prices.domain.PricesRepository;
import com.priceproductondate.prices.domain.service.PricesService;
import com.priceproductondate.prices.domain.service.impl.PricesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    @Autowired
    PricesService pricesService(PricesRepository pricesRepository){
        return new PricesServiceImpl(pricesRepository);
    }

}
