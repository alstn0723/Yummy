package com.yummy.backend.repository;

import com.yummy.backend.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

    Member findMemberByName(String name);

    Member findMemberByMemberId(String member_id);

}
