package com.mobilemodel.service;

import com.mobilemodel.entity.Mobile;

import java.util.List;

public interface MobileService {
    List<Mobile> getAllMobiles();

    Mobile getMobileById(Long mobileId);

    Mobile createMobile(Mobile mobile);

    Mobile updateMobile(Long mobileId, Mobile mobile);

    void deleteMobile(Long mobileId);
}
