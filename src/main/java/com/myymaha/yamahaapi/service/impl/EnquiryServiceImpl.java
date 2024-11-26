package com.myymaha.yamahaapi.service.impl;

import com.myymaha.yamahaapi.dto.EnquiryDto;
import com.myymaha.yamahaapi.dto.UserDto;
import com.myymaha.yamahaapi.entity.Enquiry;
import com.myymaha.yamahaapi.exception.ResourceNotFoundException;
import com.myymaha.yamahaapi.mapper.EnquiryMapper;
import com.myymaha.yamahaapi.repository.EnquiryRepository;
import com.myymaha.yamahaapi.service.IEnquiryService;
import com.myymaha.yamahaapi.service.IUserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class EnquiryServiceImpl implements IEnquiryService {
    EnquiryRepository enquiryRepo;

    @Override
    public void createEnquiry(EnquiryDto enquiryDto) {
      Enquiry enquiry = EnquiryMapper.mapToEnquiry(enquiryDto);
        enquiry.setCreatedOn(LocalDateTime.now());
        enquiry.setCreatedBy("Bharath");
        enquiry.setModifiedOn(LocalDateTime.now());
        enquiry.setModifiedBy("Bharath");
        Enquiry savedEnquiry = enquiryRepo.save(enquiry);
    }

    @Override
    public EnquiryDto getEnquiry(String id) {
        Enquiry enquiry = enquiryRepo.findById(Long.parseLong(id)).orElseThrow(
                () -> new ResourceNotFoundException("Enquiry", "id", id)
        );
        return EnquiryMapper.mapToEnquiryDto(enquiry);
    }
}
