package com.priceproductondate.prices.infrastructure;


import com.priceproductondate.prices.domain.Price;
import com.priceproductondate.prices.domain.PricesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PricesJpaRepositoryImpl implements PricesRepository {

    @Autowired
    com.priceproductondate.prices.infrastructure.repository.PricesRepository pricesRepository;

    @Autowired
    PricesMapperInfrastructure pricesMapper;

    @Override
    public List<Price> findAll() {
        return pricesRepository.findAll().stream()
                .map(price -> pricesMapper.priceInfrastructureToDomain(price)).collect(Collectors.toList());
    }

}
