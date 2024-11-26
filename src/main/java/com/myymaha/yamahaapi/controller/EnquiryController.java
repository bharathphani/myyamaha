package com.myymaha.yamahaapi.controller;


import com.myymaha.yamahaapi.constants.Constants;
import com.myymaha.yamahaapi.dto.EnquiryDto;
import com.myymaha.yamahaapi.dto.ResponseDto;
import com.myymaha.yamahaapi.service.IEnquiryService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/enquiry", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class EnquiryController {

    private IEnquiryService iEnquiryService;

    @GetMapping(path = "sayHello")
    public String sayHello() {
        return "Enquiry in my yamaha";
    }

    @PostMapping(path = "create")
    public ResponseEntity<ResponseDto> createEnquiry(@RequestBody EnquiryDto enquiryDto) {
        iEnquiryService.createEnquiry(enquiryDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseDto(Constants.HTTP_CODE_201, Constants.ENQUIRY_SUCCESS_MSG_201));
    }

    @GetMapping(path = "fetch")
    public ResponseEntity<EnquiryDto> getEnquiryById(@RequestParam String id) {
        EnquiryDto enquiryDto = iEnquiryService.getEnquiry(id);
        return ResponseEntity.status(HttpStatus.OK).body(enquiryDto);
    }
}
