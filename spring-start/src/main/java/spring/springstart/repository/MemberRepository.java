package spring.springstart.repository;

import spring.springstart.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member); //회원이 저장소에 저장
    Optional<Member> findById(Long id); //null이 반환될 가능성이 있으면 Optional로 감싸준다.
    Optional<Member> findByName(String name);
    List<Member>findAll();//지금까지 저장된 모든 회원 리스트를 전부 반환
}
