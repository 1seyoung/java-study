package com.practice.web_practice.service;

import static org.junit.jupiter.api.Assertions.*;

import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.practice.web_practice.domain.Member;
import com.practice.web_practice.repository.MemoryMemberRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MemberServiceTest {

    MemberService memberService ;
    MemoryMemberRepository memberRepository ;


    @BeforeEach
    public void beforeEach() {
        memberRepository = new MemoryMemberRepository();
        memberService = new MemberService(memberRepository);
    }

    @AfterEach
    public void afterEach() {
        memberRepository.clearStore();
    }


    @Test
    public void 회원가입() throws Exception {
//Given
        Member member = new Member();
        member.setName("spring");
//When
        Long saveId = memberService.join(member);
//Then
        Member findMember = memberService.findOne(saveId).get();
        assertEquals(member.getName(), findMember.getName());
    }

    @Test
    public void 중복_회원_예외() {
        //given
        Member member1 = new Member();
        member1.setName("spring");

        Member member2 = new Member();
        member2.setName("spring");

        //when
        memberService.join(member1);
        IllegalStateException e = assertThrows(IllegalStateException.class,
                () -> memberService.join(member2));

        assertEquals(e.getMessage(), "이미 존재하는 회원입니다.");

//        try {
//            memberService.join(member2); // 예외가 발생해야 한다.
//            fail();
//        } catch (IllegalStateException e) {
//            Assertions.assertEquals(e.getMessage(), "이미 존재하는 회원입니다.");
//        }

    }

    @Test
    void findMembers() {
    }

    @Test
    void findOne() {
    }
}