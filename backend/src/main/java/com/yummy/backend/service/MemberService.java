package com.yummy.backend.service;

import com.yummy.backend.entity.Member;
import com.yummy.backend.repository.MemberRepository;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    private MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {

        this.memberRepository = memberRepository;
    }


}
