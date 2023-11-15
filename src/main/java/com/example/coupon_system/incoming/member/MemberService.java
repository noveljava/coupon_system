package com.example.coupon_system.incoming.member;

import com.example.coupon_system.domain.member.dto.RequestJoinDTO;

public interface MemberService {
        void join(RequestJoinDTO requestJoinDTO);
        void login(RequestJoinDTO member);
}
