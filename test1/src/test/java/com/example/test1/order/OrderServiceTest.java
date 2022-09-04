package com.example.test1.order;

import com.example.test1.AppConfig;
import com.example.test1.member.Grade;
import com.example.test1.member.Member;
import com.example.test1.member.MemberService;
import com.example.test1.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OrderServiceTest { MemberService memberService; OrderService orderService;

    @BeforeEach
    public void beforeEach() {

        AppConfig appConfig = new AppConfig();

        memberService = appConfig.memberService();
        orderService = appConfig.orderService(); }
}