package com.mobilemodel.serviceimpl;


import com.mobilemodel.entity.Offer;
import com.mobilemodel.repository.OfferRepository;
import com.mobilemodel.service.OfferService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OfferServiceImpl implements OfferService {
    private final OfferRepository offerRepository;

    @Autowired
    public OfferServiceImpl(OfferRepository offerRepository) {
        this.offerRepository = offerRepository;
    }

    @Override
    public List<Offer> getAllOffers() {
        return offerRepository.findAll();
    }

    @Override
    public Offer getOfferById(Long offerId) {
        Optional<Offer> offer = offerRepository.findById(offerId);
        return offer.orElse(null);
    }

    @Override
    public Offer createOffer(Offer offer) {
        return offerRepository.save(offer);
    }

    @Override
    public Offer updateOffer(Long offerId, Offer offer) {
        if (offerRepository.existsById(offerId)) {
            offer.setOfferId(offerId);
            return offerRepository.save(offer);
        }
        return null; // Handle this as needed, e.g., return a meaningful error response.
    }

    @Override
    public void deleteOffer(Long offerId) {
        offerRepository.deleteById(offerId);
    }
}
