package com.example.test1.discount;

import com.example.test1.member.Member;

public interface DiscountPolicy {
    int discount(Member member, int price);
}
