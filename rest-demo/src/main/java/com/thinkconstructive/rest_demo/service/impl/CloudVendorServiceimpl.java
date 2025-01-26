//package com.thinkconstructive.rest_demo.service.impl.impl;
//
//import com.thinkconstructive.rest_demo.exception.CloudVendorNotFoundException;
//import com.thinkconstructive.rest_demo.model.CloudVendor;
//import com.thinkconstructive.rest_demo.repository.CloudVendorRepository;
//import com.thinkconstructive.rest_demo.service.impl.CloudVendorService;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class CloudVendorServiceimpl  implements CloudVendorService {
//
//    CloudVendorRepository cloudVendorRepository;
//
//    public CloudVendorServiceimpl(CloudVendorRepository cloudVendorRepository) {
//        this.cloudVendorRepository = cloudVendorRepository;
//    }
//
//
//    @Override
//    public String createCloudVendor(CloudVendor cloudVendor) {
//        cloudVendorRepository.save(cloudVendor);
//        return "Success";
//    }
//
//    @Override
//    public String updateCloudVendor(CloudVendor cloudVendor) {
//        cloudVendorRepository.save(cloudVendor);
//        return "Success";
//    }
//
//    @Override
//    public String deleteCloudVendor(String cloudVendorId) {
//        cloudVendorRepository.deleteById(cloudVendorId);
//        return "Success";
//    }
//
//    @Override
//    public CloudVendor getCloudVendor(String cloudVendorId) {
//        // More Business Logic
//        if(cloudVendorRepository.findById(cloudVendorId).isEmpty())
//            throw new CloudVendorNotFoundException("Requested Cloud Vendor does not exist");
//        return cloudVendorRepository.findById(cloudVendorId).get();
//    }
//
//    @Override
//    public List<CloudVendor> getAllCloudVendors() {
//        return cloudVendorRepository.findAll();
//    }
//}
//
//
//
