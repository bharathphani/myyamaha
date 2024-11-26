package com.myymaha.yamahaapi.entity;

import com.myymaha.yamahaapi.dto.ImageDto;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Product extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "active")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;

    private String name;

    private String price;

}
