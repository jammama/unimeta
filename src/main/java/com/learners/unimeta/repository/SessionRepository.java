package com.learners.unimeta.repository;

import com.learners.unimeta.entity.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, String> {
}