package com.mobilemodel.controller;

import com.mobilemodel.entity.Salesinfo;
import com.mobilemodel.service.SalesinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/salesinfo")
public class SalesinfoController {
    private final SalesinfoService salesinfoService;

    @Autowired
    public SalesinfoController(SalesinfoService salesinfoService) {
        this.salesinfoService = salesinfoService;
    }

    @GetMapping
    public List<Salesinfo> getAllSalesinfo() {
        return salesinfoService.getAllSalesinfo();
    }

    @GetMapping("/{saleId}")
    public Salesinfo getSalesinfoById(@PathVariable Long saleId) {
        return salesinfoService.getSalesinfoById(saleId);
    }

    @PostMapping
    public Salesinfo createSalesinfo( @RequestBody Salesinfo salesinfo) {
        return salesinfoService.createSalesinfo(salesinfo);
    }

    @PutMapping("/{saleId}")
    public Salesinfo updateSalesinfo( @PathVariable Long saleId,  @RequestBody Salesinfo salesinfo) {
        return salesinfoService.updateSalesinfo(saleId, salesinfo);
    }

    @DeleteMapping("/{saleId}")
    public void deleteSalesinfo(@PathVariable Long saleId) {
        salesinfoService.deleteSalesinfo(saleId);
    }
}
