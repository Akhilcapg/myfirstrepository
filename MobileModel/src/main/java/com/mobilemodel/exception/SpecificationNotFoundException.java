package com.mobilemodel.exception;

public class SpecificationNotFoundException extends RuntimeException {
    public SpecificationNotFoundException(Long specId) {
        super("Specification with ID " + specId + " not found");
    }
}