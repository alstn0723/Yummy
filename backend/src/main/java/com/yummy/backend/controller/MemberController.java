package com.yummy.backend.controller;

import com.yummy.backend.entity.Member;
import com.yummy.backend.repository.MemberRepository;
import com.yummy.backend.service.MemberService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class MemberController {


    private MemberRepository memberRepository;
    private MemberService memberService;

    public MemberController(MemberRepository memberRepository, MemberService memberService) {

        this.memberRepository = memberRepository;
        this.memberService = memberService;
    }

    //Create Member
    @PostMapping(path = "/member/create")
    public Member createMember(@RequestBody Member member){

        Member result = memberRepository.save(member);

        return result;
    }

    //Find Member by Id
    @GetMapping(path = "/member/find/id")
    public Optional<Member> findMemberById(@RequestParam Long id){

        Optional<Member> result = memberRepository.findById(id);

        return result;
    }

    //Find Member by Name
    @GetMapping(path = "/member/find/name")
    public Optional<Member> findMemberByName(@RequestParam String name){

        Optional<Member> result = Optional.ofNullable(memberRepository.findMemberByName(name));

        return result;
    }

    //Check Member Unique
    @GetMapping(path = "/member/unique")
    public Optional<Member> isMemberUnique(@RequestParam String member_id){

        findMemberByMemberId(member_id)
        Optional<Member> result = Optional.ofNullable(memberRepository.findMemberByName(name));

        return result;
    }


    //Delete Member by Id
    @DeleteMapping(path = "/member/delete")
    public String deleteMember(@RequestParam Long id){

        if (memberRepository.findById(id) == null) {
            throw new NullPointerException("no id");
        } else {
            memberRepository.deleteById(id);
            return "Member deleted";
        }
    }
}
