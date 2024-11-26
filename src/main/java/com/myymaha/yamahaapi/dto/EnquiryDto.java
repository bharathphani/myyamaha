package com.myymaha.yamahaapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EnquiryDto {
    private long id;

    private String custId;

    private String productId;

    private int quantity;
}
