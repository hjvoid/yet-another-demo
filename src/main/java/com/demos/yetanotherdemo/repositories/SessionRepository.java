package com.demos.yetanotherdemo.repositories;

import com.demos.yetanotherdemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
