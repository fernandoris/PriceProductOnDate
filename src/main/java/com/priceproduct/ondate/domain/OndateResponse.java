package com.priceproduct.ondate.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class OndateResponse implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer productId;
	
	private Integer brandId;
	
	private Integer priceList;	
	
	private Date startDate;
	
	private Date endDate;
	
	private Double price;
	
	private String curr;

}
