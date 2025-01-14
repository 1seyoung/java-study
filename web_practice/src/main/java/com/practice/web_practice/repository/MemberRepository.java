package com.practice.web_practice.repository;
import com.practice.web_practice.domain.Member;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;


public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name); //Opsional은 null을 처리하는 방법
    List<Member> findAll();

    //인터페이스에서 선언된 메소드는 기본적으로 public
    //public을 생략해도 메소드는 자동으로 public으로 처리
}
