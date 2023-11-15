package com.example.coupon_system.domain.member.service;

import com.example.coupon_system.domain.member.Member;
import com.example.coupon_system.domain.member.dto.RequestJoinDTO;
import com.example.coupon_system.outgoing.MemberRepository;
import org.springframework.stereotype.Component;

@Component
public class MemberDomainServiceImpl implements MemberDomainService {
    private final MemberRepository memberRepository;

    public MemberDomainServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(RequestJoinDTO requestJoinDTO) {
        Member member = Member.of(requestJoinDTO);
        memberRepository.save(Member.from(member));
    }

    @Override
    public void login(RequestJoinDTO member) {

    }
}
