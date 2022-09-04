package com.example.test1.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) { this.memberRepository = memberRepository; }

    public void join(Member member) { memberRepository.save(member); }

    public Member findMember(Long memberId) { return memberRepository.findById(memberId); }

}