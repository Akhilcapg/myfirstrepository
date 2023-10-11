package com.mobilemodel.service;

import com.mobilemodel.entity.Specification;

import java.util.List;

public interface SpecificationService {
    List<Specification> getAllSpecifications();

    Specification getSpecificationById(Long specId);

    Specification createSpecification(Specification specification);

    Specification updateSpecification(Long specId, Specification specification);

    void deleteSpecification(Long specId);
}
