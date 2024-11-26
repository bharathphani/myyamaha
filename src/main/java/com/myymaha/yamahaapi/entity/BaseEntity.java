package com.myymaha.yamahaapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Setter;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;

@MappedSuperclass
@Getter @Setter @ToString
public class BaseEntity {
    @Column(name = "CREATED_ON", updatable = false)
    private LocalDateTime createdOn;

    // if col name is CREATED_ON and if variable name is like createdBy no need
    // to add col name mapping
    @Column(updatable = false)
    private String createdBy;

    @Column(updatable = false)
    private LocalDateTime modifiedOn;

    @Column(updatable = false)
    private String modifiedBy;

}
