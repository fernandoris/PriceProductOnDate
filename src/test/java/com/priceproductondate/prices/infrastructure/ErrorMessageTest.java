package com.priceproductondate.prices.infrastructure;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;

import static org.junit.Assert.assertNotNull;

@RunWith(MockitoJUnitRunner.class)
public class ErrorMessageTest {

    @Test
    public void errorMessageTest1(){

        ErrorMessage errorMessage = new ErrorMessage();
        errorMessage.setErrors(new ArrayList<>());

        assertNotNull(errorMessage.getErrors());

    }

}
