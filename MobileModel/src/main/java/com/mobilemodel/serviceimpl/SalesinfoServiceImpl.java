package com.mobilemodel.serviceimpl;



import com.mobilemodel.entity.Salesinfo;
import com.mobilemodel.exception.SalesinfoNotFoundException;
import com.mobilemodel.repository.SalesInfoRepository;
import com.mobilemodel.service.SalesinfoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SalesinfoServiceImpl implements SalesinfoService {
    private final SalesInfoRepository salesinfoRepository;

    @Autowired
    public SalesinfoServiceImpl(SalesInfoRepository salesinfoRepository) {
        this.salesinfoRepository = salesinfoRepository;
    }

    @Override
    public List<Salesinfo> getAllSalesinfo() {
        return salesinfoRepository.findAll();
    }

    @Override
    public Salesinfo getSalesinfoById(Long saleId) {
        Optional<Salesinfo> salesinfo = salesinfoRepository.findById(saleId);
        return salesinfo.orElse(null);
    }

    @Override
    public Salesinfo createSalesinfo(Salesinfo salesinfo) {
        return salesinfoRepository.save(salesinfo);
    }

    @Override
    public Salesinfo updateSalesinfo(Long saleId, Salesinfo salesinfo) {
        if (salesinfoRepository.existsById(saleId)) {
            salesinfo.setSaleId(saleId);
            return salesinfoRepository.save(salesinfo);
        } else {
            throw new SalesinfoNotFoundException(saleId);
        }
    }

    @Override
    public void deleteSalesinfo(Long saleId) {
        salesinfoRepository.deleteById(saleId);
    }
}
