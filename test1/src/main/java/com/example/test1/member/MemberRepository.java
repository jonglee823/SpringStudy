package com.example.test1.member;

public interface MemberRepository {

    void save(Member meber);
    Member findById(Long memberId);
}
