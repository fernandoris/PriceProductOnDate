package com.priceproductondate.prices.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
public class Price implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Integer id;

	private Integer brandId;

	private Date startDate;

	private Date endDate;

	private Integer priceList;

	private Integer productId;

	private Integer priority;

	private Double price;

	private String curr;
}
