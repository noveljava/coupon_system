package com.example.coupon_system.domain.member.service;

import com.example.coupon_system.domain.member.dto.RequestJoinDTO;

public interface MemberDomainService {
    void join(RequestJoinDTO member);
    void login(RequestJoinDTO member);
}
