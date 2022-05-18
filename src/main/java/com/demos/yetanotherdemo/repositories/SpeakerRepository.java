package com.demos.yetanotherdemo.repositories;

import com.demos.yetanotherdemo.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
