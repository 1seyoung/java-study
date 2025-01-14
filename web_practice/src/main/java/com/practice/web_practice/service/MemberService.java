package com.practice.web_practice.service;

import com.practice.web_practice.domain.Member;
import com.practice.web_practice.repository.MemberRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    //@Autowired
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    private final MemberRepository memberRepository;

    /**
     * 회원 가입
     * @param member
     * @return
     */
    public Long join(Member member) {
// V1     Optional<Member> result = memberRepository.findByName(member.getName());
//        result.ifPresent(m -> { // result가 있으면 : Optional에 값이 있으면
//            throw new IllegalStateException("이미 존재하는 회원입니다.");
//        });

        // V2
        validateDuplicateMember(member);

        memberRepository.save(member);
        return member.getId();
        // 같은 이름이 있는 회원은 x

    }

    private void validateDuplicateMember(Member member) {
        memberRepository.findByName(member.getName())
                .ifPresent(m -> {
                    throw new IllegalStateException("이미 존재하는 회원입니다.");
                });
    }

    /**
     * 전체 회원 조회
     * @return
     */
    public List<Member> findMembers() {
        return memberRepository.findAll();
    }

    public Optional<Member> findOne(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
