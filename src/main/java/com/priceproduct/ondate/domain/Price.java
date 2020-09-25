package com.priceproduct.ondate.domain;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Price {

	@Column(name = "BRAND_ID")
	private Integer brandId;
	
	@Column(name = "START_DATE")
	private Timestamp startDate;
	
	@Column(name = "END_DATE")
	private Timestamp endDate;
	
	@Column(name = "PRICE_LIST")
	private Integer priceList;
	
	@Column(name = "PRODICT_ID")
	private Integer productId;
	
	@Column(name = "PRIORITY")
	private Integer priority;
	
	@Column(name = "PRICE")
	private Double price;
	
	@Column(name = "CURR")
	private String curr;
}
