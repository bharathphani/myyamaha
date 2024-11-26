package com.myymaha.yamahaapi.mapper;

import com.myymaha.yamahaapi.dto.EnquiryDto;
import com.myymaha.yamahaapi.entity.Enquiry;

public class EnquiryMapper {
    public static EnquiryDto mapToEnquiryDto(Enquiry enquiry) {
        return new EnquiryDto(enquiry.getId(), enquiry.getCustId(), enquiry.getProductId(), enquiry.getQuantity());
    }

    public static Enquiry mapToEnquiry(EnquiryDto enquiryDto) {
        return new Enquiry(enquiryDto.getId(), enquiryDto.getCustId(), enquiryDto.getProductId(), enquiryDto.getQuantity());
    }
}
