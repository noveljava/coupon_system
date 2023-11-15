package com.example.coupon_system.domain.member;

import com.example.coupon_system.domain.member.dto.RequestJoinDTO;
import com.example.coupon_system.outgoing.entity.MemberEntity;
import lombok.Getter;

@Getter
public class Member {
    MemberID memberId;
    String loginId;
    String name;
    String password;

    public Member(MemberID memberId, String loginId, String name, String password) {
        this.memberId = memberId;
        this.loginId = loginId;
        this.name = name;
        this.password = password;
    }

    public static Member of(RequestJoinDTO dto) {
        return new Member(null, dto.getLoginId(), dto.getName(), dto.getPassword());
    }

    public static MemberEntity from(Member member) {
        MemberEntity entity = new MemberEntity();

        entity.setLoginId(member.loginId);
        entity.setName(member.name);
        entity.setPassword(member.password);

        return entity;
    }
}
