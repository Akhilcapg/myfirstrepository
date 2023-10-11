package com.mobilemodel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mobilemodel.entity.Model;

public interface ModelRepository extends JpaRepository<Model, Long>{

}
