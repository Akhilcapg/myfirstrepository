package com.mobilemodel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mobilemodel.entity.Customer;

@Repository
public interface CustomerRepository extends  JpaRepository<Customer, Long>{

	List<Customer> findByCity(String city);

	/*
	 * List<Customer> findByModelName(String modelName);
	 * 
	 * Customer findByImeiNumber(String imeiNumber);
	 */
}
