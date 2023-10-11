package com.mobilemodel.controller;

import com.mobilemodel.entity.Mobile;
import com.mobilemodel.service.MobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/mobiles")
public class MobileController {
    private final MobileService mobileService;

    @Autowired
    public MobileController(MobileService mobileService) {
        this.mobileService = mobileService;
    }

    @GetMapping("/getallmobiles")
    public List<Mobile> getAllMobiles() {
        return mobileService.getAllMobiles();
    }

    @GetMapping("/{mobileId}")
    public Mobile getMobileById(@PathVariable Long mobileId) {
        return mobileService.getMobileById(mobileId);
    }

    @PostMapping("/addmobile")
    public Mobile createMobile(@Valid @RequestBody Mobile mobile) {
        return mobileService.createMobile(mobile);
    }

    @PutMapping("/updatemobile/{mobileId}")
    public Mobile updateMobile(@Valid @PathVariable Long mobileId, @RequestBody Mobile mobile) {
        return mobileService.updateMobile(mobileId, mobile);
    }

    @DeleteMapping("/deletemobile/{mobileId}")
    public void deleteMobile(@PathVariable Long mobileId) {
        mobileService.deleteMobile(mobileId);
    }
}
