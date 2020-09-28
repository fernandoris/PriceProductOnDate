package com.priceproductondate.prices.domain;

import java.util.List;

public interface PricesRepository {

    public List<Price> findAll();

}
