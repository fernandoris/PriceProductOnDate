package com.priceproductondate.prices.domain.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import com.priceproductondate.prices.domain.Price;
import com.priceproductondate.prices.domain.PricesRepository;
import com.priceproductondate.prices.domain.PricesResponse;
import com.priceproductondate.prices.domain.mapper.PricesMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.priceproductondate.prices.domain.service.PricesService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PricesServiceImpl implements PricesService {

	@Autowired
	PricesMapper pricesMapper;

	private final PricesRepository pricesRepository;

	public PricesServiceImpl(PricesRepository pricesRepository) {
		this.pricesRepository = pricesRepository;
	}

	@Override
	public Optional<PricesResponse> getPrice(Date date, Integer productId, Integer brandId) {
		List<Price> priceList = pricesRepository.findAll();

		List<Predicate<Price>> allPredicates = new ArrayList<>();
		allPredicates.add(p -> p.getProductId().equals(productId));
		allPredicates.add(p -> p.getBrandId().equals(brandId));
		allPredicates.add(p -> p.getStartDate().before(date));
		allPredicates.add(p -> p.getEndDate().after(date));

		Optional<Price> price = priceList.stream()
				.filter(allPredicates.stream().reduce(x -> true, Predicate::and))
				.sorted((p1, p2) -> p2.getPriority().compareTo(p1.getPriority()))
				.findFirst();

		PricesResponse result = pricesMapper.priceToPricesResponse(price.orElse(null));

		return Optional.ofNullable(result);
	}

//	@Override
//	public Optional<OndateResponse> getPrice(Date date, Integer productId, Integer brandId) {
//
//		OndateResponse response = null;
//
//		Optional<Price> priceOpt;
//		try {
//			priceOpt = ondateRepository.findFirstByProductIdAndBrandIdAndStartDateBeforeAndEndDateAfterOrderByPriorityDesc(productId,brandId,date,date);
//		}catch(DataAccessException e) {
//			log.error("Error in database query : {}",e.getMessage());
//			throw e;
//		}
//
//		if(priceOpt.isPresent()) {
//			Price price = priceOpt.get();
//			response = ondateMapper.priceToOndateResponse(price);
//		}
//		Optional<OndateResponse> responseOpt = Optional.ofNullable(response);
//
//		return responseOpt;
//	}

}
