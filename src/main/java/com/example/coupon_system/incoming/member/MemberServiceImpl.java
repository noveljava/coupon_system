package com.example.coupon_system.incoming.member;

import com.example.coupon_system.domain.member.dto.RequestJoinDTO;
import com.example.coupon_system.domain.member.service.MemberDomainService;
import com.example.coupon_system.outgoing.MemberRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MemberServiceImpl implements MemberService {
    private final MemberRepository memberRepository;
    private final MemberDomainService memberService;

    @Override
    public void join(RequestJoinDTO requestJoinDTO) {
        memberService.join(requestJoinDTO);
    }

    @Override
    public void login(RequestJoinDTO member) {

    }
}
