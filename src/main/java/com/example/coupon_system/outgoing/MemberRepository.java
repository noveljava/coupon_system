package com.example.coupon_system.outgoing;

import com.example.coupon_system.outgoing.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<MemberEntity, Integer> {

}