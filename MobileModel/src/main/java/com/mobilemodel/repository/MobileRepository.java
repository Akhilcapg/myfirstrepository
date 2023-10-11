package com.mobilemodel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mobilemodel.entity.Mobile;
@Repository

public interface MobileRepository extends JpaRepository<Mobile, Long> {

	List<Mobile> findByPrice(double price);

}
