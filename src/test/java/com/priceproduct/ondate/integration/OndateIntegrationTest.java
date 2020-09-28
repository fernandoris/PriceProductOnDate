package com.priceproduct.ondate.integration;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.priceproduct.ondate.mapper.OndateMapper;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {OndateMapper.class},properties = { "spring.jpa.database-platform=org.hibernate.dialect.H2Dialect" })
@ComponentScan("com.priceproduct.ondate")
@Sql("/data.sql")
@AutoConfigureTestDatabase
@AutoConfigureMockMvc
@Slf4j
public class OndateIntegrationTest {
	
	@Autowired
	private MockMvc mockMvc;	
	
	private String productId;
	
	private String brandId;
	
	@Before
	public void init() {
		productId = "35455";
		brandId = "1";
	}
	
	@Test
    public void pricesTest1() throws Exception {
		
		String date = "2020-06-14-10.00.00";
		
		Double expected = 35.5;
		
        String response = mockMvc.perform(get("/prices")
        		.param("date", date)
        		.param("productId", productId)
        		.param("brandId", brandId))
                .andExpect(status().is(HttpStatus.OK.value()))
                .andExpect(jsonPath("$.price", is(expected)))
                .andReturn().getResponse().getContentAsString();
 
        log.info("response: " + response);
    }
	
	@Test
    public void pricesTest2() throws Exception {
		
		String date = "2020-06-14-16.00.00";
		
		Double expected = 25.45;
		
        String response = mockMvc.perform(get("/prices")
        		.param("date", date)
        		.param("productId", productId)
        		.param("brandId", brandId))
                .andExpect(status().is(HttpStatus.OK.value()))
                .andExpect(jsonPath("$.price", is(expected)))
                .andReturn().getResponse().getContentAsString();
 
        log.info("response: " + response);
    }
	
	@Test
    public void pricesTest3() throws Exception {
		
		String date = "2020-06-14-21.00.00";
		
		Double expected = 35.5;
		
        String response = mockMvc.perform(get("/prices")
        		.param("date", date)
        		.param("productId", productId)
        		.param("brandId", brandId))
                .andExpect(status().is(HttpStatus.OK.value()))
                .andExpect(jsonPath("$.price", is(expected)))
                .andReturn().getResponse().getContentAsString();
 
        log.info("response: " + response);
    }
	
	@Test
    public void pricesTest4() throws Exception {
		
		String date = "2020-06-15-10.00.00";
		
		Double expected = 30.5;
		
        String response = mockMvc.perform(get("/prices")
        		.param("date", date)
        		.param("productId", productId)
        		.param("brandId", brandId))
                .andExpect(status().is(HttpStatus.OK.value()))
                .andExpect(jsonPath("$.price", is(expected)))
                .andReturn().getResponse().getContentAsString();
 
        log.info("response: " + response);
    }
	
	@Test
    public void pricesTest5() throws Exception {
		
		String date = "2020-06-16-21.00.00";
		
		Double expected = 38.95;
		
        String response = mockMvc.perform(get("/prices")
        		.param("date", date)
        		.param("productId", productId)
        		.param("brandId", brandId))
                .andExpect(status().is(HttpStatus.OK.value()))
                .andExpect(jsonPath("$.price", is(expected)))
                .andReturn().getResponse().getContentAsString();
 
        log.info("response: " + response);
    }
	
	@Test
    public void pricesTest6() throws Exception {
		
		String date = "2018-06-16-21.00.00";		
		
        String response = mockMvc.perform(get("/prices")
        		.param("date", date)
        		.param("productId", productId)
        		.param("brandId", brandId))
                .andExpect(status().is(HttpStatus.NOT_FOUND.value()))
                .andReturn().getResponse().getContentAsString();
 
        log.info("response: " + response);
    }

}
