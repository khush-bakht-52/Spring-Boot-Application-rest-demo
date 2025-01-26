package com.thinkconstructive.rest_demo.controller;

import com.thinkconstructive.rest_demo.model.CloudVendor;
import com.thinkconstructive.rest_demo.response.ResponseHandler;
import com.thinkconstructive.rest_demo.service.CloudVendorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {
    private final CloudVendorService cloudVendorService;

    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    @GetMapping("/{VendorID}")
    public ResponseEntity<Object> getCloudVendorDetails(@PathVariable("VendorID") String VendorID) {
        return ResponseHandler.responseBuilder(
                "Request Vendor Details are given here",
                HttpStatus.OK,
                cloudVendorService.getCloudVendor(VendorID)
        );
    }


    @GetMapping()
    public ResponseEntity<List<CloudVendor>> getAllCloudVendors() {
        return ResponseEntity.ok(cloudVendorService.getAllCloudVendors());
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudvendor) {
        cloudVendorService.createCloudVendor(cloudvendor);
        return "Cloud vendor created successfully!";
    }
    @PutMapping
    public String UpdateCloudVendorDetails(@RequestBody CloudVendor cloudvendor) {
        cloudVendorService.updateCloudVendor(cloudvendor);
        return "Cloud vendor Updated successfully!";
    }
    @DeleteMapping("/{VendorID}")

    public String DeleteCloudVendorDetails(@PathVariable String VendorID) {
        cloudVendorService.deleteCloudVendor(VendorID);
        return "Cloud vendor Deleted successfully!";
    }



}