package com.yummy.backend.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Getter
@Setter
@Entity
public class Member {

    @Id
    @GeneratedValue
    private Long Id;

    private String name;
    private String address;
    private String phone;
    private String member_id;

}
