package com.mobilemodel.exception;

// Import statements...

public class SalesinfoNotFoundException extends RuntimeException {
    public SalesinfoNotFoundException(Long saleId) {
        super("Salesinfo with ID " + saleId + " not found");
    }
}

