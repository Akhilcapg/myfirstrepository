package com.mobilemodel.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mobilemodel.entity.Mobile;
import com.mobilemodel.entity.Specification;


@Repository
public interface SpecificationRepository extends JpaRepository<Specification, Long> {

	
	Specification findBySpecId(Long sid);

}
