package com.learners.unimeta.service;

import com.learners.unimeta.dto.LoginResult;
import com.learners.unimeta.dto.MemberDto;
import com.learners.unimeta.entity.Member;
import com.learners.unimeta.entity.Session;
import com.learners.unimeta.repository.MemberRepository;
import com.learners.unimeta.repository.SessionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;
    private final SessionRepository sessionRepository;

    public Member saveMember(MemberDto memberDto){
        Member memberInfo = memberRepository.findById(memberDto.getId());
        if(memberInfo != null)
            return memberRepository.save(memberDto.convertToEntity());
        else
            throw new RuntimeException();
    }

    public LoginResult login(MemberDto memberDto){
        LoginResult loginResult = new LoginResult();
        Member memberInfo = memberRepository.findById(memberDto.getId());
        if(memberDto.equals(memberInfo.getPassword())){
            Session session = new Session();
            session.setId(memberInfo.getId());
            sessionRepository.save(session);
        }else {
            // 익셉션을 던진다
        }
        loginResult.setMember(memberInfo);
        loginResult.setToken("should be, but not now");
        return loginResult;
    }

    public Member logout(MemberDto memberDto){
        Member memberInfo = memberRepository.findById(memberDto.getId());
        Session session = new Session();
        session.setId(memberInfo.getId());
        sessionRepository.delete(session);
        return memberInfo;
    }
}
