package com.priceproductondate.prices.infrastructure;

import org.springframework.core.NestedRuntimeException;

import java.util.function.Supplier;

public class PriceNotFoundException extends NestedRuntimeException {

    public PriceNotFoundException(String msg) {
        super(msg);
    }

    public PriceNotFoundException(String msg, Throwable cause) {
        super(msg, cause);
    }

}
