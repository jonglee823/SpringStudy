package com.example.test1;

import com.example.test1.member.Grade;
import com.example.test1.member.Member;
import com.example.test1.member.MemberService;
import com.example.test1.order.Order;
import com.example.test1.order.OrderService;

public class OrderApp {

    public static void main(String[] args) {

        AppConfig appConfig = new AppConfig(); MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();

        long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP); memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        System.out.println("order = " + order);

    }

}
