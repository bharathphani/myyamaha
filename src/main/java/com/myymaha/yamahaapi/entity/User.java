package com.myymaha.yamahaapi.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;


// If class name is YamahaUser then no need of table name mapping
@Entity
@Table(name = "YAMAHA_USER")
@Getter @Setter @ToString @NoArgsConstructor @AllArgsConstructor
public class User extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "active")
    @GenericGenerator(name = "native", strategy = "native")
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
