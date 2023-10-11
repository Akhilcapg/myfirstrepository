package com.mobilemodel.serviceimpl;

import com.mobilemodel.entity.Mobile;
import com.mobilemodel.repository.MobileRepository;
import com.mobilemodel.service.MobileService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MobileServiceImpl implements MobileService {
    private final MobileRepository mobileRepository;

    @Autowired
    public MobileServiceImpl(MobileRepository mobileRepository) {
        this.mobileRepository = mobileRepository;
    }

    @Override
    public List<Mobile> getAllMobiles() {
        return mobileRepository.findAll();
    }

    @Override
    public Mobile getMobileById(Long mobileId) {
        Optional<Mobile> mobile = mobileRepository.findById(mobileId);
        return mobile.orElse(null);
    }

    @Override
    public Mobile createMobile(Mobile mobile) {
        return mobileRepository.save(mobile);
    }

    @Override
    public Mobile updateMobile(Long mobileId, Mobile mobile) {
        if (mobileRepository.existsById(mobileId)) {
            mobile.setMobileId(mobileId);
            return mobileRepository.save(mobile);
        }
        return null; // Handle this as needed, e.g., return a meaningful error response.
    }

    @Override
    public void deleteMobile(Long mobileId) {
        mobileRepository.deleteById(mobileId);
    }
}
