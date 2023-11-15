package com.example.coupon_system.incoming.member;

import com.example.coupon_system.domain.member.dto.RequestJoinDTO;
import java.lang.reflect.Member;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/member")
@AllArgsConstructor
public class MemberController {
    MemberService memberService;

    @GetMapping("/login")
    public String login() {
        return "login page";
    }

    @GetMapping("")
    public String index() {
        return "index page";
    }

    @GetMapping("/{member_id}")
    public String test(@PathVariable String member_id) {
        System.out.println("member_id: " + member_id);
        return "member/test";
    }

    @PostMapping("")
    public void create(@RequestBody RequestJoinDTO member) {
        memberService.join(member);
    }

    @PutMapping("/{member_id}")
    public void update(@PathVariable String member_id, @RequestBody Member member) {
    }
}