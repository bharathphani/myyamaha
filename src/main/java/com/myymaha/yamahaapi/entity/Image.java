package com.myymaha.yamahaapi.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Image extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "active")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;

    private String productId;

    private String image;
}
