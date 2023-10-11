package com.mobilemodel.controller;

import com.mobilemodel.entity.Offer;
import com.mobilemodel.service.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/offers")
public class OfferController {
    private final OfferService offerService;

    @Autowired
    public OfferController(OfferService offerService) {
        this.offerService = offerService;
    }

    @GetMapping
    public List<Offer> getAllOffers() {
        return offerService.getAllOffers();
    }

    @GetMapping("/{offerId}")
    public Offer getOfferById(@PathVariable Long offerId) {
        return offerService.getOfferById(offerId);
    }

    @PostMapping
    public Offer createOffer(@Valid@RequestBody Offer offer) {
        return offerService.createOffer(offer);
    }

    @PutMapping("/{offerId}")
    public Offer updateOffer(@Valid @PathVariable Long offerId, @RequestBody Offer offer) {
        return offerService.updateOffer(offerId, offer);
    }

    @DeleteMapping("/{offerId}")
    public void deleteOffer(@PathVariable Long offerId) {
        offerService.deleteOffer(offerId);
    }
}
