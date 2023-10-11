package com.mobilemodel.service;

import com.mobilemodel.entity.Offer;

import java.util.List;

public interface OfferService {
    List<Offer> getAllOffers();

    Offer getOfferById(Long offerId);

    Offer createOffer(Offer offer);

    Offer updateOffer(Long offerId, Offer offer);

    void deleteOffer(Long offerId);
}
