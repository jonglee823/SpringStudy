package com.example.test1.member;

import com.example.test1.AppConfig;
import org.junit.jupiter.api.BeforeEach;

class MemberServiceTest {

    MemberService memberService;

    @BeforeEach
    public void beforeEach() {

        AppConfig appConfig = new AppConfig();

        memberService = appConfig.memberService(); }

}