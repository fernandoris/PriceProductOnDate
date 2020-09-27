package com.priceproduct.ondate.repository;

import java.io.Serializable;
import java.util.Date;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.priceproduct.ondate.domain.Price;


@Repository
public interface OndateRepository extends JpaRepository<Price, Integer>, Serializable {

	/**
	 * Consult in the database the PRICES table filtering by productId, brandId and date. 
	 * Sort the results by priority in descending order and return the first result
	 * @param productId
	 * @param brandId
	 * @param date
	 * @param date2
	 * @return
	 */
	Optional<Price> findFirstByProductIdAndBrandIdAndStartDateBeforeAndEndDateAfterOrderByPriorityDesc(Integer productId,
			Integer brandId, Date date, Date date2);

}
