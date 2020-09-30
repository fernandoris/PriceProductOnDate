package com.priceproductondate.prices.infrastructure;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(MockitoJUnitRunner.class)
public class ProblemTest {
    @InjectMocks
    private Problem problem;

    @Test
    public void problemTest1(){
        String msg = "msg";
        problem.setMessage(msg);
        assertEquals(problem.getMessage(),msg);
    }

    @Test
    public void problemTest2(){
        String logRef = "msg";
        problem.setLogRef(logRef);
        assertEquals(problem.getLogRef(),logRef);
    }

    @Test
    public void problemTest3(){
        Problem problem = new Problem();
        assertNotNull(problem);
    }
}
