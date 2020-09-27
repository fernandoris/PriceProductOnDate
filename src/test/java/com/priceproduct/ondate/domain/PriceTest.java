package com.priceproduct.ondate.domain;


import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import com.priceproduct.ondate.utils.Constants;

@RunWith(MockitoJUnitRunner.class)
public class PriceTest {

	@InjectMocks
	private Price price;
	
	@Test
	public void PriceTest1() throws ParseException
	{
		//Test for over 90% code coverage
		
		Integer brandId = new Integer("1");
		Integer id = new Integer("2");
		Double priceDouble = new Double("30.5");
		Integer priceList = new Integer("3");
		Integer priority = new Integer("4");
		Integer productId = new Integer("5");
		
		price.setBrandId(Integer.valueOf("1"));
		price.setCurr("EUR");
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(Constants.DATE_REQUEST_PATTERN);
		Date date;		
		date = simpleDateFormat.parse("2020-06-14-10.00.34");		
		price.setEndDate(date);
		price.setStartDate(date);
		price.setId(id);
		price.setPrice(priceDouble);
		price.setPriceList(priceList);
		price.setPriority(priority);
		price.setProductId(productId);
		
		assertEquals(price.getBrandId(),brandId);
		assertEquals(price.getCurr(),"EUR");
		assertEquals(price.getStartDate(),date);
		assertEquals(price.getEndDate(),date);
		assertEquals(price.getId(),id);
		assertEquals(price.getPrice(),priceDouble);
		assertEquals(price.getPriceList(),priceList);
		assertEquals(price.getPriority(),priority);
		assertEquals(price.getProductId(),productId);
	}
	
}
