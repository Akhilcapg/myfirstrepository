package com.mobilemodel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mobilemodel.entity.Salesinfo;


public interface SalesInfoRepository extends JpaRepository<Salesinfo, Long>{
	
	Salesinfo findBySaleId(Long sid);
	

}
