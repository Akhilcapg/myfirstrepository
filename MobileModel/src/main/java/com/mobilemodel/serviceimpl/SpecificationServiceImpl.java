package com.mobilemodel.serviceimpl;



import com.mobilemodel.entity.Specification;
import com.mobilemodel.exception.SpecificationNotFoundException;
import com.mobilemodel.repository.SpecificationRepository;
import com.mobilemodel.service.SpecificationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SpecificationServiceImpl implements SpecificationService {
    private final SpecificationRepository specificationRepository;

    @Autowired
    public SpecificationServiceImpl(SpecificationRepository specificationRepository) {
        this.specificationRepository = specificationRepository;
    }

    @Override
    public List<Specification> getAllSpecifications() {
        return specificationRepository.findAll();
    }

    @Override
    public Specification getSpecificationById(Long specId) {
        Optional<Specification> specification = specificationRepository.findById(specId);
        if (specification.isPresent()) {
            return specification.get();
        } else {
            throw new SpecificationNotFoundException(specId);
        }
    }

    @Override
    public Specification createSpecification(Specification specification) {
        return specificationRepository.save(specification);
    }

    @Override
    public Specification updateSpecification(Long specId, Specification specification) {
        if (specificationRepository.existsById(specId)) {
            specification.setSpecId(specId);
            return specificationRepository.save(specification);
        }
        return null; // Handle this as needed, e.g., return a meaningful error response.
    }

    @Override
    public void deleteSpecification(Long specId) {
        specificationRepository.deleteById(specId);
    }
}
