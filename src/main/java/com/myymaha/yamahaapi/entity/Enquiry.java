package com.myymaha.yamahaapi.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
public class Enquiry extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "active")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;

    private String custId;

    private String productId;

    private int quantity;
}
