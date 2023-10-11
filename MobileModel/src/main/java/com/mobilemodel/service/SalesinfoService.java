package com.mobilemodel.service;

import com.mobilemodel.entity.Salesinfo;

import java.util.List;

public interface SalesinfoService {
    List<Salesinfo> getAllSalesinfo();

    Salesinfo getSalesinfoById(Long saleId);

    Salesinfo createSalesinfo(Salesinfo salesinfo);

    Salesinfo updateSalesinfo(Long saleId, Salesinfo salesinfo);

    void deleteSalesinfo(Long saleId);
}
