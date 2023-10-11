package com.mobilemodel.controller;

import com.mobilemodel.entity.Specification;
import com.mobilemodel.service.SpecificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/specifications")
public class SpecificationController {
    private final SpecificationService specificationService;

    @Autowired
    public SpecificationController(SpecificationService specificationService) {
        this.specificationService = specificationService;
    }

    @GetMapping
    public List<Specification> getAllSpecifications() {
        return specificationService.getAllSpecifications();
    }

    @GetMapping("/{specId}")
    public Specification getSpecificationById(@PathVariable Long specId) {
        return specificationService.getSpecificationById(specId);
    }

    @PostMapping
    public Specification createSpecification(@Valid @RequestBody Specification specification) {
        return specificationService.createSpecification(specification);
    }

    @PutMapping("/{specId}")
    public Specification updateSpecification(@Valid @PathVariable Long specId, @RequestBody Specification specification) {
        return specificationService.updateSpecification(specId, specification);
    }

    @DeleteMapping("/{specId}")
    public void deleteSpecification(@PathVariable Long specId) {
        specificationService.deleteSpecification(specId);
    }
}
