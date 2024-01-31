package spring.springstart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.springstart.domain.Member; //사용자나 회원과 관련된 데이터를 표현하는데 사용
import spring.springstart.repository.MemberRepository;
import spring.springstart.repository.MemoryMemberRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MemberService {
    /*MemberService는 순수한 자바 클래스이므로 스프링이 이 클래스를 안을 수 없다.*/
    // Ctrl + Shift + T 를 누르면 자동으로 @Test가 만들어진다.

    private final MemberRepository memberRepository;


    @Autowired
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }
    //new를 생성하는 것이 아니라 외부에서 생성하는 것임
//    'MemberService"가 데이터 처리를 하기 위해서는 'MemberRepository'를 사용한다는 뜻이다.

    /*
    *  회원가입
    * */
    public Long join(Member member){
        //같은 이름이 있는 중복 회원X
        validateDuplicateMember(member);
        memberRepository.save(member);
        return member.getId();//id를 반환
    }
    private void validateDuplicateMember(Member member){
        memberRepository.findByName(member.getName())
                .ifPresent(m -> {
                    throw new IllegalStateException("이미 존재하는 회원입니다.");
                });
    }

    /*
    * 전체 회원 조회
    * */
    public List<Member> findMembers(){
        return memberRepository.findAll();
    }
    public Optional<Member> findOne(Long memberId){ //단일 객체를 찾기 위한 메서드
        return memberRepository.findById(memberId);
    }
}
