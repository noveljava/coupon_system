package com.example.coupon_system.domain.member.dto;

import com.example.coupon_system.domain.member.Member;
import com.example.coupon_system.domain.member.MemberID;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestJoinDTO extends Member {

    public RequestJoinDTO(MemberID memberId, String loginId, String name, String password) {
        super(memberId, loginId, name, password);
    }
}
