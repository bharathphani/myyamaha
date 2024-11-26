package com.myymaha.yamahaapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class UserDto {
    private long id;

    private String name;

    private String email;

    private String mobileNo;

    private String addressLine1;

    private String addressLine2;

    private String pincode;

    private String city;

    private String state;
}
