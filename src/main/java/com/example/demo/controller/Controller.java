package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Vendor;

@RestController
@RequestMapping("/vendor")
public class Controller {
    Vendor vendor;
    @GetMapping("{vendorId}")
    public Vendor getVendorDetails(String vendorId){
        return vendor;
    }

    @PostMapping
    public String createVendor(@RequestBody Vendor vendor){
        this.vendor = vendor;
        return "Vendor Created Successfully";
    }

    @PutMapping
    public String updateVendor(@RequestBody Vendor vendor){
        this.vendor = vendor;
        return "Vendor Updated Successfully";
    }

    @DeleteMapping("{vendorId}")
    public String deleteVendor(String vendorId){
        this.vendor = null;
        return "Vendor deleted Successfully";
    }
}
