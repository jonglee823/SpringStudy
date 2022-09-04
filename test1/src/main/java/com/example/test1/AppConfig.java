package com.example.test1;

import com.example.test1.discount.DiscountPolicy;
import com.example.test1.discount.FixDiscountPolicy;
import com.example.test1.member.MemberRepository;
import com.example.test1.member.MemberService;
import com.example.test1.member.MemberServiceImpl;
import com.example.test1.member.MemoryMemberRepository;
import com.example.test1.order.OrderService;
import com.example.test1.order.OrderServiceImpl;

public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public DiscountPolicy discountPolicy() {
        return new FixDiscountPolicy();
    }
}