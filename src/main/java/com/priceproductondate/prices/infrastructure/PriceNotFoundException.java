package com.priceproductondate.prices.infrastructure;

public class PriceNotFoundException extends RuntimeException {

    public PriceNotFoundException(String msg) {
        super(msg);
    }

    public PriceNotFoundException(String msg, Throwable cause) {
        super(msg, cause);
    }

}
