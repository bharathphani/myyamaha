package com.myymaha.yamahaapi.service;

import com.myymaha.yamahaapi.dto.EnquiryDto;
import com.myymaha.yamahaapi.dto.ProductDto;
import com.myymaha.yamahaapi.entity.Enquiry;

public interface IEnquiryService {
    public void createEnquiry(EnquiryDto enquiryDto);
    public EnquiryDto getEnquiry(String id);
}
