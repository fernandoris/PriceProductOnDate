package com.priceproductondate.prices.infrastructure;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
@RunWith(MockitoJUnitRunner.class)
public class PricesControllerAdviceTest {

    @Mock
    MethodArgumentTypeMismatchException exception;

    @Test
    public void pricesControllerAdviceTest(){
        PricesControllerAdvice pricesControllerAdvice = new PricesControllerAdvice();

        when(exception.getCause()).thenReturn(null);
        when(exception.getMessage()).thenReturn("message");

        ResponseEntity<ErrorMessage> ret = pricesControllerAdvice.handleIllegalArgumentException(exception);
        assertEquals(ret.getStatusCode(), HttpStatus.BAD_REQUEST);
    }

}
