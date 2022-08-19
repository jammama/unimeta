package com.learners.unimeta.repository;

import com.learners.unimeta.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Member findById(String id);
}