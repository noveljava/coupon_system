package com.example.coupon_system.outgoing.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.Instant;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class MemberEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "loginId", nullable = false, length = 20)
    private String loginId;

    @Column(name = "name", nullable = false, length = 20)
    private String name;

    @Column(name = "password", nullable = false, length = 20)
    private String password;

    @Column(name = "regDate")
    private Instant regDate;

}