package com.practice.web_practice.repository;

import com.practice.web_practice.domain.Member;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public class MemoryMemberRepository implements MemberRepository{

    // 키는 회원 아이디, 값은 회원 정보(<Member> 객체)
    private  static Map<Long, Member> store = new HashMap<>();
    private static long sequence = 0L; // 키값 생성, 실무에서는 동시성을 고려해야함


    @Override
    public Member save(Member member) {
        member.setId(++sequence);
        store.put(member.getId(), member);
        return member;
    }

    @Override
    public Optional<Member> findById(Long id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public Optional<Member> findByName(String name) {
        return store.values().stream()
                .filter(member -> member.getName().equals(name))
                .findAny(); // 하나라도 찾으면 반환
    }

    @Override
    public List<Member> findAll() {
        return new ArrayList<>(store.values()); // store에 있는 모든 멤버 값들을 반환
    }

    public void clearStore() {
        store.clear();
    }
}
